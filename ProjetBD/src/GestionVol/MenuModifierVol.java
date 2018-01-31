package GestionVol;

import DonnePOJO.Vol;
import Outils.LectureClavier;
import PackageDAO.Connexion;
import PackageDAO.VolDAO;
import oracle.sql.TIMESTAMP;

public class MenuModifierVol {

	public void afficherMenuModifier(Connexion conn) {
		System.out.println("Saisissez le numero de vol que vous souhaitez modifier");
		// saisie numero vol
		String noVol = LectureClavier.lireChaine();
		
		System.out.println("Saisissez la date du vol que vous souhaitez modifier");
		// saisie date vol
		TIMESTAMP dateVol = new TIMESTAMP(LectureClavier.lireChaine());
		Vol v = recupVol(conn, noVol, dateVol);
		afficherVol(v);
		
		MenuChoixModificationVol menuChoixModificationVol = new MenuChoixModificationVol();
		menuChoixModificationVol.afficherChoixModificationVol(conn, v);
		
	}

	private void afficherVol(Vol v) {
		System.out.println(v.toString());
	}

	private Vol recupVol(Connexion conn, String noVol, TIMESTAMP date) {
		Object[] tab = new Object[2];
		tab[0] = noVol;
		tab[1] = date;
		
		conn.connect();
		
		VolDAO volDAO = new VolDAO(conn.getConn());
		Vol v = volDAO.find(tab);
		return v;

	}
}
