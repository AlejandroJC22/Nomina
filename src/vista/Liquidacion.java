
package vista;

//importamos las librerias necesarias
import Controlador.Liquidar;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandro José Castilla Cuello
 */
//Creamos la interfaz
public class Liquidacion extends javax.swing.JFrame {
    private String nombre;
    private String documento;
    private String salario;
    Conexion con1 = new Conexion();
    Connection conet;
    Statement st;
    ResultSet rs;
    //Creamos una tabla
    public static DefaultTableModel modelo;
    
    
    
    public Liquidacion() {
        
        initComponents();
        //Asignamos el tamaño de la interfaz
        this.setSize(722, 350);
        this.setLocationRelativeTo(null);
        consultar();
    }
       public void consultar(){
        String sql = "select * from liquidación";
        try{
            conet = con1.getConnection();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] liquidado = new Object [6];
            modelo = (DefaultTableModel) tabla.getModel();
            while (rs.next()){
                
                liquidado [0] = rs.getString("Nombre");
                liquidado [1] = rs.getInt("Documento");
                liquidado [2] = rs.getInt("Salario base");
                liquidado [3] = rs.getInt("Comisión");
                liquidado [4] = rs.getInt("Horas extra");
                liquidado [5] = rs.getInt("Liquidación");
                
                
                modelo.addRow(liquidado);
            }
        }catch(Exception e){
            
        }
        
        
        
    }
       public void setDocumento(String documento){
            this.documento = documento;
        }
       public void setNombre(String nombre){
            this.nombre = nombre;
        }
       public void setSalario(String salario){
           this.salario = salario;
           txt_salario.setText(salario);
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
        txt_salario = new javax.swing.JTextField();
        txt_comision = new javax.swing.JTextField();
        txt_horaextra = new javax.swing.JTextField();
        tipoHora = new javax.swing.JComboBox<>();
        label_status = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelLiquidar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        panelNominar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        panelModificar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

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
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Liquidación empleados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 300, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Salario base:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 71, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Comision:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 71, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Horas extra:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 128, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Tipo hora extra:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 128, -1, -1));

        txt_salario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salarioActionPerformed(evt);
            }
        });
        txt_salario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_salarioKeyTyped(evt);
            }
        });
        getContentPane().add(txt_salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 68, 190, -1));

        txt_comision.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_comision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_comisionActionPerformed(evt);
            }
        });
        txt_comision.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_comisionKeyTyped(evt);
            }
        });
        getContentPane().add(txt_comision, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 68, 175, -1));

        txt_horaextra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_horaextra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_horaextraActionPerformed(evt);
            }
        });
        txt_horaextra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_horaextraKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_horaextraKeyTyped(evt);
            }
        });
        getContentPane().add(txt_horaextra, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 125, 101, -1));

        tipoHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tipoHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora extra diurna ordinaria", "Hora extra nocturna ordinaria", "Recargo por hora nocturna ordinaria", "Hora extra diurna dominical", "Hora extra nocturna dominical", "Recargo dominical o festivo", "Hora dominical" }));
        tipoHora.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(tipoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 125, 310, -1));

        label_status.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 336, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 40));

        jPanel2.setBackground(new java.awt.Color(102, 0, 51));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 60));

        panelLiquidar.setBackground(new java.awt.Color(102, 0, 51));
        panelLiquidar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLiquidarMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Liquidar");
        panelLiquidar.add(jLabel7);

        getContentPane().add(panelLiquidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 70, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Documento", "Salario base", "Comisión", "Horas extra", "Liquidación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 670, 80));

        panelNominar.setBackground(new java.awt.Color(102, 0, 51));
        panelNominar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNominarMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nóminar");
        panelNominar.add(jLabel9);

        jPanel1.add(panelNominar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 70, 30));

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

        jPanel1.add(panelModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 70, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 750, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void txt_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salarioActionPerformed

    private void txt_comisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_comisionActionPerformed
        
    }//GEN-LAST:event_txt_comisionActionPerformed

    private void txt_horaextraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_horaextraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_horaextraActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        
    }//GEN-LAST:event_tablaMouseClicked

    private void txt_comisionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_comisionKeyTyped
        //Creamos una condicion para que solo se inserten numeros
        //en la casilla Salario base
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txt_comisionKeyTyped

    private void txt_horaextraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_horaextraKeyTyped
        //Creamos una condicion para que solo se inserten numeros
        //en la casilla comision
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txt_horaextraKeyTyped

    private void txt_salarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_salarioKeyTyped
        //Creamos una condicion para que solo se inserten numeros
        //en la casilla  Hora extra
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txt_salarioKeyTyped

    private void txt_horaextraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_horaextraKeyReleased
        
    }//GEN-LAST:event_txt_horaextraKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Nómina n = new Nómina();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void panelLiquidarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLiquidarMouseClicked
        if (txt_salario.getText().isEmpty() || txt_comision.getText().isEmpty() || txt_horaextra.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Favor ingrese todos los datos solicitados");
        }else{
            
        //Definimos las variables del boton enviar para almacenar la información
        //Al ser cuadros de texto, se transforman a enteros con el metodo Integer.parseInt
        int salariobase = Integer.parseInt(txt_salario.getText());
        int comision = Integer.parseInt(txt_comision.getText());
        int hora_extra = Integer.parseInt(txt_horaextra.getText());
        int tipo = tipoHora.getSelectedIndex();
        int valor = 0;
        switch (tipo) {
            case 0:
            valor = 6041;
            break;
            case 1:
            valor = 8458;
            break;
            case 2:
            valor = 1692;
            break;
            case 3:
            valor = 9666;
            break;
            case 4:
            valor = 12083;
            break;
            case 5:
            valor = 3625;
            break;
            case 6:
            valor = 8458;
            break;
        }
        
        Liquidar liq;
        liq = new Liquidar(salariobase,comision,hora_extra, valor);
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_nomina","root","");
            PreparedStatement info = cn.prepareStatement("insert into liquidación values (?,?,?,?,?,?)");
            
            info.setString(1, nombre);
            info.setString(2, documento);
            info.setString(3, txt_salario.getText());
            info.setString(4, txt_comision.getText());
            info.setString(5, txt_horaextra.getText());
            info.setInt(6, Liquidar.enteroLiquidado);
            
            info.executeUpdate();
            
            }catch(Exception e){
                
            }

            //Creamos una lista de datos string los cuales ingresará el usuario
            String []Datos=new String[3];
            Datos[0]=txt_salario.getText();
            Datos[1]=txt_comision.getText();
            Datos[2]=txt_horaextra.getText();
            

            //Creamos un nuevo vector que nos permita asignar los valores a la celda correspondiente 
            // de la tabla
            Vector datos = new Vector();
            


            //Asignamos los valores correspondientes en cada celda de la tabla
            datos.addElement(nombre);
            datos.addElement(documento);
            datos.addElement(Datos[0]);
            datos.addElement(Datos[1]);
            datos.addElement(Datos[2]);
            datos.addElement(Liquidar.enteroLiquidado);
            
            //Enviamos la informacion a la tabla
            modelo.addRow(datos);

             

            //Limpiamos los registros anteriormente ingresados por el usuario
            txt_salario.setText("");
            txt_comision.setText("");
            txt_horaextra.setText("");
            
            
            JOptionPane.showMessageDialog(null, "Ciente liquidado satisfactoriamente");
             }
    }//GEN-LAST:event_panelLiquidarMouseClicked

    private void panelModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelModificarMouseClicked
            //definimos la variable para modificar la fila seleccionada de la tabla
            int filaSelect = tabla.getSelectedRow();
            
            
            //En caso que no se seleccione una fila, mostrar error
            if (filaSelect==-1){
                JOptionPane.showMessageDialog(null, "Fila no seleccionada, por favor seleccione una fila");
            }else{
                try{
                    String valor = tabla.getValueAt(filaSelect, 1).toString();
                    PreparedStatement eliminar = conet.prepareStatement("Delete from liquidación Where Documento ='"+valor+"'");
                    eliminar.executeUpdate();
                }catch(Exception e){
                    
                }
                //Mostramos los valores anteriormente ingresados por el usuario
                //para asignar los nuevos valores en caso que se desee en cada
                //una de las celdas
                txt_salario.setText(tabla.getValueAt(filaSelect, 2).toString());
                txt_comision.setText(tabla.getValueAt(filaSelect, 3).toString());
                txt_horaextra.setText(tabla.getValueAt(filaSelect, 4).toString());
                
                
                
                //removemos la fila que se desea modificar
                modelo.removeRow(filaSelect);
                
            }
            
    }//GEN-LAST:event_panelModificarMouseClicked

    private void panelNominarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNominarMouseClicked
        //definimos la variable para modificar la fila seleccionada de la tabla
            int filaSelect = tabla.getSelectedRow();
            
            
            //En caso que no se seleccione una fila, mostrar error
            if (filaSelect==-1){
                JOptionPane.showMessageDialog(null, "Fila no seleccionada, por favor seleccione una fila");
            }else{
                int pregunta = JOptionPane.showConfirmDialog(null, "¿Esta seguro de nóminar el usuario?");
                if(pregunta == 0){
                try{
                    String valor = tabla.getValueAt(filaSelect, 1).toString();
                    PreparedStatement eliminar = conet.prepareStatement("Delete from liquidación Where Documento ='"+valor+"'");
                    eliminar.executeUpdate();
                    Nómina n = new Nómina();
                    n.setNombre(tabla.getValueAt(filaSelect, 0).toString());
                    n.setDocumento(tabla.getValueAt(filaSelect, 1).toString());
                    n.setSalario(tabla.getValueAt(filaSelect, 2).toString());
                    n.setVisible(true);
                    dispose();
                }catch(Exception e){
                    
                }
            }
            }
    }//GEN-LAST:event_panelNominarMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void  run() {
               new Liquidacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_status;
    private javax.swing.JPanel panelLiquidar;
    private javax.swing.JPanel panelModificar;
    private javax.swing.JPanel panelNominar;
    public static javax.swing.JTable tabla;
    private javax.swing.JComboBox<String> tipoHora;
    public static javax.swing.JTextField txt_comision;
    public static javax.swing.JTextField txt_horaextra;
    public static javax.swing.JTextField txt_salario;
    // End of variables declaration//GEN-END:variables
}
