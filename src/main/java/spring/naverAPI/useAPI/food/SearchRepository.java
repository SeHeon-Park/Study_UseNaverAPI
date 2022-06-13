package spring.naverAPI.useAPI.food;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchRepository extends JpaRepository<FoodEntity, String> {
}
