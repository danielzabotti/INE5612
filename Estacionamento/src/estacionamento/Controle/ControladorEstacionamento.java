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

    public void entradaSaidaVeiculo(String placa) {

        Placa tmpPlaca = new Placa(placa);
        
        
        if(!estacionamento.veiculoEstacionado(tmpPlaca)){
            
            if(!estacionamento.alocarVeiculo(new Veiculo(tmpPlaca)))
                throw new Error("Não há vagas disponíveis!");
            
        }else{
            Veiculo veiculo = estacionamento.buscarVeiculo(tmpPlaca);
            
            String total = estacionamento.valorSaida(veiculo).toString();
            if(visao.dialogoSimNao("Total: " + total, "Confirmar saída")){
                estacionamento.registrarSaida(veiculo).toPlainString();
            } 
               
        }
        atualizarView();
    }

    public void configurarVagas(String numeroVagasString, String valorVagasString) {
        Integer numeroVagas = Integer.parseInt(numeroVagasString);
        BigDecimal valorVagas = new BigDecimal(valorVagasString);
        
        if(!estacionamento.configurarVagas(numeroVagas, valorVagas))
            throw new Error("");
        atualizarView();
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
