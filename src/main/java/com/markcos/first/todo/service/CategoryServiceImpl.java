package com.markcos.first.todo.service;

import com.markcos.first.todo.entity.CategoryEntity;
import com.markcos.first.todo.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public Optional<CategoryEntity> getCategory(String name) {
        return categoryRepository.findByName(name);
    }

}
