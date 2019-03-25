package org.ccem.otus.api.spring.services;

import org.ccem.otus.api.spring.documents.Permission;

import java.util.List;
import java.util.Optional;

public interface PermissionService {

    List<Permission> findAll();

    Optional<Permission> findById(String id);

    Permission create(Permission permission);

    Permission update(Permission permission);

    void delete(String id);

}
