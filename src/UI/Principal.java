package UI;


import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m98am
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    CardLayout card; 
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        card=(CardLayout) panel_pestañas.getLayout();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_pestañas = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.95F);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_pestañas.setBackground(new java.awt.Color(0, 0, 0));
        panel_pestañas.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("¡Todas tus canciones favoritas en un solo lugar!");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("GoPlay mantiene toda tu música en un mismo lugar, lista para que la escuches. ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Escucha un poco de rock, pop mientras trabajas, relájate en tu casa con algo de música indie, crea playlists y se el amo para ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("tu próxima fiesta, organiza tu biblioteca como quieras y disfruta de ellas en cualquier momento y lugar.");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Tan perfecta para acompañar tu estado de ánimo, o para ayudarte a cambiarlo.");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, 20));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Hecha especialmente para ti.");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("GoPlay!");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, 30));

        jLabel27.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Just Play it!");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 580, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.jpg"))); // NOI18N
        jLabel24.setText("jLabel24");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 740, -1));

        panel_pestañas.add(jPanel1, "card2");

        getContentPane().add(panel_pestañas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 1100, 630));

        jPanel6.setBackground(new java.awt.Color(255, 0, 51));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Tu música");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Playlist");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Álbunes");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Artistas");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 430, 50));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText("Nombre de la canción reproduciendo");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 860, -1, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Rewind_26px.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 870, 30, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Play_26px.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 870, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Fast_Forward_26px.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 870, 30, -1));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GoPlay");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Headset_26px.png"))); // NOI18N
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, -10, 30, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Heart_50px_3.png"))); // NOI18N
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Minimize_Window_32px_1.png"))); // NOI18N
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 10, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Close_Window_32px_1.png"))); // NOI18N
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, -1, -1));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 60));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Repeat_32px_1.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 860, -1, 40));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Search_32px_1.png"))); // NOI18N
        jLabel16.setText("jLabel16");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 30, 60));

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setForeground(new java.awt.Color(102, 102, 102));
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);
        jPanel5.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 180, 20));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 80, 250, 40));

        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 860, -1, 40));

        jSlider1.setBackground(new java.awt.Color(0, 0, 0));
        jSlider1.setForeground(new java.awt.Color(0, 0, 0));
        jSlider1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSlider1.setOpaque(false);
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 870, 130, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Artista");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 880, -1, 20));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Shuffle_32px.png"))); // NOI18N
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 860, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blur .jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 850, 1350, 60));

        pnlMenu.setBackground(new java.awt.Color(51, 51, 51));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 0, 51));
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Adjust_32px.png"))); // NOI18N
        jLabel31.setText("Tu música");
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        pnlMenu.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 0, 51));
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Music_32px.png"))); // NOI18N
        jLabel32.setText("Playlist");
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        pnlMenu.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 0, 51));
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Heart_50px_3.png"))); // NOI18N
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        pnlMenu.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("GoPlay");
        pnlMenu.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 80, 30));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Headset_26px.png"))); // NOI18N
        pnlMenu.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 50, 60));

        jLabel38.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Just Play it!");
        pnlMenu.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 80, -1));

        getContentPane().add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 200, 180, 520));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Playlist_32px.png"))); // NOI18N
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 30, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1350, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
        jLabel18.setForeground(Color.black);

    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        jLabel18.setForeground(Color.white);
    }//GEN-LAST:event_jLabel18MouseExited

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
          jLabel17.setForeground(Color.black);
       
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
      
 jLabel17.setForeground(Color.white);
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
       jLabel3.setForeground(Color.black);
    
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
       jLabel3.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        
jLabel12.setForeground(Color.black);

    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
       jLabel12.setForeground(Color.white); 
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
      mostarMusica();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
     mostarPlaylist();
       
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        mostarAlbunes();
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
       mostarArtistas();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
       System.exit(WIDTH);
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
     this.setExtendedState(WIDTH);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
         int posicion = pnlMenu.getX();
        if(posicion > -180){
            Animacion.Animacion.mover_izquierda(0, 0, 0, 0, jLabel30);
            Animacion.Animacion.mover_izquierda(0, -180, 2, 2, pnlMenu);
        }else{
            Animacion.Animacion.mover_derecha(0, 0, 0, 0, jLabel30);
            Animacion.Animacion.mover_derecha(-180, 0, 2, 2, pnlMenu);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
       mostarMusica();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
     mostarPlaylist();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
    jPanel1.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel33MouseClicked
    
    public void mostarMusica()
     {
         MusicaUI musicaUI=new MusicaUI();
         panel_pestañas.add(musicaUI,"Musica");
         card.show(panel_pestañas, "Musica");
         SwingUtilities.updateComponentTreeUI(this);
     }
    public void mostarPlaylist()
     {
         PlaylistUI playlistUI=new PlaylistUI();
         panel_pestañas.add(playlistUI,"Playlist");
         card.show(panel_pestañas,"Playlist");
         SwingUtilities.updateComponentTreeUI(this);
     }
    public void mostarAlbunes()
     {
         AlbunesUI albunesUI=new AlbunesUI();
         panel_pestañas.add(albunesUI,"Albunes");
         card.show(panel_pestañas, "Albunes");
         SwingUtilities.updateComponentTreeUI(this);
     }
    public void mostarArtistas()
     {
         ArtistasUI artistasUI=new ArtistasUI();
         panel_pestañas.add(artistasUI,"Artistas");
         card.show(panel_pestañas, "Artistas");
         SwingUtilities.updateComponentTreeUI(this);
     }
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel panel_pestañas;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}