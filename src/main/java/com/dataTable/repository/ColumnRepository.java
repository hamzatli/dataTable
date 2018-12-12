package com.dataTable.repository;


import com.dataTable.model.Columns;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColumnRepository extends CrudRepository<Columns, Integer> {
}
