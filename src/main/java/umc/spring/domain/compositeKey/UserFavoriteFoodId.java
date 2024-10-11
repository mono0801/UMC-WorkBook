package umc.spring.domain.compositeKey;

import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
public class UserFavoriteFoodId implements Serializable {
    private Long favoriteFoodId;
    private Long userId;
}
