package estacionamento.Modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
            retorno = true;   
        }else{
            throw new Error("O número de vagas configurado é menor ou igual que o de vagas ocupadas no momento!");
        }
        return retorno;
    }
    
    public Set<Vaga> vagasOcupadas() {
        Set<Vaga> retorno = new HashSet<>();
        for(Vaga vaga : this.vagas)
            if(vaga.isOcupada())
                retorno.add(vaga);
        return retorno;
    }

    public Set<Vaga> vagasLivres() {
        Set<Vaga> retorno = new HashSet<>();
        for(Vaga vaga : this.vagas)
            if(!vaga.isOcupada())
                retorno.add(vaga);
        return retorno;
    }

    public Boolean veiculoEstacionado(Placa placa) {
        Boolean retorno = false;
        for(Vaga vaga : this.vagasOcupadas())
            if(vaga.getVeiculo().getPlaca().equals(placa))
                retorno = true;
        return retorno;
    }

    public BigDecimal registrarSaida(Veiculo veiculo) {
        Vaga vaga = null;
        for(Vaga ivaga : this.vagasOcupadas())
            if(ivaga.getVeiculo().equals(veiculo))
                vaga = ivaga;
        
        
        vaga.setOcupada(false);
        vaga.setVeiculo(null);
        return vaga.getValor();
    }

    public Veiculo buscarVeiculo(Placa placa) {
        Veiculo retorno = null;
        for(Vaga vaga : this.vagasOcupadas())
            if(vaga.getVeiculo().getPlaca().equals(placa))
                retorno = vaga.getVeiculo();
        return retorno;
    }
    
}
