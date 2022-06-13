package spring.naverAPI.useAPI.food;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class FoodEntity {
    @Id
    @GeneratedValue
    private String bloggerlink;
    private String title;
    private String link;
    private String description;
    private String bloggername;

}
