package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.common.BaseEntity;
import umc.spring.domain.enums.Gender;
import umc.spring.domain.favoriteFood.UserFavoriteFood;
import umc.spring.domain.mission.UserMission;
import umc.spring.domain.mission.UserMissionCount;
import umc.spring.domain.qna.Qna;
import umc.spring.domain.restaurant.Restaurant;
import umc.spring.domain.review.Review;
import umc.spring.domain.review.ReviewReply;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "User")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Builder.Default
    private boolean owner = false;

    @Column(length = 10, nullable = false)
    private String userName;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private Gender gender = Gender.NONE;

    @Column(nullable = false)
    private LocalDate birth;

    @Column(length = 20, nullable = false)
    private String address;

    @Column(length = 20, nullable = false)
    private String email;

    @Column(length = 20)
    @Builder.Default
    private String phone = null;

    @Builder.Default
    private int point = 0;

    @Builder.Default
    private boolean status = false;

    @Builder.Default
    private LocalDate deleteDate = null;


    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Restaurant> restaurants;

    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews;

    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ReviewReply> reviewWriters;

    @OneToMany(mappedBy = "reviewReplyWriter", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ReviewReply> reviewReplyWriters;

    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Alarm> alarms;

    @OneToMany(mappedBy = "reviewReplyWriter", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Alarm> alarmReviewReplyWriters;

    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Qna> qnaWriters;

    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserFavoriteFood> userFavoriteFoods;

    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserMissionCount> userMissionCounts;

    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserMission> userMissions;
}
