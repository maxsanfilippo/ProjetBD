package PackageDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import DonnePOJO.*;

public class PersonnelDAO extends DAO<Personnel> {

	public PersonnelDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Personnel obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Personnel obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Personnel obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Personnel find(Object[] tab) {
		int idPers = (int) tab[0];
		Personnel Pl = null;
		try {
		      ResultSet result = this.connect.createStatement(
		        ResultSet.TYPE_SCROLL_INSENSITIVE,
		        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Personnel WHERE idPerso = " + idPers);
		      if(result.first())
		      {
		    	  Pl = new Personnel(result.getInt("idPerso"));
		      }
		} catch (SQLException e) {

		      e.printStackTrace();
		    }
		return Pl;
	}

}
