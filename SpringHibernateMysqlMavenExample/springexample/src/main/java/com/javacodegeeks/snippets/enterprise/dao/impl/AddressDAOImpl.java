package com.javacodegeeks.snippets.enterprise.dao.impl;

import com.javacodegeeks.snippets.enterprise.dao.repository.AddressDAO;
import com.javacodegeeks.snippets.enterprise.model.Address;
import org.hibernate.SessionFactory;

/**
 * Created by Praktykant on 09.09.14.
 */

public class AddressDAOImpl implements AddressDAO {

    SessionFactory sessionFactory;

    public Address findAddress(long id) {
        return (Address) sessionFactory.getCurrentSession().get(Address.class, id);
    }

    @Override
    public void persist(Address T) {
        sessionFactory.getCurrentSession().persist(T);
    }

    @Override
    public Address findById(int id) {
        return (Address) sessionFactory.getCurrentSession().get(Address.class, id);
    }

    @Override
    public void update(Address T) {
        sessionFactory.getCurrentSession().update(T);
    }

    @Override
    public void delete(Address T) {
        sessionFactory.getCurrentSession().delete(T);
    }
}
