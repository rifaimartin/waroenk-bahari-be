package com.vania.controllers;

import com.vania.entities.Menu;
import com.vania.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class MenuController {

    @Autowired
    MenuService menuService;

    @PutMapping("/menu")
    public Menu createMenu(@RequestBody Menu menu){
        return menuService.createMenu(menu);
    }
}
