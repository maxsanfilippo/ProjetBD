package PackageDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import DonnePOJO.*;

public class ModeleDAO extends DAO<Modele> {

	public ModeleDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Modele obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Modele obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Modele obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Modele find(Object[] tab) {
		String noMod = (String) tab[0];
		Modele Md = null;
		try {
		      ResultSet result = this.connect.createStatement(
		        ResultSet.TYPE_SCROLL_INSENSITIVE,
		        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Modele WHERE noModele = " + noMod);
		      if(result.first())
		      {
		    	  Md = new Modele(result.getString("noModele"),result.getInt("nbPilotes"),result.getInt("rayon"),result.getInt("volumeMax"),result.getInt("poidsMax"),result.getInt("nbPlaces"),result.getInt("nbPlacesEco"),result.getInt("nbPlacesPremiere"),result.getInt("nbPlacesAffaire"));
		      }
		} catch (SQLException e) {

		      e.printStackTrace();
		    }
		return Md;
	}

}
