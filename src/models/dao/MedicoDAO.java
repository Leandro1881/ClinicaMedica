/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Agenda;

/**
 *
 * @author lbacc
 */
public class MedicoDAO {
    
    public static int retorna_crm(String nome_medico){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int crm = -100;
        
        try {
            stmt = con.prepareStatement("SELECT CRM FROM MEDICOS WHERE NOME = ?");
            stmt.setString(1, nome_medico);
            rs = stmt.executeQuery();
        
        if (rs.next()){
            crm = rs.getInt("CRM");
            System.out.println(crm);
        }
        
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }  
    return crm;
    }
    
        public static String retorna_telefone(int CRM){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String telefone = "";
        
        try {
            stmt = con.prepareStatement("SELECT TELEFONE FROM MEDICOS WHERE CRM = ?");
            stmt.setInt(1, CRM);
            rs = stmt.executeQuery();
        
        if (rs.next()){
            telefone = rs.getString("telefone");
        }
        
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }  
    return telefone.replace("-","").replace("(","").replace(")","");
    }
}
