package application;

//C'est le model
public class Stagiaire {
	
    private String nom;
	private String email;
	private String phone;
	private String profil;
	private String preferences;
	private String commentaire;
	private String ville;
	
	public Stagiaire(String nom, String email, String phone, String profil, String preferences, String commentaire,
			String ville) {
		this.nom = nom;
		this.email = email;
		this.phone = phone;
		this.profil = profil;
		this.preferences = preferences;
		this.commentaire = commentaire;
		this.ville = ville;
	}
	
	@Override
	public String toString() {
		return "Stagiaire [nom=" + nom + ", email=" + email + ", phone=" + phone + ", profil=" + profil
				+ ", preferences=" + preferences + ", commentaire=" + commentaire + ", ville=" + ville + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getProfil() {
		return profil;
	}
	public void setProfil(String profil) {
		this.profil = profil;
	}
	public String getPreferences() {
		return preferences;
	}
	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}

}
