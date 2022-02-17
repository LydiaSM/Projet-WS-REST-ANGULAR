package rest.todo.model;


public class DetailPanier {
	private int idPanier;
	private int idArticle;
	private int idDetail;
	private int quantity;
	public DetailPanier(int idPanier, int idArticle, int idDetail, int quantity) {
		super();
		this.idPanier = idPanier;
		this.idArticle = idArticle;
		this.idDetail = idDetail;
		this.quantity = quantity;
	}
	
	

}
