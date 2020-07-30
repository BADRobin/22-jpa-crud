package com.bryl.jpacrud.service;

import com.bryl.jpacrud.dao.EmployeeDAO;
import com.bryl.jpacrud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(@Qualifier ("employeeDAOJpaImpl")EmployeeDAO TheEmployeeDAO){
        employeeDAO = TheEmployeeDAO;

    }

    @Override
    @Transactional
    public List<Employee> findAll() {

        return employeeDAO.findAll();
    }

    @Override
    @Transactional
    public Employee findById(int theId) {

        return employeeDAO.findById(theId);
    }

    @Override
    @Transactional
    public void save(Employee theEmployee) {
        employeeDAO.save(theEmployee);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        employeeDAO.deleteById(theId);
    }
}
