/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estacionamento.Visao;

/**
 *
 * @author aluno
 */
public class MensagemComStatus {    
    private String mensagem;
    private String estado;
    
    public MensagemComStatus(String mensagem, String estado){
        this.mensagem = mensagem;
        this.estado = estado;
    }
    
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String isEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getEstado() {
        return estado;
    }
}
