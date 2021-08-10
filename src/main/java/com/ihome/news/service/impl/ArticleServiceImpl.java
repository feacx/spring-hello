package com.ihome.news.service.impl;

import com.ihome.news.entity.Article;
import com.ihome.news.mapper.ArticleMapper;
import com.ihome.news.service.ArticleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService  {
  
  @Autowired
  private ArticleMapper articleMapper;

  @Override
  public Article findById(Integer id) {
    return articleMapper.findById(id);
  }

}
