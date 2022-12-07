package com.example.springboot3.service;

import com.example.springboot3.entity.Role;

import java.util.List;

public interface RoleService {
    void addRole(Role role);
    void updateRole(Role role);
    void removeRoleById(Integer id);
    List<Role> getAllRoles();
    Role getRoleByName(String name);
}
