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
public class Vaga {
    private Boolean ocupada;
    
    /**
     *
     * @param valor
     */
    public Vaga(Float valor){
        this.valor = valor;
    }

    public Boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(Boolean ocupada) {
        this.ocupada = ocupada;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
    private Float valor;    
}
