package GestionVol;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DonnePOJO.Vol;
import PackageDAO.Connexion;
import oracle.sql.TIMESTAMP;

public class MenuModifierVol {

	public void afficherMenuModifier(Connexion conn) {
		System.out.println("Saisissez le numero de vol que vous souhaitez modifier");
		// saisie numero vol
		String noVol = null;
		Vol v = recupVol(conn, noVol);
		afficherVol(v);
		
		MenuChoixModificationVol menuChoixModificationVol = new MenuChoixModificationVol();
		menuChoixModificationVol.afficherChoixModificationVol(conn);
		
	}

	private void afficherVol(Vol v) {
		System.out.println(v.toString());
	}

	private Vol recupVol(Connexion conn, String noVol) {
		Statement requete;
		ResultSet resultat;
		Vol result = null;
		
		conn.connect();
		
		try {
			requete = conn.getConn().createStatement();
			resultat = requete.executeQuery("SELECT * FROM Vol WHERE noVol = "+noVol);
			if(resultat.next())
			{
				result = new Vol(resultat.getString("noVol"),new TIMESTAMP(resultat.getString("datedepart")),resultat.getString("aeroOrigine"),resultat.getString("aeroDestination"),
						resultat.getInt("duree"), resultat.getInt("distance"), resultat.getBoolean("arrive"), resultat.getInt("noAvion"));
			}	
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return result;
	}
}
