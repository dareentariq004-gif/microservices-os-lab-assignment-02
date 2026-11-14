package com.Menu.Menu.controller;

import com.Menu.Menu.entity.MenuEntity;
import com.Menu.Menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")

public class MenuController {

    @Autowired
    private MenuService menuService;

    @PostMapping
    public MenuEntity createItem(@RequestBody MenuEntity item) {
        return menuService.saveItem(item);
    }

    @GetMapping
    public List<MenuEntity> getAllItems() {
        return menuService.getAllItems();
    }
}