package com.ds04011.SpringTest.bookmark.service;

import java.util.List;

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
	
	public List<Bookmark> getBookmarkList(){
		return bookmarkRepository.selectAllBookmark();
	}
	
	public boolean isUrlDuplicate(String url) {
		int count = bookmarkRepository.selectCountByUrl(url);
		
		boolean is = false;
		
		if(count == 0) {
			is = false;
		} else {
			// 수가 1 이상 = 중복됨 
			is = true;
		}
		
		return is;
		
	}
	
	public int deleteBookmark(int id) {
		
		int count = bookmarkRepository.deleteBookmark(id);
		return count;
	}
}
