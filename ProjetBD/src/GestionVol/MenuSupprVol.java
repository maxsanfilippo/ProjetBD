package GestionVol;

import DonnePOJO.Vol;
import Outils.LectureClavier;
import PackageDAO.Connexion;
import PackageDAO.VolDAO;
import oracle.sql.TIMESTAMP;

public class MenuSupprVol {
	
	public void SupressionVol(Connexion conn)
	{
		System.out.println("Saisissez le numero de vol que vous souhaitez modifier");
		// saisie numero vol
		String noVol = LectureClavier.lireChaine();
		
		System.out.println("Saisissez la date du vol que vous souhaitez modifier");
		// saisie date vol
		TIMESTAMP dateVol = new TIMESTAMP(LectureClavier.lireChaine());
		
		VolDAO VDao = new VolDAO(conn.getConn());
		Object[] t = new Object[2];
		t[0]=noVol;
		t[1]=dateVol;
		Vol v = VDao.find(t);
	}
	
	//rentrer le novol
	
	//rentrer al date du vol
	
	//consultaion autre vol similaire
	
	/*si Vol Passager
	 * 
	 * si autre vol similaire transfere des reservation ddes place ver autre place
	 * 
	 * si vol fret
	 * si autre vol similaire transfere resa fret vers nouveau vol*/
	
	//suppression des ancien resa
	
	//suppression des Voltype
	
	//suppression des vol
	
	//indiqué que le vol est supprimé

}
