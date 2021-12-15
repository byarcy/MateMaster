
package Ventanas;

import clases.*;
import javax.swing.JOptionPane;

public class Facil extends javax.swing.JFrame {

 
    public Facil() {
        initComponents();
        setLocationRelativeTo(null);//Aparezca centrado en la pantalla
        setTitle("MateMaster");//Titulo en la barra
        setResizable(false);//No permite maximizar
        pregunta.setText(pf.getPregunta(posf));
        
        String[] Resp = rf.setRespuestasFacil(posf);
            
            //Metodo para borrar la seleccion en los radio botones
            buttonGroup1.clearSelection();
            //Establecemos el texto de las posibles respuestas en los radio botones
            opc1.setText(Resp[0]);
            opc2.setText(Resp[1]);
            opc3.setText(Resp[2]);
            opc4.setText(Resp[3]);
            opc1.requestFocus();
            atras.setEnabled(false);
            terminar.setEnabled(false);
            volver.setEnabled(false);
    }
    
    int posf = 0;
    //Creamos objetos de la clase respuestas y preguntas, se debe importar las clases del paquete clases
    RespuestasFacil rf = new RespuestasFacil();
    PreguntasFacil pf = new PreguntasFacil();
    
    Object[] seleccion = {"","","","","",};
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pregunta = new javax.swing.JLabel();
        opc1 = new javax.swing.JRadioButton();
        opc2 = new javax.swing.JRadioButton();
        opc3 = new javax.swing.JRadioButton();
        opc4 = new javax.swing.JRadioButton();
        atras = new javax.swing.JButton();
        terminar = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MateMaster Facil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 36))); // NOI18N

        pregunta.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        pregunta.setText("Pregunta");

        buttonGroup1.add(opc1);
        opc1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc2);
        opc2.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        opc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc3);
        opc3.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        opc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc4);
        opc4.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        opc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc4ActionPerformed(evt);
            }
        });

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        terminar.setText("Terminar");
        terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarActionPerformed(evt);
            }
        });

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        volver.setText("Volver a jugar");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(terminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opc2)
                            .addComponent(opc1)
                            .addComponent(opc4)
                            .addComponent(opc3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(opc1)
                        .addGap(18, 18, 18)
                        .addComponent(opc2)
                        .addGap(18, 18, 18)
                        .addComponent(opc3)
                        .addGap(18, 18, 18)
                        .addComponent(opc4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(terminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        
        if(posf == 3)
            siguiente.setEnabled(false); //Boton Siguiente desactivado cuando llegue a la ultima pregunta
            terminar.setEnabled(true);//Boton terminar habilitado cuando termine el examen
            volver.setEnabled(true);
       
        if(posf < 5){
            atras.setEnabled(true);//Boton atras habilitado 
            posf++;
            //Establecemos las preguntas en el labbel(pregunta)
            pregunta.setText(pf.getPregunta(posf));
            String[] Resp = rf.setRespuestasFacil(posf);
            
            //Metodo para borrar la seleccion en los radio botones
            buttonGroup1.clearSelection();
            //Establecemos el texto de las posibles respuestas de los labbel en los radio botones dependiendo el indice
            opc1.setText(Resp[0]);
            opc2.setText(Resp[1]);
            opc3.setText(Resp[2]);
            opc4.setText(Resp[3]);
            opc1.requestFocus();
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        
        if(posf > 0){
            posf--;//Permite regresar siempre y cuando sea mayor a la primera pregunta
        }else{
        
        }
        
        if(posf == 0){
            atras.setEnabled(false);//Desabilita el boton atras en la primera pregunta
        }
        if(posf > -1){
            
            siguiente.setEnabled(true);//Habilita boton siguiente desde la primera pregunta
            //Establecemos las preguntas en el labbel(pregunta)
            pregunta.setText(pf.getPregunta(posf));
            String[] Resp = rf.setRespuestasFacil(posf);
            
            //Metodo para borrar la seleccion en los radio botones
            buttonGroup1.clearSelection();
            //Establecemos el texto de las posibles respuestas de los labbel en los radio botones dependiendo el indice
            opc1.setText(Resp[0]);
            opc2.setText(Resp[1]);
            opc3.setText(Resp[2]);
            opc4.setText(Resp[3]);
            opc1.requestFocus();
            atras.setEnabled(false);
        }
    }//GEN-LAST:event_atrasActionPerformed

    private void terminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarActionPerformed
        
        
        
         int Resultado = 0;
         
         for(int i=0; i < 5;i++){
             //Compara la respuesta seleccionada con la respuesta verdadera
             if(seleccion[i].equals(rf.getRespuestasFacil(i))){
                 Resultado = Resultado + 1;
             }
         }
         Resultado = Resultado * 20;
         JOptionPane.showMessageDialog(null, "La calificación es "+Resultado);
         
         
    }//GEN-LAST:event_terminarActionPerformed

    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1ActionPerformed
        seleccion [posf] = opc1.getLabel();
    }//GEN-LAST:event_opc1ActionPerformed

    private void opc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc2ActionPerformed
        seleccion [posf] = opc2.getLabel();
    }//GEN-LAST:event_opc2ActionPerformed

    private void opc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc3ActionPerformed
       seleccion [posf] = opc3.getLabel();
    }//GEN-LAST:event_opc3ActionPerformed

    private void opc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc4ActionPerformed
       seleccion [posf] = opc4.getLabel();
    }//GEN-LAST:event_opc4ActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Inicio vistaInicio = new Inicio();//Creamos objeto de la vista inicio
        vistaInicio.setVisible(true);//Hace que la vista inicial sea visible
        dispose();//Esta vista se cierra
    }//GEN-LAST:event_volverActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton opc1;
    private javax.swing.JRadioButton opc2;
    private javax.swing.JRadioButton opc3;
    private javax.swing.JRadioButton opc4;
    private javax.swing.JLabel pregunta;
    private javax.swing.JButton siguiente;
    private javax.swing.JButton terminar;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
