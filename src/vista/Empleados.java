
package vista;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Empleados extends javax.swing.JFrame {
    private static int usuario;
    
    Conexion con1 = new Conexion();
    Connection conet;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    //Creamos una tabla
    DefaultTableModel modelo;
    
    public Empleados(int usuario) {
        initComponents();
        
        //Asignamos el tamaño de la interfaz
        this.setSize(632, 251);
        //Ejecutamos la aplicacion en el centro de la pantalla
        this.setLocationRelativeTo(null);
        consultar(usuario);  
    }
    
    public boolean consultar(int usuario){
    String sql = "select * from empleados where Documento=" + usuario;
    
    boolean usuarioEncontrado = false; // se inicializa la bandera en falso
        
    try{
        conet = con1.getConnection();
        st = conet.createStatement();
        rs = st.executeQuery(sql);
        Object[] empleado = new Object [7];
        modelo = (DefaultTableModel) tabla.getModel();
        while (rs.next()){
            empleado [0] = rs.getString("Nombre");
            empleado [1] = rs.getInt("Documento");
            empleado [2] = rs.getInt("Salario Base");
            empleado [3] = rs.getInt("Dias laborados");
            empleado [4] = rs.getInt("Devengado");
            empleado [5] = rs.getInt("Deducción");
            empleado [6] = rs.getInt("Sueldo");

            modelo.addRow(empleado);
            usuarioEncontrado = true; // se cambia la bandera a verdadero
        }
        DecimalFormat formatea = new DecimalFormat("###,###.##");

        if (usuarioEncontrado) { // se verifica si se encontró el usuario
            lblEmpleado1.setText("Bienvenido " + empleado[0]);
            lblEstado1.setText("Su sueldo es de " + formatea.format(empleado[6]));
            lblEstado2.setText("A continuación el detalle completo");
            this.setVisible(true);
        } else {
            dispose();
        }

    } catch (Exception e){
    }
    
    return usuarioEncontrado;
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEmpleado1 = new javax.swing.JLabel();
        panelSalir = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblEstado2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        lblEstado1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmpleado1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblEmpleado1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblEmpleado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 410, 30));

        panelSalir.setBackground(new java.awt.Color(102, 0, 51));
        panelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSalirMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cerrar Sesión");
        panelSalir.add(jLabel11);

        jPanel1.add(panelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 740, 56));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEstado2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel2.add(lblEstado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 410, 30));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Documento", "Salario Base", "Dias laborados", "Devengado", "Deducción", "Sueldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 597, 40));

        lblEstado1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel2.add(lblEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 410, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 780, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

    }//GEN-LAST:event_tablaMouseClicked

    private void panelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSalirMouseClicked
        Ingreso i = new Ingreso();
        i.setVisible(true);
        dispose();
    }//GEN-LAST:event_panelSalirMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmpleado1;
    private javax.swing.JLabel lblEstado1;
    private javax.swing.JLabel lblEstado2;
    private javax.swing.JPanel panelSalir;
    public static javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
