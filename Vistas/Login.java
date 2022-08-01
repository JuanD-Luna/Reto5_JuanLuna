package Vistas;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        pngMinTicIcon = new javax.swing.JLabel();
        txtIniSesi = new javax.swing.JLabel();
        txtUsua = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        sepUsua = new javax.swing.JSeparator();
        txtContra = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        sepContra = new javax.swing.JSeparator();
        btnEntrar = new javax.swing.JPanel();
        txtbntEntrar = new javax.swing.JLabel();
        btnRestablecer = new javax.swing.JPanel();
        txtbntrestablecer = new javax.swing.JLabel();
        pngMisTicIcon = new javax.swing.JLabel();
        txtMisTic = new javax.swing.JLabel();
        SideBannerLogin = new javax.swing.JLabel();
        UpperBar = new javax.swing.JPanel();
        CloseWindow = new javax.swing.JPanel();
        extbntxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(200, 200));

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pngMinTicIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/MinTicLogo.png"))); // NOI18N
        pnlLogin.add(pngMinTicIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 180, 38));

        txtIniSesi.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txtIniSesi.setText("INICIAR SESIÓN");
        pnlLogin.add(txtIniSesi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtUsua.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txtUsua.setText("USUARIO");
        pnlLogin.add(txtUsua, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 90, 30));

        txtUserName.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(204, 204, 204));
        txtUserName.setText("Ingrese su nombre de usuario");
        txtUserName.setBorder(null);
        txtUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserNameMousePressed(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        pnlLogin.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 430, 30));

        sepUsua.setForeground(new java.awt.Color(0, 0, 0));
        pnlLogin.add(sepUsua, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 430, 30));

        txtContra.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txtContra.setText("CONTRASEÑA");
        pnlLogin.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        txtPassword.setForeground(new java.awt.Color(204, 204, 204));
        txtPassword.setText("**********");
        txtPassword.setBorder(null);
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPasswordMousePressed(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        pnlLogin.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 430, -1));

        sepContra.setForeground(new java.awt.Color(0, 0, 0));
        pnlLogin.add(sepContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 430, 30));

        btnEntrar.setBackground(new java.awt.Color(191, 2, 131));
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntrarMouseExited(evt);
            }
        });

        txtbntEntrar.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        txtbntEntrar.setForeground(new java.awt.Color(255, 255, 255));
        txtbntEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbntEntrar.setText("ENTRAR");
        txtbntEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnEntrarLayout = new javax.swing.GroupLayout(btnEntrar);
        btnEntrar.setLayout(btnEntrarLayout);
        btnEntrarLayout.setHorizontalGroup(
            btnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbntEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btnEntrarLayout.setVerticalGroup(
            btnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEntrarLayout.createSequentialGroup()
                .addComponent(txtbntEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pnlLogin.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 130, 40));

        btnRestablecer.setBackground(new java.awt.Color(191, 2, 131));

        txtbntrestablecer.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        txtbntrestablecer.setForeground(new java.awt.Color(255, 255, 255));
        txtbntrestablecer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbntrestablecer.setText("RESTABLECER CONTRASEÑA");
        txtbntrestablecer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtbntrestablecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtbntrestablecerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtbntrestablecerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtbntrestablecerMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRestablecerLayout = new javax.swing.GroupLayout(btnRestablecer);
        btnRestablecer.setLayout(btnRestablecerLayout);
        btnRestablecerLayout.setHorizontalGroup(
            btnRestablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbntrestablecer, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        btnRestablecerLayout.setVerticalGroup(
            btnRestablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbntrestablecer, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnlLogin.add(btnRestablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 200, 40));

        pngMisTicIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/MisTICLogo.png"))); // NOI18N
        pngMisTicIcon.setText("jLabel6");
        pnlLogin.add(pngMisTicIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 140, 140));

        txtMisTic.setBackground(new java.awt.Color(255, 255, 255));
        txtMisTic.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        txtMisTic.setForeground(new java.awt.Color(255, 255, 255));
        txtMisTic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMisTic.setText("Mision TIC");
        pnlLogin.add(txtMisTic, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 290, -1));

        SideBannerLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/BannerLogin.jpg"))); // NOI18N
        SideBannerLogin.setToolTipText("");
        pnlLogin.add(SideBannerLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 296, 500));

        UpperBar.setBackground(new java.awt.Color(255, 255, 255));
        UpperBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                UpperBarMouseDragged(evt);
            }
        });
        UpperBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UpperBarMousePressed(evt);
            }
        });

        CloseWindow.setBackground(new java.awt.Color(255, 255, 255));

        extbntxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        extbntxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        extbntxt.setText("X");
        extbntxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        extbntxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                extbntxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                extbntxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                extbntxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout CloseWindowLayout = new javax.swing.GroupLayout(CloseWindow);
        CloseWindow.setLayout(CloseWindowLayout);
        CloseWindowLayout.setHorizontalGroup(
            CloseWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CloseWindowLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(extbntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CloseWindowLayout.setVerticalGroup(
            CloseWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CloseWindowLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(extbntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout UpperBarLayout = new javax.swing.GroupLayout(UpperBar);
        UpperBar.setLayout(UpperBarLayout);
        UpperBarLayout.setHorizontalGroup(
            UpperBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperBarLayout.createSequentialGroup()
                .addComponent(CloseWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 760, Short.MAX_VALUE))
        );
        UpperBarLayout.setVerticalGroup(
            UpperBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpperBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CloseWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlLogin.add(UpperBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void UpperBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpperBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_UpperBarMousePressed

    private void UpperBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpperBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y -  yMouse);
    }//GEN-LAST:event_UpperBarMouseDragged

    private void extbntxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extbntxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_extbntxtMouseClicked

    private void extbntxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extbntxtMouseEntered
        CloseWindow.setBackground(Color.red);
        extbntxt.setForeground(Color.white);
    }//GEN-LAST:event_extbntxtMouseEntered

    private void extbntxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extbntxtMouseExited
        CloseWindow.setBackground(Color.white);
        extbntxt.setForeground(Color.black);
    }//GEN-LAST:event_extbntxtMouseExited

    private void btnEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseEntered
        btnEntrar.setBackground(new Color(253, 2, 171));
    }//GEN-LAST:event_btnEntrarMouseEntered

    private void btnEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseExited
        btnEntrar.setBackground(new Color(191, 2, 131));
    }//GEN-LAST:event_btnEntrarMouseExited

    private void txtUserNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserNameMousePressed
        if (txtUserName.getText().equals("Ingrese su nombre de usuario")) {
            txtUserName.setText("");
            txtUserName.setForeground(Color.black);
        } if (String.valueOf(txtPassword.getPassword()).isEmpty()) {
            txtPassword.setText("**********");
            txtPassword.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUserNameMousePressed

    private void txtPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMousePressed
        if (String.valueOf(txtPassword.getPassword()).equals("**********")) {
            txtPassword.setText("");
            txtPassword.setForeground(Color.black);
        } if (txtUserName.getText().isEmpty()) {
            txtUserName.setText("Ingrese su nombre de usuario");
            txtUserName.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtPasswordMousePressed

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
        
        String userName = txtUserName.getText();
        String password = txtPassword.getText();

        if(userName.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Hay campos sin diligenciar", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            if(userName.equals("MisionTIC") && password.equals("ciclo2")) {
                JOptionPane.showMessageDialog(null, "Bienvenido al sitema Mision Tic 2022");
                UserMenu usermenu = new UserMenu();
                usermenu.setVisible(rootPaneCheckingEnabled);
                this.dispose();
            } else { JOptionPane.showMessageDialog(null, "Error al iniciar sesion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEntrarMouseClicked

    private void txtbntrestablecerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbntrestablecerMouseClicked
        ResetPassword restPassword = new ResetPassword(this, rootPaneCheckingEnabled);
        restPassword.setVisible(true);
    }//GEN-LAST:event_txtbntrestablecerMouseClicked

    private void txtbntrestablecerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbntrestablecerMouseEntered
        btnRestablecer.setBackground(new Color(253, 2, 171));
    }//GEN-LAST:event_txtbntrestablecerMouseEntered

    private void txtbntrestablecerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbntrestablecerMouseExited
         btnRestablecer.setBackground(new Color(191, 2, 131));
    }//GEN-LAST:event_txtbntrestablecerMouseExited
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CloseWindow;
    private javax.swing.JLabel SideBannerLogin;
    private javax.swing.JPanel UpperBar;
    private javax.swing.JPanel btnEntrar;
    private javax.swing.JPanel btnRestablecer;
    private javax.swing.JLabel extbntxt;
    private javax.swing.JLabel pngMinTicIcon;
    private javax.swing.JLabel pngMisTicIcon;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JSeparator sepContra;
    private javax.swing.JSeparator sepUsua;
    private javax.swing.JLabel txtContra;
    private javax.swing.JLabel txtIniSesi;
    private javax.swing.JLabel txtMisTic;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JLabel txtUsua;
    private javax.swing.JLabel txtbntEntrar;
    private javax.swing.JLabel txtbntrestablecer;
    // End of variables declaration//GEN-END:variables
}