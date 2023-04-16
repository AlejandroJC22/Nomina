
package vista;

import Modelo.Conexion;
import Modelo.LoginDAO;
import Modelo.login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Usuarios extends javax.swing.JFrame {
    login lg = new login();
    LoginDAO login = new LoginDAO();
    Conexion con1 = new Conexion();
    Connection conet;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    //Creamos una tabla
    DefaultTableModel modelo;
    
    public Usuarios() {
        initComponents();
        //Asignamos el tamaño de la interfaz
        this.setSize(533, 383);
        this.setLocationRelativeTo(null);
        consultar();
    }
    public void consultar(){
        String sql = "select * from datosingreso";
        try{
            conet = con1.getConnection();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] usuario = new Object [4];
            modelo = (DefaultTableModel) tabla1.getModel();
            while (rs.next()){
                usuario[0]=rs.getString(1);
                usuario[1]=rs.getString(2);
                usuario[2]=rs.getString(3);
                usuario[3]=rs.getString(4);
                
                modelo.addRow(usuario);
                
            }
        
        }catch(Exception e){
            
        }
        
        
        
    }
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoHora = new javax.swing.JComboBox<>();
        btnvolver1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_documento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tipoPrivilegio = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panelAgregar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panelModificar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        panelEliminar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        tipoHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tipoHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora extra diurna ordinaria", "Hora extra nocturna ordinaria", "Recargo por hora nocturna ordinaria", "Hora extra diurna dominical", "Hora extra nocturna dominical", "Recargo dominical o festivo", "Hora dominical" }));

        btnvolver1.setText("Volver");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        txt_documento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_documentoActionPerformed(evt);
            }
        });
        txt_documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_documentoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 140, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Privilegio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        txt_usuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyTyped(evt);
            }
        });
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 130, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Documento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        tipoPrivilegio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tipoPrivilegio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Administrador" }));
        tipoPrivilegio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPrivilegioActionPerformed(evt);
            }
        });
        getContentPane().add(tipoPrivilegio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 130, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Usuario:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        txt_contraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_contraseñaKeyTyped(evt);
            }
        });
        getContentPane().add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 140, -1));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Usuario", "Contraseña", "Privilegio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabla1);
        if (tabla1.getColumnModel().getColumnCount() > 0) {
            tabla1.getColumnModel().getColumn(0).setResizable(false);
            tabla1.getColumnModel().getColumn(1).setResizable(false);
            tabla1.getColumnModel().getColumn(2).setResizable(false);
            tabla1.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 500, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jPanel2.setBackground(new java.awt.Color(102, 0, 51));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAgregar.setBackground(new java.awt.Color(102, 0, 51));
        panelAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelAgregarMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Agregar");
        panelAgregar.add(jLabel7);

        jPanel1.add(panelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 60, 30));

        panelModificar.setBackground(new java.awt.Color(102, 0, 51));
        panelModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelModificarMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Modificar");
        panelModificar.add(jLabel8);

        jPanel1.add(panelModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 70, 30));

        panelEliminar.setBackground(new java.awt.Color(102, 0, 51));
        panelEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEliminarMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Eliminar");
        panelEliminar.add(jLabel9);

        jPanel1.add(panelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 60, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 540, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_documentoActionPerformed
        
    }//GEN-LAST:event_txt_documentoActionPerformed

    private void txt_documentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_documentoKeyTyped
        //Creamos una condicion para que solo se inserten letras y espacios
        //en la casilla Documento
        char c = evt.getKeyChar();

        if(c<'0' || c>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txt_documentoKeyTyped

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void txt_usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyReleased

    }//GEN-LAST:event_txt_usuarioKeyReleased

    private void txt_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyTyped
        //Creamos una condicion para que solo se inserten letras y espacios
        //en la casilla Usuario
        char c = evt.getKeyChar();

        if(((c<'a' || c>'z')&&(c<'A') | c>'Z')&&(c<' '||c>' ')){
            evt.consume();
        }
    }//GEN-LAST:event_txt_usuarioKeyTyped

    private void tipoPrivilegioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPrivilegioActionPerformed
        
    }//GEN-LAST:event_tipoPrivilegioActionPerformed

    private void txt_contraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraseñaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contraseñaKeyTyped

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Administrador a = new Administrador();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void panelAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAgregarMouseClicked
        if (txt_documento.getText().isEmpty() || txt_usuario.getText().isEmpty() || txt_contraseña.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Favor ingrese todos los datos solicitados");
        }else{
        int documento = Integer.parseInt(txt_documento.getText());
        String usuario = txt_usuario.getText();
        String contraseña = String.valueOf(txt_contraseña.getPassword());
        String privilegio = tipoPrivilegio.getSelectedItem().toString();
        if(!"".equals(documento) || !"".equals(usuario) || !"".equals(contraseña)){
            lg.setDocumento(documento);
            lg.setUsuario(usuario);
            lg.setContraseña(contraseña);
            lg.setPrivilegio(privilegio);
            login.Registrar(lg);
            
            //Creamos una lista de datos string los cuales ingresará el usuario
            String []Datos=new String[4];
            Datos[0]=txt_documento.getText();
            Datos[1]=txt_usuario.getText();
            Datos[2]=String.valueOf(txt_contraseña.getPassword());
            Datos[3]=tipoPrivilegio.getSelectedItem().toString();

            //Creamos un nuevo vector que nos permita asignar los valores a la celda correspondiente 
            // de la tabla
            Vector datos = new Vector();
            


            //Asignamos los valores correspondientes en cada celda de la tabla
            datos.addElement(Datos[0]);
            datos.addElement(Datos[1]);
            datos.addElement(Datos[2]);
            datos.addElement(Datos[3]);

            //Enviamos la informacion a la tabla
            modelo.addRow(datos);
            
            //Limpiamos los registros anteriormente ingresados por el usuario
            txt_documento.setText("");
            txt_usuario.setText("");
            txt_contraseña.setText("");
            JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");
            
            }
        }
    }//GEN-LAST:event_panelAgregarMouseClicked

    private void panelModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelModificarMouseClicked
            //definimos la variable para modificar la fila seleccionada de la tabla
            int filaSelect = tabla1.getSelectedRow();
            
            
            //En caso que no se seleccione una fila, mostrar error
            if (filaSelect==-1){
                JOptionPane.showMessageDialog(null, "Fila no seleccionada, por favor seleccione una fila");
            }else{
                try{
                    String valor = tabla1.getValueAt(filaSelect, 0).toString();
                    PreparedStatement eliminar = conet.prepareStatement("Delete from datosingreso Where Documento = '"+valor+"'");
                    eliminar.executeUpdate();
                }catch(Exception e){
                    
                }
                //Mostramos los valores anteriormente ingresados por el usuario
                //para asignar los nuevos valores en caso que se desee en cada
                //una de las celdas
                txt_documento.setText(tabla1.getValueAt(filaSelect, 0).toString());
                txt_usuario.setText(tabla1.getValueAt(filaSelect, 1).toString());
                txt_contraseña.setText(tabla1.getValueAt(filaSelect, 2).toString());
                
                
                //removemos la fila que se desea modificar
                modelo.removeRow(filaSelect);
                
            }
               
    }//GEN-LAST:event_panelModificarMouseClicked

    private void panelEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEliminarMouseClicked
        //definimos la variable para modificar la fila seleccionada de la tabla
            int filaSelect = tabla1.getSelectedRow();
            
            if (filaSelect == -1){
                JOptionPane.showMessageDialog(null, "Fila no seleccionada, por favor seleccione una fila");
            }else{
                int pregunta = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar el usuario?");
                if(pregunta == 0){
                    try{
                    String valor = tabla1.getValueAt(filaSelect, 0).toString();
                    PreparedStatement eliminar = conet.prepareStatement("Delete from datosingreso Where Documento='"+valor+"'");
                    eliminar.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
                    //removemos la fila que se desea eliminar
                    modelo.removeRow(filaSelect);
                    
                }catch(Exception e){
                    
                }
            }
            }
            
    }//GEN-LAST:event_panelEliminarMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnvolver1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelAgregar;
    private javax.swing.JPanel panelEliminar;
    private javax.swing.JPanel panelModificar;
    private javax.swing.JTable tabla1;
    private javax.swing.JComboBox<String> tipoHora;
    private javax.swing.JComboBox<String> tipoPrivilegio;
    private javax.swing.JPasswordField txt_contraseña;
    public static javax.swing.JTextField txt_documento;
    public static javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
