package com.triple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.triple.domain.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

}
