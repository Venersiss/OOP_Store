/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Custodio_OOPCOMP121
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBConnection.init();
        Connection c=DBConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = c.prepareStatement("Select * from weapon_shop.weapon_store");
            ResultSet rs=ps.executeQuery();
        while (rs.next()){
            System.out.println(":"+rs.getString("class")+" ,"+rs.getString("name")+" ,"+rs.getString("type")+" ,"+rs.getString("price"));
        }
            
        
        Scanner input = new Scanner(System.in);
            
            ps=c.prepareStatement("INSERT INTO weapon_shop.weapon_store (class, name, type, price)\n" +
"VALUES ('"+input.next()+"','"+input.next()+"','"+input.next()+"','"+input.next()+"')");
                if(!ps.execute()){
                    System.out.println("new data saved");
                }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
