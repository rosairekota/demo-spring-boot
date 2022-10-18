package com.repository;

import java.util.ArrayList;

public interface AbstractRepository<D> {
    public ArrayList<D> findAll();

    public D findById(int id);

    public boolean add (D value);
}
