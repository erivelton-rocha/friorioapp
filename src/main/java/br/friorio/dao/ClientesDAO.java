/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.friorio.dao;

import br.com.friorio.model.Clientes;
import br.com.fririo.jdbc.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ANALISTA_SISTEMA
 */


public class ClientesDAO {
    private final Connection conn;
    
    public ClientesDAO(){
        this.conn = new ConnectionFactory().getConnection();
    
}
    //Metodo cadastrarCliente
    public void cadastrarCliente(Clientes obj){

        try {
               String sql = "INSET INTO tb_clientes (nome, rg, cpf, email, telefone, celular, cep, endereco, "
                + "numero, complemento, bairro, cidade, estado)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
               
               PreparedStatement stmt = conn.prepareStatement(sql);
               stmt.setString(1, obj.getNome());
               stmt.setString(1, obj.getRg());
               stmt.setString(1, obj.getCpf());
               stmt.setString(1, obj.getEmail());
               stmt.setString(1, obj.getTelefone());
               stmt.setString(1, obj.getCelular());
               stmt.setString(1, obj.getCep());
               stmt.setString(1, obj.getEndereco());
               stmt.setString(1, obj.getNumero());
               stmt.setString(1, obj.getComplemento());
               stmt.setString(1, obj.getBairro());
               stmt.setString(1, obj.getCidade());
               stmt.setString(1, obj.getUf());
               
               stmt.execute();
               stmt.close();
               
               JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    
    }
    
    public void alterarCliente(Clientes obj){
        
    }
}
