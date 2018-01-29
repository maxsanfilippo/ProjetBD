package PackageDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import DonnePOJO.*;

public class PersonneDAO extends DAO<Personne> {

	public PersonneDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Personne obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Personne obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Personne obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Personne find(Object[] tab) {
		int idPers = (int) tab[0];
		Personne P = null;
		try {
		      ResultSet result = this.connect.createStatement(
		        ResultSet.TYPE_SCROLL_INSENSITIVE,
		        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Hotesse WHERE idPerso = " + idPers);
		      if(result.first())
		      {
		    	  P = new Personne(result.getInt("idPers"),result.getString("nom"),result.getString("prenom"),result.getInt("nbHeuresVol"));
		      }
		} catch (SQLException e) {

		      e.printStackTrace();
		    }
		return P;
	}

}
