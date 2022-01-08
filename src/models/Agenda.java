/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.Time;

/**
 *
 * @author lbacc
 */
public class Agenda extends Medico {
    
    private int idagenda;
    private int idmedico;
    private String diasemana;
    private Time horainicio;
    private Time horafim;

    public Agenda(int idagenda, int idmedico, String diasemana, Time horainicio, Time horafim, String nome, String telefone) {
        this.idagenda = idagenda;
        this.idmedico = idmedico;
        this.diasemana = diasemana;
        this.horainicio = horainicio;
        this.horafim = horafim;
    }

    public Agenda() {

    }
    
    

    /**
     * @return the idagenda
     */
    public int getIdagenda() {
        return idagenda;
    }

    /**
     * @param idagenda the idagenda to set
     */
    public void setIdagenda(int idagenda) {
        this.idagenda = idagenda;
    }

    /**
     * @return the idmedico
     */
    public int getIdmedico() {
        return idmedico;
    }

    /**
     * @param idmedico the idmedico to set
     */
    public void setIdmedico(int idmedico) {
        this.idmedico = idmedico;
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

    /**
     * @return the horainicio
     */
    public Time getHorainicio() {
        return horainicio;
    }

    /**
     * @param horainicio the horainicio to set
     */
    public void setHorainicio(Time horainicio) {
        this.horainicio = horainicio;
    }

    /**
     * @return the horafim
     */
    public Time getHorafim() {
        return horafim;
    }

    /**
     * @param horafim the horafim to set
     */
    public void setHorafim(Time horafim) {
        this.horafim = horafim;
    }
    
}
