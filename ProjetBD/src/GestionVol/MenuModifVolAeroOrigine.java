package GestionVol;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DonnePOJO.Avion;
import DonnePOJO.Vol;
import Outils.LectureClavier;
import PackageDAO.Connexion;
import PackageDAO.VolDAO;

public class MenuModifVolAeroOrigine {

	public void mainModifVolAeroOrigine(Connexion conn, Vol vol) {
		try {
			conn.getConn().setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		conn.connect();
		System.out.println("Saisissez le nouvel aeroport d'origine");
		// saisie aeroport
		String aeroportOrigine = LectureClavier.lireChaine();
		
		afficherAvionsDisponibles(conn, aeroportOrigine);
		
		
		// saisie noAvion
		int noAvion = LectureClavier.lireEntier("Saisissez le numero du nouvel avion assigné");
		
		modifierVol(conn, aeroportOrigine, noAvion, vol);
		
		try {
			conn.disconnect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void modifierVol(Connexion conn, String aeroportOrigine, int noAvion, Vol vol) {
		conn.connect();
		VolDAO volDAO = new VolDAO(conn.getConn());
		vol.setAeroOrigine(aeroportOrigine);
		vol.setNoAvion(noAvion);
		volDAO.update(vol);
		
	}

	private void afficherAvionsDisponibles(Connexion conn, String aeroportOrigine) {
		Statement requete;
		ResultSet resultat;
		ArrayList<Avion> result = new ArrayList<Avion>();
		
		conn.connect();
		
		try {
			requete = conn.getConn().createStatement();
			// si avion fret
			resultat = requete.executeQuery("SELECT noAvion, noModele FROM Avion WHERE noAvion IN "
					+ "(SELECT noAvion FROM Vol JOIN AvionFret ON Vol.noAvion=AvionFret.noAvion WHERE [] = "+aeroportOrigine+" AND arrive=1"
							+ "AND volumeMax >= [] AND poidsMax >= []");
			
			// si avion passager
			// resultat = ...
			
			while(resultat.next())
			{
				result.add(new Avion(resultat.getInt("noAvion"),resultat.getInt("rayon"),resultat.getString("noModele")));
			}	
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		// affichage des avions
		int indexA = 0;
		for(Avion a: result)
		{
			System.out.print(indexA+":  ");
			System.out.println(a.toString());
			indexA++;
		}
	}
}
