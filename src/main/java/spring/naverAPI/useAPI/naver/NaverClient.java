package spring.naverAPI.useAPI.naver;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import spring.naverAPI.useAPI.naver.dto.SearchFoodReq;
import spring.naverAPI.useAPI.naver.dto.SearchFoodRes;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

@Component
public class NaverClient {

    public ResponseEntity<SearchFoodRes> searchLocal(SearchFoodReq searchLocalReq){
        ByteBuffer buffer = StandardCharsets.UTF_8.encode(searchLocalReq.getQuery());
        String encode = StandardCharsets.UTF_8.decode(buffer).toString();

        URI uri = UriComponentsBuilder
                .fromUriString("https://openapi.naver.com")
                .path("/v1/search/blog.json")
                .queryParams(searchLocalReq.toMultiValueMap())
                .encode()
                .build()
                .toUri();

        RestTemplate restTemplate = new RestTemplate();

        RequestEntity<Void> req = RequestEntity
                .get(uri)
                .header("X-Naver-Client-Id", "vcN3MF7YVpZvGy5ki0PK")
                .header("X-Naver-Client-Secret", "CQUXsudEcb")
                .build();

        ResponseEntity<SearchFoodRes> responseEntity = new RestTemplate().exchange(req, SearchFoodRes.class);
        return responseEntity;
    }
}
