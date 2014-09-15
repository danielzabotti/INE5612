/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author daniel
 */
public class AtividadeBean implements Serializable {

    private String nome;
    private String descricao;
    private CategoriaBean categoria;
    private Integer progresso;
    private Date inicio;
    private Date fim;

    public AtividadeBean(AtividadeBean atividade) {
        this.nome = atividade.nome;
        this.descricao = atividade.descricao;
        this.categoria = atividade.categoria;
        this.progresso = atividade.progresso;
        this.inicio = atividade.inicio;
        this.fim = atividade.fim;
    }

    public AtividadeBean(String nome, String descricao, CategoriaBean categoria,
            Integer progresso, Date inicio, Date fim) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = new CategoriaBean(categoria);
        this.progresso = progresso;
        this.inicio = inicio;
        this.fim = fim;
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

    public CategoriaBean getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaBean categoria) {
        this.categoria = categoria;
    }

    public Integer getProgresso() {
        return progresso;
    }

    public void setProgresso(Integer progresso) {
        this.progresso = progresso;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

}
