package beans;

public class Utilisateur {

	private int id_user;
	private String nom_user;
	private String prenom_user;
	private int age_user;
	private String login;
	private String password;
	private int rang;
	
	
	public Utilisateur(int id_user, String nom_user, String prenom_user,
			int age_user, String login, String password, int rang) {
		
		super();
		this.id_user = id_user;
		this.nom_user = nom_user;
		this.prenom_user = prenom_user;
		this.age_user = age_user;
		this.login = login;
		this.password = password;
		this.rang = rang;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getNom_user() {
		return nom_user;
	}

	public void setNom_user(String nom_user) {
		this.nom_user = nom_user;
	}

	public String getPrenom_user() {
		return prenom_user;
	}

	public void setPrenom_user(String prenom_user) {
		this.prenom_user = prenom_user;
	}

	public int getAge_user() {
		return age_user;
	}

	public void setAge_user(int age_user) {
		this.age_user = age_user;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRang() {
		return rang;
	}

	public void setRang(int rang) {
		this.rang = rang;
	}
	
	public void ajouterUtilisateur(){
		
		
		
	}
}
	
	
	

