package rest.todo.model;

public class Panier {
	private int idPanier;
	private double prixTotal;
	
	public Panier(int idPanier, double prixTotal) {
		super();
		this.idPanier = idPanier;
		this.prixTotal = prixTotal;
	}

	public int getIdPanier() {
		return idPanier;
	}

	public void setIdPanier(int idPanier) {
		this.idPanier = idPanier;
	}

	public double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}
	
}
