package com.eq.app;

import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eq.dao.UserDAO;
import com.eq.model.User;
import com.eq.model.UserLog;
import com.eq.model.UserProfile;

public class Application {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        
     
       

       UserDAO userDao = context.getBean(UserDAO.class);
       User user =userDao.findUserByUserId(1);
       Set<UserLog> logs =user.getUserLogs();
       System.out.println("set size is : "+logs.size());
        context.close(); 
	}
}
