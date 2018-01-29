package PackageDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import DonnePOJO.*;

public class ReservationDAO extends DAO<Reservation> {

	public ReservationDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Reservation obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Reservation obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Reservation obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Reservation find(Object[] tab) {
		int noRes = (int) tab[0];
		Reservation res = null;
		try {
		      ResultSet result = this.connect.createStatement(
		        ResultSet.TYPE_SCROLL_INSENSITIVE,
		        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Reservation WHERE noResa = " + noRes);
		      if(result.first())
		      {
		    	  res = new Reservation(result.getInt("noResa"),result.getDate("dateResa"),result.getInt("prixTotal"),result.getInt("idPerso"));
		      }
		} catch (SQLException e) {

		      e.printStackTrace();
		    }
		return res;
	}

}
