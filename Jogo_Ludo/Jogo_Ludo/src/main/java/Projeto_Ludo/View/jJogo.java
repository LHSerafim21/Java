package Projeto_Ludo.View;

import Projeto_Ludo.Control.Configuração;
import Projeto_Ludo.Model.Jogo;

public class jJogo extends javax.swing.JFrame {
    
    private int x = 1;
    private int Iniciar;
    private int Player1;
    private int Player2;
    private int R;
    private String ValorDado;
    
    public jJogo() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelTabuleiro = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanelGrandeVermelho = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        jPanel83 = new javax.swing.JPanel();
        jPanel81 = new javax.swing.JPanel();
        Vermelho1 = new javax.swing.JPanel();
        Vermelho2 = new javax.swing.JPanel();
        Vermelho3 = new javax.swing.JPanel();
        Vermelho4 = new javax.swing.JPanel();
        Vermelho5 = new javax.swing.JPanel();
        Vermelho6 = new javax.swing.JPanel();
        Vermelho7 = new javax.swing.JPanel();
        jPanelGrandeVerde = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel84 = new javax.swing.JPanel();
        jPanel85 = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jPanel87 = new javax.swing.JPanel();
        Verde1 = new javax.swing.JPanel();
        Verde2 = new javax.swing.JPanel();
        Verde3 = new javax.swing.JPanel();
        Verde4 = new javax.swing.JPanel();
        Verde5 = new javax.swing.JPanel();
        Verde6 = new javax.swing.JPanel();
        Verde7 = new javax.swing.JPanel();
        jPanelGrandeAzul = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel92 = new javax.swing.JPanel();
        jPanel93 = new javax.swing.JPanel();
        jPanel94 = new javax.swing.JPanel();
        jPanel95 = new javax.swing.JPanel();
        Azul1 = new javax.swing.JPanel();
        Azul2 = new javax.swing.JPanel();
        Azul3 = new javax.swing.JPanel();
        Azul4 = new javax.swing.JPanel();
        Azul5 = new javax.swing.JPanel();
        Azul6 = new javax.swing.JPanel();
        Azul7 = new javax.swing.JPanel();
        jPanelGrandeAmarelo = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel88 = new javax.swing.JPanel();
        jPanel89 = new javax.swing.JPanel();
        jPanel90 = new javax.swing.JPanel();
        jPanel91 = new javax.swing.JPanel();
        Amarelo1 = new javax.swing.JPanel();
        Amarelo2 = new javax.swing.JPanel();
        Amarelo3 = new javax.swing.JPanel();
        Amarelo4 = new javax.swing.JPanel();
        Amarelo5 = new javax.swing.JPanel();
        Amarelo6 = new javax.swing.JPanel();
        Amarelo7 = new javax.swing.JPanel();
        Branco0 = new javax.swing.JPanel();
        Branco1 = new javax.swing.JPanel();
        Branco2 = new javax.swing.JPanel();
        Branco3 = new javax.swing.JPanel();
        Branco4 = new javax.swing.JPanel();
        Branco5 = new javax.swing.JPanel();
        Branco6 = new javax.swing.JPanel();
        Branco7 = new javax.swing.JPanel();
        Branco8 = new javax.swing.JPanel();
        Branco9 = new javax.swing.JPanel();
        Branco10 = new javax.swing.JPanel();
        Branco11 = new javax.swing.JPanel();
        Branco12 = new javax.swing.JPanel();
        Branco13 = new javax.swing.JPanel();
        Branco14 = new javax.swing.JPanel();
        Branco15 = new javax.swing.JPanel();
        Branco16 = new javax.swing.JPanel();
        Branco17 = new javax.swing.JPanel();
        Branco18 = new javax.swing.JPanel();
        Branco19 = new javax.swing.JPanel();
        Branco20 = new javax.swing.JPanel();
        Branco21 = new javax.swing.JPanel();
        Branco22 = new javax.swing.JPanel();
        Branco23 = new javax.swing.JPanel();
        Branco24 = new javax.swing.JPanel();
        Branco25 = new javax.swing.JPanel();
        Branco26 = new javax.swing.JPanel();
        Branco27 = new javax.swing.JPanel();
        Branco28 = new javax.swing.JPanel();
        Branco29 = new javax.swing.JPanel();
        Branco30 = new javax.swing.JPanel();
        Branco31 = new javax.swing.JPanel();
        Branco32 = new javax.swing.JPanel();
        Branco33 = new javax.swing.JPanel();
        Branco34 = new javax.swing.JPanel();
        Branco35 = new javax.swing.JPanel();
        Branco36 = new javax.swing.JPanel();
        Branco37 = new javax.swing.JPanel();
        Branco38 = new javax.swing.JPanel();
        Branco39 = new javax.swing.JPanel();
        Branco40 = new javax.swing.JPanel();
        Branco41 = new javax.swing.JPanel();
        Branco42 = new javax.swing.JPanel();
        Branco43 = new javax.swing.JPanel();
        Branco44 = new javax.swing.JPanel();
        Branco45 = new javax.swing.JPanel();
        Branco46 = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        jPanelLançarDado = new javax.swing.JPanel();
        GirarDado = new javax.swing.JButton();
        jLabel_Imagem = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabelResultadoDado = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelVezPlayer = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaJogada = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelDadoPlayer2 = new javax.swing.JLabel();
        jLabelDadoPlayer1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanelTabuleiro.setBackground(new java.awt.Color(51, 51, 51));
        jPanelTabuleiro.setPreferredSize(new java.awt.Dimension(705, 705));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanelGrandeVermelho.setBackground(new java.awt.Color(255, 0, 0));
        jPanelGrandeVermelho.setPreferredSize(new java.awt.Dimension(282, 282));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel82.setBackground(new java.awt.Color(255, 0, 0));
        jPanel82.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel80.setBackground(new java.awt.Color(255, 0, 0));
        jPanel80.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel83.setBackground(new java.awt.Color(255, 0, 0));
        jPanel83.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel81.setBackground(new java.awt.Color(255, 0, 0));
        jPanel81.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanelGrandeVermelhoLayout = new javax.swing.GroupLayout(jPanelGrandeVermelho);
        jPanelGrandeVermelho.setLayout(jPanelGrandeVermelhoLayout);
        jPanelGrandeVermelhoLayout.setHorizontalGroup(
            jPanelGrandeVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGrandeVermelhoLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanelGrandeVermelhoLayout.setVerticalGroup(
            jPanelGrandeVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGrandeVermelhoLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        Vermelho1.setBackground(new java.awt.Color(255, 0, 0));
        Vermelho1.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Vermelho1Layout = new javax.swing.GroupLayout(Vermelho1);
        Vermelho1.setLayout(Vermelho1Layout);
        Vermelho1Layout.setHorizontalGroup(
            Vermelho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Vermelho1Layout.setVerticalGroup(
            Vermelho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Vermelho2.setBackground(new java.awt.Color(255, 0, 0));
        Vermelho2.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Vermelho2Layout = new javax.swing.GroupLayout(Vermelho2);
        Vermelho2.setLayout(Vermelho2Layout);
        Vermelho2Layout.setHorizontalGroup(
            Vermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Vermelho2Layout.setVerticalGroup(
            Vermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Vermelho3.setBackground(new java.awt.Color(255, 0, 0));
        Vermelho3.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Vermelho3Layout = new javax.swing.GroupLayout(Vermelho3);
        Vermelho3.setLayout(Vermelho3Layout);
        Vermelho3Layout.setHorizontalGroup(
            Vermelho3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Vermelho3Layout.setVerticalGroup(
            Vermelho3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Vermelho4.setBackground(new java.awt.Color(255, 0, 0));
        Vermelho4.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Vermelho4Layout = new javax.swing.GroupLayout(Vermelho4);
        Vermelho4.setLayout(Vermelho4Layout);
        Vermelho4Layout.setHorizontalGroup(
            Vermelho4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Vermelho4Layout.setVerticalGroup(
            Vermelho4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Vermelho5.setBackground(new java.awt.Color(255, 0, 0));
        Vermelho5.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Vermelho5Layout = new javax.swing.GroupLayout(Vermelho5);
        Vermelho5.setLayout(Vermelho5Layout);
        Vermelho5Layout.setHorizontalGroup(
            Vermelho5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Vermelho5Layout.setVerticalGroup(
            Vermelho5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Vermelho6.setBackground(new java.awt.Color(255, 0, 0));
        Vermelho6.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Vermelho6Layout = new javax.swing.GroupLayout(Vermelho6);
        Vermelho6.setLayout(Vermelho6Layout);
        Vermelho6Layout.setHorizontalGroup(
            Vermelho6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Vermelho6Layout.setVerticalGroup(
            Vermelho6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Vermelho7.setBackground(new java.awt.Color(255, 0, 0));
        Vermelho7.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Vermelho7Layout = new javax.swing.GroupLayout(Vermelho7);
        Vermelho7.setLayout(Vermelho7Layout);
        Vermelho7Layout.setHorizontalGroup(
            Vermelho7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Vermelho7Layout.setVerticalGroup(
            Vermelho7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanelGrandeVerde.setBackground(new java.awt.Color(51, 255, 0));
        jPanelGrandeVerde.setPreferredSize(new java.awt.Dimension(282, 282));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel84.setBackground(new java.awt.Color(0, 255, 0));
        jPanel84.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel85.setBackground(new java.awt.Color(51, 255, 0));
        jPanel85.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel86.setBackground(new java.awt.Color(0, 255, 0));
        jPanel86.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel87.setBackground(new java.awt.Color(51, 255, 0));
        jPanel87.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanelGrandeVerdeLayout = new javax.swing.GroupLayout(jPanelGrandeVerde);
        jPanelGrandeVerde.setLayout(jPanelGrandeVerdeLayout);
        jPanelGrandeVerdeLayout.setHorizontalGroup(
            jPanelGrandeVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGrandeVerdeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanelGrandeVerdeLayout.setVerticalGroup(
            jPanelGrandeVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGrandeVerdeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        Verde1.setBackground(new java.awt.Color(0, 255, 0));
        Verde1.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Verde1Layout = new javax.swing.GroupLayout(Verde1);
        Verde1.setLayout(Verde1Layout);
        Verde1Layout.setHorizontalGroup(
            Verde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Verde1Layout.setVerticalGroup(
            Verde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Verde2.setBackground(new java.awt.Color(51, 255, 51));
        Verde2.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Verde2Layout = new javax.swing.GroupLayout(Verde2);
        Verde2.setLayout(Verde2Layout);
        Verde2Layout.setHorizontalGroup(
            Verde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Verde2Layout.setVerticalGroup(
            Verde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Verde3.setBackground(new java.awt.Color(0, 255, 0));
        Verde3.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Verde3Layout = new javax.swing.GroupLayout(Verde3);
        Verde3.setLayout(Verde3Layout);
        Verde3Layout.setHorizontalGroup(
            Verde3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Verde3Layout.setVerticalGroup(
            Verde3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Verde4.setBackground(new java.awt.Color(0, 255, 0));
        Verde4.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Verde4Layout = new javax.swing.GroupLayout(Verde4);
        Verde4.setLayout(Verde4Layout);
        Verde4Layout.setHorizontalGroup(
            Verde4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Verde4Layout.setVerticalGroup(
            Verde4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Verde5.setBackground(new java.awt.Color(0, 255, 0));
        Verde5.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Verde5Layout = new javax.swing.GroupLayout(Verde5);
        Verde5.setLayout(Verde5Layout);
        Verde5Layout.setHorizontalGroup(
            Verde5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Verde5Layout.setVerticalGroup(
            Verde5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Verde6.setBackground(new java.awt.Color(0, 255, 0));
        Verde6.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Verde6Layout = new javax.swing.GroupLayout(Verde6);
        Verde6.setLayout(Verde6Layout);
        Verde6Layout.setHorizontalGroup(
            Verde6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Verde6Layout.setVerticalGroup(
            Verde6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Verde7.setBackground(new java.awt.Color(0, 255, 0));
        Verde7.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Verde7Layout = new javax.swing.GroupLayout(Verde7);
        Verde7.setLayout(Verde7Layout);
        Verde7Layout.setHorizontalGroup(
            Verde7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Verde7Layout.setVerticalGroup(
            Verde7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanelGrandeAzul.setBackground(new java.awt.Color(0, 0, 255));
        jPanelGrandeAzul.setPreferredSize(new java.awt.Dimension(282, 282));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel92.setBackground(new java.awt.Color(0, 0, 255));
        jPanel92.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel93.setBackground(new java.awt.Color(0, 0, 255));
        jPanel93.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout jPanel93Layout = new javax.swing.GroupLayout(jPanel93);
        jPanel93.setLayout(jPanel93Layout);
        jPanel93Layout.setHorizontalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel93Layout.setVerticalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel94.setBackground(new java.awt.Color(0, 0, 255));
        jPanel94.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout jPanel94Layout = new javax.swing.GroupLayout(jPanel94);
        jPanel94.setLayout(jPanel94Layout);
        jPanel94Layout.setHorizontalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel94Layout.setVerticalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel95.setBackground(new java.awt.Color(0, 0, 255));
        jPanel95.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout jPanel95Layout = new javax.swing.GroupLayout(jPanel95);
        jPanel95.setLayout(jPanel95Layout);
        jPanel95Layout.setHorizontalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel95Layout.setVerticalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanelGrandeAzulLayout = new javax.swing.GroupLayout(jPanelGrandeAzul);
        jPanelGrandeAzul.setLayout(jPanelGrandeAzulLayout);
        jPanelGrandeAzulLayout.setHorizontalGroup(
            jPanelGrandeAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGrandeAzulLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanelGrandeAzulLayout.setVerticalGroup(
            jPanelGrandeAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGrandeAzulLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        Azul1.setBackground(new java.awt.Color(0, 0, 255));
        Azul1.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Azul1Layout = new javax.swing.GroupLayout(Azul1);
        Azul1.setLayout(Azul1Layout);
        Azul1Layout.setHorizontalGroup(
            Azul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Azul1Layout.setVerticalGroup(
            Azul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Azul2.setBackground(new java.awt.Color(0, 0, 255));
        Azul2.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Azul2Layout = new javax.swing.GroupLayout(Azul2);
        Azul2.setLayout(Azul2Layout);
        Azul2Layout.setHorizontalGroup(
            Azul2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Azul2Layout.setVerticalGroup(
            Azul2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Azul3.setBackground(new java.awt.Color(0, 0, 255));
        Azul3.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Azul3Layout = new javax.swing.GroupLayout(Azul3);
        Azul3.setLayout(Azul3Layout);
        Azul3Layout.setHorizontalGroup(
            Azul3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Azul3Layout.setVerticalGroup(
            Azul3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Azul4.setBackground(new java.awt.Color(0, 0, 255));
        Azul4.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Azul4Layout = new javax.swing.GroupLayout(Azul4);
        Azul4.setLayout(Azul4Layout);
        Azul4Layout.setHorizontalGroup(
            Azul4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Azul4Layout.setVerticalGroup(
            Azul4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Azul5.setBackground(new java.awt.Color(0, 0, 255));
        Azul5.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Azul5Layout = new javax.swing.GroupLayout(Azul5);
        Azul5.setLayout(Azul5Layout);
        Azul5Layout.setHorizontalGroup(
            Azul5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Azul5Layout.setVerticalGroup(
            Azul5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Azul6.setBackground(new java.awt.Color(0, 0, 255));
        Azul6.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Azul6Layout = new javax.swing.GroupLayout(Azul6);
        Azul6.setLayout(Azul6Layout);
        Azul6Layout.setHorizontalGroup(
            Azul6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Azul6Layout.setVerticalGroup(
            Azul6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Azul7.setBackground(new java.awt.Color(0, 0, 255));
        Azul7.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Azul7Layout = new javax.swing.GroupLayout(Azul7);
        Azul7.setLayout(Azul7Layout);
        Azul7Layout.setHorizontalGroup(
            Azul7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Azul7Layout.setVerticalGroup(
            Azul7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanelGrandeAmarelo.setBackground(new java.awt.Color(255, 255, 0));
        jPanelGrandeAmarelo.setPreferredSize(new java.awt.Dimension(282, 282));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel88.setBackground(new java.awt.Color(255, 255, 0));
        jPanel88.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout jPanel88Layout = new javax.swing.GroupLayout(jPanel88);
        jPanel88.setLayout(jPanel88Layout);
        jPanel88Layout.setHorizontalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel88Layout.setVerticalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel89.setBackground(new java.awt.Color(255, 255, 0));
        jPanel89.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout jPanel89Layout = new javax.swing.GroupLayout(jPanel89);
        jPanel89.setLayout(jPanel89Layout);
        jPanel89Layout.setHorizontalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel89Layout.setVerticalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel90.setBackground(new java.awt.Color(255, 255, 0));
        jPanel90.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout jPanel90Layout = new javax.swing.GroupLayout(jPanel90);
        jPanel90.setLayout(jPanel90Layout);
        jPanel90Layout.setHorizontalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel90Layout.setVerticalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel91.setBackground(new java.awt.Color(255, 255, 0));
        jPanel91.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanelGrandeAmareloLayout = new javax.swing.GroupLayout(jPanelGrandeAmarelo);
        jPanelGrandeAmarelo.setLayout(jPanelGrandeAmareloLayout);
        jPanelGrandeAmareloLayout.setHorizontalGroup(
            jPanelGrandeAmareloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGrandeAmareloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanelGrandeAmareloLayout.setVerticalGroup(
            jPanelGrandeAmareloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGrandeAmareloLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        Amarelo1.setBackground(new java.awt.Color(255, 255, 0));
        Amarelo1.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Amarelo1Layout = new javax.swing.GroupLayout(Amarelo1);
        Amarelo1.setLayout(Amarelo1Layout);
        Amarelo1Layout.setHorizontalGroup(
            Amarelo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Amarelo1Layout.setVerticalGroup(
            Amarelo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Amarelo2.setBackground(new java.awt.Color(255, 255, 0));
        Amarelo2.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Amarelo2Layout = new javax.swing.GroupLayout(Amarelo2);
        Amarelo2.setLayout(Amarelo2Layout);
        Amarelo2Layout.setHorizontalGroup(
            Amarelo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Amarelo2Layout.setVerticalGroup(
            Amarelo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Amarelo3.setBackground(new java.awt.Color(255, 255, 0));
        Amarelo3.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Amarelo3Layout = new javax.swing.GroupLayout(Amarelo3);
        Amarelo3.setLayout(Amarelo3Layout);
        Amarelo3Layout.setHorizontalGroup(
            Amarelo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Amarelo3Layout.setVerticalGroup(
            Amarelo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Amarelo4.setBackground(new java.awt.Color(255, 255, 0));
        Amarelo4.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Amarelo4Layout = new javax.swing.GroupLayout(Amarelo4);
        Amarelo4.setLayout(Amarelo4Layout);
        Amarelo4Layout.setHorizontalGroup(
            Amarelo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Amarelo4Layout.setVerticalGroup(
            Amarelo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Amarelo5.setBackground(new java.awt.Color(255, 255, 0));
        Amarelo5.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Amarelo5Layout = new javax.swing.GroupLayout(Amarelo5);
        Amarelo5.setLayout(Amarelo5Layout);
        Amarelo5Layout.setHorizontalGroup(
            Amarelo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Amarelo5Layout.setVerticalGroup(
            Amarelo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Amarelo6.setBackground(new java.awt.Color(255, 255, 0));
        Amarelo6.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Amarelo6Layout = new javax.swing.GroupLayout(Amarelo6);
        Amarelo6.setLayout(Amarelo6Layout);
        Amarelo6Layout.setHorizontalGroup(
            Amarelo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Amarelo6Layout.setVerticalGroup(
            Amarelo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Amarelo7.setBackground(new java.awt.Color(255, 255, 0));
        Amarelo7.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Amarelo7Layout = new javax.swing.GroupLayout(Amarelo7);
        Amarelo7.setLayout(Amarelo7Layout);
        Amarelo7Layout.setHorizontalGroup(
            Amarelo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Amarelo7Layout.setVerticalGroup(
            Amarelo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco0.setBackground(new java.awt.Color(255, 255, 255));
        Branco0.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco0Layout = new javax.swing.GroupLayout(Branco0);
        Branco0.setLayout(Branco0Layout);
        Branco0Layout.setHorizontalGroup(
            Branco0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco0Layout.setVerticalGroup(
            Branco0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco1.setBackground(new java.awt.Color(255, 255, 255));
        Branco1.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco1Layout = new javax.swing.GroupLayout(Branco1);
        Branco1.setLayout(Branco1Layout);
        Branco1Layout.setHorizontalGroup(
            Branco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco1Layout.setVerticalGroup(
            Branco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco2.setBackground(new java.awt.Color(255, 255, 255));
        Branco2.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco2Layout = new javax.swing.GroupLayout(Branco2);
        Branco2.setLayout(Branco2Layout);
        Branco2Layout.setHorizontalGroup(
            Branco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco2Layout.setVerticalGroup(
            Branco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco3.setBackground(new java.awt.Color(255, 255, 255));
        Branco3.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco3Layout = new javax.swing.GroupLayout(Branco3);
        Branco3.setLayout(Branco3Layout);
        Branco3Layout.setHorizontalGroup(
            Branco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco3Layout.setVerticalGroup(
            Branco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco4.setBackground(new java.awt.Color(255, 255, 255));
        Branco4.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco4Layout = new javax.swing.GroupLayout(Branco4);
        Branco4.setLayout(Branco4Layout);
        Branco4Layout.setHorizontalGroup(
            Branco4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco4Layout.setVerticalGroup(
            Branco4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco5.setBackground(new java.awt.Color(255, 255, 255));
        Branco5.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco5Layout = new javax.swing.GroupLayout(Branco5);
        Branco5.setLayout(Branco5Layout);
        Branco5Layout.setHorizontalGroup(
            Branco5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco5Layout.setVerticalGroup(
            Branco5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco6.setBackground(new java.awt.Color(255, 255, 255));
        Branco6.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco6Layout = new javax.swing.GroupLayout(Branco6);
        Branco6.setLayout(Branco6Layout);
        Branco6Layout.setHorizontalGroup(
            Branco6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco6Layout.setVerticalGroup(
            Branco6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco7.setBackground(new java.awt.Color(255, 255, 255));
        Branco7.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco7Layout = new javax.swing.GroupLayout(Branco7);
        Branco7.setLayout(Branco7Layout);
        Branco7Layout.setHorizontalGroup(
            Branco7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco7Layout.setVerticalGroup(
            Branco7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco8.setBackground(new java.awt.Color(255, 255, 255));
        Branco8.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco8Layout = new javax.swing.GroupLayout(Branco8);
        Branco8.setLayout(Branco8Layout);
        Branco8Layout.setHorizontalGroup(
            Branco8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco8Layout.setVerticalGroup(
            Branco8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco9.setBackground(new java.awt.Color(255, 255, 255));
        Branco9.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco9Layout = new javax.swing.GroupLayout(Branco9);
        Branco9.setLayout(Branco9Layout);
        Branco9Layout.setHorizontalGroup(
            Branco9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco9Layout.setVerticalGroup(
            Branco9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco10.setBackground(new java.awt.Color(255, 255, 255));
        Branco10.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco10Layout = new javax.swing.GroupLayout(Branco10);
        Branco10.setLayout(Branco10Layout);
        Branco10Layout.setHorizontalGroup(
            Branco10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco10Layout.setVerticalGroup(
            Branco10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco11.setBackground(new java.awt.Color(255, 255, 255));
        Branco11.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco11Layout = new javax.swing.GroupLayout(Branco11);
        Branco11.setLayout(Branco11Layout);
        Branco11Layout.setHorizontalGroup(
            Branco11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco11Layout.setVerticalGroup(
            Branco11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco12.setBackground(new java.awt.Color(255, 255, 255));
        Branco12.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco12Layout = new javax.swing.GroupLayout(Branco12);
        Branco12.setLayout(Branco12Layout);
        Branco12Layout.setHorizontalGroup(
            Branco12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco12Layout.setVerticalGroup(
            Branco12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco13.setBackground(new java.awt.Color(255, 255, 255));
        Branco13.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco13Layout = new javax.swing.GroupLayout(Branco13);
        Branco13.setLayout(Branco13Layout);
        Branco13Layout.setHorizontalGroup(
            Branco13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco13Layout.setVerticalGroup(
            Branco13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco14.setBackground(new java.awt.Color(255, 255, 255));
        Branco14.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco14Layout = new javax.swing.GroupLayout(Branco14);
        Branco14.setLayout(Branco14Layout);
        Branco14Layout.setHorizontalGroup(
            Branco14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco14Layout.setVerticalGroup(
            Branco14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco15.setBackground(new java.awt.Color(255, 255, 255));
        Branco15.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco15Layout = new javax.swing.GroupLayout(Branco15);
        Branco15.setLayout(Branco15Layout);
        Branco15Layout.setHorizontalGroup(
            Branco15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco15Layout.setVerticalGroup(
            Branco15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco16.setBackground(new java.awt.Color(255, 255, 255));
        Branco16.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco16Layout = new javax.swing.GroupLayout(Branco16);
        Branco16.setLayout(Branco16Layout);
        Branco16Layout.setHorizontalGroup(
            Branco16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco16Layout.setVerticalGroup(
            Branco16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco17.setBackground(new java.awt.Color(255, 255, 255));
        Branco17.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco17Layout = new javax.swing.GroupLayout(Branco17);
        Branco17.setLayout(Branco17Layout);
        Branco17Layout.setHorizontalGroup(
            Branco17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco17Layout.setVerticalGroup(
            Branco17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco18.setBackground(new java.awt.Color(255, 255, 255));
        Branco18.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco18Layout = new javax.swing.GroupLayout(Branco18);
        Branco18.setLayout(Branco18Layout);
        Branco18Layout.setHorizontalGroup(
            Branco18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco18Layout.setVerticalGroup(
            Branco18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco19.setBackground(new java.awt.Color(255, 255, 255));
        Branco19.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco19Layout = new javax.swing.GroupLayout(Branco19);
        Branco19.setLayout(Branco19Layout);
        Branco19Layout.setHorizontalGroup(
            Branco19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco19Layout.setVerticalGroup(
            Branco19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco20.setBackground(new java.awt.Color(255, 255, 255));
        Branco20.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco20Layout = new javax.swing.GroupLayout(Branco20);
        Branco20.setLayout(Branco20Layout);
        Branco20Layout.setHorizontalGroup(
            Branco20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco20Layout.setVerticalGroup(
            Branco20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco21.setBackground(new java.awt.Color(255, 255, 255));
        Branco21.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco21Layout = new javax.swing.GroupLayout(Branco21);
        Branco21.setLayout(Branco21Layout);
        Branco21Layout.setHorizontalGroup(
            Branco21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco21Layout.setVerticalGroup(
            Branco21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco22.setBackground(new java.awt.Color(255, 255, 255));
        Branco22.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco22Layout = new javax.swing.GroupLayout(Branco22);
        Branco22.setLayout(Branco22Layout);
        Branco22Layout.setHorizontalGroup(
            Branco22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco22Layout.setVerticalGroup(
            Branco22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco23.setBackground(new java.awt.Color(255, 255, 255));
        Branco23.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco23Layout = new javax.swing.GroupLayout(Branco23);
        Branco23.setLayout(Branco23Layout);
        Branco23Layout.setHorizontalGroup(
            Branco23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco23Layout.setVerticalGroup(
            Branco23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco24.setBackground(new java.awt.Color(255, 255, 255));
        Branco24.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco24Layout = new javax.swing.GroupLayout(Branco24);
        Branco24.setLayout(Branco24Layout);
        Branco24Layout.setHorizontalGroup(
            Branco24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco24Layout.setVerticalGroup(
            Branco24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco25.setBackground(new java.awt.Color(255, 255, 255));
        Branco25.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco25Layout = new javax.swing.GroupLayout(Branco25);
        Branco25.setLayout(Branco25Layout);
        Branco25Layout.setHorizontalGroup(
            Branco25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco25Layout.setVerticalGroup(
            Branco25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco26.setBackground(new java.awt.Color(255, 255, 255));
        Branco26.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco26Layout = new javax.swing.GroupLayout(Branco26);
        Branco26.setLayout(Branco26Layout);
        Branco26Layout.setHorizontalGroup(
            Branco26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco26Layout.setVerticalGroup(
            Branco26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco27.setBackground(new java.awt.Color(255, 255, 255));
        Branco27.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco27Layout = new javax.swing.GroupLayout(Branco27);
        Branco27.setLayout(Branco27Layout);
        Branco27Layout.setHorizontalGroup(
            Branco27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco27Layout.setVerticalGroup(
            Branco27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco28.setBackground(new java.awt.Color(255, 255, 255));
        Branco28.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco28Layout = new javax.swing.GroupLayout(Branco28);
        Branco28.setLayout(Branco28Layout);
        Branco28Layout.setHorizontalGroup(
            Branco28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco28Layout.setVerticalGroup(
            Branco28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco29.setBackground(new java.awt.Color(255, 255, 255));
        Branco29.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco29Layout = new javax.swing.GroupLayout(Branco29);
        Branco29.setLayout(Branco29Layout);
        Branco29Layout.setHorizontalGroup(
            Branco29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco29Layout.setVerticalGroup(
            Branco29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco30.setBackground(new java.awt.Color(255, 255, 255));
        Branco30.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco30Layout = new javax.swing.GroupLayout(Branco30);
        Branco30.setLayout(Branco30Layout);
        Branco30Layout.setHorizontalGroup(
            Branco30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco30Layout.setVerticalGroup(
            Branco30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco31.setBackground(new java.awt.Color(255, 255, 255));
        Branco31.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco31Layout = new javax.swing.GroupLayout(Branco31);
        Branco31.setLayout(Branco31Layout);
        Branco31Layout.setHorizontalGroup(
            Branco31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco31Layout.setVerticalGroup(
            Branco31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco32.setBackground(new java.awt.Color(255, 255, 255));
        Branco32.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco32Layout = new javax.swing.GroupLayout(Branco32);
        Branco32.setLayout(Branco32Layout);
        Branco32Layout.setHorizontalGroup(
            Branco32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco32Layout.setVerticalGroup(
            Branco32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco33.setBackground(new java.awt.Color(255, 255, 255));
        Branco33.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco33Layout = new javax.swing.GroupLayout(Branco33);
        Branco33.setLayout(Branco33Layout);
        Branco33Layout.setHorizontalGroup(
            Branco33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco33Layout.setVerticalGroup(
            Branco33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco34.setBackground(new java.awt.Color(255, 255, 255));
        Branco34.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco34Layout = new javax.swing.GroupLayout(Branco34);
        Branco34.setLayout(Branco34Layout);
        Branco34Layout.setHorizontalGroup(
            Branco34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco34Layout.setVerticalGroup(
            Branco34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco35.setBackground(new java.awt.Color(255, 255, 255));
        Branco35.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco35Layout = new javax.swing.GroupLayout(Branco35);
        Branco35.setLayout(Branco35Layout);
        Branco35Layout.setHorizontalGroup(
            Branco35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco35Layout.setVerticalGroup(
            Branco35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco36.setBackground(new java.awt.Color(255, 255, 255));
        Branco36.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco36Layout = new javax.swing.GroupLayout(Branco36);
        Branco36.setLayout(Branco36Layout);
        Branco36Layout.setHorizontalGroup(
            Branco36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco36Layout.setVerticalGroup(
            Branco36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco37.setBackground(new java.awt.Color(255, 255, 255));
        Branco37.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco37Layout = new javax.swing.GroupLayout(Branco37);
        Branco37.setLayout(Branco37Layout);
        Branco37Layout.setHorizontalGroup(
            Branco37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco37Layout.setVerticalGroup(
            Branco37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco38.setBackground(new java.awt.Color(255, 255, 255));
        Branco38.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco38Layout = new javax.swing.GroupLayout(Branco38);
        Branco38.setLayout(Branco38Layout);
        Branco38Layout.setHorizontalGroup(
            Branco38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco38Layout.setVerticalGroup(
            Branco38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco39.setBackground(new java.awt.Color(255, 255, 255));
        Branco39.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco39Layout = new javax.swing.GroupLayout(Branco39);
        Branco39.setLayout(Branco39Layout);
        Branco39Layout.setHorizontalGroup(
            Branco39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco39Layout.setVerticalGroup(
            Branco39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco40.setBackground(new java.awt.Color(255, 255, 255));
        Branco40.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco40Layout = new javax.swing.GroupLayout(Branco40);
        Branco40.setLayout(Branco40Layout);
        Branco40Layout.setHorizontalGroup(
            Branco40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco40Layout.setVerticalGroup(
            Branco40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco41.setBackground(new java.awt.Color(255, 255, 255));
        Branco41.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco41Layout = new javax.swing.GroupLayout(Branco41);
        Branco41.setLayout(Branco41Layout);
        Branco41Layout.setHorizontalGroup(
            Branco41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco41Layout.setVerticalGroup(
            Branco41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco42.setBackground(new java.awt.Color(255, 255, 255));
        Branco42.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco42Layout = new javax.swing.GroupLayout(Branco42);
        Branco42.setLayout(Branco42Layout);
        Branco42Layout.setHorizontalGroup(
            Branco42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco42Layout.setVerticalGroup(
            Branco42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco43.setBackground(new java.awt.Color(255, 255, 255));
        Branco43.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco43Layout = new javax.swing.GroupLayout(Branco43);
        Branco43.setLayout(Branco43Layout);
        Branco43Layout.setHorizontalGroup(
            Branco43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco43Layout.setVerticalGroup(
            Branco43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco44.setBackground(new java.awt.Color(255, 255, 255));
        Branco44.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco44Layout = new javax.swing.GroupLayout(Branco44);
        Branco44.setLayout(Branco44Layout);
        Branco44Layout.setHorizontalGroup(
            Branco44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco44Layout.setVerticalGroup(
            Branco44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco45.setBackground(new java.awt.Color(255, 255, 255));
        Branco45.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco45Layout = new javax.swing.GroupLayout(Branco45);
        Branco45.setLayout(Branco45Layout);
        Branco45Layout.setHorizontalGroup(
            Branco45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco45Layout.setVerticalGroup(
            Branco45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        Branco46.setBackground(new java.awt.Color(255, 255, 255));
        Branco46.setPreferredSize(new java.awt.Dimension(47, 47));

        javax.swing.GroupLayout Branco46Layout = new javax.swing.GroupLayout(Branco46);
        Branco46.setLayout(Branco46Layout);
        Branco46Layout.setHorizontalGroup(
            Branco46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        Branco46Layout.setVerticalGroup(
            Branco46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelTabuleiroLayout = new javax.swing.GroupLayout(jPanelTabuleiro);
        jPanelTabuleiro.setLayout(jPanelTabuleiroLayout);
        jPanelTabuleiroLayout.setHorizontalGroup(
            jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelGrandeVermelho, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelGrandeAzul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                        .addComponent(Branco0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Verde2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Verde1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                        .addComponent(Branco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Branco11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                        .addComponent(Branco7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Verde3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Branco6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                        .addComponent(Branco2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Verde4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Branco5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                        .addComponent(Branco8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Verde5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Branco4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                        .addComponent(Branco9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Verde7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                                .addComponent(Verde6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Branco3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelGrandeVerde, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTabuleiroLayout.createSequentialGroup()
                                .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                        .addComponent(Branco24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Azul5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Branco33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                        .addComponent(Branco25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Azul4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Branco32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                        .addComponent(Branco26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Azul3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Branco31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Azul1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Branco27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                                .addComponent(Azul2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Branco30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                                .addComponent(Branco28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Branco29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(Amarelo7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                        .addComponent(Branco23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Azul7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                                .addComponent(Azul6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Branco34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                        .addComponent(Amarelo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Amarelo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Amarelo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Amarelo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Amarelo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Branco46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                            .addComponent(Branco35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Branco36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Branco37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Branco38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Amarelo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Branco39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanelGrandeAmarelo, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
                                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                        .addComponent(Branco40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Branco41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Branco42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Branco43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Branco44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Branco45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                        .addComponent(Branco17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Branco18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Branco19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Branco20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Branco21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Branco22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Branco10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Branco16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                .addComponent(Vermelho2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Vermelho3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Vermelho4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Vermelho5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Vermelho6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Vermelho7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                .addComponent(Vermelho1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Branco12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Branco13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Branco14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Branco15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanelTabuleiroLayout.setVerticalGroup(
            jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                        .addComponent(jPanelGrandeVermelho, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Branco15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Branco14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Branco13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Branco12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Vermelho1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Branco10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Vermelho2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Vermelho3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Vermelho4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Vermelho5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Vermelho6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Branco16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Branco17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Branco18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Branco19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Branco20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Branco21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Branco22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Branco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Branco11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Verde2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Branco0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Verde1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Branco7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Branco6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(Verde3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Branco2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Verde4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Branco5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Verde5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Branco8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Branco4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Verde6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Branco9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Branco3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jPanelGrandeVerde, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Branco40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Branco41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Branco42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Branco43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Branco44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Branco45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Amarelo6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Amarelo5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Amarelo4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Amarelo3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Amarelo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Branco46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTabuleiroLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Vermelho7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Amarelo7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Branco35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Branco36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Branco37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Branco38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Amarelo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Branco39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                .addComponent(Verde7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Azul7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelGrandeAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Branco23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Azul6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Branco34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Branco24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Branco33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Azul4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                                    .addComponent(Branco32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(Branco31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                                    .addComponent(Branco25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(Branco26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Azul3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addComponent(Azul5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                        .addComponent(Branco30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Branco29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Azul1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Azul2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Branco27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Branco28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanelTabuleiroLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanelGrandeAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelMenu.setBackground(new java.awt.Color(153, 153, 153));

        jPanelLançarDado.setForeground(new java.awt.Color(102, 102, 102));

        GirarDado.setFont(new java.awt.Font("Blue Fonte Sans", 0, 36)); // NOI18N
        GirarDado.setText("Girar Dado");
        GirarDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirarDadoActionPerformed(evt);
            }
        });

        jLabel_Imagem.setIcon(new javax.swing.ImageIcon("C:\\Users\\Henrique\\Desktop\\Faculdade\\#Programação\\Java\\Jogo_Ludo\\Jogo_Ludo\\src\\main\\java\\icon\\Dado.png")); // NOI18N
        jLabel_Imagem.setText("jLabel2");
        jLabel_Imagem.setMaximumSize(new java.awt.Dimension(100, 89));
        jLabel_Imagem.setMinimumSize(new java.awt.Dimension(100, 89));
        jLabel_Imagem.setPreferredSize(new java.awt.Dimension(100, 89));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        jLabelResultadoDado.setBackground(new java.awt.Color(0, 0, 0));
        jLabelResultadoDado.setFont(new java.awt.Font("Blue Fonte Sans", 0, 36)); // NOI18N
        jLabelResultadoDado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelResultadoDado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResultadoDado.setText("?????");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelResultadoDado, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jLabelResultadoDado, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanelLançarDadoLayout = new javax.swing.GroupLayout(jPanelLançarDado);
        jPanelLançarDado.setLayout(jPanelLançarDadoLayout);
        jPanelLançarDadoLayout.setHorizontalGroup(
            jPanelLançarDadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLançarDadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLançarDadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLançarDadoLayout.createSequentialGroup()
                        .addComponent(jLabel_Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GirarDado)))
                .addGap(14, 14, 14))
        );
        jPanelLançarDadoLayout.setVerticalGroup(
            jPanelLançarDadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLançarDadoLayout.createSequentialGroup()
                .addGroup(jPanelLançarDadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLançarDadoLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(GirarDado))
                    .addGroup(jPanelLançarDadoLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel_Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jLabelTitulo.setBackground(new java.awt.Color(255, 0, 0));
        jLabelTitulo.setFont(new java.awt.Font("Blue Fonte Sans", 0, 80)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 0, 0));
        jLabelTitulo.setText("LUDO");

        jLabelVezPlayer.setFont(new java.awt.Font("Blue Fonte Sans", 0, 24)); // NOI18N
        jLabelVezPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVezPlayer.setText("Sua Vez Player 1!!");

        jTextAreaJogada.setColumns(20);
        jTextAreaJogada.setRows(5);
        jTextAreaJogada.setText("Inicio do Jogo:\n\n-Gire os dados, o primeiro que tirar 6 começara\njogando.\n");
        jScrollPane2.setViewportView(jTextAreaJogada);

        jLabel1.setFont(new java.awt.Font("Blue Fonte Sans", 0, 24)); // NOI18N
        jLabel1.setText("Jogada:");

        jLabel2.setFont(new java.awt.Font("Blue Fonte Sans", 0, 24)); // NOI18N
        jLabel2.setText("Dado Player 2:");

        jLabel3.setFont(new java.awt.Font("Blue Fonte Sans", 0, 24)); // NOI18N
        jLabel3.setText("Dado Player 1:");

        jLabelDadoPlayer2.setFont(new java.awt.Font("Blue Fonte Sans", 0, 24)); // NOI18N
        jLabelDadoPlayer2.setText("??");

        jLabelDadoPlayer1.setFont(new java.awt.Font("Blue Fonte Sans", 0, 24)); // NOI18N
        jLabelDadoPlayer1.setText("??");

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelLançarDado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelVezPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDadoPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDadoPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabelVezPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelLançarDado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelDadoPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDadoPlayer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(104, 104, 104)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTabuleiro, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTabuleiro, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GirarDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirarDadoActionPerformed

        R = Configuração.NumDado();
        ValorDado = Integer.toString(R);
        jLabelResultadoDado.setText(ValorDado);
        VerificarAcerto();
    }//GEN-LAST:event_GirarDadoActionPerformed

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
            java.util.logging.Logger.getLogger(jJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jJogo().setVisible(true);
                
            }
        });
    }
    
    public String ContarErrou(){
        x++;
        if(x%2 == 1){
            jLabelVezPlayer.setText("Sua Vez Player 1!!");
            jTextAreaJogada.setText("");jTextAreaJogada.setText("Você errou!! sua vez Player 1");
            jLabelDadoPlayer2.setText("");jLabelDadoPlayer2.setText(ValorDado);
            return "";
        }
        else{
            jLabelVezPlayer.setText("Sua Vez Player 2!!");
            jTextAreaJogada.setText("");jTextAreaJogada.setText("Você errou!! sua vez Player 2");
            jLabelDadoPlayer1.setText("");jLabelDadoPlayer1.setText(ValorDado);
            return "";
        }
    }
    
    public String ContarAcerto(){
        x++;
        
        if(x%2 != 1){
            jLabelVezPlayer.setText("Sua Vez Player 2!!");
            jTextAreaJogada.setText("");jTextAreaJogada.setText("Você Acertou!!\n Espere o Player 2 Jogar para ver se começara\n jogando");
            jLabelDadoPlayer1.setText("");jLabelDadoPlayer1.setText(ValorDado);   
        }
        
        if(x%2 == 1){
            jLabelVezPlayer.setText("Sua Vez Player 1!!");
            jTextAreaJogada.setText("");jTextAreaJogada.setText("Você Acertou e começara jogando!!");
            jLabelDadoPlayer2.setText("");jLabelDadoPlayer2.setText(ValorDado);
        }
        return "";
    }
    
    public void VerificarAcerto(){
        if(R != 6){
            ContarErrou();     
        }
        if(R == 6){
            ContarAcerto();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Amarelo1;
    private javax.swing.JPanel Amarelo2;
    private javax.swing.JPanel Amarelo3;
    private javax.swing.JPanel Amarelo4;
    private javax.swing.JPanel Amarelo5;
    private javax.swing.JPanel Amarelo6;
    private javax.swing.JPanel Amarelo7;
    private javax.swing.JPanel Azul1;
    private javax.swing.JPanel Azul2;
    private javax.swing.JPanel Azul3;
    private javax.swing.JPanel Azul4;
    private javax.swing.JPanel Azul5;
    private javax.swing.JPanel Azul6;
    private javax.swing.JPanel Azul7;
    private javax.swing.JPanel Branco0;
    private javax.swing.JPanel Branco1;
    private javax.swing.JPanel Branco10;
    private javax.swing.JPanel Branco11;
    private javax.swing.JPanel Branco12;
    private javax.swing.JPanel Branco13;
    private javax.swing.JPanel Branco14;
    private javax.swing.JPanel Branco15;
    private javax.swing.JPanel Branco16;
    private javax.swing.JPanel Branco17;
    private javax.swing.JPanel Branco18;
    private javax.swing.JPanel Branco19;
    private javax.swing.JPanel Branco2;
    private javax.swing.JPanel Branco20;
    private javax.swing.JPanel Branco21;
    private javax.swing.JPanel Branco22;
    private javax.swing.JPanel Branco23;
    private javax.swing.JPanel Branco24;
    private javax.swing.JPanel Branco25;
    private javax.swing.JPanel Branco26;
    private javax.swing.JPanel Branco27;
    private javax.swing.JPanel Branco28;
    private javax.swing.JPanel Branco29;
    private javax.swing.JPanel Branco3;
    private javax.swing.JPanel Branco30;
    private javax.swing.JPanel Branco31;
    private javax.swing.JPanel Branco32;
    private javax.swing.JPanel Branco33;
    private javax.swing.JPanel Branco34;
    private javax.swing.JPanel Branco35;
    private javax.swing.JPanel Branco36;
    private javax.swing.JPanel Branco37;
    private javax.swing.JPanel Branco38;
    private javax.swing.JPanel Branco39;
    private javax.swing.JPanel Branco4;
    private javax.swing.JPanel Branco40;
    private javax.swing.JPanel Branco41;
    private javax.swing.JPanel Branco42;
    private javax.swing.JPanel Branco43;
    private javax.swing.JPanel Branco44;
    private javax.swing.JPanel Branco45;
    private javax.swing.JPanel Branco46;
    private javax.swing.JPanel Branco5;
    private javax.swing.JPanel Branco6;
    private javax.swing.JPanel Branco7;
    private javax.swing.JPanel Branco8;
    private javax.swing.JPanel Branco9;
    private javax.swing.JButton GirarDado;
    private javax.swing.JPanel Verde1;
    private javax.swing.JPanel Verde2;
    private javax.swing.JPanel Verde3;
    private javax.swing.JPanel Verde4;
    private javax.swing.JPanel Verde5;
    private javax.swing.JPanel Verde6;
    private javax.swing.JPanel Verde7;
    private javax.swing.JPanel Vermelho1;
    private javax.swing.JPanel Vermelho2;
    private javax.swing.JPanel Vermelho3;
    private javax.swing.JPanel Vermelho4;
    private javax.swing.JPanel Vermelho5;
    private javax.swing.JPanel Vermelho6;
    private javax.swing.JPanel Vermelho7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDadoPlayer1;
    private javax.swing.JLabel jLabelDadoPlayer2;
    private javax.swing.JLabel jLabelResultadoDado;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelVezPlayer;
    private javax.swing.JLabel jLabel_Imagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanelGrandeAmarelo;
    private javax.swing.JPanel jPanelGrandeAzul;
    private javax.swing.JPanel jPanelGrandeVerde;
    private javax.swing.JPanel jPanelGrandeVermelho;
    private javax.swing.JPanel jPanelLançarDado;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelTabuleiro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaJogada;
    // End of variables declaration//GEN-END:variables
}
