package com.brn.home.dao;

import com.brn.home.entity.EmployeeEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bruno
 * Date: 9/7/13
 * Time: 12:18 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addEmployee(EmployeeEntity employee) {
        this.sessionFactory.getCurrentSession().save(employee);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<EmployeeEntity> getAllEmployees() {
        return this.sessionFactory.getCurrentSession().createQuery("from EmployeeEntity").list();
    }

    @Override
    public void deleteEmployee(Integer employeeId) {
        EmployeeEntity employee = (EmployeeEntity) sessionFactory.getCurrentSession().load(
                EmployeeEntity.class, employeeId);
        if (null != employee) {
            this.sessionFactory.getCurrentSession().delete(employee);
        }
    }
}
