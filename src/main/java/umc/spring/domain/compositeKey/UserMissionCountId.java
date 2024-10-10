package umc.spring.domain.compositeKey;

import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
public class UserMissionCountId implements Serializable {
    private Long user;
    private Long locationId;
}
