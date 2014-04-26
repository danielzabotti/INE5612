/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.Controle;

import estacionamento.Modelo.Estacionamento;
import estacionamento.Modelo.Placa;
import estacionamento.Modelo.Veiculo;
import java.math.BigDecimal;

/**
 *
 * @author aluno
 */
public class ControladorEstacionamento {

    private final Estacionamento estacionamento;

    public ControladorEstacionamento() {
        estacionamento = new Estacionamento();
    }

    public String alocarVeiculo(String placa) {
        String retorno = "";
        
            Placa tmpPlaca = new Placa(placa);
            if(estacionamento.alocarVeiculo(new Veiculo(tmpPlaca))){
                retorno = "Veículo alocado.";
            }else{
                throw new Error("Estacionamento lotado!");
            }
        
        
        return retorno;
    }

    public String configurarVagas(String numeroVagasString, String valorVagasString) {
        String retorno = "";
        Integer numeroVagas = Integer.parseInt(numeroVagasString);
        BigDecimal valorVagas = new BigDecimal(valorVagasString);
        
        if(estacionamento.configurarVagas(numeroVagas, valorVagas)){
            retorno = "Vagas configuradas.";
        }else{
            throw new Error("");
        }
        return retorno;
    }

}
