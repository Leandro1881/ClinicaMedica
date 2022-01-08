/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.dao;


import models.Paciente;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;
import models.Paciente;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author lbacc
 */
public class PacienteDAO {
    
    public void inserir(Paciente p) throws SQLIntegrityConstraintViolationException, SQLException {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        
            stmt = con.prepareStatement("INSERT INTO PACIENTES (CPF, NOME, IDADE, TELEFONE, SEXO, SENHA) VALUES (?, ?, ?, ?, ?, ?)");
            stmt.setString(1, p.getCpf());
            stmt.setString(2, p.getNome());
            stmt.setInt(3, p.getIdade());
            stmt.setString(4, p.getTelefone());
            stmt.setString(5, p.getSexo());
            stmt.setString(6, p.getSenha());
            
            stmt.execute();
            stmt.close();   
            ConnectionFactory.closeConnection(con, stmt);
        
    }
     
}
