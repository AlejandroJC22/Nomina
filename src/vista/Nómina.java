
package vista;

//importamos las librerias necesarias
import Controlador.Deducciones;
import Controlador.Devengado;
import Controlador.Sueldo;
import Modelo.Conexion;
import Modelo.Empleado;
import Modelo.login;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;


/**
 *
 * @author Alejandro José Castilla Cuello
 */
//Creamos la interfaz
public class Nómina extends javax.swing.JFrame {
    private String nombre;
    private String documento;
    private String salario;
    Conexion con1 = new Conexion();
    Connection conet;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    //Creamos una tabla
    DefaultTableModel modelo;

    //Creamos el constructor de la tabla
    public Nómina() {
        initComponents();
        //Asignamos el tamaño de la interfaz
        this.setSize(660, 434);
        //Ejecutamos la aplicacion en el centro de la pantalla
        this.setLocationRelativeTo(null);
        
        consultar();
        
        
        
    }
   
    void consultar(){
        String sql = "select * from empleados";
        
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
            }
            
            //Asignamos el tamaño de cada celda de la tabla
            tabla.getColumnModel().getColumn(0).setMaxWidth(150);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(1).setMaxWidth(100);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(2).setMaxWidth(110);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(110);
            tabla.getColumnModel().getColumn(3).setMaxWidth(130);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(130);
            tabla.getColumnModel().getColumn(4).setMaxWidth(100);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(5).setMaxWidth(100);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(6).setMaxWidth(100);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(100);
            tabla.setModel(modelo);
            
        }catch (Exception e){
            
        }
        
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
        txt_nombre.setText(nombre);
    }
    public void setDocumento(String documento){
        this.documento = documento;
        txt_doc.setText(documento);
    }
    public void setSalario(String salario){
        this.salario = salario;
        txt_salariobase.setText(salario);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_doc = new javax.swing.JTextField();
        txt_salariobase = new javax.swing.JTextField();
        txt_dias = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelLiquidaciones = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        panelIngresar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        panelModificar = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        panelLiquidar = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nómina");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 170, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nombres:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 71, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Documento:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 71, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Salario:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 128, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Días laborados:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 128, -1, -1));

        txt_nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 68, 190, -1));

        txt_doc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_docActionPerformed(evt);
            }
        });
        txt_doc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_docKeyTyped(evt);
            }
        });
        getContentPane().add(txt_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 68, 175, -1));

        txt_salariobase.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_salariobase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salariobaseActionPerformed(evt);
            }
        });
        txt_salariobase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_salariobaseKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_salariobaseKeyTyped(evt);
            }
        });
        getContentPane().add(txt_salariobase, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 125, 190, -1));

        txt_dias.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_diasActionPerformed(evt);
            }
        });
        txt_dias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_diasKeyTyped(evt);
            }
        });
        getContentPane().add(txt_dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 125, 173, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLiquidaciones.setBackground(new java.awt.Color(102, 0, 51));
        panelLiquidaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLiquidacionesMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ver Liquidaciones");
        panelLiquidaciones.add(jLabel8);

        jPanel1.add(panelLiquidaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 120, 30));

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
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(5).setResizable(false);
            tabla.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 597, 155));

        panelIngresar.setBackground(new java.awt.Color(102, 0, 51));
        panelIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelIngresarMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Insertar");
        panelIngresar.add(jLabel9);

        jPanel1.add(panelIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 70, 30));

        panelModificar.setBackground(new java.awt.Color(102, 0, 51));
        panelModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelModificarMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Modificar");
        panelModificar.add(jLabel10);

        jPanel1.add(panelModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 70, 30));

        panelLiquidar.setBackground(new java.awt.Color(102, 0, 51));
        panelLiquidar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLiquidarMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Liquidar");
        panelLiquidar.add(jLabel11);

        jPanel1.add(panelLiquidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 70, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 640, 340));

        jPanel2.setBackground(new java.awt.Color(102, 0, 51));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_docActionPerformed
        
    }//GEN-LAST:event_txt_docActionPerformed

    private void txt_salariobaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salariobaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salariobaseActionPerformed

    private void txt_diasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_diasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_diasActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
                
    }//GEN-LAST:event_tablaMouseClicked

    private void txt_docKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_docKeyTyped
        //Creamos una condicion para que solo se inserten numeros
        //en la casilla Documento
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txt_docKeyTyped

    private void txt_salariobaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_salariobaseKeyTyped
        //Creamos una condicion para que solo se inserten numeros
        //en la casilla Salario
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txt_salariobaseKeyTyped

    private void txt_diasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_diasKeyTyped
        //Creamos una condicion para que solo se inserten numeros
        //en la casilla Dias laborados
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txt_diasKeyTyped

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        //Creamos una condicion para que solo se inserten letras y espacios
        //en la casilla Nombres
        char c = evt.getKeyChar();
        
        if(((c<'a' || c>'z')&&(c<'A') | c>'Z')&&(c<' '||c>' ')){
            evt.consume();
        }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_salariobaseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_salariobaseKeyReleased
        
    }//GEN-LAST:event_txt_salariobaseKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Administrador a = new Administrador();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void panelLiquidacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLiquidacionesMouseClicked
        Liquidacion n = new Liquidacion();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_panelLiquidacionesMouseClicked

    private void panelIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelIngresarMouseClicked
        if (txt_nombre.getText().isEmpty() || txt_doc.getText().isEmpty() || txt_dias.getText().isEmpty() || txt_salariobase.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Favor ingrese todos los datos solicitados");
        }else{
            
            //Definimos las variables del boton enviar para almacenar la ifnormación
            //Al ser cuadros de texto, se transforman a enteros con el metodo Integer.parseInt
            int doc = Integer.parseInt(txt_doc.getText());
            int dias = Integer.parseInt(txt_dias.getText());
            int salariobase = Integer.parseInt(txt_salariobase.getText());
            
            //Creamos un nuevo empleado y mandamos la informacion a la clase Empleado
            Empleado Emp;
            Emp = new Empleado(txt_nombre.getText(), doc,dias, salariobase);

            //Creamos una nueva deduccion y mandamos la informacion a la clase Deducciones
            Deducciones a;
            a = new Deducciones(Empleado.salariobase);

            //Creamos un nuevo devengado y mandamos la informacion a la clase Devengado
            Devengado b;
            b = new Devengado(Devengado.dev);
        
            //Creamos un nuevo sueldo y mandamos la informacion a la clase Sueldo
            Sueldo c;
            c = new Sueldo(Sueldo.sueldo);
            try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_nomina","root","");
            PreparedStatement info = cn.prepareStatement("insert into empleados values (?,?,?,?,?,?,?)");
            
            info.setString(1, txt_nombre.getText());
            info.setString(2, txt_doc.getText());
            info.setString(3, txt_salariobase.getText());
            info.setString(4, txt_dias.getText());
            info.setDouble(5, Devengado.dev);
            info.setDouble(6, Deducciones.deduccion);
            info.setDouble(7, Sueldo.sueldo);
            info.executeUpdate();
            
            }catch(Exception e){
                
            }

            //Creamos una lista de datos string los cuales ingresará el usuario
            String []Datos=new String[4];
            Datos[0]=txt_nombre.getText();
            Datos[1]=txt_doc.getText();
            Datos[2]=txt_salariobase.getText();
            Datos[3]=txt_dias.getText();

            //Creamos un nuevo vector que nos permita asignar los valores a la celda correspondiente 
            // de la tabla
            Vector datos = new Vector();
            


            //Asignamos los valores correspondientes en cada celda de la tabla
            datos.addElement(Datos[0]);
            datos.addElement(Datos[1]);
            datos.addElement(Datos[2]);
            datos.addElement(Datos[3]);
            datos.addElement(Devengado.dev);
            datos.addElement(Deducciones.deduccion);
            datos.addElement(Sueldo.sueldo);
            //Enviamos la informacion a la tabla
            modelo.addRow(datos);

             

            //Limpiamos los registros anteriormente ingresados por el usuario
            txt_nombre.setText("");
            txt_doc.setText("");
            txt_salariobase.setText("");
            txt_dias.setText("");
            
            JOptionPane.showMessageDialog(this, "Ciente agregado satisfactoriamente");
             }
    }//GEN-LAST:event_panelIngresarMouseClicked

    private void panelModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelModificarMouseClicked
            //definimos la variable para modificar la fila seleccionada de la tabla
            int filaSelect = tabla.getSelectedRow();
            
            
            //En caso que no se seleccione una fila, mostrar error
            if (filaSelect==-1){
                JOptionPane.showMessageDialog(null, "Fila no seleccionada, por favor seleccione una fila");
            }else{
                try{
                    String valor = tabla.getValueAt(filaSelect, 1).toString();
                    PreparedStatement eliminar = conet.prepareStatement("Delete from empleados Where Documento = '"+valor+"'");
                    eliminar.executeUpdate();
                }catch(Exception e){
                    
                }
                //Mostramos los valores anteriormente ingresados por el usuario
                //para asignar los nuevos valores en caso que se desee en cada
                //una de las celdas
                txt_nombre.setText(tabla.getValueAt(filaSelect, 0).toString());
                txt_doc.setText(tabla.getValueAt(filaSelect, 1).toString());
                txt_salariobase.setText(tabla.getValueAt(filaSelect, 2).toString());
                txt_dias.setText(tabla.getValueAt(filaSelect, 3).toString());
                
                
                //removemos la fila que se desea modificar
                modelo.removeRow(filaSelect);
                
            }
    }//GEN-LAST:event_panelModificarMouseClicked

    private void panelLiquidarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLiquidarMouseClicked
        //definimos la variable para modificar la fila seleccionada de la tabla
        int filaSelect = tabla.getSelectedRow();
        //En caso que no se seleccione una fila, mostrar error
            if (filaSelect==-1){
                JOptionPane.showMessageDialog(null, "Fila no seleccionada, por favor seleccione una fila");
            }else{
                int pregunta = JOptionPane.showConfirmDialog(null, "¿Esta seguro de liquidar el usuario?");
                if(pregunta == 0){
                try{
                    String valor = tabla.getValueAt(filaSelect, 1).toString();
                    PreparedStatement eliminar = conet.prepareStatement("Delete from empleados Where Documento = '"+valor+"'");
                    eliminar.executeUpdate();
                    Liquidacion l = new Liquidacion();
                    l.setNombre(tabla.getValueAt(filaSelect, 0).toString());
                    l.setDocumento(tabla.getValueAt(filaSelect, 1).toString());
                    l.setSalario(tabla.getValueAt(filaSelect, 2).toString());
                    l.setVisible(true);
                    dispose();
                }catch(Exception e){
                    
                }
                //removemos la fila que se desea modificar
                modelo.removeRow(filaSelect);
                
            }
            }
            
    }//GEN-LAST:event_panelLiquidarMouseClicked

   
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nómina().setVisible(true);
            }
        });
    }
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelIngresar;
    private javax.swing.JPanel panelLiquidaciones;
    private javax.swing.JPanel panelLiquidar;
    private javax.swing.JPanel panelModificar;
    public static javax.swing.JTable tabla;
    public static javax.swing.JTextField txt_dias;
    public static javax.swing.JTextField txt_doc;
    public static javax.swing.JTextField txt_nombre;
    public static javax.swing.JTextField txt_salariobase;
    // End of variables declaration//GEN-END:variables
}
