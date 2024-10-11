package umc.spring.domain.compositeKey;

import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
public class RestaurantMenuId implements Serializable {
    private Long restaurantId;
    private Long menuId;
}
