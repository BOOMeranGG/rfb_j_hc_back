package com.orange.freelance_rfb.repository;

import com.orange.freelance_rfb.model.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository
    extends JpaRepository<Long, Feedback> {
}
