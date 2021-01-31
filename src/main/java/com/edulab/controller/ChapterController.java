package com.edulab.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edulab.model.Chapter;
import com.edulab.response.ApiResponse;
import com.edulab.service.ChapterService;

@RestController
@RequestMapping("/chapter")
public class ChapterController 
{
	@Autowired
	public ChapterService chapterService;
	
	@PostMapping("/save")
	public ApiResponse saveChapter(@RequestBody Chapter chapter)
	{
		return new ApiResponse(HttpStatus.OK, "success", chapterService.save(chapter));
	}
	
	@GetMapping("/findAll")
	public ApiResponse findAllChapter()
	{
		return new ApiResponse(HttpStatus.OK, "success", chapterService.findAllChapter());
	}
	
	@GetMapping("/findById/{id}")
	public ApiResponse findChapterById(@PathVariable int id)
	{
		return new ApiResponse(HttpStatus.OK, "success", chapterService.findChapterById(id));
	}
	
	@PutMapping("/updateById/{id}")
	public ApiResponse updateChapterById(@RequestBody Chapter chapter, @PathVariable int id)
	{
		return new ApiResponse(HttpStatus.OK, "success", chapterService.updateChapterById(chapter, id));
	}
	
	
	@DeleteMapping("/deleteById/{id}")
	public void deleteChapterById(@PathVariable int id)
	{
		chapterService.deleteChapterByName(id);
	}
	
	
}
