package GestionVol;

import java.sql.Connection;
import java.sql.SQLException;

import DonnePOJO.Vol;
import Outils.LectureClavier;
import PackageDAO.Connexion;
import PackageDAO.VolDAO;

public class MenuModifVolDistance {

	public void mainModifVolDistance(Connexion conn, Vol vol) {
		try {
			conn.getConn().setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		conn.connect();
		
		// saisie aeroport
		int distance = LectureClavier.lireEntier("Saisissez la nouvelle distance de vol");
		
		modifierVol(conn, distance, vol);
		
		System.out.println(vol.toString());
		
		try {
			conn.disconnect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void modifierVol(Connexion conn, int distance, Vol vol) {
		VolDAO volDAO = new VolDAO(conn.getConn());
		vol.setDistance(distance);
		volDAO.update(vol);
	}
}
