package PackageDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import DonnePOJO.*;

public class AdresseDAO extends DAO<Adresse> {

	public AdresseDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Adresse obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Adresse obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Adresse obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Adresse find(Object[] tab) {
		int idA = (int) tab[0];
		Adresse A = null;
		try {
		      ResultSet result = this.connect.createStatement(
		        ResultSet.TYPE_SCROLL_INSENSITIVE,
		        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Adresse WHERE idAdresse = " + idA);
		      if(result.first())
		      {
		    	  A = new Adresse(result.getInt("idAdresse"), result.getInt("noAdresse"),result.getString("rue"), result.getInt("cpp"), result.getString("ville"),result.getString("pays"), result.getInt("idPerso"));
		      }
		}catch (SQLException e) {

			      e.printStackTrace();

			    }
		return null;
	}

}
