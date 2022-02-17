package rest.todo.model;

public class Utilisateur {
	private int idUtilisateur;
	private String login;
	private String mdp;
	private String role;
	
	
	public Utilisateur(int idUtilisateur, String login, String mdp, String role) {
		this.idUtilisateur = idUtilisateur;
		this.login = login;
		this.mdp = mdp;
		this.role = role;
	}
}