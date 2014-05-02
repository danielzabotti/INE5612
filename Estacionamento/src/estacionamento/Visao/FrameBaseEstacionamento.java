/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.Visao;

import estacionamento.Controle.ControladorEstacionamento;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class FrameBaseEstacionamento extends javax.swing.JFrame {

    private final ControladorEstacionamento controladorEstacionamento;

    /**
     * Creates new form FrameBase
     */
    public FrameBaseEstacionamento(ControladorEstacionamento controlador) {
        initComponents();
        this.controladorEstacionamento = controlador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTabbedPanePrincipal = new javax.swing.JTabbedPane();
        jPanelMovimento = new javax.swing.JPanel();
        jButtonConfirmar = new javax.swing.JButton();
        jLabelPlaca = new javax.swing.JLabel();
        jLabelEntradaSaida = new javax.swing.JLabel();
        jTextFieldPlaca = new javax.swing.JTextField();
        jPanelConfiguracao = new javax.swing.JPanel();
        jTextFieldValorVaga = new javax.swing.JTextField();
        jLabelValorVaga = new javax.swing.JLabel();
        jTextFieldVagasDisponiveis = new javax.swing.JTextField();
        jLabelVagasDisponiveis = new javax.swing.JLabel();
        jButtonConfirmarVagas = new javax.swing.JButton();
        jSeparatorTopo = new javax.swing.JSeparator();
        jLabelVagasLivres = new javax.swing.JLabel();
        jLabelVagasOcupadas = new javax.swing.JLabel();
        jLabelVagasLivresTotal = new javax.swing.JLabel();
        jLabelVagasOcupadasTotal = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConfirmarMouseClicked(evt);
            }
        });

        jLabelPlaca.setText("Placa");

        jLabelEntradaSaida.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelEntradaSaida.setText("Entrada/Saída");

        jTextFieldPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlacaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMovimentoLayout = new javax.swing.GroupLayout(jPanelMovimento);
        jPanelMovimento.setLayout(jPanelMovimentoLayout);
        jPanelMovimentoLayout.setHorizontalGroup(
            jPanelMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMovimentoLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(jPanelMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelPlaca)
                    .addComponent(jLabelEntradaSaida)
                    .addComponent(jButtonConfirmar)
                    .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanelMovimentoLayout.setVerticalGroup(
            jPanelMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMovimentoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabelEntradaSaida)
                .addGap(48, 48, 48)
                .addComponent(jLabelPlaca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButtonConfirmar)
                .addGap(30, 30, 30))
        );

        jTabbedPanePrincipal.addTab("Movimento", jPanelMovimento);

        jTextFieldValorVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorVagaActionPerformed(evt);
            }
        });

        jLabelValorVaga.setText("Valor por vaga");

        jTextFieldVagasDisponiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVagasDisponiveisActionPerformed(evt);
            }
        });

        jLabelVagasDisponiveis.setText("Vagas disponíveis");

        jButtonConfirmarVagas.setText("Confirmar");
        jButtonConfirmarVagas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConfirmarVagasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelConfiguracaoLayout = new javax.swing.GroupLayout(jPanelConfiguracao);
        jPanelConfiguracao.setLayout(jPanelConfiguracaoLayout);
        jPanelConfiguracaoLayout.setHorizontalGroup(
            jPanelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConfiguracaoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelValorVaga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldValorVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelVagasDisponiveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldVagasDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonConfirmarVagas, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanelConfiguracaoLayout.setVerticalGroup(
            jPanelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConfiguracaoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelValorVaga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldValorVaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVagasDisponiveis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldVagasDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonConfirmarVagas)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jTabbedPanePrincipal.addTab("Configuração", jPanelConfiguracao);

        jLabelVagasLivres.setText("Vagas Livres:");

        jLabelVagasOcupadas.setText("Vagas Ocupadas:");

        jLabelVagasLivresTotal.setText("0");

        jLabelVagasOcupadasTotal.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPanePrincipal)
            .addComponent(jSeparatorTopo, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelVagasOcupadas)
                    .addComponent(jLabelVagasLivres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelVagasLivresTotal)
                    .addComponent(jLabelVagasOcupadasTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVagasLivres)
                    .addComponent(jLabelVagasLivresTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVagasOcupadas)
                    .addComponent(jLabelVagasOcupadasTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlacaActionPerformed

    private void jTextFieldValorVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorVagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorVagaActionPerformed

    private void jTextFieldVagasDisponiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVagasDisponiveisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVagasDisponiveisActionPerformed

    private void jButtonConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConfirmarMouseClicked
        try {
          controladorEstacionamento.entradaSaidaVeiculo(jTextFieldPlaca.getText());
        } catch (Error err) {
            System.out.println("Erro:  " + err.getMessage());
        } catch (Exception ex) {
            System.out.println("Exceção:  " + ex.getMessage());
        }

    }//GEN-LAST:event_jButtonConfirmarMouseClicked

    private void jButtonConfirmarVagasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConfirmarVagasMouseClicked
        try {
            controladorEstacionamento.configurarVagas(jTextFieldVagasDisponiveis.getText(), jTextFieldValorVaga.getText());
        } catch (Error err) {
            System.out.println("Erro:  " + err.getMessage());
            System.out.println("Stack:  " + Arrays.toString(err.getStackTrace()));

        } catch (Exception ex) {
            System.out.println("Exceção:  " + ex.getMessage());
            System.out.println("Stack:  " + Arrays.toString(ex.getStackTrace()));
        }
    }//GEN-LAST:event_jButtonConfirmarVagasMouseClicked

    public void mudarTextoVagasOcupadas(String qnt) {
        this.jLabelVagasOcupadasTotal.setText(qnt);
    }

    public void mudarTextoVagasLivres(String qnt) {
        this.jLabelVagasLivresTotal.setText(qnt);
    }
    
    public Boolean dialogoSimNao(String textoCorpo, String textoBarra){
        Boolean retorno = false;
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, textoCorpo, textoBarra, dialogButton);
        if (dialogResult == 0) {
            retorno = true;
        }
        return retorno;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonConfirmarVagas;
    private javax.swing.JLabel jLabelEntradaSaida;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelVagasDisponiveis;
    private javax.swing.JLabel jLabelVagasLivres;
    private javax.swing.JLabel jLabelVagasLivresTotal;
    private javax.swing.JLabel jLabelVagasOcupadas;
    private javax.swing.JLabel jLabelVagasOcupadasTotal;
    private javax.swing.JLabel jLabelValorVaga;
    private javax.swing.JPanel jPanelConfiguracao;
    private javax.swing.JPanel jPanelMovimento;
    private javax.swing.JSeparator jSeparatorTopo;
    private javax.swing.JTabbedPane jTabbedPanePrincipal;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextField jTextFieldVagasDisponiveis;
    private javax.swing.JTextField jTextFieldValorVaga;
    // End of variables declaration//GEN-END:variables
}
