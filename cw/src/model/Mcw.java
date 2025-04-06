package model;
import java.sql.*;
import javax.swing.JOptionPane;

public class Mcw {
    public void registerUser(String username,String password,String phoneNo,String gender,String email){
        try{ 
            Statement st = DBcon.createConnection().createStatement();
            int count = st.executeUpdate("insert into accounts values('"+username+"','"+password+"','"+phoneNo+"','"+gender+"','"+email+"')");
            if (count > 0) {
           JOptionPane.showMessageDialog(null, "Registered successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Registration failed", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException e){
            System.err.println(e.getMessage());
        }
    }
}
