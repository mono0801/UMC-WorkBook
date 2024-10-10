package umc.spring.domain.restaurant;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.compositeKey.RestaurantMenuId;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "RestaurantMenu")
@IdClass(RestaurantMenuId.class)
public class RestaurantMenu {

    // TODO : 컬럼 세부 설정하기
    // TODO : 연관관계 설정하기 - 단방향
    // TODO : 연관관계 설정하기 - 양방향

    // TODO : 복합키 & 연관관계 설정
    @Id
    private Menu menu;

    @Id
    private Restaurant restaurant;
}
