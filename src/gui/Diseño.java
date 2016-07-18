package gui;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import dao.EstacionamientoDAO;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import to.EstacionamientoTO;
import gui.Datos;
import javax.swing.WindowConstants;
public class Diseño extends javax.swing.JFrame {
    int vehiculo=0,tipo=0;
    boolean cargar=false;
//En esta para a la clase EstacionamientoDao la representamos con objEstacionamientoDO
EstacionamientoDAO objEstacionamientoDAO= new EstacionamientoDAO();  
    ResultSet rsUsuario;
    boolean sw,p;
    public Diseño() {
        initComponents();
        setSize(905, 345);
        getRootPane().setDefaultButton(jbtnNuevo);
        cargaRegistros();  
        muestraRegistros();
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        Auto = new javax.swing.JRadioButton();
        Moto = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jbtnNuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtNum_Est = new javax.swing.JTextField();
        jtxtNombres = new javax.swing.JTextField();
        jtxtPlacas = new javax.swing.JTextField();
        jbtnPrimero = new javax.swing.JButton();
        jbtnAnterior = new javax.swing.JButton();
        jbtnSiguiente = new javax.swing.JButton();
        jbtnUltimo = new javax.swing.JButton();
        jbtnGrabar = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jbtnBorrar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        Numero_estacionamiento1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtTipo_vehiculo = new javax.swing.JTextField();
        Auto1 = new javax.swing.JRadioButton();
        Moto1 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jtxtTipo_Usuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxtdDispo_Est = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Alumno = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        Maestro = new javax.swing.JRadioButton();
        Discapasitado = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        Auto.setText("Auto");
        Auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoActionPerformed(evt);
            }
        });

        Moto.setText("Moto");
        Moto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotoActionPerformed(evt);
            }
        });

        jLabel4.setText("Seleciones es moto o auto");

        jbtnNuevo.setText("Nuevo Estacionamiento");
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Numero de Estacionamiento:");

        jLabel2.setText("Nombre Completos:");

        jLabel3.setText("Placas:");

        jtxtNum_Est.setEnabled(false);
        jtxtNum_Est.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNum_EstActionPerformed(evt);
            }
        });

        jtxtNombres.setEnabled(false);
        jtxtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombresActionPerformed(evt);
            }
        });

        jtxtPlacas.setEnabled(false);

        jbtnPrimero.setText("l<");
        jbtnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrimeroActionPerformed(evt);
            }
        });

        jbtnAnterior.setText("<<");
        jbtnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAnteriorActionPerformed(evt);
            }
        });

        jbtnSiguiente.setText(">>");
        jbtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSiguienteActionPerformed(evt);
            }
        });

        jbtnUltimo.setText(">l");
        jbtnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUltimoActionPerformed(evt);
            }
        });

        jbtnGrabar.setText("Grabar");
        jbtnGrabar.setEnabled(false);
        jbtnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGrabarActionPerformed(evt);
            }
        });

        jbtnEditar.setText("Editar o Ocupar Estacionamiento");
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });

        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.setEnabled(false);
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jbtnBorrar.setText("Liberar Estacionamiento");
        jbtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBorrarActionPerformed(evt);
            }
        });

        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jLabel5.setText("El estacionamiento se encuenta:");

        jtxtTipo_vehiculo.setEnabled(false);
        jtxtTipo_vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTipo_vehiculoActionPerformed(evt);
            }
        });

        Auto1.setText("Auto");
        Auto1.setEnabled(false);
        Auto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto1ActionPerformed(evt);
            }
        });

        Moto1.setText("Moto");
        Moto1.setEnabled(false);
        Moto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Moto1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Seleccione vehiculo:");

        jtxtTipo_Usuario.setEnabled(false);

        jLabel8.setText("Estado de Usuario:");

        jtxtdDispo_Est.setEnabled(false);

        jLabel9.setText("Tipo de Veihiculo:");

        Alumno.setText("Alumno");
        Alumno.setEnabled(false);
        Alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnoActionPerformed(evt);
            }
        });

        jLabel10.setText("Seleccione Estado de usuario:");

        Maestro.setText("Maestro");
        Maestro.setEnabled(false);
        Maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaestroActionPerformed(evt);
            }
        });

        Discapasitado.setText("Discapacitado");
        Discapasitado.setEnabled(false);
        Discapasitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscapasitadoActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Desktop\\Trabajos no identificados\\qwed.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136)
                                .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtxtNombres)
                                        .addComponent(jtxtNum_Est, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtdDispo_Est, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Moto1)
                                            .addComponent(Auto1))
                                        .addGap(78, 78, 78)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Alumno)
                                    .addComponent(Maestro)
                                    .addComponent(Discapasitado)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jtxtTipo_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtTipo_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)))
                        .addGap(871, 871, 871)))
                .addComponent(Numero_estacionamiento1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Maestro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Alumno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Discapasitado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(31, 31, 31))
                                        .addComponent(jtxtTipo_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtxtTipo_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbtnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jbtnPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbtnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Auto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Moto1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtxtNum_Est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jtxtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtxtPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtxtdDispo_Est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Numero_estacionamiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        setSize(new java.awt.Dimension(824, 340));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jbtnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrimeroActionPerformed
        try{
            rsUsuario.first();
            muestraRegistros();
        } catch(Exception e)  {
        } 
    }//GEN-LAST:event_jbtnPrimeroActionPerformed

    private void jbtnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAnteriorActionPerformed
        try{
            rsUsuario.previous();
            if(rsUsuario.isBeforeFirst()){
                rsUsuario.first();
            }
            muestraRegistros();
        } catch (Exception e){
        }
        
    }//GEN-LAST:event_jbtnAnteriorActionPerformed
    private void jbtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSiguienteActionPerformed
            try{
            rsUsuario.next();
            if(rsUsuario.isAfterLast()){
                rsUsuario.last();
            }
            muestraRegistros();

        } catch (Exception e){
        }
            
    }//GEN-LAST:event_jbtnSiguienteActionPerformed
    private void jbtnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUltimoActionPerformed
        try{
            rsUsuario.last();
            muestraRegistros();

        } catch(Exception e)  {
        }
    }//GEN-LAST:event_jbtnUltimoActionPerformed
    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed

        if (jtxtNombres.getText().equals("---------")||jtxtPlacas.getText().equals("--------")){
            limparControles2();
        }else{
            limparControles();
        }
        habilitarControladores(true);
        getRootPane().setDefaultButton(jbtnGrabar);
        sw=false;
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarActionPerformed
if (tipo==1 || tipo==0 || tipo==2) {
if (vehiculo==0 || vehiculo==1){    
    try{
EstacionamientoTO objEstacionamientoTO=new EstacionamientoTO();
objEstacionamientoTO.setNombusu(jtxtNombres.getText());
objEstacionamientoTO.setplacasusu(jtxtPlacas.getText());

/*Implementar el boton para agregar mas usuario
if (jtxtNombres.getText().equals("")||jtxtPlacas.getText().equals("")){
JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                + "Por favor Llene todo lo correspondiente", "Acceso denegado",
                JOptionPane.ERROR_MESSAGE);
}else{
objEstacionamientoTO.setNombusu(jtxtNombres.getText());
objEstacionamientoTO.setplacasusu(jtxtPlacas.getText());
objEstacionamientoDAO.insert(objEstacionamientoTO);
cargaRegistros();
muestraRegistros();
habilitarControladores(false);
getRootPane().setDefaultButton(jbtnNuevo);   
JOptionPane.showMessageDialog(rootPane,"Registro Guardado");
Alumno.setSelected(false);
Maestro.setSelected(false);
Moto1.setSelected(false);
Auto1.setSelected(false);
}
*/

if (jtxtNombres.getText().equals("")||jtxtPlacas.getText().equals("")){
JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                + "Por favor Llene todo lo correspondiente", "Acceso denegado",
                JOptionPane.ERROR_MESSAGE);
cargar=false;
}else{
objEstacionamientoTO.setIdusu(jtxtNum_Est.getText());
objEstacionamientoDAO.ocupar(objEstacionamientoTO);
JOptionPane.showMessageDialog(rootPane, "Registro Guardado exitosamente");
Alumno.setSelected(false);
Maestro.setSelected(false);
Moto1.setSelected(false);
Auto1.setSelected(false);
cargar=true;
if (tipo==2){
objEstacionamientoTO.setIdusu(jtxtNum_Est.getText());
objEstacionamientoDAO.discapacitado(objEstacionamientoTO);
}else if(tipo==1){
objEstacionamientoTO.setIdusu(jtxtNum_Est.getText());
objEstacionamientoDAO.maestro(objEstacionamientoTO);
}else if(tipo==0){
objEstacionamientoTO.setIdusu(jtxtNum_Est.getText());
objEstacionamientoDAO.alumno(objEstacionamientoTO);    
}
if(vehiculo==0){
objEstacionamientoTO.setIdusu(jtxtNum_Est.getText());                
objEstacionamientoDAO.auto(objEstacionamientoTO);    
}else if (vehiculo==1){
objEstacionamientoTO.setIdusu(jtxtNum_Est.getText());
objEstacionamientoDAO.moto(objEstacionamientoTO);
}
}
if(cargar==true){
    limparControles();
cargaRegistros();
muestraRegistros();
habilitarControladores(false);
getRootPane().setDefaultButton(jbtnNuevo);

}
}catch (Exception e) {
        
    }
}else{
    JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                + "Por favor Llene todo lo correspondiente", "Acceso denegado",
                JOptionPane.ERROR_MESSAGE);
}
}else{
    JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                + "Por favor Llene todo lo correspondiente", "Acceso denegado",
                JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_jbtnGrabarActionPerformed

    private void jtxtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombresActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        habilitarControladores(false);
        limparControles();
        getRootPane().setDefaultButton(jbtnNuevo);
        cargaRegistros();
        muestraRegistros();
        
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBorrarActionPerformed
    try{
    int op = JOptionPane.showConfirmDialog(rootPane,"¿Desea liberar estacionamiento?",
                    "Pregunta",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
    if(op==JOptionPane.YES_OPTION){
    EstacionamientoTO objEstacionamientoTO=new EstacionamientoTO();
    objEstacionamientoTO.setIdusu(jtxtNum_Est.getText());
    objEstacionamientoDAO.delete(objEstacionamientoTO);
    JOptionPane.showMessageDialog(rootPane,"Estacionamiento Libre");
    cargaRegistros();
    muestraRegistros();
    }
}catch(Exception e){
}    
    }//GEN-LAST:event_jbtnBorrarActionPerformed

    private void jtxtNum_EstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNum_EstActionPerformed

    }//GEN-LAST:event_jtxtNum_EstActionPerformed

    private void jtxtTipo_vehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTipo_vehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTipo_vehiculoActionPerformed

    private void AutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoActionPerformed

    }//GEN-LAST:event_AutoActionPerformed

    private void MotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotoActionPerformed

    }//GEN-LAST:event_MotoActionPerformed

    private void Auto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto1ActionPerformed
vehiculo=0;
try{
    p=sw;
sw=true;
motoauto(sw);
                }catch(Exception e){
        }
sw=p;
    }//GEN-LAST:event_Auto1ActionPerformed

    private void Moto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Moto1ActionPerformed
vehiculo=1;
try{
    p=sw;
sw=true;
motoauto(sw);
}catch(Exception e){
        }
sw=p;
    }//GEN-LAST:event_Moto1ActionPerformed

    private void AlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnoActionPerformed
tipo=0;
try{
    p=sw;
sw=true;
motoauto(sw);
                }catch(Exception e){
        }
sw=p;
    }//GEN-LAST:event_AlumnoActionPerformed

    private void MaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaestroActionPerformed
 tipo=1;
try{
p=sw;
sw=true;
motoauto(sw);
}catch(Exception e){
        }
sw=p;
    }//GEN-LAST:event_MaestroActionPerformed

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        habilitarControladores(true);
        limparControles();
        getRootPane().setDefaultButton(jbtnGrabar);
        sw=true;
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void DiscapasitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscapasitadoActionPerformed
 tipo=2;
try{
p=sw;
sw=true;
motoauto(sw);
}catch(Exception e){
        }
sw=p;
    }//GEN-LAST:event_DiscapasitadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Alumno;
    private javax.swing.JRadioButton Auto;
    private javax.swing.JRadioButton Auto1;
    private javax.swing.JRadioButton Discapasitado;
    private javax.swing.JRadioButton Maestro;
    private javax.swing.JRadioButton Moto;
    private javax.swing.JRadioButton Moto1;
    private javax.swing.JLabel Numero_estacionamiento1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbtnAnterior;
    private javax.swing.JButton jbtnBorrar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnGrabar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JButton jbtnPrimero;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JButton jbtnSiguiente;
    private javax.swing.JButton jbtnUltimo;
    private javax.swing.JTextField jtxtNombres;
    private javax.swing.JTextField jtxtNum_Est;
    private javax.swing.JTextField jtxtPlacas;
    private javax.swing.JTextField jtxtTipo_Usuario;
    private javax.swing.JTextField jtxtTipo_vehiculo;
    private javax.swing.JTextField jtxtdDispo_Est;
    // End of variables declaration//GEN-END:variables
private void cargaRegistros() {
    try{
    rsUsuario= objEstacionamientoDAO.cargaRegistros();
    rsUsuario.next();
    }catch(Exception e){
    }   
    }

    private void muestraRegistros() {
    try{
    jtxtNum_Est.setText(rsUsuario.getString(1));
    jtxtNombres.setText(rsUsuario.getString(2));
    jtxtPlacas.setText(rsUsuario.getString(3));
    jtxtdDispo_Est.setText(rsUsuario.getString(4));
    jtxtTipo_vehiculo.setText(rsUsuario.getString(5));
    jtxtTipo_Usuario.setText(rsUsuario.getString(6));
    }catch(Exception e){
        JOptionPane.showMessageDialog(rootPane,"No hay registros");
    }   
    }
    private void habilitarControladores(boolean b){
    vehiculo=3;
    tipo=3;
    jtxtNombres.setEditable(b);
    jtxtPlacas.setEditable(b);
    
    JButton[] control= {jbtnAnterior,jbtnBorrar,jbtnEditar,jbtnNuevo,
    jbtnPrimero, jbtnSalir, jbtnSiguiente,jbtnUltimo};
    
    for(JButton objButton : control){
    objButton.setEnabled(!b);
    }
    Alumno.setEnabled(b);
    Discapasitado.setEnabled(b);
    Maestro.setEnabled(b);
    Auto1.setEnabled(b);
    Moto1.setEnabled(b);
    jtxtNombres.setEnabled(b);
    jtxtPlacas.setEnabled(b);
   jbtnGrabar.setEnabled(b);
   jbtnCancelar.setEnabled(b);
   jtxtNombres.grabFocus();
    }
   private void limparControles2() {
    jtxtNombres.setText("");
    jtxtdDispo_Est.setText("");
    jtxtTipo_vehiculo.setText("");
    jtxtPlacas.setText("");
    jtxtTipo_Usuario.setText("");
    Alumno.setSelected(false);
    Maestro.setSelected(false);
    Discapasitado.setSelected(false);
    Moto1.setSelected(false);
    Auto1.setSelected(false);
    }
    private void limparControles() {
    jtxtdDispo_Est.setText("");
    jtxtTipo_Usuario.setText("");
    jtxtTipo_vehiculo.setText("");
    Alumno.setSelected(false);
    Discapasitado.setSelected(false);
Maestro.setSelected(false);
Moto1.setSelected(false);
Auto1.setSelected(false);
    }
     private void motoauto(boolean b){
    if (tipo==0||tipo==1 || tipo==2){
    Maestro.setEnabled(!b);
    Alumno.setEnabled(!b);
    Discapasitado.setEnabled(!b);
    }
    if (vehiculo==0||vehiculo==1){
    Auto1.setEnabled(!b);
    Moto1.setEnabled(!b);
    }
    }
    }
    


