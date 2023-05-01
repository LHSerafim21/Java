/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Projeto_Ludo.View;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Henrique
 */
public class jSerHost extends javax.swing.JFrame {

    /**
     * Creates new form jSerHost
     */
    public jSerHost() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundoSerHost = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPaneCadastrarPlayer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPanePlayer1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPanePlayer2 = new javax.swing.JTextPane();
        jButtonIniciar = new javax.swing.JButton();
        jLabelPlayer1 = new javax.swing.JLabel();
        jLabelPlayer2 = new javax.swing.JLabel();
        jLabelInsiraONome = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jLabel_IP = new javax.swing.JLabel();
        jButtonPegarIP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFundoSerHost.setBackground(new java.awt.Color(153, 153, 153));

        jLabelTitulo.setFont(new java.awt.Font("Blue Fonte Sans", 0, 80)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 0, 0));
        jLabelTitulo.setText("LUDO");

        jPaneCadastrarPlayer.setBackground(new java.awt.Color(102, 102, 102));
        jPaneCadastrarPlayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(jTextPanePlayer1);

        jPaneCadastrarPlayer.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 95, 258, 50));

        jScrollPane2.setViewportView(jTextPanePlayer2);

        jPaneCadastrarPlayer.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 95, 258, 49));

        jButtonIniciar.setFont(new java.awt.Font("Blue Fonte Sans", 0, 36)); // NOI18N
        jButtonIniciar.setText("INICIAR!!");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });
        jPaneCadastrarPlayer.add(jButtonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 279, 266, 56));

        jLabelPlayer1.setFont(new java.awt.Font("Blue Fonte Sans", 0, 24)); // NOI18N
        jLabelPlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlayer1.setText("Player 1");
        jPaneCadastrarPlayer.add(jLabelPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 180, 30));

        jLabelPlayer2.setFont(new java.awt.Font("Blue Fonte Sans", 0, 24)); // NOI18N
        jLabelPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlayer2.setText("Player 2");
        jPaneCadastrarPlayer.add(jLabelPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 140, 30));

        jLabelInsiraONome.setFont(new java.awt.Font("Blue Fonte Sans", 0, 24)); // NOI18N
        jLabelInsiraONome.setText("Insira o Nome:");
        jPaneCadastrarPlayer.add(jLabelInsiraONome, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 270, 30));

        jButtonVoltar.setFont(new java.awt.Font("Blue Fonte Sans", 0, 24)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabel_IP.setFont(new java.awt.Font("Blue Fonte Sans", 0, 48)); // NOI18N
        jLabel_IP.setText("Seu Endereco de ip");

        jButtonPegarIP.setFont(new java.awt.Font("Blue Fonte Sans", 0, 36)); // NOI18N
        jButtonPegarIP.setText("Pegar IP");
        jButtonPegarIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPegarIPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFundoSerHostLayout = new javax.swing.GroupLayout(jPanelFundoSerHost);
        jPanelFundoSerHost.setLayout(jPanelFundoSerHostLayout);
        jPanelFundoSerHostLayout.setHorizontalGroup(
            jPanelFundoSerHostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoSerHostLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelFundoSerHostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFundoSerHostLayout.createSequentialGroup()
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(340, 340, 340))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFundoSerHostLayout.createSequentialGroup()
                        .addComponent(jPaneCadastrarPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFundoSerHostLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jButtonPegarIP, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFundoSerHostLayout.setVerticalGroup(
            jPanelFundoSerHostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoSerHostLayout.createSequentialGroup()
                .addGroup(jPanelFundoSerHostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFundoSerHostLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jPaneCadastrarPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFundoSerHostLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanelFundoSerHostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonPegarIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_IP, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFundoSerHost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFundoSerHost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        Janela_Principal frame = new Janela_Principal();
        
        
        frame.setVisible(true);
        frame.setSize(1177,807);
        dispose();
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        
        if(jTextPanePlayer1.getText() != ""){
        
        String Player1 = jTextPanePlayer1.getText();
        String Player2 = jTextPanePlayer2.getText();
        
        jJogo game = new jJogo();
        game.setVisible(true);
        game.setSize(1177,807);
        dispose();
        game.setLocationRelativeTo(null);
        }
        
        else{
            JOptionPane.showMessageDialog(rootPane, "ERRO, Digite o nome dos Players para começar a jogar...");
        }
    }//GEN-LAST:event_jButtonIniciarActionPerformed

    private void jButtonPegarIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPegarIPActionPerformed
        
        try {
            String ipDaMaquina = InetAddress.getLocalHost().getHostAddress();
            jLabel_IP.setText("Seu IP: " + ipDaMaquina);
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(jSerHost.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonPegarIPActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jSerHost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jSerHost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jSerHost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jSerHost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jSerHost().setVisible(true);
            }
        });
    }
    
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JButton jButtonPegarIP;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelInsiraONome;
    private javax.swing.JLabel jLabelPlayer1;
    private javax.swing.JLabel jLabelPlayer2;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabel_IP;
    private javax.swing.JPanel jPaneCadastrarPlayer;
    private javax.swing.JPanel jPanelFundoSerHost;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPanePlayer1;
    private javax.swing.JTextPane jTextPanePlayer2;
    // End of variables declaration//GEN-END:variables
}
