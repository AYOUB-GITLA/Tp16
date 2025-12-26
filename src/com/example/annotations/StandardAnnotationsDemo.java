package com.example.annotations;

import java.util.ArrayList;
import java.util.List;

public class StandardAnnotationsDemo {
    
    
	@Deprecated(since = "1.2", forRemoval = true)
    public void ancienneMethode() {
        System.out.println("Cette méthode est obsolète");
    }
    
    
    @Override
    public String toString() {
        return "StandardAnnotationsDemo";
    }
    
    
    @SuppressWarnings("unchecked")
    public List<String> getList() {
        ArrayList list = new ArrayList();
        return list;
    }
    public static void main(String[] args) {
    	//ETAPE 1
        StandardAnnotationsDemo demo = new StandardAnnotationsDemo();
        
        demo.ancienneMethode();
        
        System.out.println(demo);
        
        List<String> liste = demo.getList();
        System.out.println("Liste créée: " + liste);
        //ETAPE2 LIRE ANNOTATION
        Class<StandardAnnotationsDemo> cla = StandardAnnotationsDemo.class;

        if (cla.isAnnotationPresent(Author.class)) {
            Author author = cla.getAnnotation(Author.class);

            System.out.println("Auteur : " + author.name());
            System.out.println("Date   : " + author.date());
        }
        
    }
}
