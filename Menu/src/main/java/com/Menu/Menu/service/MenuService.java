package com.Menu.Menu.service;

import com.Menu.Menu.entity.MenuEntity;
import com.Menu.Menu.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public MenuEntity saveItem(MenuEntity item) {
        return menuRepository.save(item);
    }

    public List<MenuEntity> getAllItems() {
        return menuRepository.findAll();
    }
}