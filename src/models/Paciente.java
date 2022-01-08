package models;

import java.sql.Time;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author lbacc
 */
public class Paciente {
    
    private int count = 0;
    private String nome;
    private String cpf;
    private int idade;
    private String telefone;
    private String sexo;
    private String senha;
    
    private Time horainicio;
    private Time horafim;

    public Paciente(String nome, String cpf, Time horainicio, Time horafim) {
        this.nome = nome;
        this.cpf = cpf;
        this.horainicio = horainicio;
        this.horafim = horafim;
        count++;
    }
    

    public Paciente() {
    
    }

    public Paciente(String nome, String cpf, int idade, String telefone, String sexo, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
        this.sexo = sexo;
        this.senha = senha;
    }
    
    

    public Paciente(String text, String text0) {
        nome = text;
        cpf = text0;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
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

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
