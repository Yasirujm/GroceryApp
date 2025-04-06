package controller;
import model.Mcw;

public class Cuser {
    public void registerUser(String username,String password,String phoneNo,String gender,String email){
        Mcw nm = new Mcw();
        nm.registerUser(username,password,phoneNo,gender,email);
    }
}
