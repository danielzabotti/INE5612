/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.Controle;

import estacionamento.Modelo.Estacionamento;
import estacionamento.Modelo.Placa;
import estacionamento.Modelo.Veiculo;
import estacionamento.Visao.FrameBaseEstacionamento;
import java.math.BigDecimal;
import java.util.Arrays;

/**
 *
 * @author aluno
 */
public class ControladorEstacionamento {

    private final Estacionamento estacionamento;
    private FrameBaseEstacionamento visao;

    public ControladorEstacionamento() {
        estacionamento = new Estacionamento();
    }

    public String entradaSaidaVeiculo(String placa) {
        String retorno = "";
        Placa tmpPlaca = new Placa(placa);
        
        
        if(!estacionamento.veiculoEstacionado(tmpPlaca)){
            
            if(estacionamento.alocarVeiculo(new Veiculo(tmpPlaca))){
                retorno = "Veículo alocado.";
            }else{
                throw new Error("Estacionamento lotado!");
            }
        }else{
            Veiculo veiculo = estacionamento.buscarVeiculo(tmpPlaca);
            retorno = estacionamento.registrarSaida(veiculo).toPlainString();
        }
        atualizarView();
        return retorno;
    }

    public String configurarVagas(String numeroVagasString, String valorVagasString) {
        String retorno = "";
        Integer numeroVagas = Integer.parseInt(numeroVagasString);
        BigDecimal valorVagas = new BigDecimal(valorVagasString);
        
        if(estacionamento.configurarVagas(numeroVagas, valorVagas)){
            retorno = "Vagas configuradas.";
        }else{
            throw new Error("merdaxiti");
        }
        atualizarView();
        return retorno;
    }

    public void registrarView(FrameBaseEstacionamento visao) {
        this.visao = visao;
        this.visao.setVisible(true);
        atualizarView();
    }

    private void atualizarView() {
        this.visao.mudarTextoVagasOcupadas(String.valueOf(estacionamento.vagasOcupadas().size()));
        this.visao.mudarTextoVagasLivres(String.valueOf(estacionamento.vagasLivres().size()));    
    }

}
