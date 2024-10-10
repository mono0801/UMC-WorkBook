package umc.spring.domain.review;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.common.BaseEntity;

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

    // TODO : 컬럼 생성하기
    /*
    reviewId
    // 리뷰 작성자
    userId
    restaurantId
    // 리뷰 답변 작성자
    reviewWriter
    reviewReplyContent
     */
}
