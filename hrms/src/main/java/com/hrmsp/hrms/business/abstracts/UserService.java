package com.hrmsp.hrms.business.abstracts;

import java.util.List;

import com.hrmsp.hrms.entities.concretes.User;

public interface UserService {
		void add(User user);
		void delete(User user);
		List<User>getAll();
		User getById(int id);
}
