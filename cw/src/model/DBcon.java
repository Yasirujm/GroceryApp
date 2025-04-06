package model;
import java.sql.*;

public class DBcon {
    private static Connection con;
    public static Connection createConnection(){
        try{    String dbpath = "jdbc:mysql://localhost/cw";
        con = DriverManager.getConnection(dbpath,"root","");
        }
        catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return con;
    }
}
