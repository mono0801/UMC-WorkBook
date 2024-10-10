package umc.spring.domain.mission;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.User;
import umc.spring.domain.compositeKey.UserMissionId;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "UserFavoriteFood")
@IdClass(UserMissionId.class)
public class UserMission {

    // TODO : 연관관계 설정하기 - 단방향

    // TODO : 복합키 & 연관관계 설정
    @Id
    private RestaurantMission restaurantMission;

    @Id
    private User user;

    @Column(nullable = false)
    @Builder.Default
    private boolean complete = false;
}
