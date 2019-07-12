package org.ccem.otus.api.spring.permission.repositories;

import org.ccem.otus.api.spring.permission.models.Permission;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IPermissionRepository extends MongoRepository<Permission, String> {

    @Query("{_id: ?0},{version: ?0}")
    Permission updateVersionById(String id, Integer version);

    @Query("{_id: ?0},{version: ?0}")
    Permission aggregate(String id, Integer version);
}
