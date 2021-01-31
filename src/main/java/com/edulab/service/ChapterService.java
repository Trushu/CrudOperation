package com.edulab.service;

import java.util.List;
import java.util.Map;

import com.edulab.model.Chapter;

public interface ChapterService {

	Chapter save(Chapter chapter);

	List<Chapter> findAllChapter();

	Chapter findChapterById(int id);

	void deleteChapterByName(int id);

	Object updateChapterById(Chapter chapter, int id);

}
