package com.ihome.news.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {
  @GetMapping("/articles")
  public String getArticles() {
    return "hello articles";
  }

  @GetMapping("/articles/{id}")
  public String getArticle(@PathVariable("id") long id) {
    return "article" + id;
  }
}
