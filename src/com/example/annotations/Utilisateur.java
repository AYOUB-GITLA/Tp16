package com.example.annotations;

public class Utilisateur {

	@NotNull
    @Length(min = 3, max = 50)
    private String nom;
    
    @NotNull
    @Length(min = 5, max = 100)
    private String email;
    
    @Range(min = 18, max = 120)
    private int age;

	/**
	 * @param nom
	 * @param email
	 * @param age
	 */
	public Utilisateur(String nom, String email, int age) {
		super();
		this.nom = nom;
		this.email = email;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Utilisateur [nom=" + nom + ", email=" + email + ", age=" + age + "]";
	}
    
    
}
