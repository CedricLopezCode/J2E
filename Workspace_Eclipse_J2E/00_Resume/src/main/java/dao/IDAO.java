package dao;

import java.util.List;

import bean.User;

public interface IDAO<T> {

	public boolean create(T object);
	public List<T> read();
	public void update(T object);
	public void delete(int id);
	public List<T> lister();
	public T findById(int id);
	public void vider_table(T object);
	public User login(String email, String pwd);
	
}