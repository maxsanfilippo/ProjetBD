package PackageDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import DonnePOJO.*;

public class SaitPiloterDAO extends DAO<SaitPiloter> {

	public SaitPiloterDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(SaitPiloter obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(SaitPiloter obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(SaitPiloter obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SaitPiloter find(Object[] tab) {
		int idPers = (int) tab[0];
		String nMod = (String) tab[1];
		SaitPiloter sP = null;
		try {
		      ResultSet result = this.connect.createStatement(
		        ResultSet.TYPE_SCROLL_INSENSITIVE,
		        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM SaitPiloter WHERE idPerso = " + idPers);
		      if(result.first())
		      {
		    	  sP = new SaitPiloter(result.getInt("idPerso"),result.getString("noModele"));
		      }
		} catch (SQLException e) {
		      e.printStackTrace();
		    }
		return sP;
	}

}
