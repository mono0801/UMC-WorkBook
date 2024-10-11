package umc.spring.domain.favoriteFood;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "FavoriteFood")
public class FavoriteFood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long favoriteFoodId;

    @Column(length = 20, nullable = false)
    private String foodCategory;
}
