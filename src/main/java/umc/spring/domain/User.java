package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.common.BaseEntity;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "User")
public class User extends BaseEntity {

    // TODO : 컬럼 세부 설정하기
    // TODO : 연관관계 설정하기 - 단방향
    // TODO : 연관관계 설정하기 - 양방향

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    // TODO : 컬럼 생성하기
    /*
    owner
    userName
    gender
    birth
    address
    email
    phone
    point
    status
    deleteDate
     */
}
