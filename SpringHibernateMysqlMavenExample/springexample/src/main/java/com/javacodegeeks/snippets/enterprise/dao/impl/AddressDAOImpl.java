package com.javacodegeeks.snippets.enterprise.dao.impl;


import com.javacodegeeks.snippets.enterprise.dao.repository.AddressDAO;
import com.javacodegeeks.snippets.enterprise.model.Address;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by Praktykant on 09.09.14.
 */

public class AddressDAOImpl extends HibernateDaoSupport implements AddressDAO {

    private HibernateTemplate template = null;

    @Override
    public void persist(Address T) {
        template.persist(T);
    }

    @Override
    public Address findById(int id) {
        return (Address) template.get(Address.class,id);
    }

    @Override
    public void update(Address T) {
        template.update(T);
    }

    @Override
    public void delete(Address T) {
        template.delete(T);
    }
}
