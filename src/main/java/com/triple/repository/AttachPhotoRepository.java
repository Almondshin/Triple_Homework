package com.triple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.triple.domain.AttachPhoto;

@Repository
public interface AttachPhotoRepository extends JpaRepository<AttachPhoto, Long>{

}
