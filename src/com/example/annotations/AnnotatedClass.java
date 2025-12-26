package com.example.annotations;
@Version(value="v 3.4") 
@Author(name = "Ayoub Lahmimsi", date = "2025-12-18")
public class AnnotatedClass {
    
	
	 @MethodInfo(
		        description = "Méthode qui affiche des informations",
		        tags = {"info", "affichage"},
		        revision = 2
		    )
    public void afficherInfo() {
        System.out.println("Classe annotée avec @Author");
    }
    
	 @MethodInfo(description = "Méthode principale")
    public static void main(String[] args) {
        AnnotatedClass obj = new AnnotatedClass();
        obj.afficherInfo();
        
    }
}
