package spring.naverAPI.useAPI.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import spring.naverAPI.useAPI.food.FoodEntity;
import spring.naverAPI.useAPI.food.SearchService;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/restaurant")
public class ServerAPIController {

    private final SearchService searchService;

    @GetMapping("/search")
    public ModelAndView search(@RequestParam String query) throws Exception{
        List<FoodEntity> search_result = searchService.search(query);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/home/main");
        mav.addObject("search_result", search_result);
        return mav;
    }


}
