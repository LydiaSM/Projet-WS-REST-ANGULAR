package rest.todo.model;

public class Panier {
	
	
	private int id;
	private double prixTotal;
	  
	public Panier(int id, double prixTotal) {
		this.id=id;
		this.prixTotal=prixTotal;
	}
	  public int getId() {
		return id;
	}
	  
	public void setId(int id) {
		this.id = id;
	}
	public double getPrixTotal() {
		return prixTotal;
	}
	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}

}
