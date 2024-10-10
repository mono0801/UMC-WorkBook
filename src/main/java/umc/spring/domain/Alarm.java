package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.common.BaseEntity;

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

    // TODO : 컬럼 생성하기
    /*
    userId
    reviewId
    reviewWriter
    qnaId
    title
    alarmContent
    dtype
    confirm
     */
}
