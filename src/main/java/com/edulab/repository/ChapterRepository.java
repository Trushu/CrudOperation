package com.edulab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edulab.model.Chapter;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Integer>
{

}
