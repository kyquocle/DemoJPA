package com.cybersoft.DemoJPA.controller;

import com.cybersoft.DemoJPA.dto.UserDTO;
import com.cybersoft.DemoJPA.payload.LoginRequest;
import com.cybersoft.DemoJPA.service.imp.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

//    @GetMapping("")
//    public ResponseEntity<?> getUser(){
//        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
//    }

//    @PostMapping("")
//    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest){
//        return new ResponseEntity<>(userService.login(loginRequest),HttpStatus.OK);
//        // ResponseEntity trả về JSON nên post man nhớ đổi text qua JSON
//    }

    @PostMapping("")
    public ResponseEntity<?> addUser(@RequestBody UserDTO userDTO){
        userService.insertUser(userDTO);
        return new ResponseEntity<>("",HttpStatus.OK);
    }

    @GetMapping("")
        public ResponseEntity<?> getAllUser(){
        return new ResponseEntity<>(userService.getAllUser(),HttpStatus.OK);
        }

    @GetMapping("/getUserbyEmailAndRoleName")
    public ResponseEntity<?> getByEmailAndRoleName(
            @RequestParam("email") String email,
            @RequestParam("roleName") String roleName
    ){
        return new ResponseEntity<>(userService.getByEmailAndRoleName(email, roleName),HttpStatus.OK);
    }
}
