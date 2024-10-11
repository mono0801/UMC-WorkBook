package umc.spring.domain.mission;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.restaurant.Location;
import umc.spring.domain.restaurant.Restaurant;

import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "RestaurantMission")
public class RestaurantMission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long restaurantMissionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurantId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_id", nullable = false)
    private Mission missionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", nullable = false)
    private Location locationId;

    @OneToMany(mappedBy = "restaurantMissionId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserMission> userMissions;
}
