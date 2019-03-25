package org.ccem.otus.api.spring.controllers;

import org.ccem.otus.api.spring.documents.Permission;
import org.ccem.otus.api.spring.services.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/permissions")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @GetMapping
    public ResponseEntity<List<Permission>> findAll(){
        return ResponseEntity.ok(this.permissionService.findAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Permission>> findById(@PathVariable(name = "id") String id){
        return ResponseEntity.ok(this.permissionService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Permission> create(@RequestBody Permission permission){
        return ResponseEntity.ok(this.permissionService.create(permission));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Permission> update(@PathVariable(name = "id") String id, @RequestBody Permission permission){
        permission.setId(id);
        return ResponseEntity.ok(this.permissionService.update(permission));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Integer> delete(@PathVariable(name = "id") String id){
        this.permissionService.delete(id);
        return ResponseEntity.ok(1);

    }


}
