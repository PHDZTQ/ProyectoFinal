/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaDeVideo;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author HernandezTique
 */
public class VideoMainJFrame extends javax.swing.JFrame {
    public static DefaultTableModel modelo;
    static public int idx_s;
    static public int idx_p;
    //public String buscarS;
    //public String buscarP;
    IngresarJFrame ingresar=new IngresarJFrame();
    public VideoMainJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnIngresar.setEnabled(false);
        //btnImprimir.setEnabled(false);
        btnRentar.setEnabled(false);
        btnDevolver.setEnabled(false);
    }
    /*public void cargarInterfazP(){
        String datos[][]={};
        String columna[]={"Codigo", "Lanzamiento", "Nombre", "Categoria", "Formato", "Duracion", "Secuelas"};
        modelo=new DefaultTableModel(datos,columna);
    }
    public void cargarDatosP(){
        Peliculas p;
        for (int i = 0; i < IngresarJFrame.Peliculas.size(); i++) {
            p=(Peliculas)IngresarJFrame.Peliculas.get(i);
            modelo.insertRow(contador,new Object[]{});
            modelo.setValueAt(p.generadorCodigo(),contador,0);
            modelo.setValueAt(p.lanzamiento,contador,1);
            modelo.setValueAt(p.nombre,contador,2);
            modelo.setValueAt(p.categoria,contador,3);
            modelo.setValueAt(p.formato,contador,4);
            modelo.setValueAt(p.duracion,contador,5);
            modelo.setValueAt(p.secuelas,contador,6);
        }
    }
    public void cargarInterfazS(){
        String datos[][]={};
        String columna[]={"Codigo", "Lanzamiento", "Nombre", "Categoria", "Formato", "Duracion", "Temporadas"};
        modelo=new DefaultTableModel(datos,columna);
    }
     public void cargarDatosS(){
        Series s;
        for (int i=0;i<IngresarJFrame.Series.size();i++) {
            s=(Series)IngresarJFrame.Series.get(i);
            modelo.insertRow(contador,new Object[]{});
            modelo.setValueAt(s.generadorCodigo(),contador,0);
            modelo.setValueAt(s.lanzamiento,contador,1);
            modelo.setValueAt(s.nombre,contador,2);
            modelo.setValueAt(s.categoria,contador,3);
            modelo.setValueAt(s.formato,contador,4);
            modelo.setValueAt(s.duracion,contador,5);
            modelo.setValueAt(s.temporadas,contador,6);
        }
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnIngresar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        btnRentar = new javax.swing.JButton();
        btnDevolver = new javax.swing.JButton();
        rdbtnCliente = new javax.swing.JRadioButton();
        rdbtnEmpleado = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIngresar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 11)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnImprimir.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 11)); // NOI18N
        btnImprimir.setText("Imprimir Lista");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 11)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Selecciona el tipo de usuario");

        lblMensaje.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 0, 0));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("¡Bienvenido!");

        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Selecciona la opcion que deseas realizar");

        btnRentar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 11)); // NOI18N
        btnRentar.setText("Rentar");
        btnRentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentarActionPerformed(evt);
            }
        });

        btnDevolver.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 11)); // NOI18N
        btnDevolver.setText("Devolver");
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbtnCliente);
        rdbtnCliente.setText("Cliente");
        rdbtnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnClienteActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbtnEmpleado);
        rdbtnEmpleado.setText("Empleado");
        rdbtnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnEmpleadoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        lblTitulo.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("TIENDA DE VIDEO");
        lblTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(rdbtnCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbtnEmpleado)
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIngresar)
                        .addGap(18, 18, 18)
                        .addComponent(btnImprimir)
                        .addGap(18, 18, 18)
                        .addComponent(btnRentar)
                        .addGap(18, 18, 18)
                        .addComponent(btnDevolver)
                        .addGap(0, 93, Short.MAX_VALUE))
                    .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir))
                    .addComponent(lblMensaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensaje)
                .addGap(30, 30, 30)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnEmpleado)
                    .addComponent(rdbtnCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(lblMenu)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnImprimir)
                    .addComponent(btnRentar)
                    .addComponent(btnDevolver))
                .addGap(60, 60, 60)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        ImprimirJFrame a=new ImprimirJFrame();
        a.setVisible(true);
        
        //this.setVisible(false);
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        IngresarJFrame b=new IngresarJFrame();
        b.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentarActionPerformed
        RentarJFrame r=new RentarJFrame();
        r.setVisible(true);
    }//GEN-LAST:event_btnRentarActionPerformed

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        String codigo=JOptionPane.showInputDialog(null,"Ingrese el codigo",JOptionPane.QUESTION_MESSAGE);
        ingresar.BuscarCodigo(codigo);
        boolean e=false;
        Series s;
        Peliculas p;
        for (int i=0;i<IngresarJFrame.Series.size();i++) {
            s=(Series)IngresarJFrame.Series.get(i);
            if(s.codigo.equalsIgnoreCase(codigo)&&s.getEstado().equalsIgnoreCase("Rentado")){
                s.setEstado("Disponible");
                JOptionPane.showMessageDialog(null,"Opcion realizada satisfactoriamente","MENSAJE",JOptionPane.INFORMATION_MESSAGE);
                e=true;
            }
        }
        if(e!=true){
            for (int i=0;i<IngresarJFrame.Peliculas.size();i++) {
                p=(Peliculas)IngresarJFrame.Peliculas.get(i);
                if(p.codigo.equalsIgnoreCase(codigo)&&p.getEstado().equalsIgnoreCase("Rentado")){
                    p.setEstado("Disponible");
                    JOptionPane.showMessageDialog(null,"Opcion realizada satisfactoriamente","MENSAJE",JOptionPane.INFORMATION_MESSAGE);
                    e=true;
                }
            }
        }
        if(e==false){
            JOptionPane.showMessageDialog(null,"Codigo no encontrado","MENSAJE",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDevolverActionPerformed

    private void rdbtnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnClienteActionPerformed
        btnIngresar.setEnabled(false);
        btnRentar.setEnabled(true);
        btnDevolver.setEnabled(true);
    }//GEN-LAST:event_rdbtnClienteActionPerformed

    private void rdbtnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnEmpleadoActionPerformed
        btnIngresar.setEnabled(true);
        btnRentar.setEnabled(false);
        btnDevolver.setEnabled(false);
    }//GEN-LAST:event_rdbtnEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(VideoMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VideoMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VideoMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VideoMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VideoMainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnDevolver;
    public static javax.swing.JButton btnImprimir;
    public static javax.swing.JButton btnIngresar;
    public static javax.swing.JButton btnRentar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblTitulo;
    public static javax.swing.JLabel lblUsuario;
    public static javax.swing.JRadioButton rdbtnCliente;
    public static javax.swing.JRadioButton rdbtnEmpleado;
    // End of variables declaration//GEN-END:variables

    /*public void BuscarNombre(String nombre){
        IngresarJFrame i=new IngresarJFrame();
        i.cargarInterfazP();
        i.cargarDatosP();
        i.cargarInterfazS();
        i.cargarDatosS();
        String buscarnombre=("");
    }
    /*private String showInputDialog(String ingrese_el_numero_que_desa_buscar) {
        int press=evt.getKeyChar();
        if(press==10){
            String nombreEncontrado=txtBuscador.getText().trim();
            Series s;
            Peliculas p;
            for (int i=0; i<IngresarJFrame.modelo.findColumn(nombreEncontrado); i++) {
                //s=(Series)IngresarJFrame.modelo.findColumn(nombreEncontrado);  
            }
        }
        return null;
    }*/       
}
