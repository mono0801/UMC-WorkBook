package umc.spring.domain.qna;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.Alarm;
import umc.spring.domain.User;
import umc.spring.domain.common.BaseEntity;

import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "Qna")
public class Qna extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long qnaId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User userId;

    @Column(length = 80, nullable = false)
    private String qnaContent;

    @OneToMany(mappedBy = "qnaId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<QnaReply> qnaReplies;

    @OneToMany(mappedBy = "qnaId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Alarm> alarms;
}
