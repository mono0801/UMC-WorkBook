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
@Table(name = "UserMission")
@IdClass(UserMissionId.class)
public class UserMission {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_mission_id", nullable = false)
    private RestaurantMission restaurantMissionId;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User userId;

    @Column(nullable = false)
    @Builder.Default
    private boolean complete = false;
}
