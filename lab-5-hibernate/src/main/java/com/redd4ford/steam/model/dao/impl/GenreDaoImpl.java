package com.redd4ford.steam.model.dao.impl;

import com.redd4ford.steam.model.dao.AbstractGenericDaoImpl;
import com.redd4ford.steam.model.entity.Genre;

public class GenreDaoImpl extends AbstractGenericDaoImpl<Genre> {

  public GenreDaoImpl() {
    super(Genre.class);
  }

}
