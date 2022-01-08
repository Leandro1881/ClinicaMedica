/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author lbacc
 */
public class MedicoEspecialidades {
    
    private int idmedico;
    private int idespecialidade;

    public MedicoEspecialidades() {
    
    }

    public MedicoEspecialidades(int idmedico, int idespecialidade) {
        this.idmedico = idmedico;
        this.idespecialidade = idespecialidade;
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
     * @return the idespecialidade
     */
    public int getIdespecialidade() {
        return idespecialidade;
    }

    /**
     * @param idespecialidade the idespecialidade to set
     */
    public void setIdespecialidade(int idespecialidade) {
        this.idespecialidade = idespecialidade;
    }
}
