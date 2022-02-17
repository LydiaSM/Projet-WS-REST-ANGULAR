package rest.todo.model;

public class DetailPanier {
	private int idDetail;
	private int idArticle;
	private int idPanier;
	private int quantite;
	
	public DetailPanier(int idDetail, int idArticle, int idPanier, int quantite) {
		this.idDetail = idDetail;
		this.idArticle = idArticle;
		this.idPanier = idPanier;
		this.quantite = quantite;
	}
	
	public void AfficherPanier() {
		//pour afficher les articles du panier
	}
	public void supprimerArticle() {
		this.quantite -- ;
	}
	
	public void ajouterArticle(int idArticle) {
		
	}
}
