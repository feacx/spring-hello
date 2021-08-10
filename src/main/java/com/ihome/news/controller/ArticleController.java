package com.ihome.news.controller;

import com.ihome.news.entity.Article;
import com.ihome.news.service.ArticleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articles")
public class ArticleController {

  @Autowired
  private ArticleService articleService;

  @GetMapping
  public String getArticles() {
    return "hello articles";
  }

  @GetMapping("/{id}")
  public String getArticle(@PathVariable("id") Integer id) {
    Article article = articleService.findById(id);
    return article.getTitle();
  }

}
