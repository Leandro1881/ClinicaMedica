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
public class AgendaDAO {
    
    public boolean read_login(String cpf, String senha) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        try {
            stmt = con.prepareStatement("SELECT * FROM PACIENTES WHERE CPF = ? AND SENHA = ?");
            stmt.setString(1, cpf);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }
    
    
    public List<Agenda> read_dentista(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Agenda> lista = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT A.DiaSemana, A.HoraInicio, A.HoraFim, m.nome, m.telefone, A.IdAgenda from agendas A\n" +
"inner join medicos m on A.IdMedico = m.crm\n" +
"inner join medicos_especialidades me on m.crm = me.idmedico\n" +
"where me.idespecialidade = 111");
            rs = stmt.executeQuery();
        
        while (rs.next()){
            Agenda a = new Agenda();
            a.setHorainicio(rs.getTime("HoraInicio"));
            a.setHorafim(rs.getTime("HoraFim"));
            a.setDiasemana(rs.getString("DiaSemana"));
            a.setNome(rs.getString("Nome"));
            a.setTelefone(rs.getString("telefone"));
            a.setIdagenda(rs.getInt("IdAgenda"));
            lista.add(a);       
        }
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
      return lista;   
    }
    
     public List<Agenda> read_pediatra(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Agenda> lista = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT A.DiaSemana, A.HoraInicio, A.HoraFim, m.nome, m.telefone, A.IdAgenda from agendas A\n" +
"inner join medicos m on A.IdMedico = m.crm\n" +
"inner join medicos_especialidades me on m.crm = me.idmedico\n" +
"where me.idespecialidade = 222");
            rs = stmt.executeQuery();
        
        while (rs.next()){
            Agenda a = new Agenda();
            a.setHorainicio(rs.getTime("HoraInicio"));
            a.setHorafim(rs.getTime("HoraFim"));
            a.setDiasemana(rs.getString("DiaSemana"));
            a.setNome(rs.getString("Nome"));
            a.setTelefone(rs.getString("telefone"));
            a.setIdagenda(rs.getInt("IdAgenda"));
            lista.add(a);       
        }
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
      return lista;   
    }
     
      public List<Agenda> read_nutricionista(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Agenda> lista = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT A.DiaSemana, A.HoraInicio, A.HoraFim, m.nome, m.telefone, A.IdAgenda from agendas A\n" +
"inner join medicos m on A.IdMedico = m.crm\n" +
"inner join medicos_especialidades me on m.crm = me.idmedico\n" +
"where me.idespecialidade = 333");
            rs = stmt.executeQuery();
        
        while (rs.next()){
            Agenda a = new Agenda();
            a.setHorainicio(rs.getTime("HoraInicio"));
            a.setHorafim(rs.getTime("HoraFim"));
            a.setDiasemana(rs.getString("DiaSemana"));
            a.setNome(rs.getString("Nome"));
            a.setTelefone(rs.getString("telefone"));
            a.setIdagenda(rs.getInt("IdAgenda"));
            lista.add(a);       
        }
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
      return lista;   
    }
      
    public void delete(int idagenda) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM AGENDAS WHERE IdAgenda = ?");
            stmt.setInt(1, idagenda);
            stmt.execute();
            stmt.close();           
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void inserir(Agenda a) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("insert into agendas values (?, ?, ?, ?, ?);");
            stmt.setInt(1, a.getIdagenda());
            stmt.setInt(2, a.getIdmedico());
            stmt.setString(3, a.getDiasemana());
            stmt.setTime(4, a.getHorainicio());
            stmt.setTime(5, a.getHorafim());
            stmt.execute();
            stmt.close();           
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    
   
    
}
