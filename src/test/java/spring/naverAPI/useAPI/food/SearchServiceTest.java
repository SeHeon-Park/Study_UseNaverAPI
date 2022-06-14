package spring.naverAPI.useAPI.food;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import static org.junit.jupiter.api.Assertions.*;

@Rollback(value = false)
@SpringBootTest
class SearchServiceTest {

    @Autowired
    SearchService s;

    @Test
    public void test(){
        String query = "짜장면";
        System.out.println(s.search(query));
    }


}