package org.ccem.otus.api.spring.permission.services.impl;

import org.ccem.otus.api.spring.permission.models.Permission;
import org.ccem.otus.api.spring.permission.repositories.IPermissionRepository;
import org.ccem.otus.api.spring.permission.services.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private IPermissionRepository IPermissionRepository;

    @Override
    public List<Permission> findAll() {
        return this.IPermissionRepository.findAll();
    }

    public Optional<Permission> findById(String id) {
        return this.IPermissionRepository.findById(id);
    }

    @Override
    public Permission create(Permission permission) {
        return this.IPermissionRepository.save(permission);
    }

    @Override
    public Permission update(Permission permission) {
        return this.IPermissionRepository.save(permission);
    }

    @Override
    public void delete(String id) { this.IPermissionRepository.deleteById(id); }

    @Override
    public Permission updateVersion(String id, Integer version){
        return  this.IPermissionRepository.updateVersionById(id, version);

    }

    @Override
    public Permission aggregate(String id, Integer version){
        return  this.IPermissionRepository.aggregate(id, version);

    }



}
