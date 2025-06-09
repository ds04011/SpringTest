package com.ds04011.SpringTest.bookmark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds04011.SpringTest.bookmark.domain.Bookmark;
import com.ds04011.SpringTest.bookmark.repository.BookmarkRepository;

@Service
public class BookmarkService {
	
	@Autowired
	private BookmarkRepository bookmarkRepository;
	
	public int addBookmark(Bookmark bookmark) {
		return bookmarkRepository.InsertBookmark(bookmark);
	}
}
