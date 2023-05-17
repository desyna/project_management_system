/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.LoginView;
import model.Connector;
import view.MenuView;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class ControllerLogin {
    LoginView loginView;
    
    public ControllerLogin(LoginView loginView) {
        this.loginView = loginView;
        
    } 
    
    public void cek(){
        String username = loginView.getLoginUsername().getText();
        String password = loginView.getLoginPassword();
        String cek_user = null;
        String cek_pass = null;
        
        try {
            Connector connector = new Connector();
            Statement statement = connector.koneksi.createStatement();
            String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password +"'";
            ResultSet result = statement.executeQuery(query);
            
            while (result.next()) {
                cek_user = result.getString("username");
                cek_pass = result.getString("password");
            }
            result.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Kesalahan");
        }
        
        if (cek_user == null && cek_pass == null) {
            String message = "Username Atau Password Salah";
            JOptionPane.showMessageDialog(null,message,"Message",JOptionPane.INFORMATION_MESSAGE);
//            loginView.setLoginUsername(null);
//            loginView.setLoginPassword(null);
        }else {
            String message1 = "Login Berhasil";
            JOptionPane.showMessageDialog(null,message1,"Message",
            JOptionPane.INFORMATION_MESSAGE);
            new MenuView().setVisible(true);
            loginView.dispose();
        }
    }
}
