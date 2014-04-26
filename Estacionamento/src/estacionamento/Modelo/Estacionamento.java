package estacionamento.Modelo;

import java.math.BigDecimal;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Estacionamento {
    private HashSet<Vaga> vagas;
    
    public Estacionamento(){
        vagas = new HashSet<>();
        vagas.add(new Vaga(new BigDecimal(0.00)));
    }
    
    public Boolean alocarVeiculo(Veiculo veiculo) {
        Boolean retorno = false;
        for(Vaga vaga : vagas){
            if(!vaga.isOcupada()){
                vaga.setVeiculo(veiculo);
                vaga.setOcupada(true);
                retorno = true;
                break;
            }
        }
        return retorno;
    }

    public Boolean configurarVagas(Integer numeroVagas, BigDecimal valorVagas) {
        Boolean retorno = false;
        HashSet<Vaga> vagasOcupadas = new HashSet<>();
        for(Vaga vaga : vagas){
            if(vaga.isOcupada()){
                vagasOcupadas.add(vaga);
            }
        }
        if(vagasOcupadas.size() < numeroVagas){
            vagas.clear();
            vagas.addAll(vagasOcupadas);
            for(Integer i = 0; i<numeroVagas;i++)
                vagas.add(new Vaga(valorVagas));
                
        }else{
            throw new Error("O número de vagas configurado é menor ou igual que o de vagas ocupadas no momento!");
        }
        return retorno;
    }
    
}
