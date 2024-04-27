package com.dcm.job.domain;

import com.dcm.global.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@Getter
@AllArgsConstructor
@Table(name = "JOB")
public class Job extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobId;

    @Column(nullable = false)
    private String jobType;

    @Column(nullable = false)
    private String jobName;

    @Column(nullable = false)
    private String useYn;

    protected Job() {}

    public static Job of(String jobType, String jobName, String useYn) {
        return of(null, jobType, jobName, useYn);
    }

    public static Job of(Long jobId, String jobType, String jobName, String useYn) {
        return new Job(jobId, jobType, jobName, useYn);
    }


}