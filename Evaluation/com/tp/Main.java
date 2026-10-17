package Evaluation.com.tp;

public class Main {
	public static void main(String[] args) {
		// Creation de deux clients
		Client c1= new Client (1,"Hind","El hannaoui");
		Client c2= new Client (2,"Reda","Alami");
		
		
		
		 //  Creation des vehicules
		Voiture v1 = new Voiture("A87621", "Cliot", 300, 5);
        Voiture v2 = new Voiture("B89652", "Dacia", 400, 7);
        Moto m1 = new Moto("C87123", "BMW", 150, 125);
        
     //  Tableau des vehicules
        Vehicule[] vehicules = {v1, v2, m1};
	    
        //  Affichage des vehicules
        System.out.println("Les vehicules");

        for (Vehicule v : vehicules) {
            v.afficherDetails();
        }
        
        System.out.println();

        //  Creation de trois locations
        Location l1 = new Location(c1, v1, 3);
        Location l2 = new Location(c2, v2, 2);
        Location l3 = new Location(c1, m1, 6);

        //  Tableau de locations
        Location[] locations = {l1, l2, l3};

        System.out.println("les locations");
        
        System.out.println();
        

        double total = 0;

        for (Location l : locations) {
            l.afficherRecapitulatif();
            System.out.println();
            total += l.calculerMontant();
        }

        //  Affichage du montant total
        System.out.println("Montant total de toutes les locations : "
                + total + " DH");
    }
}
