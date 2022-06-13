package spring.naverAPI.useAPI.naver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchFoodRes {
    private String lastBuildDate;
    private int total;
    private int start;
    private int display;
    private List<SearchLocalItem> items;

    @Data
    public static class SearchLocalItem{
        private String title;
        private String link;
        private String description;
        private String bloggername;
        private String bloggerlink;
    }

}
