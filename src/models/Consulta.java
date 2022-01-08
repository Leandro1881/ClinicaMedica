/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.Time;
/**
 *
 * @author lbacc
 */
public class Consulta extends Medico{
    
    private String IdConsulta;
    private int IdMedico;
    private String IdPaciente;
    private Time DtInicio;
    private Time DtFim;
    private String diasemana;

    public Consulta() {
      // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Consulta(String IdConsulta, int IdMedico, String IdPaciente, Time DtInicio, Time DtFim, String diasemana) {
        this.IdConsulta = IdConsulta;
        this.IdMedico = IdMedico;
        this.IdPaciente = IdPaciente;
        this.DtInicio = DtInicio;
        this.DtFim = DtFim;
        this.diasemana = diasemana;
    }

    

    /**
     * @return the IdConsulta
     */
    public String getIdConsulta() {
        return IdConsulta;
    }

    /**
     * @param IdConsulta the IdConsulta to set
     */
    public void setIdConsulta(String IdConsulta) {
        this.IdConsulta = IdConsulta;
    }

    /**
     * @return the IdMedico
     */
    public int getIdMedico() {
        return IdMedico;
    }

    /**
     * @param IdMedico the IdMedico to set
     */
    public void setIdMedico(int IdMedico) {
        this.IdMedico = IdMedico;
    }

    /**
     * @return the IdPaciente
     */
    public String getIdPaciente() {
        return IdPaciente;
    }

    /**
     * @param IdPaciente the IdPaciente to set
     */
    public void setIdPaciente(String IdPaciente) {
        this.IdPaciente = IdPaciente;
    }

    /**
     * @return the DtInicio
     */
    public Time getDtInicio() {
        return DtInicio;
    }

    /**
     * @param DtInicio the DtInicio to set
     */
    public void setDtInicio(Time DtInicio) {
        this.DtInicio = DtInicio;
    }

    /**
     * @return the DtFim
     */
    public Time getDtFim() {
        return DtFim;
    }

    /**
     * @param DtFim the DtFim to set
     */
    public void setDtFim(Time DtFim) {
        this.DtFim = DtFim;
    }

    public Consulta(String IdConsulta, int IdMedico, String IdPaciente, Time DtInicio, Time DtFim) {
        this.IdConsulta = IdConsulta;
        this.IdMedico = IdMedico;
        this.IdPaciente = IdPaciente;
        this.DtInicio = DtInicio;
        this.DtFim = DtFim;
    }

    /**
     * @return the diasemana
     */
    public String getDiasemana() {
        return diasemana;
    }

    /**
     * @param diasemana the diasemana to set
     */
    public void setDiasemana(String diasemana) {
        this.diasemana = diasemana;
    }
    
    
}
