/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.dao;

import com.niit.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nikhi
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    SessionFactory sessionFactory;
            
    public void save(User u) {
        Session openSession = sessionFactory.openSession();
        Transaction beginTransaction = openSession.beginTransaction();
        openSession.save(u);
        beginTransaction.commit();
        openSession.close();
    }

	public void delete(User e) {
		// TODO Auto-generated method stub
		
	}
    
}
