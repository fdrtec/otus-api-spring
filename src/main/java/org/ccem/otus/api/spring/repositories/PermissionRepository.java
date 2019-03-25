package org.ccem.otus.api.spring.repositories;

import org.ccem.otus.api.spring.documents.Permission;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PermissionRepository extends MongoRepository<Permission, String> {
}
