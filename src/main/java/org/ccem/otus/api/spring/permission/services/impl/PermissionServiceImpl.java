package org.ccem.otus.api.spring.permission.services.impl;

import org.ccem.otus.api.spring.permission.models.Permission;
import org.ccem.otus.api.spring.permission.repositories.PermissionRepository;
import org.ccem.otus.api.spring.permission.services.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public List<Permission> findAll() {
        return this.permissionRepository.findAll();
    }

    public Optional<Permission> findById(String id) {
        return this.permissionRepository.findById(id);
    }

    @Override
    public Permission create(Permission permission) {
        return this.permissionRepository.save(permission);
    }

    @Override
    public Permission update(Permission permission) {
        return this.permissionRepository.save(permission);
    }

    @Override
    public void delete(String id) {
        this.permissionRepository.deleteById(id);

    }
}
