package controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class ArticleController {
    @GetMapping("/articles/new")
    public String index(Model model) {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle() {
        return "";
    }
}
