package spring.naverAPI.useAPI.food;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@Entity
public class FoodEntity {
    @Id
    @GeneratedValue
    private Long Id;
    private String bloggerlink;
    private String title;
    private String link;
    private String description;
    private String bloggername;

    public FoodEntity(String bloggerlink, String title, String link, String description, String bloggername) {
        this.bloggerlink = bloggerlink;
        this.title = title;
        this.link = link;
        this.description = description;
        this.bloggername = bloggername;
    }
}
