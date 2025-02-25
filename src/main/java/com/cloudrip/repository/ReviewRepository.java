package com.cloudrip.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloudrip.domain.Board;
import com.cloudrip.domain.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{
	
	List<Review> findAll();
	
//	List<Review> findByBoard(Board Board);
}
