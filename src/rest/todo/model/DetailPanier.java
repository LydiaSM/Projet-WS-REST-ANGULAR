package rest.todo.model;

public class DetailPanier {
	private int iddetail;
	private int idarticle;
	private int idpanier;
	private int quantite;
	
	public DetailPanier(int iddetail, int idarticle, int idpanier, int quantite) {
		super();
		this.iddetail = iddetail;
		this.idarticle = idarticle;
		this.idpanier = idpanier;
		this.quantite = quantite;
	}
	
}
