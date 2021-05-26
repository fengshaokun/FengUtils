package com.day13;

import java.io.*;
import java.util.List;

@SuppressWarnings("unchecked")
public class UserDao {

	private String filePath = "D:/fengshaokun/zuoye/a.txt";

	// 1.保存List的方法
	/**
	 * @param 接受一个User集合为参数
	 *            没有返回值
	 */
	public void setUsers(List<User> users) {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(filePath));
			oos.writeObject(users);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.flush();
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 2.读取List的方法
	public List<User> getUsers() {
		List<User> users = null;
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(filePath));
			users = (List<User>) ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}

	// 3.添加新用户
	// 先将原list读取出来,在其中add一个新的用户对象
	public void addUsers(User user) {
	List<User>users = getUsers();
	user.setUserid(users.size()+1);
     users.add(user);
     setUsers(users);
     }
     // 4.根据用户编号,修改用户的信息
		// 先将原list读取出来,遍历list,如果用户编号匹配,就修改信息;将修改以后的list写回数据文件
	public void updateUserById(User user){
		List<User>users = getUsers();
		users.set(user.getUserid()-1, user);//使用用户编号-1,找到要修改的用户下标
		setUsers(users);		
	}
	// 5.根据用户编号,查询用户记录
	public User inquireUserById(int userId ){
		List<User>users = getUsers();
		return users.get(userId-1);
	}
		
	}

