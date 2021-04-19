package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.security.crypto.bcrypt.BCrypt;

import bean.User;

public class Userdao implements IDAO<User>{

	Connection connect = Connect.avoirConnection();
	
	@Override
	public boolean create(User object) {
		boolean connectionOK = false;
		try {
			PreparedStatement req = connect.prepareStatement("INSERT INTO user " + "(nom, prenom, mail, mdp)" + " VALUES (?,?,?,?) ");
			req.setString(1, object.getNom());
			req.setString(2, object.getPrenom());
			req.setString(3, object.getEmail());
			req.setString(4, object.getPwd());
			System.out.println(req);
			req.executeUpdate();
			System.out.println("Create ok");
			connectionOK = true;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Create ERREUR !");
		}
		return connectionOK;
	}

	@Override
	public List<User> read() {
		List<User> listeUser = new ArrayList<>();
		User tempUser = new User();
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM user");
			ResultSet rs = req.executeQuery();
			
			while(rs.next()) {
				tempUser.setId_user(rs.getInt("id_user"));
				tempUser.setNom(rs.getString("nom"));
				tempUser.setPrenom(rs.getString("prenom"));
				tempUser.setPrenom(rs.getString("email"));
				tempUser.setPrenom(rs.getString("pwd"));
				
				listeUser.add(tempUser);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Read ERREUR !");
		}
		return listeUser;
	}

	@Override
	public void update(User object) {

		try {
			PreparedStatement req = connect.prepareStatement("UPDATE user SET nom = ?, prenom = ? WHERE id = ?");
			req.setString(1, object.getNom());
			req.setString(2, object.getPrenom());
			req.setInt(3, object.getId_user());
			req.executeUpdate();
			
			System.out.println("Update ok");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Update ERREUR !");
		}
	}

	@Override
	public void delete(int id) {
		
		try {
			PreparedStatement req = connect.prepareStatement("DELETE FROM user WHERE id = ?");
			req.setInt(1, id);
			req.executeUpdate();
			
			System.out.println("Delete ok");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Delete ERREUR !");
		}
	}
	
	@Override
	public List<User> lister() {
		List<User> listeUser = new ArrayList<>();
		User tempUser = new User();
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM user");
			ResultSet rs = req.executeQuery();
			
			while(rs.next()) {
				tempUser.setId_user(rs.getInt("id_user"));
				tempUser.setNom(rs.getString("nom"));
				tempUser.setPrenom(rs.getString("prenom"));
				tempUser.setPrenom(rs.getString("email"));
				tempUser.setPrenom(rs.getString("pwd"));
				
				listeUser.add(tempUser);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Read ERREUR !");
		}
		return listeUser;
	}
	@Override
	public User login(String email, String pwd) {
		
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM user WHERE mail = ?");
			req.setString(1, email);
			ResultSet rs = req.executeQuery();
			
			while (rs.next()) {
				if(BCrypt.checkpw(pwd, rs.getString("mdp"))) {
					return new User(rs.getString("nom"),rs.getString("prenom"),rs.getString("mail"),rs.getString("mdp"));
				}
			}
		} catch (Exception e3) {
			e3.printStackTrace();
		}
		return null;
	}
	
	//Correction
	public boolean emailexist(String email) {
		List<User> tableauUser = new ArrayList<>();
		try {
			PreparedStatement listUser = connect.prepareStatement("SELECT * FROM user WHERE email = ?");
			listUser.setString(1, email);
			ResultSet rs = listUser.executeQuery();
			
			while (rs.next()) {
				User userTempBoucle = new User();
				userTempBoucle.setId_user(rs.getInt("id_user"));
				userTempBoucle.setEmail(rs.getString("email"));
				userTempBoucle.setPwd(rs.getString("pwd"));
				tableauUser.add(userTempBoucle);
			}
			System.out.println(tableauUser.size());
			return tableauUser.size() == 1 ? true : false;
		} catch (Exception e3) {
			e3.printStackTrace();
			return false;
		}
	}

	

	@Override
	public void vider_table(User object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
