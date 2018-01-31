package GestionVol;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import DonnePOJO.Vol;
import Outils.LectureClavier;
import PackageDAO.Connexion;
import PackageDAO.VolDAO;
import oracle.sql.TIMESTAMP;

public class MenuModifVolArrivee {

	public void mainModifVolArrivee(Connexion conn, Vol vol) {
		try {
			conn.getConn().setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		conn.connect();
		
		modifierVolArrivee(conn, vol);
		
		modifierVolDuree(conn, vol);
		
		System.out.println(vol.toString());
		
		try {
			conn.disconnect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void modifierVolDuree(Connexion conn, Vol vol) {
		VolDAO volDAO = new VolDAO(conn.getConn());
		Date d = new Date(System.currentTimeMillis());
		//vol.setDuree(new TIMESTAMP(d));
		volDAO.update(vol);
	}

	private void modifierVolArrivee(Connexion conn, Vol vol) {
		VolDAO volDAO = new VolDAO(conn.getConn());
		vol.setArrive(1);
		volDAO.update(vol);
	}
}
