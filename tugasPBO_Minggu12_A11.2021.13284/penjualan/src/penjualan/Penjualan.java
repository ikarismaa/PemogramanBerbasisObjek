/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package penjualan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author asus
 */
public class Penjualan {
    String url, usr, pwd, dbn;
    public Penjualan (String dbn){
        this.url = "jdbc:mysql://localhost/" + dbn;
        this.usr = "root";
        this.pwd = "";
    }
    public Penjualan (String host, String user, String pass, String dbn){
        this.url = "jdbc:mysql://" + host + "/" + dbn;
        this.usr = user;
        this.pwd = pass;
    }
    
    public Connection getConnection() {
        Connection con = null;
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(this.url, this.usr, this.pwd);
        }
        catch (ClassNotFoundException e){
            System.out.println ("Error #1 : " + e.getMessage());
            System.exit(0);
        }
        catch (SQLException e){
            System.out.println("Eror #2 : " + e.getMessage());
            System.exit(0);
        }
        return con;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Penjualan kon = new Penjualan ("penjualan");
        Connection c = kon.getConnection();
        // TODO code application logic here
    }
    
}
