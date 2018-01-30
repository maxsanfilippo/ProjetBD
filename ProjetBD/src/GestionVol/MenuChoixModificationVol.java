package GestionVol;

import DonnePOJO.Vol;
import PackageDAO.Connexion;

public class MenuChoixModificationVol {

	public void afficherChoixModificationVol(Connexion conn, Vol vol) {
		System.out.println("Que voulez-vous modifier sur ce vol ?");
		System.out.println("1 : aeroport d'origine");
		System.out.println("2 : aeroport de destination");
		System.out.println("3 : distance");
		System.out.println("4 : signaler arrivée");
		System.out.println("5 : avion assigné");
		System.out.println("6 : ajouter un personnel");
		System.out.println("6 : supprimer un personnel");
		
		
		// saisie choix
		int choix = 0;
		switch(choix) {
			case 1: MenuModifVolAeroOrigine menuAeroOrigine = new MenuModifVolAeroOrigine();
			menuAeroOrigine.mainModifVolAeroOrigine(conn, vol);break;
			case 2: MenuModifVolAeroDestination menuAeroDestination = new MenuModifVolAeroDestination();
			menuAeroDestination.mainModifVolAeroDestination(conn, vol);break;
			/*case 3: MenuModifVolDistance menuDistance = new MenuModifVolDistance();break;
			case 4: MenuModifVolArrivee menuArrivee = new MenuModifVolArrivee();break;
			case 5: MenuModifVolAvion menuAvion = new MenuModifVolAvion();break;
			case 6: MenuModifVolAjoutPersonnel menuAjoutPersonnel = new MenuModifVolAjoutPersonnel();break;
			case 7: MenuModifVolSupprPersonnel menuSupprPersonnel = new MenuModifVolSupprPersonnel();break;*/
		}
	}
}
