package com.ds04011.SpringTest.bookmark;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ds04011.SpringTest.bookmark.domain.Bookmark;
import com.ds04011.SpringTest.bookmark.service.BookmarkService;

@Controller
public class BookmarkController {
	
	@Autowired
	private BookmarkService bookmarkService;
	
	@GetMapping("/bookmark/list")
	public String bookmarkList(Model model) {
		
		List<Bookmark> list1 =  bookmarkService.getBookmarkList();
		model.addAttribute("result", list1);
		
		return "bookmark/list";
	}
	
	
	@GetMapping("/bookmark/input")
	public String bookmarkpage() {
		return "bookmark/input";
	}
	
	
	@ResponseBody
	@PostMapping("/bookmark/add")
	public Map<String, String> bookmarkAdd(@RequestParam("name") String name
			, @RequestParam("url") String url) {
		
		
		Bookmark bookmark = new Bookmark();
		bookmark.setName(name);
		bookmark.setUrl(url);
		
		int count = bookmarkService.addBookmark(bookmark);
		String result = "fail";
		if(count == 1) {
			result="success";
		}
		
		Map<String, String> map1 = new HashMap<>();
		map1.put("result", result);
		
		return map1;
		
		
	}
	
	@ResponseBody
	@GetMapping("/bookmark-url-duplicate")
	public Map<String, Boolean> isUrlDuplicate(@RequestParam("url") String url) {
		
		// 중복 여부가 리턴됨, 
		boolean dup = bookmarkService.isUrlDuplicate(url);
		
		Map<String, Boolean> map1 = new HashMap<>();
		map1.put("isDuplicate", dup);
		
		return map1;
		
	}
	
	
	
}
