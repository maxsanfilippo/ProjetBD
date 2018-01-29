package PackageDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import DonnePOJO.*;

public class AvionPassagerDAO extends DAO<AvionPassager> {

	public AvionPassagerDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(AvionPassager obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(AvionPassager obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(AvionPassager obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AvionPassager find(Object[] tab) {
		int noAvion = (int) tab[0];
		AvionPassager AP=null;
		try {
		      ResultSet result = this.connect.createStatement(
		        ResultSet.TYPE_SCROLL_INSENSITIVE,
		        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM AvionPassager WHERE noVol = " + noAvion);
		      if(result.first())
		      {
		    	  AP = new AvionPassager(result.getInt("nbPlaces"),result.getInt("nbPlacesEco"),result.getInt("nbPlacesPremiere"), result.getInt("nbPlacesAffaire"), result.getInt("noAvion"));
		      }
		} catch (SQLException e) {

		      e.printStackTrace();

		    }
				
		return AP;
	}

}
