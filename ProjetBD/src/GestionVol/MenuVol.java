package GestionVol;

import Outils.LectureClavier;
import PackageDAO.*;

public class MenuVol {
	
	private Connexion conn;
	private LectureClavier lecture;
	
	public MenuVol()
	{
		this.conn = new Connexion();
		this.lecture = new LectureClavier();
	}

	public void afficherMenu() {
		System.out.println("Veuillez saisir votre choix");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("| 1 . Consulter les Vol en cour ## non terminé");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("| 2 . Ajouter un nouveau Vol ## non terminé");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("| 3 . Modifier un Vol ## non terminé");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("| 4 . Supprimer un Vol ## non terminé");
		System.out.println("------------------------------------------------------------------------------");

		// Saisir choix | String choix = ....
		
		String choix;
		choix = this.lecture.lireChaine();
		this.choixFonct(choix);

	}

	private void choixFonct(String choix) {
		switch(choix)
		{
		case "1" :
			MenuConsulterVol mC = new MenuConsulterVol();
			mC.afficherVols(this.conn);
		case "2" :
			MenuAjouterVol mA = new MenuAjouterVol();
			mA.afficherMenuAjout(this.conn);
		case "3" :
			MenuModifierVol mM = new MenuModifierVol();
		case "4" :
			MenuSupprVol mS = new MenuSupprVol();
		}
		
	}

}
