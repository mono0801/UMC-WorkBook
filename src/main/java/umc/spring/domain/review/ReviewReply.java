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
@Table(name = "ReviewReply")
public class ReviewReply extends BaseEntity {

    // TODO : 컬럼 세부 설정하기
    // TODO : 연관관계 설정하기 - 단방향
    // TODO : 연관관계 설정하기 - 양방향

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reviewReplyId;

    private Review reviewId;
    // 리뷰 작성자
    private User userId;
    private Restaurant restaurantId;
    // 리뷰 답변 작성자
    private User reviewWriter;
    private String reviewReplyContent;
}
