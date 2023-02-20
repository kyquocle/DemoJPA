package com.cybersoft.DemoJPA.service;

import com.cybersoft.DemoJPA.dto.UserDTO;
import com.cybersoft.DemoJPA.entity.Roles;
import com.cybersoft.DemoJPA.entity.Users;
import com.cybersoft.DemoJPA.payload.LoginRequest;
import com.cybersoft.DemoJPA.repository.UserRepository;
import com.cybersoft.DemoJPA.service.imp.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserDTO> getAllUsers() {
        List<Users> list = userRepository.findAll();
        List<UserDTO> dtoList = new ArrayList<>();
        for (Users data: list){
            UserDTO userDTO = new UserDTO();
            userDTO.setEmail(data.getEmail());
            userDTO.setPassword(data.getPassword());

            dtoList.add(userDTO);
        }
        return dtoList;
    }

    @Override
    public boolean login(LoginRequest loginRequest) {
        return userRepository.findByEmailAndPassword(loginRequest.getEmail(), loginRequest.getPassword()).size() > 0;
    }

    @Override
    public boolean insertUser(UserDTO userDTO) {
        Roles roles = new Roles();
//        roles.setId(userDTO.getRoleId());
        Users users = new Users();
        users.setEmail(userDTO.getEmail());
        users.setPassword(userDTO.getPassword());
        users.setFullName(userDTO.getFullName());
        users.setAvatar(userDTO.getAvatar());
        users.setRoleId(userDTO.getRoleId());
//        users.setRoles(roles);
        try {
            userRepository.save(users);
            return true;
        }
                //save: nếu id của cái mình thêm trùng id cái đã có thì nó sẽ cập nhật,
                // còn không trùng thì nó sẽ thêm
        catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<UserDTO> getAllUser() {
        List<UserDTO> list = new ArrayList<>();
        for (Users users:userRepository.getAllUser()){
            UserDTO userDTO = new UserDTO();
            userDTO.setEmail(users.getEmail());
            userDTO.setPassword(users.getPassword());
            userDTO.setFullName(users.getFullName());
            userDTO.setAvatar(users.getAvatar());

            list.add(userDTO);
        }
        return list;
    }

    @Override
    public List<UserDTO> getByEmailAndRoleName(String email, String roleName) {
        List<UserDTO> list = new ArrayList<>();
        for (Users users:userRepository.getByEmailAndRoleName(email, roleName)){
            UserDTO userDTO = new UserDTO();
            userDTO.setEmail(users.getEmail());
            userDTO.setPassword(users.getPassword());
            userDTO.setFullName(users.getFullName());
            userDTO.setAvatar(users.getAvatar());

            list.add(userDTO);
        }
        return list;
    }
}
