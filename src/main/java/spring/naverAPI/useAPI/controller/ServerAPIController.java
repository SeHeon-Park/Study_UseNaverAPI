package spring.naverAPI.useAPI.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import spring.naverAPI.useAPI.food.FoodEntity;
import spring.naverAPI.useAPI.food.SearchService;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/server")
public class ServerAPIController {

    private final SearchService searchService;

    @GetMapping("/search")
    public List<FoodEntity> search(@RequestParam String query){
        return searchService.search(query);
    }
}
