package konek_database;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;

public class koneksi {
    public static Connection con;
    public static Statement stm;
    
    public void koneksisql(){
        try{
            String url = "jdbc:mysql://localhost/tubes_pbo";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url,user,pass);
            stm = (Statement) con.createStatement();
            System.out.println("koneksi berhasil");
        }catch(Exception e) {
            System.err.println("koneksi gagal");
        }
    }
    
    public static void main (String[] args){
        koneksi test = new koneksi();
        test.koneksisql();
        System.exit(0);
    }
    public java.sql.Connection getkoneksi(){
        return null;
        
    }
}
