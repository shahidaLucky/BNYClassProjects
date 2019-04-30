package com.jpaSampleProject.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpaSampleProject.entities.Employee;

//import com.jpaSampleProject.entities.Employee;

public class EmployeeService {

	public static void createEmployee(Employee newEmployee) {
		
		//creating instance of Managerfarcory and manager
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("japSampleProject");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		
		//insert into table employee
		entitymanager.getTransaction().begin();
		entitymanager.persist(newEmployee);       // one insert into table Employee {name}...... 
		entitymanager.getTransaction().commit(); // commit / save/ sending record to DB
		
		//closing 
		entitymanager.close();
		entityManagerFactory.close();
	}

	public Employee findEmployee(int EMPLOYEEID) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("japSampleProject");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// find employee
		Employee foundEmployee = entityManager.find(Employee.class, EMPLOYEEID);

		//entityManager.close();
		//entityManagerFactory.close();

		return foundEmployee;

	}

	public  void updateEmployeePhone(int EMPLOYEEID, String PHONE) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("japSampleProject");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();

		entitymanager.getTransaction().begin();
		Employee founEmployee = entitymanager.find(Employee.class, EMPLOYEEID);
		founEmployee.setPHONE(PHONE);
		entitymanager.getTransaction().commit();

		//entitymanager.close();
		//entityManagerFactory.close();

	}

	public  Employee removeEmployee(int EMPLOYEEID) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("japSampleProject");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		entitymanager.getTransaction().begin();

		Employee founEmployee = entitymanager.find(Employee.class,EMPLOYEEID);
		entitymanager.remove(founEmployee);
		entitymanager.getTransaction().commit();
		return founEmployee;

		//entitymanager.close();
		//entityManagerFactory.close();

	}

}
