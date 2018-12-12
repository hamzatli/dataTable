package com.dataTable.service;


import com.dataTable.model.Columns;

import java.util.List;

public interface ColumnService {


    Columns save(Columns columns);

    void delete(Integer id);

    void update (Columns columns);

    List<Columns> getAll();

    Columns getOne(Integer id);



}
