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
import javax.swing.JOptionPane;
import models.Agenda;
import models.Consulta;

/**
 *
 * @author lbacc
 */
public class ConsultasDAO {
    
    
    public void inserir(Consulta c) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO CONSULTAS (IdConsulta, IdMedico, IdPaciente, DtInicio, DtFim, DiaSemana) VALUES "
                    + "(?, ?, ?, ?, ?, ?)");
            stmt.setString(1, c.getIdConsulta());
            stmt.setInt(2, c.getIdMedico());
            stmt.setString(3, c.getIdPaciente());
            stmt.setTime(4, c.getDtInicio());
            stmt.setTime(5, c.getDtFim());
            stmt.setString(6, c.getDiasemana());
            stmt.execute();
            stmt.close();           
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
    public List<Consulta> read_consultas(String cpf){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Consulta> lista = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT DISTINCT IdConsulta, idpaciente, dtinicio, dtfim, nome, diasemana FROM CONSULTAS C\n" +
"INNER JOIN MEDICOS M ON C.IDMEDICO = M.CRM\n" +
"where idpaciente = ?");
            stmt.setString(1, cpf);
            rs = stmt.executeQuery();
        
        while (rs.next()){
            Consulta c = new Consulta();

            c.setIdConsulta(rs.getString("idconsulta"));
            c.setIdPaciente(rs.getString("idpaciente"));
            c.setDtInicio(rs.getTime("dtinicio"));
            c.setDtFim(rs.getTime("dtfim"));
            c.setNome(rs.getString("nome"));
            c.setDiasemana(rs.getString("diasemana"));
            lista.add(c);       
        }
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
      return lista;   
    }
    
    
    public void delete(int idconsulta) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM CONSULTAS WHERE idconsulta = ?");
            stmt.setInt(1, idconsulta);
            stmt.execute();
            stmt.close();           
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Consulta> read_consultas_medico(int crm) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Consulta> lista = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("select IdConsulta, IdPaciente, dtinicio, dtfim, diasemana, nome "
                    + "from consultas c inner join pacientes p on p.cpf = c.idpaciente where IdMedico = ?");
            stmt.setInt(1, crm);
            rs = stmt.executeQuery();
        
        while (rs.next()){
            Consulta c = new Consulta();

            c.setIdConsulta(rs.getString("idconsulta"));
            c.setIdPaciente(rs.getString("idpaciente"));
            c.setDtInicio(rs.getTime("dtinicio"));
            c.setDtFim(rs.getTime("dtfim"));
            c.setDiasemana(rs.getString("diasemana"));
            c.setNome(rs.getString("nome"));
            lista.add(c);       
        }
        
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "CRM inválido.");
        } catch (SQLException EX){
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
      return lista;   
    }

    
}
