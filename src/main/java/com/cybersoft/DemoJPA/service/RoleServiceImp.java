package com.cybersoft.DemoJPA.service;

import com.cybersoft.DemoJPA.dto.RoleDTO;
import com.cybersoft.DemoJPA.entity.Roles;
import com.cybersoft.DemoJPA.repository.RoleRepository;
import com.cybersoft.DemoJPA.service.imp.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service // đẩy dữ liệu lên bean
public class RoleServiceImp implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public List<RoleDTO> getAllRole() {
        List<Roles> list = roleRepository.findAll();
        List<RoleDTO> dtoList = new ArrayList<>();
        for (Roles data : list) {
            RoleDTO roleDTO = new RoleDTO();
            roleDTO.setId(data.getId());
            roleDTO.setName((data.getName()));
            roleDTO.setDesc(data.getDesc());

            dtoList.add(roleDTO);
        }
        return dtoList;
    }

    @Override
    public List<RoleDTO> getRoleByName(String name) {
        List<Roles> list = roleRepository.findByName(name);
        List<RoleDTO> dtoList = new ArrayList<>();
        for (Roles data : list) {
            RoleDTO roleDTO = new RoleDTO();
            roleDTO.setId(data.getId());
            roleDTO.setName((data.getName()));
            roleDTO.setDesc(data.getDesc());

            dtoList.add(roleDTO);
        }
        return dtoList;
    }
}
