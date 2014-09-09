package com.javacodegeeks.snippets.enterprise.dao.main;

/**
 * Created by Praktykant on 09.09.14.
 */
public interface DAO<T> {

    public void persist(T T);

    public T findById(int id);

    public void update(T T);

    public void delete(T T);

}