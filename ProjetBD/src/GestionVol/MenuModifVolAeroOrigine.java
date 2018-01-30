package GestionVol;

import PackageDAO.Connexion;

public class MenuModifVolAeroOrigine {

	public void mainModifVolAeroOrigine(Connexion conn) {
		System.out.println("Saisissez le nouvel aeroport d'origine");
		// saisie aeroport
		String aeroport = "";
		afficherAvionsDisponibles(conn);
		
	}

	private void afficherAvionsDisponibles(Connexion conn) {
		
	}
}
