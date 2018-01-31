package PackageDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {

static final String CONN_URL = "jdbc:oracle:thin:@im2ag-oracle.e.ujf-grenoble.fr:1521:im2ag";
	
	static final String USER = "sanfilma";
	static final String PASSWD = "Batterie1";

	static Connection conn; 
	
	public void connect() {
		try {
	        
	  	    // Enregistrement du driver Oracle
	  	    System.out.print("Loading Oracle driver... "); 
	  	    DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	  	    System.out.println("loaded");
	  	    
	  	    // Etablissement de la connection
	  	    System.out.print("Connecting to the database... "); 
	 	    conn = DriverManager.getConnection(CONN_URL,USER,PASSWD);
	   	    System.out.println("connected");
	  	    
	  	    // Desactivation de l'autocommit
		  	conn.setAutoCommit(false);
	  	    System.out.println("Autocommit disabled");

		    // code métier de la fonctionnalité

	  	    // Liberation des ressources et fermeture de la connexion...
	       	// A COMPLETER 
	 	    
	  	    
	  	    
	  	    // traitement d'exception
          } catch (SQLException e) {
              System.err.println("failed");
              System.out.println("Affichage de la pile d'erreur");
  	          e.printStackTrace(System.err);
              System.out.println("Affichage du message d'erreur");
              System.out.println(e.getMessage());
              System.out.println("Affichage du code d'erreur");
  	          System.out.println(e.getErrorCode());	    

          }
     }

	public void disconnect() throws SQLException {
		conn.close();
		System.out.println("bye.");
	}
	
	public Connection getConn()
	{
		return this.conn;
	}
		
}
