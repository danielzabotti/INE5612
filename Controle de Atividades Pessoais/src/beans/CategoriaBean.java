/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.io.Serializable;

/**
 *
 * @author daniel
 */
public class CategoriaBean implements Serializable{
    private String nome;
    private String descricao;

    public CategoriaBean(CategoriaBean categoria){
        this.nome = categoria.nome;
        this.descricao = categoria.descricao;
    }
    
    public CategoriaBean(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
