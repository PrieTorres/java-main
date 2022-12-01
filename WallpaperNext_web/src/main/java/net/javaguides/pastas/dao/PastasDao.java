package net.javaguides.pastas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.estudante.senai.objetos.pasta;

public class PastasDao {

	private String jdbcURL = "jdbc:mysql://localhost:3306/java_web_aplication";
    private String jdbcUsername = "root";
    private String jdbcPassword = "root";
    
    private static final String SELECT_ALL_Pastas = "select * from pasta";
    
    public PastasDao() {}
    
	 protected Connection getConnection() {
		 
        Connection connection;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            System.out.println("conexao --> "+connection);
            return connection;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
        
	  }
	 
	 public List < pasta > selectAllPastas() {

	        List < pasta > pastas = new ArrayList < > ();
	        try (Connection connection = getConnection();

	            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_Pastas);) {
	            System.out.println(preparedStatement);
	  
	            ResultSet rs = preparedStatement.executeQuery();

	            while (rs.next()) {
	                int id = rs.getInt("id");
	                String nome = rs.getString("nome");
	                String descricao = rs.getString("criador");
	                String criador = rs.getString("descricao");
	                pastas.add(new pasta( nome, descricao, criador));
	            }
	        } catch (SQLException e) {
	            printSQLException(e);
	        }
	        return pastas;
	    }
	 
	 
    	 
	 private void printSQLException(SQLException ex) {
	        for (Throwable e: ex) {
	            if (e instanceof SQLException) {
	                e.printStackTrace(System.err);
	                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                System.err.println("Message: " + e.getMessage());
	                Throwable t = ex.getCause();
	                while (t != null) {
	                    System.out.println("Cause: " + t);
	                    t = t.getCause();
	                }
	            }
	        }
	    }
    
}
