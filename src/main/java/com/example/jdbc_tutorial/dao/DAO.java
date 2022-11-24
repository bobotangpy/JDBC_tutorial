package com.example.jdbc_tutorial.dao;

import java.util.List;
import java.util.Optional;

// Data Access Object => commands for access the DB
public interface DAO<T> {
    List<T> list();

    void create(T t);

    Optional<T> get(int id);

    void update(T t, int id);

    void delete(int id);
}
