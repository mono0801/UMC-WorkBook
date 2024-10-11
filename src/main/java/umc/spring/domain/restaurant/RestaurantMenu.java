package umc.spring.domain.restaurant;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.compositeKey.RestaurantMenuId;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "RestaurantMenu")
@IdClass(RestaurantMenuId.class)
public class RestaurantMenu {

    // TODO : 연관관계 설정하기 - 양방향

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id", nullable = false)
    private Menu menuId;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurantId;
}
