package com.day13;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		User user1 = new User(1,"zs","123","1",1);
		User user2 = new User(2,"ls","123","1",1);
		User user3 = new User(3,"ww","123","2",1);
		List<User> list = new ArrayList<User>();
		list.add(user1);
		list.add(user2);
		list.add(user3);

		UserDao ud = new  UserDao();
		ud.setUsers(list);
	}

}
