/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Login {
    private String user, pass;
    Login(){
        this.user = "";
        this.pass = "";
    }
    Login (String user, String pass){
        this.user = user;
        this.pass = pass;
    }
    public void inputUser(){
        this.user = user;
    }
public void inputPass(){
    this.pass = pass;
}    
}
