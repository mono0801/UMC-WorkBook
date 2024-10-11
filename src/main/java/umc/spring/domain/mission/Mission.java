package umc.spring.domain.mission;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "Mission")
public class Mission {

    // TODO : 연관관계 설정하기 - 양방향

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long missionId;

    @Column(length = 50, nullable = false)
    private String missionContent;

    @Column(nullable = false)
    @Builder.Default
    private int point = 0;
}
