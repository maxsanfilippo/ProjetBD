package GestionVol;

import java.sql.*;
import java.util.ArrayList;

import DonnePOJO.Avion;
import DonnePOJO.Personne;
import DonnePOJO.Pilote;
import DonnePOJO.Vol;
import PackageDAO.AvionDAO;
import PackageDAO.Connexion;

public class MenuAjouterVol {

	public void afficherMenuAjout(Connexion conn) {
		System.out.println("Entree le numero de Vol");
		String noVol;
		// Entree La date du Vol
		System.out.println("Entree la Date du Vol");
		Date dt;
		// Entree le aeroOrigine
		System.out.println("Entree l aeroport Origine du Vol");
		String aeroOrigine;
		// Entree le aeroDestination
		System.out.println("Entree l aeroport Destination du Vol");
		String aeroDestination;
		// Entree le aeroDestination
		System.out.println("Entree la distance de Vol");
		int distance;
		
		Avion a;
		
		ArrayList<Avion> Av;
		Av = recupAvionDispo(conn, dt);
		System.out.println("liste des Avions Disponible");
		System.out.println("---------------------------------------");
		AfficherAvion(Av);
		System.out.println("veuiller choisir votre avion");
		System.out.println("---------------------------------------");
		//choisir AVION
		int indAvion;
		a = Av.get(indAvion);
		
		ArrayList<Personne> pl;
		pl = recupPiloteDispo(conn, dt,a);
		System.out.println("liste des Pilotes Disponible");
		System.out.println("---------------------------------------");
		AfficherPilotes(pl);
		System.out.println("veuiller choisir vos Pilotes");
		System.out.println("---------------------------------------");
		// choisir Pilote
		
		ArrayList<Personne> ph;
		ph = recupHotesseDispo(conn, dt);
		System.out.println("liste des Pilotes Disponible");
		System.out.println("---------------------------------------");
		AfficherHotesse(ph);
		System.out.println("veuiller choisir vos Pilotes");
		System.out.println("---------------------------------------");
		// choisir Hotesse
		
		//creation
		
		Vol v = new Vol(noVol,dt,aeroOrigine,aeroDestination,distance,false,a.getNoAvion());
		ajouterPilotes();
		ajouterHotesse()
		creerPlace();
		
	}

	private void AfficherHotesse(ArrayList<Personne> ph) {
		int indexP = 0;
		for(Personne p: ph)
		{
			System.out.print(indexP+":  ");
			System.out.println(p.toString());
			indexP++;
		}
		
	}

	private ArrayList<Personne> recupHotesseDispo(Connexion conn, Date dt) {
		Statement requete;
		ResultSet resultat;
		ArrayList<Personne> result = new ArrayList<Personne>();
		
		conn.connect();
		
		try {
			requete = conn.getConn().createStatement();
			resultat = requete.executeQuery("SELECT * FROM Hotesse join Personne on Personne.idPerso=Hotesse.idPerso WHERE idPerso NOT IN (select * From assure join Vol on assure.noVol=Vol.noVol And assure.datedepart=Vol.datedepart where Vol.arrive=false AND datedepart > "+dt+")");
			while(resultat.next())
			{
				result.add(new Personne(resultat.getInt("idPerso"),resultat.getString("nom"),resultat.getString("prenom"),resultat.getInt("nbHeuresVol")));
			}	
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return result;
	}

	private ArrayList<Personne> recupPiloteDispo(Connexion conn, Date dt, Avion a) {
		Statement requete;
		ResultSet resultat;
		ArrayList<Personne> result = new ArrayList<Personne>();
		
		conn.connect();
		
		try {
			requete = conn.getConn().createStatement();
			resultat = requete.executeQuery("SELECT * FROM Pilote join Personne on Personne.idPerso=Pilote.idPerso join saitPiloter on saitPiloter.idPerso=Pilote.idPerso "
					+ "WHERE saitPiloter.noModele="+a.getNoModele()+" AND idPerso NOT IN (select * From assure join Vol on assure.noVol=Vol.noVol And assure.datedepart=Vol.datedepart "
					+ "where Vol.arrive=false AND datedepart > "+dt+")");
			while(resultat.next())
			{
				result.add(new Personne(resultat.getInt("idPerso"),resultat.getString("nom"),resultat.getString("prenom"),resultat.getInt("nbHeuresVol")));
			}	
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return result;
	}

	private void AfficherPilotes(ArrayList<Personne> pl) {
		int indexP = 0;
		for(Personne p: pl)
		{
			System.out.print(indexP+":  ");
			System.out.println(p.toString());
			indexP++;
		}
		
	}

	private void AfficherAvion(ArrayList<Avion> av) {
		int indexA = 0;
		for(Avion a: av)
		{
			System.out.print(indexA+":  ");
			System.out.println(a.toString());
			indexA++;
		}
		
	}

	public ArrayList<Avion> recupAvionDispo(Connexion conn, Date dt) {
		Statement requete;
		ResultSet resultat;
		ArrayList<Avion> result = new ArrayList<Avion>();
		
		conn.connect();
		
		try {
			requete = conn.getConn().createStatement();
			resultat = requete.executeQuery("SELECT * FROM AVION WHERE noAvion NOT IN (select noAvion From Vol where Vol.arrive=false AND datedepart > "+dt+")");
			while(resultat.next())
			{
				result.add(new Avion(resultat.getInt("noAvion"), resultat.getInt("rayon"), resultat.getString("noModele")));
			}	
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return result;
	}

}