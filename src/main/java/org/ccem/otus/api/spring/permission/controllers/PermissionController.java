package org.ccem.otus.api.spring.permission.controllers;

import org.ccem.otus.api.spring.permission.models.Permission;
import org.ccem.otus.api.spring.permission.responses.Response;
import org.ccem.otus.api.spring.permission.services.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/permissions")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @GetMapping
    public ResponseEntity<Response<List<Permission>>> findAll(){
        return ResponseEntity.ok(new Response<List<Permission>>(this.permissionService.findAll()));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Response<Optional<Permission>>> findById(@PathVariable(name = "id") String id){
        return ResponseEntity.ok(new Response<Optional<Permission>>(this.permissionService.findById(id)));
    }

    @PostMapping
    public ResponseEntity<Response<Permission>> create(@Valid @RequestBody Permission permission, BindingResult result){
        if(result.hasErrors()){
            List<String> errors = new ArrayList<>();
            result.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Permission>(errors));

        }

        return ResponseEntity.ok(new Response<Permission>(this.permissionService.create(permission)));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Response<Permission>> update(@Valid @PathVariable(name = "id") String id, @RequestBody Permission permission, BindingResult result){
        if(result.hasErrors()){
            List<String> errors = new ArrayList<>();
            result.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Permission>(errors));
        }

        permission.setId(id);
        return ResponseEntity.ok(new Response<Permission>(this.permissionService.update(permission)));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Response<Integer>> delete(@PathVariable(name = "id") String id){
        this.permissionService.delete(id);
        return ResponseEntity.ok(new Response<Integer>(1));

    }


}
