package umc.spring.domain.restaurant;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.User;
import umc.spring.domain.common.BaseEntity;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "Restaurant")
public class Restaurant extends BaseEntity {

    // TODO : 연관관계 설정하기 - 단방향
    // TODO : 연관관계 설정하기 - 양방향

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long restaurantId;

    private Location locationId;

    private User userId;

    @Column(length = 20, nullable = false)
    private String restaurantName;

    @Column(length = 30, nullable = false)
    private String address;
}
