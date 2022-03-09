package cg.service;

import cg.model.Category;

public interface ICategoryService {
        Iterable<Category> findAll();
        Iterable<Category> findAllByName(String name);
}
