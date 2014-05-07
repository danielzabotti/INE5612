/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estacionamento.Modelo;

/**
 *
 * @author aluno
 */
public class Cliente {
    private CPF cpf;
    private String nome;
    private Telefone telefone;
    
    public Cliente(CPF cpf, String nome, Telefone telefone){
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    
    
    
    
}
