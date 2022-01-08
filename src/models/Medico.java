
package models;

/**
 *
 * @author lbacc
 */
public class Medico extends MedicoEspecialidades {
    private int crm;
    private String nome;
    private String telefone;

    public Medico(int crm, String nome, String telefone) {
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Medico() {
 
    }
    
    

    /**
     * @return the crm
     */
    public int getCrm() {
        return crm;
    }

    /**
     * @param crm the crm to set
     */
    public void setCrm(int crm) {
        this.crm = crm;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
