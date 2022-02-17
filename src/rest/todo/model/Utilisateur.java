package rest.todo.model;

public class Utilisateur {
	private int idutilisateur;
	private String login;
	private String mdp;
	private String role;
	
	
	public Utilisateur(int idutilisateur, String login, String mdp, String role) {
		super();
		this.idutilisateur = idutilisateur;
		this.login = login;
		this.mdp = mdp;
		this.role = role;
	}
}