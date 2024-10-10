package umc.spring.domain.mission;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
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

    // TODO : 컬럼 세부 설정하기
    // TODO : 연관관계 설정하기 - 단방향

    // TODO : 복합키 & 연관관계 설정
    @Id
    private Location location;

    @Id
    private User user;

    /*
    missionCount
     */
}
