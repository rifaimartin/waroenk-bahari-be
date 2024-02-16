package com.vania.controllers;

import com.vania.entities.Menu;
import com.vania.services.MenuService;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin
public class MenuController {

    @Autowired
    MenuService menuService;

    @PutMapping("/menu")
    public Menu createMenu(@RequestBody Menu menu){
        return menuService.createMenu(menu);
    }

    @PostMapping("/menu")
    public Menu updateMenu(@RequestBody Menu menu){
        return menuService.updateMenu(menu);
    }

    @PutMapping("/menu/image")
    public Menu createMenuWithImage(@RequestPart MultipartFile image, String menuInput) throws IOException {
        return menuService.createMenuWithImage(menuInput, image);
    }

    @PostMapping("/menu/image")
    public Menu createMenuWithImageEdit(@RequestPart MultipartFile image, String menuInput) throws IOException {
        return menuService.updateMenuWithImage(menuInput, image);
    }

    @GetMapping("/menu/{id}")
    public Menu getMenuById(@PathVariable String id){
        return menuService.getMenuById(id);
    }

    @GetMapping("/menus")
    public List<Menu> getAllMenu(){
        return menuService.getAllMenu();
    }

    @DeleteMapping("/menu/{id}")
    public void deleteMenu(@PathVariable String id){
        menuService.deleteMenuById(id);
    }
}
