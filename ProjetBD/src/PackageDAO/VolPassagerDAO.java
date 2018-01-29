package PackageDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import DonnePOJO.Vol;
import DonnePOJO.VolPassager;

public class VolPassagerDAO extends DAO<VolPassager> {

	public VolPassagerDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(VolPassager obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(VolPassager obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(VolPassager obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public VolPassager find(Object[] tab) {
		String novol = (String) tab[0];
		Date dt = (Date) tab[1];
		VolPassager vol = null;
		try {
		      ResultSet result = this.connect.createStatement(
		        ResultSet.TYPE_SCROLL_INSENSITIVE,
		        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM VolPassager WHERE noVol = " + novol+" AND dateDepart = " + dt);
		      if(result.first())

		          vol = new VolPassager(result.getInt("placesMinEco"),result.getInt("placesMinPremiere"),result.getInt("placesMinAffaire"),result.getString("noVol"),result.getDate("dateDepart"));         
		          
		    } catch (SQLException e) {

		      e.printStackTrace();

		    }
		// TODO Auto-generated method stub
		return vol;
	}

}
