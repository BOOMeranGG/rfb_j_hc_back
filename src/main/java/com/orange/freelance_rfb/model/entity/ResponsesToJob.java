package com.orange.freelance_rfb.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "responses_to_job")
public class ResponsesToJob {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "response_id")
    private Long responseId;

    @Column(name = "commentary")
    private String commentary;

    @Column(name = "author_id")
    private int authorId;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;
}
