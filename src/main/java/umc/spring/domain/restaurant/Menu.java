package umc.spring.domain.restaurant;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "Menu")
public class Menu {

    // TODO : 컬럼 세부 설정하기
    // TODO : 연관관계 설정하기 - 단방향

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menuID;

    // TODO : 컬럼 생성하기
    /*
    menuName
    menuPrice
    menuDescript
     */
}
