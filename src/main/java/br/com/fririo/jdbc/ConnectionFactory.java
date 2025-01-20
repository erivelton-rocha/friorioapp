/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fririo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ANALISTA_SISTEMA
 */
public class ConnectionFactory {
    
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:postgresql://127.0.0.1/bvendas", "appfriorio", "root");
        }catch(Exception erro){
            throw new RuntimeException(erro);
        }
    }
    
}
