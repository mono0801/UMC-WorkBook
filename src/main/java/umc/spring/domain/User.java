package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.common.BaseEntity;
import umc.spring.domain.enums.Gender;

import java.time.LocalDate;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "User")
public class User extends BaseEntity {

    // TODO : 연관관계 설정하기 - 단방향
    // TODO : 연관관계 설정하기 - 양방향

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
}
