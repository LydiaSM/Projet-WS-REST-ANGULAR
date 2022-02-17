package rest.todo.model;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Article {
    private int idArticle;
    private String label;
    private String marque;
    private String prix;
    private Categorie categorie;
    private String photo;

    public Article(){

    }

	public Article(int idArticle, String label, String marque, String prix, Categorie categorie, String photo) {
		this.idArticle = idArticle;
		this.label = label;
		this.marque = marque;
		this.prix = prix;
		this.categorie = categorie;
		this.photo = photo;
	}

	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}