package umc.spring.domain.restaurant;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.User;
import umc.spring.domain.common.BaseEntity;
import umc.spring.domain.mission.RestaurantMission;
import umc.spring.domain.review.Review;
import umc.spring.domain.review.ReviewReply;

import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "Restaurant")
public class Restaurant extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long restaurantId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", nullable = false)
    private Location locationId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User userId;

    @Column(length = 20, nullable = false)
    private String restaurantName;

    @Column(length = 30, nullable = false)
    private String address;

    @OneToMany(mappedBy = "restaurantId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews;

    @OneToMany(mappedBy = "restaurantId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ReviewReply> reviewReplies;

    @OneToMany(mappedBy = "restaurantId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RestaurantMenu> restaurantMenus;

    @OneToMany(mappedBy = "restaurantId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RestaurantMission> restaurantMissions;
}
