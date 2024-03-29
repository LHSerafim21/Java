/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Controlador.ControladorFabricante;
import Controlador.ControladorProduto;
import Controlador.ControladorTransportadora;
import Controlador.ControladorUsuario;
import Controlador.ControladorVendas;

/**
 *
 * @author Nazaro
 */
public class TelaInicial2 extends javax.swing.JFrame {

    ControladorProduto controller;
    /**
     * Creates new form TelaInicial2
     */
    public TelaInicial2() {
        initComponents();
        controller = new ControladorProduto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuProdutoCadastrar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuFabricanteCadastrar = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuTransportadoraCadastrar = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuUsuarioCadastrarC = new javax.swing.JMenuItem();
        jMenuUsuarioCadastrarG = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comercio Eletronico");

        jMenu3.setText("Produtos");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuProdutoCadastrar.setText("Cadastrar Produto");
        jMenuProdutoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProdutoCadastrarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuProdutoCadastrar);

        jMenu1.setText("Listar");

        jMenuItem24.setText("Todos");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem24);

        jMenuItem2.setText("Moveis");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Eletrodomesticos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Eletronicos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Vestuario");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Mais Vendidos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenu4.setText("Por Valor");

        jMenuItem7.setText("QUICKSORT");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("BUBBLESORT");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenu1.add(jMenu4);

        jMenu3.add(jMenu1);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Fabricantes");

        jMenuFabricanteCadastrar.setText("Cadastro Fabricantes");
        jMenuFabricanteCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFabricanteCadastrarActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuFabricanteCadastrar);

        jMenu9.setText("Listar");

        jMenuItem9.setText("Todos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem9);

        jMenuItem10.setText("Mais Vendas");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem10);

        jMenuItem11.setText("Maior Lucro");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem11);

        jMenu5.add(jMenu9);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Transportadoras");

        jMenuTransportadoraCadastrar.setText("Cadastrar Transportadora");
        jMenuTransportadoraCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTransportadoraCadastrarActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuTransportadoraCadastrar);

        jMenu10.setText("Listar");

        jMenuItem12.setText("Todas");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem12);

        jMenuItem13.setText("Mais Transportes");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem13);

        jMenu6.add(jMenu10);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Usuarios");

        jMenu8.setText("Cadastrar");

        jMenuUsuarioCadastrarC.setText("Cliente");
        jMenuUsuarioCadastrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUsuarioCadastrarCActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuUsuarioCadastrarC);

        jMenuUsuarioCadastrarG.setText("Cadastrar Gerente");
        jMenuUsuarioCadastrarG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUsuarioCadastrarGActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuUsuarioCadastrarG);

        jMenu7.add(jMenu8);

        jMenu11.setText("Listar");

        jMenuItem14.setText("Gerentes");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem14);

        jMenuItem15.setText("Clientes");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem15);

        jMenuItem16.setText("Clientes Ouro");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem16);

        jMenuItem17.setText("Historico de Cliente");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem17);

        jMenu7.add(jMenu11);

        jMenuBar1.add(jMenu7);

        jMenu2.setText("Vendas");

        jMenuItem18.setText("Realizar Venda");
        jMenu2.add(jMenuItem18);

        jMenu12.setText("Listar");

        jMenuItem19.setText("Todas");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem19);

        jMenuItem1.setText("Mês");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem1);

        jMenu13.setText("Pagamento");

        jMenuItem21.setText("Dinheiro");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem21);

        jMenuItem22.setText("PIX");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem22);

        jMenuItem23.setText("Cartão de Crédito");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem23);

        jMenu12.add(jMenu13);

        jMenu2.add(jMenu12);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 849, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuProdutoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProdutoCadastrarActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(() -> {
            CadastroProduto dialog = new CadastroProduto();
            dialog.setVisible(true);
        });  
    }//GEN-LAST:event_jMenuProdutoCadastrarActionPerformed

    private void jMenuFabricanteCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFabricanteCadastrarActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            CadastroFabricante dialog = new CadastroFabricante();
            dialog.setVisible(true);
        });          // TODO add your handling code here:
    }//GEN-LAST:event_jMenuFabricanteCadastrarActionPerformed

    private void jMenuTransportadoraCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTransportadoraCadastrarActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            CadastroTransportadora dialog = new CadastroTransportadora();
            dialog.setVisible(true);
        });          // TODO add your handling code here:
    }//GEN-LAST:event_jMenuTransportadoraCadastrarActionPerformed

    private void jMenuUsuarioCadastrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUsuarioCadastrarCActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            CadastroCliente dialog = new CadastroCliente();
            dialog.setVisible(true);
        }); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuUsuarioCadastrarCActionPerformed

    private void jMenuUsuarioCadastrarGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUsuarioCadastrarGActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            CadastroCliente dialog = new CadastroCliente();
            dialog.setVisible(true);
        });         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuUsuarioCadastrarGActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            Relatorio dialog = new Relatorio(this, false);
            ControladorProduto controller = new ControladorProduto();
            dialog.exibir("Relatorio de Produtos", "Todos os Produtos cadastrados", controller.listarProdutosCadastrados());
            dialog.setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
            Relatorio dialog = new Relatorio(this, false);
            ControladorProduto controller = new ControladorProduto();
            dialog.exibir("Relatorio de Produtos", "Todos os Moveis cadastrados", controller.listarMoveis());
            dialog.setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
            Relatorio dialog = new Relatorio(this, false);
            ControladorProduto controller = new ControladorProduto();
            dialog.exibir("Relatorio de Produtos", "Todos os Eletrodomesticos cadastrados", controller.listarEletrodomesticos());
            dialog.setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
            Relatorio dialog = new Relatorio(this, false);
            ControladorProduto controller = new ControladorProduto();
            dialog.exibir("Relatorio de Produtos", "Todos os Eletronicos cadastrados", controller.listarEletronicos());
            dialog.setVisible(true);
        });       // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
            Relatorio dialog = new Relatorio(this, false);
            ControladorProduto controller = new ControladorProduto();
            dialog.exibir("Relatorio de Produtos", "Todas as Roupas cadastradas", controller.listarVestuarios());
            dialog.setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
            Relatorio dialog = new Relatorio(this, false);
            ControladorProduto controller = new ControladorProduto();
            dialog.exibir("Relatorio de Produtos", "Os 10 produtos mais vendidos", controller.listarProdutosMaisVendidos());
            dialog.setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
            Relatorio dialog = new Relatorio(this, false);
            ControladorProduto controller = new ControladorProduto();
            dialog.exibir("Relatorio de Produtos", "Produtos em ordem crescente (Valor) | QuickSort", controller.listarTodosOsProdutosOrdenadosPorValorOrdenacaoA());
            dialog.setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
            Relatorio dialog = new Relatorio(this, false);
            ControladorProduto controller = new ControladorProduto();
            dialog.exibir("Relatorio de Produtos", "Produtos em ordem crescente (Valor) | BubbleSort", controller.listarTodosOsProdutosOrdenadosPorValorOrdenacaoB());
            dialog.setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
            Relatorio dialog = new Relatorio(this, false);
            ControladorFabricante controller = new ControladorFabricante();
            dialog.exibir("Relatorio de Fabricantes", "Todos os Fabricantes", controller.listarFabricantesCadastrados());
            dialog.setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
            Relatorio dialog = new Relatorio(this, false);
            ControladorFabricante controller = new ControladorFabricante();
            dialog.exibir("Relatorio de Fabricantes", "Fabricantes com mais vendas", "Desculpe o transtorno, estamos em manutenção");
            dialog.setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
            Relatorio dialog = new Relatorio(this, false);
            ControladorFabricante controller = new ControladorFabricante();
            dialog.exibir("Relatorio de Fabricantes", "Fabricantes com maior lucro", "Desculpe o transtorno, estamos em manutenção");
            dialog.setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
            Relatorio dialog = new Relatorio(this, false);
            ControladorTransportadora controller = new ControladorTransportadora();
            dialog.exibir("Relatorio de Transportadoras", "Todas as Transportadoras", controller.listarTransportadorasCadastrados());
            dialog.setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
            Relatorio dialog = new Relatorio(this, false);
            ControladorTransportadora controller = new ControladorTransportadora();
            dialog.exibir("Relatorio de Transportadoras", "Transportadoras com mais transporte", "Desculpe o transtorno, estamos em manutenção");
            dialog.setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
            Relatorio dialog = new Relatorio(this, false);
            ControladorUsuario controller = new ControladorUsuario();
            dialog.exibir("Relatorio de Usuarios", "Todos os Gerentes", controller.listarGerentesCadastrados());
            dialog.setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
            Relatorio dialog = new Relatorio(this, false);
            ControladorUsuario controller = new ControladorUsuario();
            dialog.exibir("Relatorio de Usuarios", "Todos os Clientes", controller.listarClientesCadastrados());
            dialog.setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
            Relatorio dialog = new Relatorio(this, false);
            ControladorUsuario controller = new ControladorUsuario();
            dialog.exibir("Relatorio de Usuarios", "Todos os Clientes Ouro", controller.listarClientesOuroCadastrados());
            dialog.setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
            Relatorio dialog = new Relatorio(this, false);
            ControladorUsuario controller = new ControladorUsuario();
            dialog.exibir("Relatorio de Cliente", "Historico de Venda", "Desculpe o transtorno, estamos em manutenção");
            dialog.setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
            Relatorio dialog = new Relatorio(this, false);
            ControladorVendas controller = new ControladorVendas();
            dialog.exibir("Relatorio de Vendas", "Todos as Vendas", controller.listarVendasCadastradas());
            dialog.setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
            Relatorio dialog = new Relatorio(this, false);
            ControladorVendas controller = new ControladorVendas();
            dialog.exibir("Relatorio de Vendas", "Todos as Vendas (Dinheiro)", controller.listarVendasDinheiro());
            dialog.setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
            Relatorio dialog = new Relatorio(this, false);
            ControladorVendas controller = new ControladorVendas();
            dialog.exibir("Relatorio de Vendas", "Todos as Vendas (PIX)", controller.listarVendasPix());
            dialog.setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
            Relatorio dialog = new Relatorio(this, false);
            ControladorVendas controller = new ControladorVendas();
            dialog.exibir("Relatorio de Vendas", "Todos as Vendas (Cartão de Crédito)", controller.listarVendasCartao());
            dialog.setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
            RelatorioVendasMes dialog = new RelatorioVendasMes();
            dialog.setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuFabricanteCadastrar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuProdutoCadastrar;
    private javax.swing.JMenuItem jMenuTransportadoraCadastrar;
    private javax.swing.JMenuItem jMenuUsuarioCadastrarC;
    private javax.swing.JMenuItem jMenuUsuarioCadastrarG;
    // End of variables declaration//GEN-END:variables
}
