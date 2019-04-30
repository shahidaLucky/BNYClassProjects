package com.javaJunitLoginDemo.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.javaJunitLoginDemo.entity.UserLogin;

public class UserLoginDAOImple implements UserLoginService {

	@Override
	public boolean login(UserLogin user) {
		// Step 1. Factory manager
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("javaJunitLoginDemo");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// Step 2. Transaction (2.2 = Query - JPQL)
		String givenEmail = user.getEmail();
		String givenPassword = user.getPassword();
		Query queryLogin = entityManager.createQuery(
				"SELECT user FROM UserLogin user WHERE user.email = :givenEmail and user.password = :givenPassword");
		queryLogin.setParameter("givenEmail", givenEmail);
		queryLogin.setParameter("givenPassword", givenPassword);
		List<UserLogin> userList = queryLogin.getResultList(); // to get the result

		// Step 3. Close manager & factory
		entityManager.close();
		entityManagerFactory.close();

		// to check the list have anything
		if (userList.size() > 0) {
			// just for checking
			System.out.println("User = " + userList.get(0).getEmail());
			return true;
		} else
			return false;

	}

	@Override
	public UserLogin getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserLogin> findUserByState(String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserLogin> findUserByZipCode(String zipCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	// one way
	public void createUsers() {

		// step-1 creating instance of manager factory
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("javaJunitLoginDemo");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// step-2 Insert into table Users
		// 2.1 begin transaction
		entityManager.getTransaction().begin();

		// 2.2 execute transaction
		UserLogin user1 = new UserLogin(1, "lucky@gmail.com", "Lucky", "12345", "Bronx", "NY", "10460");
		entityManager.persist(user1);

		UserLogin user2 = new UserLogin(2, "badal@gmail.com", "Badal", "12345", "Bronx", "NY", "10460");
		entityManager.persist(user2);

		UserLogin user3 = new UserLogin(3, "shahida@gmail.com", "Shahida", "12345", "Bronx", "NY", "10460");
		entityManager.persist(user3);

		UserLogin user4 = new UserLogin(4, "kawsar@gmail.com", "Kawsar", "12345", "Bronx", "NY", "10460");
		entityManager.persist(user4);

		// commit Transaction
		entityManager.getTransaction().commit(); // commit / save/ sending record to DB

		// closing
		entityManager.close();
		entityManagerFactory.close();
	}

	@Override
	// another way
	public void createUser(UserLogin inputUserLogin) {

		// step-1 creating instance of manager factory
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("javaJunitLoginDemo");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// step-2 Insert into table Users
		// 2.1 begin transaction
		entityManager.getTransaction().begin();
		entityManager.persist(inputUserLogin);
		
		// commit Transaction
		entityManager.getTransaction().commit(); // commit / save/ sending record to DB

		// closing
		entityManager.close();
		entityManagerFactory.close();

	}

	@Override
	public void deleteUser(int id) {
		// step-1 creating instance of manager factory
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("javaJunitLoginDemo");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		// step-2 delete user from table
		// 2.1 begin transaction
		entityManager.getTransaction().begin();
		
		//2.2 delete user
		UserLogin findUser = entityManager.find(UserLogin.class, id);
		entityManager.remove(findUser);
		System.out.println("User deleted");
		
		
		
		
		// commit transaction
		entityManager.getTransaction().commit();
		
		// close
		entityManager.close();
		entityManagerFactory.close();
		
	}

}
