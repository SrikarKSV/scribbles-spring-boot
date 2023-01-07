package com.srikar.scribbles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srikar.scribbles.entity.Scribble;

@Repository
public interface ScribbleRepository extends JpaRepository<Scribble, Long> {

}
