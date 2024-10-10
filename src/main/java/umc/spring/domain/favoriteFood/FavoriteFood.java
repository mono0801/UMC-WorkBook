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

    // TODO : 연관관계 설정하기 - 단방향

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long favoriteFoodID;

    @Column(length = 20, nullable = false)
    private String foodCategory;
}
