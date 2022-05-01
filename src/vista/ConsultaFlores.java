
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
import javax.swing.table.DefaultTableModel;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.view.JasperViewer;


public class ConsultaFlores extends javax.swing.JFrame {
    
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;

    
    public ConsultaFlores() {
        initComponents();
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panGeneral = new javax.swing.JPanel();
        lblImgDecor1 = new javax.swing.JLabel();
        lblImgDecor2 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();
        btnConsultar = new javax.swing.JButton();
        btnReporteFlor = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panGeneral.setBackground(new java.awt.Color(204, 153, 255));

        lblImgDecor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crown-rosecrown-flowercrown-cute-aesthetic-tumblr-trans-hybrid-tea-rose-11562891526vjigzjtxpw-removebg-preview.png"))); // NOI18N

        lblImgDecor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/png-transparent-death-internet-meme-wake-aesthetic-petals-miscellaneous-flower-meme-thumbnail-removebg-preview.png"))); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        lblTitulo.setText("Consulta Inventario de Flores");

        jtConsulta.setBackground(new java.awt.Color(204, 255, 204));
        jtConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtConsulta.setOpaque(false);
        jScrollPane1.setViewportView(jtConsulta);

        btnConsultar.setBackground(new java.awt.Color(153, 255, 153));
        btnConsultar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar Flores");
        btnConsultar.setOpaque(false);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnReporteFlor.setBackground(new java.awt.Color(153, 255, 153));
        btnReporteFlor.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnReporteFlor.setText("Generar PDF de Inventario");
        btnReporteFlor.setOpaque(false);
        btnReporteFlor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteFlorActionPerformed(evt);
            }
        });

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/190238-removebg-preview.png"))); // NOI18N
        btnRegresar.setOpaque(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panGeneralLayout = new javax.swing.GroupLayout(panGeneral);
        panGeneral.setLayout(panGeneralLayout);
        panGeneralLayout.setHorizontalGroup(
            panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGeneralLayout.createSequentialGroup()
                .addComponent(lblImgDecor1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar))
                .addGroup(panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panGeneralLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImgDecor2))
                    .addGroup(panGeneralLayout.createSequentialGroup()
                        .addGroup(panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panGeneralLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btnConsultar))
                            .addGroup(panGeneralLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReporteFlor)))
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        panGeneralLayout.setVerticalGroup(
            panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGeneralLayout.createSequentialGroup()
                .addGroup(panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGeneralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo)
                        .addGap(49, 49, 49))
                    .addGroup(panGeneralLayout.createSequentialGroup()
                        .addComponent(lblImgDecor1)
                        .addGap(29, 29, 29)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnRegresar)
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(panGeneralLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(btnConsultar)
                .addGap(34, 34, 34)
                .addComponent(btnReporteFlor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImgDecor2))
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

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
                conectarBase();
        
        try {
           
            DefaultTableModel modeloDatos = new DefaultTableModel();
                jtConsulta.setModel(modeloDatos);
                
                rs = stmt.executeQuery("SELECT * FROM flor");
                
                ResultSetMetaData rsmd = rs.getMetaData();
                int cantidadColumnas = rsmd.getColumnCount();
                modeloDatos.addColumn("ID");
                modeloDatos.addColumn("Nombre Flor");
                modeloDatos.addColumn("En Existencia");
                modeloDatos.addColumn("Precio");
                
               
                while (rs.next()) {                
                    Object fila [] = new Object[cantidadColumnas];
                    for (int i = 0; i < cantidadColumnas; i++) {
                        fila[i]=rs.getObject(i+1);
                    }
                    modeloDatos.addRow(fila);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 4 de BD para Consulta :\n\n"+ ex);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Menu ventanaMenu = new Menu();
        ventanaMenu.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnReporteFlorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteFlorActionPerformed
        conectarBase();
        try {
            String rutaReporte="src/reportes/rptFlor.jasper";
            JasperPrint rptFloresPDF = JasperFillManager.fillReport(rutaReporte,null,cn);
            JasperViewer ventanaVisor = new JasperViewer(rptFloresPDF,false);
            ventanaVisor.setTitle("Reporte de Inventario de Flores");
            ventanaVisor.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD en informe Verifica\n\n"+e);
        }
    }//GEN-LAST:event_btnReporteFlorActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaFlores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaFlores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaFlores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaFlores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaFlores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnReporteFlor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtConsulta;
    private javax.swing.JLabel lblImgDecor1;
    private javax.swing.JLabel lblImgDecor2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panGeneral;
    // End of variables declaration//GEN-END:variables
}