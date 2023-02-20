package com.cybersoft.DemoJPA.service.imp;

import com.cybersoft.DemoJPA.dto.UserDTO;
import com.cybersoft.DemoJPA.entity.Users;
import com.cybersoft.DemoJPA.payload.LoginRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {

    List<UserDTO> getAllUsers();
    boolean login(LoginRequest loginRequest);
    boolean insertUser(UserDTO userDTO);

    List<UserDTO> getAllUser();

    List<UserDTO> getByEmailAndRoleName(String email, String roleName);
}
