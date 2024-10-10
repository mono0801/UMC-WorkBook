package umc.spring.domain.compositeKey;

import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
public class UserMissionId implements Serializable {
    private Long restaurantMission;
    private Long user;
}
