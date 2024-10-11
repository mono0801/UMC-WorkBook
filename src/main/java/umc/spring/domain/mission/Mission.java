package umc.spring.domain.mission;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "Mission")
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long missionId;

    @Column(length = 50, nullable = false)
    private String missionContent;

    @Column(nullable = false)
    @Builder.Default
    private int point = 0;

    @OneToMany(mappedBy = "missionId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RestaurantMission> restaurantMissions;
}
