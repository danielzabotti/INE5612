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
public class Carro {
    private Placa placa;
    
    public Carro(String placa){
        this.placa = new Placa(placa);
    }
    
}
