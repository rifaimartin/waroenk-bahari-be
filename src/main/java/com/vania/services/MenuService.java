package com.vania.services;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.vania.entities.Menu;
import java.util.List;


public interface MenuService {
    Menu getMenuById(String id);
    List<Menu> getAllMenu();
    Menu createMenuWithImage(String menuInput, MultipartFile image) throws IOException;
    void deleteMenuById(String id);
    Menu updateMenuWithImage(String menuInput, MultipartFile image) throws IOException;
    Menu createMenu(Menu menu);
    Menu updateMenu(Menu menu);
}
