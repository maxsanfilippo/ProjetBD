package PackageDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import DonnePOJO.*;

public class ReserverFretDAO extends DAO<ReserverFret> {

	public ReserverFretDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(ReserverFret obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(ReserverFret obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(ReserverFret obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ReserverFret find(Object[] tab) {
		int resa = (int) tab[0];
		String NVol = (String) tab[1];
		Date dt = (Date) tab[2];
		ReserverFret rF = null;
		try {
		      ResultSet result = this.connect.createStatement(
		        ResultSet.TYPE_SCROLL_INSENSITIVE,
		        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM ReserverFret WHERE noResa = " + resa + " AND noVol = "+ NVol+" AND dateDepart = "+dt);
		      if(result.first())
		      {
		    	  rF = new ReserverFret(result.getInt("VolumeResa"),result.getInt("poidsResa"),result.getInt("noResa"),result.getString("noVol"),result.getDate("dateDepart"));
		      }
		} catch (SQLException e) {

		      e.printStackTrace();
		    }
		return rF;
	}

}
