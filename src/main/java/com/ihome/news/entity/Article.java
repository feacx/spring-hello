package com.ihome.news.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Article implements Serializable {

  private Integer id;

  private String title;

  public Integer getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }
  
}
