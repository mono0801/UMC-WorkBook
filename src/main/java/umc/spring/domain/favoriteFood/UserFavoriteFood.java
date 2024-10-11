package umc.spring.domain.favoriteFood;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.User;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "UserFavoriteFood")
@IdClass(UserFavoriteFood.class)
public class UserFavoriteFood {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User userId;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "favorite_food_id", nullable = false)
    private FavoriteFood favoriteFoodId;
}
