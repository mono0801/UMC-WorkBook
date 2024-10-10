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

    // TODO : 연관관계 설정하기 - 단방향

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menuID;

    @Column(length = 20, nullable = false)
    private String menuName;

    @Column(nullable = false)
    @Builder.Default
    private int menuPrice = 0;

    @Column(length = 50, nullable = false)
    private String menuDescript;
}
