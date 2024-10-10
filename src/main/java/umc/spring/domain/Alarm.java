package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.common.BaseEntity;
import umc.spring.domain.enums.DType;
import umc.spring.domain.qna.Qna;
import umc.spring.domain.review.Review;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "Alarm")
public class Alarm extends BaseEntity {

    // TODO : 컬럼 세부 설정하기
    // TODO : 연관관계 설정하기 - 단방향

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long alarmId;

    private User userId;
    private Review reviewId;
    // 리뷰 답변 작성자
    private User reviewReplyWriter;
    private Qna qnaId;
    private String title;
    private String alarmContent;
    private DType dtype;
    private boolean confirm;
}
