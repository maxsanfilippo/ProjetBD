package PackageDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import DonnePOJO.*;

public class ClientDAO extends DAO<Client> {

	public ClientDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Client obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Client obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Client obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Client find(Object[] tab) {
		int idPers = (int) tab[0];
		Client cl = null;
		try {
		      ResultSet result = this.connect.createStatement(
		        ResultSet.TYPE_SCROLL_INSENSITIVE,
		        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Client WHERE idPerso = " + idPers);
		      if(result.first())
		      {
		    	  cl = new Client(result.getInt("idPerso"));
		      }
		} catch (SQLException e) {

		      e.printStackTrace();

		    }
		return cl;
	}

}
