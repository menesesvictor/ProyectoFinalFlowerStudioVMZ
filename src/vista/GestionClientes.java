
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
import javax.swing.table.DefaultTableModel;//tabla de datos
import modelo.Cliente;


public class GestionClientes extends javax.swing.JFrame {
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    
    Cliente objCliente = new Cliente();

    
    public GestionClientes() {
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

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panConsultaClientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();
        btnConsultar = new javax.swing.JButton();
        panAltaCliente = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblContrase??a = new javax.swing.JLabel();
        txtContrase??a = new javax.swing.JPasswordField();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        panEditarCliente = new javax.swing.JPanel();
        lblEditarId = new javax.swing.JLabel();
        lblEditarNombre = new javax.swing.JLabel();
        lblEditarContrase??a = new javax.swing.JLabel();
        txtIdEditar = new javax.swing.JTextField();
        txtNombreEditar = new javax.swing.JTextField();
        txtContrase??aEditar = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        panBajaCliente = new javax.swing.JPanel();
        lblSubTitulo = new javax.swing.JLabel();
        txtClienteEliminar = new javax.swing.JTextField();
        btnEliminarCliente = new javax.swing.JButton();
        lblImgLogo = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Gesti??n de clientes.");

        jTabbedPane1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        panConsultaClientes.setBackground(new java.awt.Color(255, 0, 0));

        jtConsulta.setBackground(new java.awt.Color(51, 51, 255));
        jtConsulta.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jtConsulta.setForeground(new java.awt.Color(255, 255, 255));
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
        jScrollPane1.setViewportView(jtConsulta);

        btnConsultar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/people-people-icon-blue-11553450975ccznm1rxwu-removebg-preview.png"))); // NOI18N
        btnConsultar.setText("Consultar Clientes ");
        btnConsultar.setOpaque(false);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panConsultaClientesLayout = new javax.swing.GroupLayout(panConsultaClientes);
        panConsultaClientes.setLayout(panConsultaClientesLayout);
        panConsultaClientesLayout.setHorizontalGroup(
            panConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panConsultaClientesLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panConsultaClientesLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(btnConsultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panConsultaClientesLayout.setVerticalGroup(
            panConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panConsultaClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultar)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar Clientes", panConsultaClientes);

        panAltaCliente.setBackground(new java.awt.Color(255, 0, 0));

        lblId.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("ID:");

        lblNombre.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");

        lblContrase??a.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblContrase??a.setForeground(new java.awt.Color(255, 255, 255));
        lblContrase??a.setText("Contrase??a:");

        txtContrase??a.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        txtId.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-icon-png-10-removebg-preview.png"))); // NOI18N
        jButton1.setText("Inscribir Cliente");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAltaClienteLayout = new javax.swing.GroupLayout(panAltaCliente);
        panAltaCliente.setLayout(panAltaClienteLayout);
        panAltaClienteLayout.setHorizontalGroup(
            panAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAltaClienteLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(panAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContrase??a)
                    .addComponent(lblId)
                    .addComponent(lblNombre))
                .addGap(62, 62, 62)
                .addGroup(panAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtContrase??a)
                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtNombre))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAltaClienteLayout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(193, 193, 193))
        );
        panAltaClienteLayout.setVerticalGroup(
            panAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAltaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAltaClienteLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblNombre))
                    .addGroup(panAltaClienteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(panAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContrase??a)
                    .addComponent(txtContrase??a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inscribir Cliente", panAltaCliente);

        panEditarCliente.setBackground(new java.awt.Color(255, 0, 0));

        lblEditarId.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblEditarId.setForeground(new java.awt.Color(255, 255, 255));
        lblEditarId.setText("Buscar ID de Cliente:");

        lblEditarNombre.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblEditarNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblEditarNombre.setText("Cambiar Nombre:");

        lblEditarContrase??a.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblEditarContrase??a.setForeground(new java.awt.Color(255, 255, 255));
        lblEditarContrase??a.setText("Cambiar Contrase??a Actual:");

        txtIdEditar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        txtNombreEditar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        txtContrase??aEditar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        btnBuscarCliente.setBackground(new java.awt.Color(0, 0, 255));
        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-flat-removebg-preview.png"))); // NOI18N
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnEditarCliente.setBackground(new java.awt.Color(0, 0, 204));
        btnEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/images__1_-removebg-preview.png"))); // NOI18N
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panEditarClienteLayout = new javax.swing.GroupLayout(panEditarCliente);
        panEditarCliente.setLayout(panEditarClienteLayout);
        panEditarClienteLayout.setHorizontalGroup(
            panEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEditarClienteLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(panEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEditarContrase??a)
                    .addComponent(lblEditarId)
                    .addComponent(lblEditarNombre))
                .addGap(18, 18, 18)
                .addGroup(panEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(txtNombreEditar)
                    .addComponent(txtContrase??aEditar))
                .addGap(99, 99, 99))
            .addGroup(panEditarClienteLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panEditarClienteLayout.setVerticalGroup(
            panEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEditarClienteLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEditarId)
                    .addComponent(txtIdEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEditarNombre)
                    .addComponent(txtNombreEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEditarContrase??a)
                    .addComponent(txtContrase??aEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarCliente)
                    .addComponent(btnEditarCliente))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Editar Cliente", panEditarCliente);

        panBajaCliente.setBackground(new java.awt.Color(255, 0, 0));

        lblSubTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblSubTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblSubTitulo.setText("Por Favor escribe el ID del cliente que deseas eliminar:");

        txtClienteEliminar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete-icon-png-19-removebg-preview.png"))); // NOI18N
        btnEliminarCliente.setOpaque(false);
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBajaClienteLayout = new javax.swing.GroupLayout(panBajaCliente);
        panBajaCliente.setLayout(panBajaClienteLayout);
        panBajaClienteLayout.setHorizontalGroup(
            panBajaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBajaClienteLayout.createSequentialGroup()
                .addGroup(panBajaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBajaClienteLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblSubTitulo))
                    .addGroup(panBajaClienteLayout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(txtClienteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panBajaClienteLayout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(btnEliminarCliente)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        panBajaClienteLayout.setVerticalGroup(
            panBajaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBajaClienteLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblSubTitulo)
                .addGap(33, 33, 33)
                .addComponent(txtClienteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnEliminarCliente)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar Cliente", panBajaCliente);

        lblImgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/190238-removebg-preview.png"))); // NOI18N
        btnRegresar.setOpaque(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblImgLogo)
                        .addGap(49, 49, 49)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegresar)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImgLogo)
                    .addComponent(lblTitulo))
                .addGap(31, 31, 31)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        conectarBase();
        
        try {
          
           DefaultTableModel modeloDatos = new DefaultTableModel();
                jtConsulta.setModel(modeloDatos);
                
                rs = stmt.executeQuery("SELECT * FROM clientes");
                
                ResultSetMetaData rsmd = rs.getMetaData();
                int cantidadColumnas = rsmd.getColumnCount();
                modeloDatos.addColumn("ID");
                modeloDatos.addColumn("Cliente");
                
                
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        conectarBase();
       
       objCliente.setIdclientes(Integer.parseInt(txtId.getText()));
       objCliente.setUsuarioclientes(txtNombre.getText());
       objCliente.setPasswordclientes(txtContrase??a.getText());
       
       String altaCliente="INSERT INTO CLIENTES (`idclientes`,`usuarioclientes`,`passwordclientes`) VALUES ('"+objCliente.getIdclientes()+"','"+objCliente.getUsuarioclientes()+"','"+objCliente.getPasswordclientes()+"')";
       
        try {
            stmt.executeUpdate(altaCliente);
            JOptionPane.showMessageDialog(null, "Registro exitoso de:\n "+objCliente.getUsuarioclientes());
            this.txtId.setText("");
        this.txtNombre.setText("");
        this.txtContrase??a.setText(null);
        
        this.txtId.requestFocus(); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 3 de BD para Alta :\n\n"+ e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Menu ventanaMenu = new Menu();
        ventanaMenu.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        try {
            conectarBase();
            objCliente.setIdclientes(Integer.parseInt(txtIdEditar.getText()));
            rs=stmt.executeQuery("SELECT * FROM clientes where idclientes = '"+objCliente.getIdclientes()+"'");
            JOptionPane.showMessageDialog(null, "Buscando Cliente, por favor espere...");
            
            if (rs.next()==true) {
                txtNombreEditar.setText(rs.getString("usuarioclientes"));
                txtContrase??aEditar.setText(rs.getString("passwordclientes"));
            } else {
                JOptionPane.showMessageDialog(null, "Error, no existe el ID de este Usuario");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 6 de BD para Baja :\n\n"+ ex);
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        String actualizarCliente="";
        try {
            conectarBase();
            objCliente.setIdclientes(Integer.parseInt(txtIdEditar.getText()));
            objCliente.setUsuarioclientes(txtNombreEditar.getText());
            objCliente.setPasswordclientes(txtContrase??aEditar.getText());
            
            actualizarCliente="UPDATE clientes SET usuarioclientes = '"+objCliente.getUsuarioclientes()+"', passwordclientes = '"+objCliente.getPasswordclientes()+"' where idclientes= '"+objCliente.getIdclientes()+"'";
            stmt.executeUpdate(actualizarCliente);
            JOptionPane.showMessageDialog(null, "Datos del Cliente actualizados\n de forma correcta \n\nVerifica consulta");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD 7 editar \n\n" + ex);
            
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        int confirmaBaja;
        try {
            conectarBase();
            int idClienteBaja=Integer.parseInt(txtClienteEliminar.getText());
            confirmaBaja=stmt.executeUpdate("DELETE FROM clientes where idclientes = '"+idClienteBaja+"'");
            
            if (confirmaBaja==1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja el ID del Usuario\n"+idClienteBaja+"\nVerifica consulta");
            } else {
                JOptionPane.showMessageDialog(null, "Error no existe el ID de este Cliente!!!");
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error 5 de BD para Baja :\n\n"+ ex);
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtConsulta;
    private javax.swing.JLabel lblContrase??a;
    private javax.swing.JLabel lblEditarContrase??a;
    private javax.swing.JLabel lblEditarId;
    private javax.swing.JLabel lblEditarNombre;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblImgLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSubTitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panAltaCliente;
    private javax.swing.JPanel panBajaCliente;
    private javax.swing.JPanel panConsultaClientes;
    private javax.swing.JPanel panEditarCliente;
    private javax.swing.JTextField txtClienteEliminar;
    private javax.swing.JPasswordField txtContrase??a;
    private javax.swing.JTextField txtContrase??aEditar;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdEditar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreEditar;
    // End of variables declaration//GEN-END:variables
}
