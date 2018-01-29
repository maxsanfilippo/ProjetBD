package PackageDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import DonnePOJO.*;

public class AssureDAO extends DAO<Assure> {

	public AssureDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Assure obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Assure obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Assure obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Assure find(Object[] tab) {
		int idPers = (int) tab[0];
		String noVol = (String) tab[1];
		Date dt = (Date) tab[2];
		Assure A =null;
		try {
		      ResultSet result = this.connect.createStatement(
		        ResultSet.TYPE_SCROLL_INSENSITIVE,
		        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Assure WHERE noVol = " + noVol+" AND dateDepart = " + dt + " AND idPerso ="+ idPers);
		      if(result.first())
		      {
		    	  A = new Assure(result.getInt("idPerso"),result.getString("noVol"), result.getDate("dateDepart"));
		      } 
		      } catch (SQLException e) {

			      e.printStackTrace();

			    }
			return A;
	}

}