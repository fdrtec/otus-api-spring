package org.ccem.otus.api.spring.permission.repositories;

import org.ccem.otus.api.spring.permission.models.Permission;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PermissionRepository extends MongoRepository<Permission, String> {
}
