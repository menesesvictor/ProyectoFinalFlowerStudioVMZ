
package vista;

import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//driver de conexion
import java.sql.ResultSet;//resultado final de datos
import java.sql.ResultSetMetaData;//resultado de metadatos
import java.sql.SQLException;//Tratamiento de Errros de BD SQL
import java.sql.Statement;//Generador de sentencias SQL    DDL,DML,DCL
import java.text.SimpleDateFormat;//Formatear datos
import java.util.Date;//fecha de sistema
import javax.swing.ImageIcon;//Tratamiento de imagenes
import javax.swing.JOptionPane;//ventanas emergentes

    
public class Acceso extends javax.swing.JFrame {
    
      
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    
    public Acceso() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    
    public void conectarBase(){
    try{ 
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/bdflowerstudiovmz","uismeneses","udl123");
            stmt=cn.createStatement();
    }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error de base de datos 1: \n"+ ex);
    }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error de base de datos 2:"+ e);
    }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpRol = new javax.swing.ButtonGroup();
        panGeneral = new javax.swing.JPanel();
        lblImgLogo = new javax.swing.JLabel();
        panCapturarDatos = new javax.swing.JPanel();
        lblUsuarioAcceso = new javax.swing.JLabel();
        lblPasswordAcceso = new javax.swing.JLabel();
        txtPasswordAcceso = new javax.swing.JPasswordField();
        txtUsuarioAcceso = new javax.swing.JTextField();
        panRolUsuario = new javax.swing.JPanel();
        optPersonal = new javax.swing.JRadioButton();
        optCliente = new javax.swing.JRadioButton();
        btnEntrarSistema = new javax.swing.JButton();
        lblBienvenida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panGeneral.setBackground(new java.awt.Color(102, 255, 102));

        lblImgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        panCapturarDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panCapturarDatos.setOpaque(false);

        lblUsuarioAcceso.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblUsuarioAcceso.setForeground(new java.awt.Color(255, 0, 204));
        lblUsuarioAcceso.setText("Usuario:");

        lblPasswordAcceso.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblPasswordAcceso.setForeground(new java.awt.Color(255, 0, 204));
        lblPasswordAcceso.setText("Contraseña:");

        txtPasswordAcceso.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        txtUsuarioAcceso.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        panRolUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecciona tu rol", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14), new java.awt.Color(255, 0, 204))); // NOI18N
        panRolUsuario.setOpaque(false);

        optPersonal.setBackground(new java.awt.Color(255, 255, 255));
        btnGrpRol.add(optPersonal);
        optPersonal.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        optPersonal.setForeground(new java.awt.Color(255, 255, 0));
        optPersonal.setText("Personal");
        optPersonal.setOpaque(false);

        optCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnGrpRol.add(optCliente);
        optCliente.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        optCliente.setForeground(new java.awt.Color(255, 255, 0));
        optCliente.setText("Cliente");
        optCliente.setOpaque(false);

        javax.swing.GroupLayout panRolUsuarioLayout = new javax.swing.GroupLayout(panRolUsuario);
        panRolUsuario.setLayout(panRolUsuarioLayout);
        panRolUsuarioLayout.setHorizontalGroup(
            panRolUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRolUsuarioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(optPersonal)
                .addGap(46, 46, 46)
                .addComponent(optCliente)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panRolUsuarioLayout.setVerticalGroup(
            panRolUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRolUsuarioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panRolUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optPersonal)
                    .addComponent(optCliente))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        btnEntrarSistema.setBackground(new java.awt.Color(255, 255, 0));
        btnEntrarSistema.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnEntrarSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sun-removebg-preview.png"))); // NOI18N
        btnEntrarSistema.setText("Entrar");
        btnEntrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarSistemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panCapturarDatosLayout = new javax.swing.GroupLayout(panCapturarDatos);
        panCapturarDatos.setLayout(panCapturarDatosLayout);
        panCapturarDatosLayout.setHorizontalGroup(
            panCapturarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCapturarDatosLayout.createSequentialGroup()
                .addGroup(panCapturarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panCapturarDatosLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(panCapturarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPasswordAcceso)
                            .addComponent(lblUsuarioAcceso))
                        .addGap(90, 90, 90)
                        .addGroup(panCapturarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPasswordAcceso, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(txtUsuarioAcceso)))
                    .addGroup(panCapturarDatosLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(panRolUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(btnEntrarSistema)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        panCapturarDatosLayout.setVerticalGroup(
            panCapturarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCapturarDatosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panCapturarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuarioAcceso)
                    .addComponent(txtUsuarioAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panCapturarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPasswordAcceso)
                    .addComponent(txtPasswordAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panCapturarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCapturarDatosLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(panRolUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panCapturarDatosLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnEntrarSistema)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        lblBienvenida.setFont(new java.awt.Font("Comic Sans MS", 3, 20)); // NOI18N
        lblBienvenida.setForeground(new java.awt.Color(255, 0, 204));
        lblBienvenida.setText("Bienvenid@, por favor ingresa tu usuario y contraseña:");

        javax.swing.GroupLayout panGeneralLayout = new javax.swing.GroupLayout(panGeneral);
        panGeneral.setLayout(panGeneralLayout);
        panGeneralLayout.setHorizontalGroup(
            panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGeneralLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGeneralLayout.createSequentialGroup()
                        .addComponent(lblBienvenida)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGeneralLayout.createSequentialGroup()
                        .addComponent(panCapturarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
            .addGroup(panGeneralLayout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(lblImgLogo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panGeneralLayout.setVerticalGroup(
            panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImgLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panCapturarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarSistemaActionPerformed
                if (optPersonal.isSelected()) {
              try{
              String usuario = txtUsuarioAcceso.getText();
              String pass = txtPasswordAcceso.getText();
                   boolean error = true;
                      conectarBase();
                   rs = stmt.executeQuery("select * from personal");
        while (rs.next() == true){
            if (usuario.equals(rs.getString("usuariopersonal")) && pass.equals(rs.getString("passwordpersonal"))){
                        error = false;
                Menu accesoSistema = new Menu();
                
            JOptionPane.showMessageDialog(null, "Bienvenido a Sistema\n" + usuario );
                accesoSistema.setVisible(true);
                this.hide();
            }      
        }
        if (error == true){
            JOptionPane.showMessageDialog(null, "Error al ingresar datos.\n Verifique");
            this.txtUsuarioAcceso.setText(null);
            this.txtPasswordAcceso.setText(null);
            this.txtUsuarioAcceso.requestFocus();
        }
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Error de BD Validacion: \n\n"+ ex);
      }   
            
        }else if (optCliente.isSelected()) {
             try{
              String usuario = txtUsuarioAcceso.getText();
              String pass = txtPasswordAcceso.getText();
                   boolean error = true;
                      conectarBase();
                   rs = stmt.executeQuery("select * from clientes");
        while (rs.next() == true){
            if (usuario.equals(rs.getString("usuarioclientes")) && pass.equals(rs.getString("passwordclientes"))){
                        error = false;
                ConsultaClientes accesoSistemaFlores = new ConsultaClientes();
                
            JOptionPane.showMessageDialog(null, "Bienvenido a Sistema\n" + usuario );
                accesoSistemaFlores.setVisible(true);
                this.hide();
            }      
        }
        if (error == true){
            JOptionPane.showMessageDialog(null, "Error al ingresar datos.\n Verifique");
            this.txtUsuarioAcceso.setText(null);
            this.txtPasswordAcceso.setText(null);
            this.txtUsuarioAcceso.requestFocus();
        }
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Error de BD Validacion: \n\n"+ ex);
      }   
        }
    }//GEN-LAST:event_btnEntrarSistemaActionPerformed

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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrarSistema;
    private javax.swing.ButtonGroup btnGrpRol;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblImgLogo;
    private javax.swing.JLabel lblPasswordAcceso;
    private javax.swing.JLabel lblUsuarioAcceso;
    private javax.swing.JRadioButton optCliente;
    private javax.swing.JRadioButton optPersonal;
    private javax.swing.JPanel panCapturarDatos;
    private javax.swing.JPanel panGeneral;
    private javax.swing.JPanel panRolUsuario;
    private javax.swing.JPasswordField txtPasswordAcceso;
    private javax.swing.JTextField txtUsuarioAcceso;
    // End of variables declaration//GEN-END:variables
}
