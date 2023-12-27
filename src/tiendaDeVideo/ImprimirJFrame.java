/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaDeVideo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tiendaDeVideo.*;
/**
 *
 * @author 182h17057
 */
public class ImprimirJFrame extends javax.swing.JFrame {
    //public String [][] matriz=new String[20][7];
    private static DefaultTableModel modelo;
    int contador=0;
    /**
     * Creates new form ImprimirJFrame
     */
    public ImprimirJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarInterfazP();
        cargarDatosP();
        cargarInterfazS();
        cargarDatosS();
        
        /*IngresarJFrame i=new IngresarJFrame();
        String[][] matrizP=new String[i.ingresarP().size()][];
        //i.ingresarS();
        matrizP = i.ingresarP().toArray(matrizP);
        //String[] array = new String[.size()];
        for (String[] matrizP1 : matrizP)
        jtPeliculas.setModel(new javax.swing.table.DefaultTableModel(
            matrizP,
            new String [] {
                "Codigo", "Lanzamiento", "Nombre", "Categoria", "Formato", "Duracion", "Secuelas"
            }
        ));
        String[][] matrizS=new String[i.ingresarS().size()][];
        //i.ingresarS();
        matrizS = i.ingresarS().toArray(matrizS);
        //String[] array = new String[.size()];
        for (String[] matrizS1 : matrizS)
        jtSeries.setModel(new javax.swing.table.DefaultTableModel(
            matrizS,
            new String [] {
                "Codigo", "Lanzamiento", "Nombre", "Categoria", "Formato", "Duracion", "Secuelas"
            }
        ));*/
        //txtaSeries.append(s.obtenerDatos());
        //txtaSeries.append(System.getProperty("line.separator")); 
    }
    
    public void cargarInterfazP(){
        String datos[][]={};
        String columna[]={"Codigo", "Lanzamiento", "Nombre", "Categoria", "Formato", "Duracion", "Secuelas", "Estado"};
        modelo=new DefaultTableModel(datos,columna);
        jtPeliculas.setModel(modelo);
    }
    public void cargarDatosP(){
        Peliculas p;
        //modelo.isEmpty();
        //Object[] array = new String[IngresarJFrame.Peliculas.size()];
        //array= (IngresarJFrame.Peliculas.toArray(array));
        //for(object[] s : array)
          //  System.out.println(s);
        for (int i = 0; i < IngresarJFrame.Peliculas.size(); i++) {
            p=(Peliculas)IngresarJFrame.Peliculas.get(i);
            modelo.insertRow(contador,new Object[]{});
            modelo.setValueAt(p.codigo,contador,0);
            modelo.setValueAt(p.lanzamiento,contador,1);
            modelo.setValueAt(p.nombre,contador,2);
            modelo.setValueAt(p.categoria,contador,3);
            modelo.setValueAt(p.formato,contador,4);
            modelo.setValueAt(p.duracion,contador,5);
            modelo.setValueAt(p.secuelas,contador,6);
            modelo.setValueAt(p.estado,contador,7);
        }
    }
    public void cargarInterfazS(){
        String datos[][]={};
        String columna[]={"Codigo", "Lanzamiento", "Nombre", "Categoria", "Formato", "Duracion", "Temporadas", "Estado"};
        modelo=new DefaultTableModel(datos,columna);
        jtSeries.setModel(modelo);
    }
    public void cargarDatosS(){
        Series s; 
        for (int j=0;j<IngresarJFrame.Series.size();j++) {
            s=(Series)IngresarJFrame.Series.get(j);
            modelo.insertRow(contador,new Object[]{});
            modelo.setValueAt(s.codigo,contador,0);
            modelo.setValueAt(s.lanzamiento,contador,1);
            modelo.setValueAt(s.nombre,contador,2);
            modelo.setValueAt(s.categoria,contador,3);
            modelo.setValueAt(s.formato,contador,4);
            modelo.setValueAt(s.duracion,contador,5);
            modelo.setValueAt(s.temporadas,contador,6);
            modelo.setValueAt(s.estado,contador,7);
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

        lbltitulo = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        lblPeliculas = new javax.swing.JLabel();
        lblSeries = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtPeliculas = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtSeries = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitulo.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lbltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo.setText("IMPRIMIR");
        lbltitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));

        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("LISTA DE TODAS LAS PELICULAS Y SERIES");
        lblMensaje.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblPeliculas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeliculas.setText("Peliculas");
        lblPeliculas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblSeries.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeries.setText("Series");
        lblSeries.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jtPeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Lanzamiento", "Nombre", "Categoria", "Formato", "Duracion", "Secuelas"
            }
        ));
        jScrollPane3.setViewportView(jtPeliculas);

        jtSeries.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Lanzamiento", "Nombre", "Categoria", "Formato", "Duracion", "Temporadas"
            }
        ));
        jScrollPane4.setViewportView(jtSeries);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                            .addComponent(lblPeliculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                            .addComponent(lblSeries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblMensaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitulo)
                .addGap(22, 22, 22)
                .addComponent(lblMensaje)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeliculas)
                    .addComponent(lblSeries))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    
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
            java.util.logging.Logger.getLogger(ImprimirJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImprimirJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImprimirJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImprimirJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImprimirJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTable jtPeliculas;
    public static javax.swing.JTable jtSeries;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblPeliculas;
    private javax.swing.JLabel lblSeries;
    private javax.swing.JLabel lbltitulo;
    // End of variables declaration//GEN-END:variables
}