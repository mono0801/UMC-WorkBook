package umc.spring.domain.mission;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "RestaurantMission")
public class RestaurantMission {

    // TODO : 컬럼 세부 설정하기
    // TODO : 연관관계 설정하기 - 단방향

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long restaurantMissionId;

    // TODO : 컬럼 생성하기
    /*
    restaurantId
    missionId
    locationId
     */
}
