package GestionVol;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import PackageDAO.Connexion;

public class MenuModifVolAeroDestination {

	public void mainModifVolAeroDestination(Connexion conn, String noVol) {
		System.out.println("Saisissez le nouvel aeroport de destination");
		// saisie aeroport
		String aeroportDestination = "";
		
		modifierVol(conn, aeroportDestination, noVol);
	}

	private void modifierVol(Connexion conn, String aeroportDestination, String noVol) {
		Statement requete;
		ResultSet resultat;
		
		conn.connect();
		
		try {
			requete = conn.getConn().createStatement();
			// pour l'aeroport d'origine
			resultat = requete.executeQuery("UPDATE Vol SET aeroOrigine = "+aeroportOrigine+" WHERE noVol = "+noVol+
					"AND datedepart=(SELECT datedepart FROM Vol WHERE noVol = "+noVol);
			
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		
	}
}
