package umc.spring.domain.restaurant;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.common.BaseEntity;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "Location")
public class Location {

    // TODO : 연관관계 설정하기 - 단방향

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationID;

    @Column(length = 20, nullable = false)
    private String locationName;
}
