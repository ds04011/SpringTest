package com.ds04011.SpringTest.bookmark;

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
		
		
		
		return "bookmark/list";
	}
	
	
	@GetMapping("/bookmark/input")
	public String bookmarkpage() {
		return "bookmark/input";
	}
	
	
	@ResponseBody
	@PostMapping("/bookmark/add")
	public String bookmarkAdd(@RequestParam("name") String name
			, @RequestParam("url") String url) {
		
		
		Bookmark bookmark = new Bookmark();
		bookmark.setName(name);
		bookmark.setUrl(url);
		
		int count = bookmarkService.addBookmark(bookmark);
		
		
		
		return "redirect:/bookmark/list";
		
		
	}
	
	
	
}
