package bean;

public class User {
	//Attributs
		protected int id_user;
		protected String nom;
		protected String prenom;
		protected String email;
		protected String pwd;
		protected static int comptage;

		//Constructeurs
		public User() {
			super();
			comptage++;
		}

		public User(String nom, String prenom, String email, String pwd) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.email = email;
			this.pwd = pwd;
			comptage++;
		}
		
		//Méthodes
		
		

		//geter & setter
		public int getId_user() {
			return id_user;
		}
		
		public void setId_user(int id_user) {
			this.id_user = id_user;
		}
		
		public String getNom() {
			return nom;
		}
		
		public void setNom(String nom) {
			this.nom = nom;
		}
		
		public String getPrenom() {
			return prenom;
		}
		
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getPwd() {
			return pwd;
		}
		
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		
		public static int getComptage() {
			return comptage;
		}
		
		public static void setComptage(int comptage) {
			User.comptage = comptage;
		}

}
