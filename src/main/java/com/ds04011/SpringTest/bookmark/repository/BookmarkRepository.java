package com.ds04011.SpringTest.bookmark.repository;

import org.apache.ibatis.annotations.Mapper;

import com.ds04011.SpringTest.bookmark.domain.Bookmark;

@Mapper
public interface BookmarkRepository {
	
	public int InsertBookmark(Bookmark bookmark);
		
	
}
