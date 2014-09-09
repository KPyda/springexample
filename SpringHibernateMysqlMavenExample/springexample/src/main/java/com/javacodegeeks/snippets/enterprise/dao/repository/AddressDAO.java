package com.javacodegeeks.snippets.enterprise.dao.repository;

import com.javacodegeeks.snippets.enterprise.dao.main.DAO;
import com.javacodegeeks.snippets.enterprise.model.Address;

/**
 * Created by Praktykant on 09.09.14.
 */
public interface AddressDAO extends DAO<Address> {
    public void persist(Address T);
    public Address findById(int id);
    public void update(Address T);
    public void delete(Address T);
}
