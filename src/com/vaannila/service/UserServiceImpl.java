package com.vaannila.service;

import com.vaannila.domain.User;
import org.apache.log4j.Logger;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class UserServiceImpl implements UserService {
        static Logger log = Logger.getLogger(UserServiceImpl.class.getName());
	@Override
	public void add(User user) throws IOException,SQLException {
		//Persist the user object here. 
		log.debug("User added successfully");

	}

}
