package bean;

import org.w3c.dom.Text;

public class Article {
	
	//Attributs
	protected int id_article;
	protected String titre;
	protected String resum;
	protected String contenu;
	protected String created_at;
	protected int auteur;
	protected static int comptage;

	//Constructeurs
	public Article() {
		super();
		comptage++;
	}

	public Article(String titre, String resum, String contenu, String created_at, int auteur) {
		super();
		this.titre = titre;
		this.resum = resum;
		this.contenu = contenu;
		this.created_at = created_at;
		this.auteur = auteur;
		comptage++;
	}

	public Article(String titre, String resum, String contenu, int auteur) {
		super();
		this.titre = titre;
		this.resum = resum;
		this.contenu = contenu;
		this.auteur = auteur;
	}

	//Méthodes
	
	//geter & setter
	public int getId_article() {
		return id_article;
	}

	public void setId_article(int id_article) {
		this.id_article = id_article;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getResum() {
		return resum;
	}

	public void setResum(String resum) {
		this.resum = resum;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public int getAuteur() {
		return auteur;
	}

	public void setAuteur(int auteur) {
		this.auteur = auteur;
	}

	public static int getComptage() {
		return comptage;
	}

	public static void setComptage(int comptage) {
		Article.comptage = comptage;
	}

}

