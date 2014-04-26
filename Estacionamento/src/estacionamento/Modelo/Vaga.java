/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estacionamento.Modelo;

import java.math.BigDecimal;

/**
 *
 * @author aluno
 */
public class Vaga {
    private Boolean ocupada;
    private BigDecimal valor;
    private Veiculo veiculoOcupante;
    /**
     *
     * @param valor
     */
    public Vaga(BigDecimal valor){
        this.valor = valor;
        this.ocupada = false;
 
    }

    public Boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(Boolean ocupada) {
        this.ocupada = ocupada;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    
    public Veiculo getVeiculo() {
        return veiculoOcupante;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculoOcupante = veiculo;
    }
        
}
