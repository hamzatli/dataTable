package com.dataTable.controller;


import com.dataTable.model.Columns;
import com.dataTable.service.ColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/column")
public class ColumnController {

    @Autowired
    private ColumnService columnService;

    @GetMapping("/get")
    public List<Columns> getAll(){
        return columnService.getAll();
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("get/{id}")
    public Columns getOne (@PathVariable Integer id){
        return columnService.getOne(id);
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @PostMapping
    public Columns save(@RequestBody Columns columns){
        return columnService.save(columns);
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @DeleteMapping("/{id}")
    public void delete (@PathVariable Integer id){
        columnService.delete(id);
    }

}
