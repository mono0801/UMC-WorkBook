package umc.spring.domain.review;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.User;
import umc.spring.domain.common.BaseEntity;
import umc.spring.domain.restaurant.Restaurant;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "Review")
public class Review extends BaseEntity {

    // TODO : 연관관계 설정하기 - 단방향
    // TODO : 연관관계 설정하기 - 양방향

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reviewId;

    private User userId;

    private Restaurant restaurantId;

    @Column(nullable = false)
    @Builder.Default
    private int rating = 0;

    @Column(length = 80, nullable = false)
    private String reviewContent;
}
