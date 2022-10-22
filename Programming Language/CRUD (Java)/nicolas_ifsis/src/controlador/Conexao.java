package controlador;

import java.sql.Connection;
import java.sql.DriverManager;



public class Conexao {
    
    /*  Segue padrão de Projeto Singleton
        Uma única instância no projeto inteiro
      
        Critéios para o Singleton:
        1. Construtor privado
        2. Variável con statica e privada
        3. Método para recuperar a instância "getInstancia()" estático
    */
    private static Connection con;

    private Conexao() throws Exception {

        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/ifsis_lp3";
            String usuario = "root";
            String senha = "";
            
            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, senha);
            con.setAutoCommit(true);

        } catch (Exception e) {
            throw e;
        }
    }

    public static Connection getInstancia() throws Exception {
        if (con == null) {
            new Conexao();
        }
        return con;
    }

    public static void main(String[] args) {
        try {
            System.out.println(Conexao.getInstancia());
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
