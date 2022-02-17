package rest.todo.model;

public class Panier {
	private int idpanier;
	private double prixtotal;
	  
	public Panier(int idpanier, double prixtotal) {
		this.idpanier = idpanier;
		this.prixTotal = prixtotal;
	}

	public int getIdpanier() {
		return idpanier;
	}

	public void setIdpanier(int idpanier) {
		this.idpanier = idpanier;
	}

	public double getPrixtotal() {
		return prixtotal;
	}

	public void setPrixtotal(double prixtotal) {
		this.prixtotal = prixtotal;
	}
	
}
