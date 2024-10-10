package umc.spring.domain.mission;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.User;
import umc.spring.domain.restaurant.Location;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "UserFavoriteFood")
@IdClass(UserMissionCount.class)
public class UserMissionCount {

    // TODO : 연관관계 설정하기 - 단방향

    // TODO : 복합키 & 연관관계 설정
    @Id
    private Location location;

    @Id
    private User user;

    @Column(nullable = false)
    @Builder.Default
    private int missionCount = 0;
}
