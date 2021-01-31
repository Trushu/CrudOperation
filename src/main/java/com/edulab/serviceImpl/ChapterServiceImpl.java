package com.edulab.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edulab.model.Chapter;
import com.edulab.repository.ChapterRepository;
import com.edulab.service.ChapterService;

@Service
@Transactional
public class ChapterServiceImpl implements ChapterService
{

	@Autowired
	private ChapterRepository chapterRepository;
	
	@Override
	public Chapter save(Chapter chapter) {
		// TODO Auto-generated method stub
		return chapterRepository.save(chapter);
	}

	@Override
	public List<Chapter> findAllChapter() {
		// TODO Auto-generated method stub
		return chapterRepository.findAll();
	}

	@Override
	public Chapter findChapterById(int id) {
		// TODO Auto-generated method stub
		return chapterRepository.findById(id).get();
	}

	@Override
	public void deleteChapterByName(int id) {
		// TODO Auto-generated method stub
		chapterRepository.deleteById(id);
	}

	@Override
	public Object updateChapterById(Chapter chapter, int id) {
		// TODO Auto-generated method stub
		Chapter chtr=chapterRepository.findById(id).get();
		if(chapter.getChapterName()!=null)
		chtr.setChapterName(chapter.getChapterName());
		
		if(chapter.getDescription()!=null)
		chtr.setDescription(chapter.getDescription());
		
		
		return chapterRepository.save(chtr);
	}

}
