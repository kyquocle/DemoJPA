package com.cybersoft.DemoJPA.service.imp;

import com.cybersoft.DemoJPA.dto.RoleDTO;

import java.util.List;

public interface RoleService {
    List<RoleDTO> getAllRole();
    List<RoleDTO> getRoleByName(String name);
}
