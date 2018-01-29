package PackageDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import DonnePOJO.*;

public class VolFretDAO extends DAO<VolFret> {

	public VolFretDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(VolFret obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(VolFret obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(VolFret obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public VolFret find(Object[] tab) {
		String novol = (String) tab[0];
		Date dt = (Date) tab[1];
		VolFret vol = null;
		try {
		      ResultSet result = this.connect.createStatement(
		        ResultSet.TYPE_SCROLL_INSENSITIVE,
		        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM VolFret WHERE noVol = " + novol+" AND dateDepart = " + dt);
		      if(result.first())

		          vol = new VolFret(result.getInt("volumeMin"),result.getInt("poidsMin"),result.getFloat("prixMetreCube"),result.getString("noVol"),result.getDate("dateDepart"));         
		          
		    } catch (SQLException e) {

		      e.printStackTrace();

		    }
		// TODO Auto-generated method stub
		return vol;
	}

}
