package spring.naverAPI.useAPI.food;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import spring.naverAPI.useAPI.naver.NaverClient;
import spring.naverAPI.useAPI.naver.dto.SearchFoodReq;
import spring.naverAPI.useAPI.naver.dto.SearchFoodRes;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SearchService {
    private final NaverClient naverClient;
    private final SearchRepository searchRepository;

    public List<FoodEntity> search(String query){
        SearchFoodReq req = new SearchFoodReq();
        req.setQuery(query);
        ResponseEntity<SearchFoodRes> res = naverClient.searchLocal(req);
        List<FoodEntity> foodEntities = res.getBody().getItems().stream().map(o -> new FoodEntity(o.getBloggerlink(),
                                                                                                  o.getTitle(),
                                                                                                  o.getLink(),
                                                                                                  o.getDescription(),
                                                                                                  o.getBloggername())).collect(Collectors.toList());
        return foodEntities;
    }
}
