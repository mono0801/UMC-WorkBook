package umc.spring.domain.qna;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.common.BaseEntity;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "QnaReply")
public class QnaReply extends BaseEntity {

    // TODO : 연관관계 설정하기 - 양방향

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long qnaReplyId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "qna_id", nullable = false)
    private Qna qnaId;

    @Column(length = 80, nullable = false)
    private String QnaReplyContent;
}
