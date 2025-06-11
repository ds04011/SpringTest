package com.ds04011.SpringTest.bookmark.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ds04011.SpringTest.bookmark.domain.Bookmark;

@Mapper
public interface BookmarkRepository {
	
	public int InsertBookmark(Bookmark bookmark);
		
	public List<Bookmark> selectAllBookmark();
	
	// 전달받은 url 이 포함된 행의 개수 조회 인건데, 카운트 값이 리턴될꺼야 , 
	public int selectCountByUrl(@Param("url") String url);
	
	public int deleteBookmark(@Param("id") int id);
}
