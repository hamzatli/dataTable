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

    @GetMapping
    public List<Columns> getAll(){
        return columnService.getAll();
    }

    @PutMapping
    public Columns update(@RequestBody Columns columns){
        return columnService.update(columns);
    }

    @GetMapping("/{id}")
    public Columns getOne (@PathVariable Integer id){
        return columnService.getOne(id);
    }

    @PostMapping
    public Columns save(@RequestBody Columns columns){
        return columnService.save(columns);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Integer id){
        columnService.delete(id);
    }

}
