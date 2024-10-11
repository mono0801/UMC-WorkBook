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
@Table(name = "UserMissionCount")
@IdClass(UserMissionCount.class)
public class UserMissionCount {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", nullable = false)
    private Location locationId;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User userId;

    @Column(nullable = false)
    @Builder.Default
    private int missionCount = 0;
}
