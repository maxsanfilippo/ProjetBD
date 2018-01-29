package PackageDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import DonnePOJO.Vol;

public class VolDAO extends DAO<Vol> {

	public VolDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Vol obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet result = this.connect.createStatement(
			        ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeQuery("INSERT INTO Vol (" + obj.getNoVol()+", " + obj.getDateDepart()+", "+obj.getAeroOrigine()
			        +", "+obj.getAeroDestination()+", "+obj.getDuree()+", "+obj.getDistance()+", "+obj.getDistance()+", "+obj.isArrive()+", "+obj.getNoAvion());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean delete(Vol obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet result = this.connect.createStatement(
			        ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeQuery("DELETE FROM Vol WHERE noVol = " + obj.getNoVol()+" AND datedepart = "+obj.getDateDepart());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean update(Vol obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet result = this.connect.createStatement(
			        ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeQuery("UPDATE Vol SET aeroOrigine = " + obj.getAeroOrigine()+", aeroDestination = "+obj.getAeroDestination()
			        +", duree = "+obj.getDuree()+", distance = "+obj.getDistance()+", arrive = "+obj.isArrive()+", noAvion = "+obj.getNoAvion()
			        +" WHERE noVol = "+obj.getNoVol()+" AND datedepart = "+obj.getDateDepart());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public Vol find(Object[] T) {
		String novol = (String) T[0];
		Date dt = (Date) T[1];
		Vol vol = null;
		try {
		      ResultSet result = this.connect.createStatement(
		        ResultSet.TYPE_SCROLL_INSENSITIVE,
		        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Vol WHERE noVol = " + novol+" AND datedepart = " + dt);
		      if(result.first())

		          vol = new Vol(result.getString("noVol"), result.getDate("datedepart"),result.getString("aeroOrigine"),result.getString("aeroDestination"),result.getInt("duree"),result.getInt("distance"),result.getBoolean("arrive"),result.getInt("noAvion"));         
		          
		    } catch (SQLException e) {

		      e.printStackTrace();

		    }
		// TODO Auto-generated method stub
		return vol;
	}


}
