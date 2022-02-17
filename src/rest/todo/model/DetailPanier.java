package rest.todo.model;


public class DetailPanier {
	private int idpanier;
	private int idarticle;
	private int iddetail;
	private int quantite;
	
	public DetailPanier(int idpanier, int idarticle, int iddetail, int quantite) {
		super();
		this.idpanier = idpanier;
		this.idarticle = idarticle;
		this.iddetail = iddetail;
		this.quantite = quantite;
	}
}
