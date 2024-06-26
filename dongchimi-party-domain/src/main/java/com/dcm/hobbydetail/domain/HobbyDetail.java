package com.dcm.hobbydetail.domain;

import com.dcm.global.domain.BaseEntity;
import com.dcm.global.enumurate.YN;
import com.dcm.hobby.domain.Hobby;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Table(name = "HOBBY_DETAIL")
public class HobbyDetail extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hobbyDetailId;

    @Column(nullable = false)
    private String hobbyDetailName;

    @Column(nullable = false)
    private YN useYn;

    @ManyToOne
    @JoinColumn(name = "hobbyId")
    private Hobby hobby;

    public static HobbyDetail of(String hobbyDetailName, YN useYn, Hobby hobby) {
        return HobbyDetail.builder()
                .hobbyDetailName(hobbyDetailName)
                .useYn(useYn)
                .hobby(hobby)
                .build();
    }

    public static HobbyDetail of(Long hobbyDetailId, String hobbyDetailName, YN useYn, Hobby hobby) {
        return HobbyDetail.builder()
                .hobbyDetailId(hobbyDetailId)
                .hobbyDetailName(hobbyDetailName)
                .useYn(useYn)
                .hobby(hobby)
                .build();
    }

}
