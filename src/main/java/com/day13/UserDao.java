package com.day13;

import java.io.*;
import java.util.List;

@SuppressWarnings("unchecked")
public class UserDao {

	private String filePath = "D:/fengshaokun/zuoye/a.txt";

	// 1.����List�ķ���
	/**
	 * @param ����һ��User����Ϊ����
	 *            û�з���ֵ
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

	// 2.��ȡList�ķ���
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

	// 3.������û�
	// �Ƚ�ԭlist��ȡ����,������addһ���µ��û�����
	public void addUsers(User user) {
	List<User>users = getUsers();
	user.setUserid(users.size()+1);
     users.add(user);
     setUsers(users);
     }
     // 4.�����û����,�޸��û�����Ϣ
		// �Ƚ�ԭlist��ȡ����,����list,����û����ƥ��,���޸���Ϣ;���޸��Ժ��listд�������ļ�
	public void updateUserById(User user){
		List<User>users = getUsers();
		users.set(user.getUserid()-1, user);//ʹ���û����-1,�ҵ�Ҫ�޸ĵ��û��±�
		setUsers(users);		
	}
	// 5.�����û����,��ѯ�û���¼
	public User inquireUserById(int userId ){
		List<User>users = getUsers();
		return users.get(userId-1);
	}
		
	}

