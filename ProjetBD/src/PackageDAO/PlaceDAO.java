package PackageDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import DonnePOJO.*;
import oracle.sql.TIMESTAMP;

public class PlaceDAO extends DAO<Place> {

	public PlaceDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Place obj) {
		try {
			ResultSet result = this.connect.createStatement(
			        ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeQuery("INSERT INTO Place ( (noPlace,classe,position,prix,noVol,datedepart) values" + obj.getIdPlace()+", " + obj.getNoPlace()+", "+obj.getClasse()
			        +", "+obj.getPosition()+", "+obj.getPrix()+", "+obj.getNoVol()+", "+obj.getDateDepart()+")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean delete(Place obj) {
		try {
			ResultSet result = this.connect.createStatement(
			        ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeQuery("DELETE FROM Place WHERE idPlace = " + obj.getIdPlace());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean update(Place obj) {
		try {
			ResultSet result = this.connect.createStatement(
			        ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeQuery("UPDATE Place SET noPlace = " + obj.getNoPlace()+", classe = "+obj.getClasse()
			        +", position = "+obj.getPosition()+", prix = "+obj.getPrix()+", noVol = "+obj.getNoVol()
			        +", datedepart = "+obj.getDateDepart()+", noResa = "+obj.getNoResa()
			        +" WHERE idPlace = "+obj.getIdPlace());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public Place find(Object[] tab) {
		String idPl = (String) tab[0];
		Place Ht = null;
		try {
		      ResultSet result = this.connect.createStatement(
		        ResultSet.TYPE_SCROLL_INSENSITIVE,
		        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Place WHERE idPlace = " + idPl);
		      if(result.first())
		      {
		    	  Classe cl = convertInClasse(result.getString("classe"));
		    	  Position p = convertInPosition(result.getString("position"));
		    	  Ht = new Place(result.getInt("idPlace"),result.getString("noPlace"),cl,p,result.getInt("prix"),result.getString("noVol"),new TIMESTAMP(result.getDate("dateDepart")),result.getInt("noResa"));
		      }
		} catch (SQLException e) {
		      e.printStackTrace();
		    }
		return Ht;
	}

	public Classe convertInClasse(String Class) throws SQLException {
		Classe cl = null;
		  if (Classe.Affaire.toString()==Class)
		  {
			  cl = Classe.Affaire;
		  }
		  if (Classe.Eco.toString()==Class)
		  {
			  cl = Classe.Affaire;
		  }
		  if (Classe.Premiere.toString()==Class)
		  {
			  cl = Classe.Affaire;
		  }
		return cl;
	}
	
	public Position convertInPosition(String Posi) throws SQLException {
		Position ps = null;
		  if (Position.Centre.toString()==Posi)
		  {
			  ps = Position.Centre;
		  }
		  if (Position.Couloir.toString()==Posi)
		  {
			  ps = Position.Couloir;
		  }
		  if (Position.Hublot.toString()==Posi)
		  {
			  ps = Position.Hublot;
		  }
		return ps;
	}

}
