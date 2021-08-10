package com.ihome.news.mapper;

import com.ihome.news.entity.Article;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {

  public Article findById(Integer id);
  
}
