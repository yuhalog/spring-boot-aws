package com.yuha.book.springbootaws.web;

import com.yuha.book.springbootaws.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class IndexController {

    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts", postsService.findByDesc());
        return "index";
    }

    @GetMapping("/posts/save")
    public String save() {
        return "posts-save";
    }

}