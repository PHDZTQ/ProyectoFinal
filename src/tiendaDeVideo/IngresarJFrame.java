/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaDeVideo;

import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static tiendaDeVideo.VideoMainJFrame.idx_s;
import static tiendaDeVideo.VideoMainJFrame.idx_p;
//import static tiendaDeVideo.ImprimirJFrame.jtPeliculas;
//import static tiendaDeVideo.ImprimirJFrame.jtSeries;

/**
 *
 * @author 182h17057
 */
public class IngresarJFrame extends javax.swing.JFrame {
    public static DefaultTableModel modelo;
    int contador=0;
    public static LinkedList Series=new LinkedList();
    public static LinkedList Peliculas=new LinkedList();
    private String pp="";
    private String ss="";
    //public String buscarS;
    //public String buscarP;
    public IngresarJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarInterfazP();
        cargarDatosP();
        cargarInterfazS();
        cargarDatosS();
    }
    /*public ArrayList<Peliculas> ingresarP(){
        String[][] matrizP = new String[peliculas.size()][7];
        for (int i = 0; i < peliculas.size(); i++) {
            matrizP[0][1]=peliculas.get(i).generadorCodigo();
            matrizP[1][1]=peliculas.get(i).lanzamiento;
            matrizP[1][2]=peliculas.get(i).nombre;
            matrizP[1][3]=peliculas.get(i).categoria;
            matrizP[1][4]=peliculas.get(i).formato;
            matrizP[1][5]=peliculas.get(i).duracion;
            matrizP[1][6]=peliculas.get(i).secuelas;
        }
        jtPeliculas.setModel(new javax.swing.table.DefaultTableModel(
        matrizP,
            new String [] {
                "Codigo", "Lanzamiento", "Nombre", "Categoria", "Formato", "Duracion", "Secuelas"
            }
        ));
        return peliculas;
    }
     public ArrayList<Series> ingresarS(){
        String[][] matrizS = new String[series.size()][7];
        for (int i = 0; i < series.size(); i++) {
            //matrizS[0][0]=series.toArray(contador,new Object[]{});
            matrizS[0][1]=series.get(i).generadorCodigo();
            matrizS[1][1]=series.get(i).lanzamiento;
            matrizS[1][2]=series.get(i).nombre;
            matrizS[1][3]=series.get(i).categoria;
            matrizS[1][4]=series.get(i).formato;
            matrizS[1][5]=series.get(i).duracion;
            matrizS[1][6]=series.get(i).temporadas;
        }
        jtSeries.setModel(new javax.swing.table.DefaultTableModel(
        matrizS,
            new String [] {
                "Codigo", "Lanzamiento", "Nombre", "Categoria", "Formato", "Duracion", "Secuelas"
            } 
        ));
        return series;
    }
     public void mostrarS(){
         
     }*/
      public void cargarInterfazP(){
        String datos[][]={};
        String columna[]={"Codigo", "Lanzamiento", "Nombre", "Categoria", "Formato", "Duracion", "Secuelas", "Estado"};
        modelo=new DefaultTableModel(datos,columna);
        jtPeliculas.setModel(modelo);
    }
    public void cargarDatosP(){
        Peliculas p;
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
        for (int i=0;i<IngresarJFrame.Series.size();i++) {
            s=(Series)IngresarJFrame.Series.get(i);
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
     public void BuscarCodigo(String c){
        //IngresarJFrame i=new IngresarJFrame();
        //txtaBusqueda.setText("");
       /* boolean s = false;
        int p = -1;
        String codigo = JOptionPane.showInputDialog(null, "Codigo");
        for (int i = 0; i <=modelo.getRowCount(); i++) {
            if (modelo.codigo[i].getMatricula().equals(matricula)) {
                s = true;
                p = i;
            }
        }
        if (s == false) {
            JOptionPane.showMessageDialog(null, "Usuario no registrado", "Busqueda", JOptionPane.INFORMATION_MESSAGE);
        } else {
            b.txtaBusqueda.append("\n" + Registro.usuarios[p].toString() + "\narmamento registrado:");
            if (Registro.usuarios[p].getArmamento_registrado() != null) {
                for (int j = 0; j < Registro.usuarios[p].getArmamento_registrado().length; j++) {
                    Busqueda_matricula.txtaBusqueda.append("\nserie= " + Registro.usuarios[p].getArmamento_registrado()[j][0] + "; material= " + Registro.usuarios[p].getArmamento_registrado()[j][1]);
                }
            } else {
                b.txtaBusqueda.setText("\n" + Registro.usuarios[p].toString() + "\narmamento registrado:" + "\nSin armamento registrado");
            }
            b.setVisible(true);
        }*/
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbltitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblLanzamiento = new javax.swing.JLabel();
        txtLanzamiento = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        cbCategoria = new javax.swing.JComboBox<>();
        lblCategoria = new javax.swing.JLabel();
        lblaFormato = new javax.swing.JLabel();
        cbFormato = new javax.swing.JComboBox<>();
        rdbtnSeries = new javax.swing.JRadioButton();
        rdbtnPeliculas = new javax.swing.JRadioButton();
        btnSalir = new javax.swing.JButton();
        lblTemporada = new javax.swing.JLabel();
        lblSecuela = new javax.swing.JLabel();
        jsTemporada = new javax.swing.JSpinner();
        jsSecuela = new javax.swing.JSpinner();
        lblDuracion = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        lblMensaje = new javax.swing.JLabel();
        lblPeliculas = new javax.swing.JLabel();
        lblSeries = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtPeliculas = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtSeries = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitulo.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lbltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo.setText("INGRESAR");
        lbltitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));

        lblNombre.setText("Nombre:");

        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblLanzamiento.setText("Año de Lanzamiento:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Acción", "Animación", "Aventura", "Ciencia Ficción", "Comedia", "Documental", "Fantasía", "Música", "Romance", "Suspenso", "Terror" }));
        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
            }
        });

        lblCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategoria.setText("Categoria");

        lblaFormato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblaFormato.setText("Formato");

        cbFormato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Blu-ray", "DVD" }));
        cbFormato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFormatoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbtnSeries);
        rdbtnSeries.setText("Serie");
        rdbtnSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnSeriesActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbtnPeliculas);
        rdbtnPeliculas.setText("Pelicula");
        rdbtnPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnPeliculasActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblTemporada.setText("Temporada:");

        lblSecuela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSecuela.setText("Secuela:");

        jsTemporada.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jsTemporada.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jsSecuela.setModel(new javax.swing.SpinnerNumberModel(1, null, 1, 1));

        lblDuracion.setText("Duracion:");

        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("LISTA DE TODAS LAS PELICULAS Y SERIES INGRESADAS");
        lblMensaje.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblPeliculas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeliculas.setText("Peliculas");
        lblPeliculas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblSeries.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeries.setText("Series");
        lblSeries.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbtnSeries)
                                .addGap(18, 18, 18)
                                .addComponent(rdbtnPeliculas)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblLanzamiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLanzamiento))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDuracion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbFormato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblaFormato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lblSecuela))
                            .addComponent(lblTemporada, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jsTemporada)
                            .addComponent(jsSecuela, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                            .addComponent(lblPeliculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitulo)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdbtnSeries)
                                    .addComponent(rdbtnPeliculas))
                                .addGap(27, 27, 27))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCategoria)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(lblaFormato)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblLanzamiento)
                                        .addComponent(txtLanzamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblDuracion)
                                        .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTemporada)
                            .addComponent(jsTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSecuela)
                            .addComponent(jsSecuela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 21, Short.MAX_VALUE)
                .addComponent(lblMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPeliculas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSeries)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbtnSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnSeriesActionPerformed
        lblSecuela.setEnabled(false);
        jsSecuela.setEnabled(false);
        lblTemporada.setEnabled(true);
        jsTemporada.setEnabled(true);
    }//GEN-LAST:event_rdbtnSeriesActionPerformed

    private void rdbtnPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnPeliculasActionPerformed
        lblTemporada.setEnabled(false);
        jsTemporada.setEnabled(false);
        lblSecuela.setEnabled(true);
        jsSecuela.setEnabled(true);
    }//GEN-LAST:event_rdbtnPeliculasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed

    }//GEN-LAST:event_cbCategoriaActionPerformed

    private void cbFormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFormatoActionPerformed

    }//GEN-LAST:event_cbFormatoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Video p;
        Video s;
        if(rdbtnSeries.isSelected()){
            ss=String.format("S-%03d",idx_s++);
            s=new Series(ss,txtLanzamiento.getText(),txtNombre.getText(),cbCategoria.getItemAt(cbCategoria.getSelectedIndex()),cbFormato.getItemAt(cbFormato.getSelectedIndex()),txtDuracion.getText(),jsTemporada.getValue().toString(),"Disponible");
            Series.add(s);
            cargarInterfazS();
            cargarDatosS();
            txtLanzamiento.setText("");
            txtNombre.setText("");
            txtDuracion.setText("");
            this.cbCategoria.setSelectedIndex(0);
            this.cbFormato.setSelectedIndex(0);
            //this.jsTemporada.setValue(0);
            JOptionPane.showMessageDialog(null,"Registrado","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }
        if(rdbtnPeliculas.isSelected()){
            pp=String.format("P-%03d",idx_p++);
            p=new Peliculas(pp,txtLanzamiento.getText(),txtNombre.getText(),cbCategoria.getItemAt(cbCategoria.getSelectedIndex()),cbFormato.getItemAt(cbFormato.getSelectedIndex()),txtDuracion.getText(),jsSecuela.getValue().toString(),"Disponible");
            Peliculas.add(p);
            cargarInterfazP();
            cargarDatosP();
            txtLanzamiento.setText("");
            txtNombre.setText("");
            txtDuracion.setText("");
            this.cbCategoria.setSelectedIndex(0);
            this.cbFormato.setSelectedIndex(0);
            //this.jsSecuela.setValue(0);
            JOptionPane.showMessageDialog(null,"Registrado","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(IngresarJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JComboBox<String> cbCategoria;
    public static javax.swing.JComboBox<String> cbFormato;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JSpinner jsSecuela;
    public static javax.swing.JSpinner jsTemporada;
    public static javax.swing.JTable jtPeliculas;
    public static javax.swing.JTable jtSeries;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDuracion;
    public static javax.swing.JLabel lblLanzamiento;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPeliculas;
    private javax.swing.JLabel lblSecuela;
    private javax.swing.JLabel lblSeries;
    private javax.swing.JLabel lblTemporada;
    private javax.swing.JLabel lblaFormato;
    private javax.swing.JLabel lbltitulo;
    public static javax.swing.JRadioButton rdbtnPeliculas;
    public static javax.swing.JRadioButton rdbtnSeries;
    public static javax.swing.JTextField txtDuracion;
    public static javax.swing.JTextField txtLanzamiento;
    public static javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
