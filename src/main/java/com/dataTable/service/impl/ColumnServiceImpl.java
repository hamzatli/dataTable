package com.dataTable.service.impl;

import com.dataTable.model.Columns;
import com.dataTable.repository.ColumnRepository;
import com.dataTable.service.ColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ColumnServiceImpl implements ColumnService {

    @Autowired
    private ColumnRepository columnRepository;

    @Override
    public Columns save(Columns columns) {

        if (!Objects.isNull(columns)) {
            return columnRepository.save(columns);
        }
        else return null;
    }

    @Override
    public void delete(Integer id) {

        columnRepository.deleteById(id);
    }

    @Override
    public void update(Columns columns) {



    }

    @Override
    public List<Columns> getAll() {
        return (List<Columns>) columnRepository.findAll();
    }

    @Override
    public Columns getOne(Integer id) {
        return columnRepository.findById(id).orElse(null);
    }
}
