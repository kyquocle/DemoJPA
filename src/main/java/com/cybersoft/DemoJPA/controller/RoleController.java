package com.cybersoft.DemoJPA.controller;

import com.cybersoft.DemoJPA.dto.RoleDTO;
import com.cybersoft.DemoJPA.entity.Roles;
import com.cybersoft.DemoJPA.repository.RoleRepository;
import com.cybersoft.DemoJPA.service.RoleServiceImp;
import com.cybersoft.DemoJPA.service.imp.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
// obfucate: làm mờ code(đổi tên code ngẫu nhiên hacker sẽ khó hiểu code)
    @Autowired
    RoleService roleService;

    @GetMapping("")
    public ResponseEntity<?> getAllRole(){
        // Phải trả về DTO về JPA không được phép trả ra entity
        return new ResponseEntity<>(roleService.getAllRole(), HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<?> getRoleByName(@PathVariable String name){
        // Phải trả về DTO về JPA không được phép trả ra entity
        return new ResponseEntity<>(roleService.getRoleByName(name), HttpStatus.OK);
    }
}
