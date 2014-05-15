/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package validadorbean;

import java.util.EventListener;

/**
 *
 * @author aluno
 */
public interface ValidadorEventListener extends EventListener {
    public void conteudoOK(ValidadorEvent evt);

    public void conteudoInvalido(ValidadorEvent evt);
}
