
package Ventanas;

import clases.*;
import javax.swing.JOptionPane;

public class Dificil extends javax.swing.JFrame {


    public Dificil() {
        initComponents();
        setLocationRelativeTo(null);//Aparezca centrado en la pantalla
        setTitle("MateMaster");//Titulo en la barra
        setResizable(false);//No permite maximizar
        preguntaD.setText(pd.getPreguntaDificil(posd));
        
        String[] Respd = rd.setRespuestasDificil(posd);
            
            //Metodo para borrar la seleccion en los radio botones
            buttonGroupd.clearSelection();
            //Establecemos el texto de las posibles respuestas en los radio botones
            opc1d.setText(Respd[0]);
            opc2d.setText(Respd[1]);
            opc3d.setText(Respd[2]);
            opc4d.setText(Respd[3]);
            opc1d.requestFocus();
            atrasd.setEnabled(false);
            terminard.setEnabled(false);
            volverd.setEnabled(false);
    }
    
    int posd = 0;
    //Creamos objetos de la clase respuestas y preguntas, se debe importar las clases del paquete clases
    RespuestasFacil rd = new RespuestasFacil();
    PreguntasFacil pd = new PreguntasFacil();
    
    Object[] selecciond = {"","","","","",};


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupd = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        preguntaD = new javax.swing.JLabel();
        opc2d = new javax.swing.JRadioButton();
        opc1d = new javax.swing.JRadioButton();
        opc3d = new javax.swing.JRadioButton();
        opc4d = new javax.swing.JRadioButton();
        atrasd = new javax.swing.JButton();
        terminard = new javax.swing.JButton();
        siguiented = new javax.swing.JButton();
        volverd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MateMaster Dificil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 36))); // NOI18N

        preguntaD.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        preguntaD.setText("Pregunta");

        buttonGroupd.add(opc2d);
        opc2d.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        opc2d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc2dActionPerformed(evt);
            }
        });

        buttonGroupd.add(opc1d);
        opc1d.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        opc1d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc1dActionPerformed(evt);
            }
        });

        buttonGroupd.add(opc3d);
        opc3d.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        opc3d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc3dActionPerformed(evt);
            }
        });

        buttonGroupd.add(opc4d);
        opc4d.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        opc4d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc4dActionPerformed(evt);
            }
        });

        atrasd.setText("Atras");
        atrasd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasdActionPerformed(evt);
            }
        });

        terminard.setText("Terminar");
        terminard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminardActionPerformed(evt);
            }
        });

        siguiented.setText("Siguiente");
        siguiented.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguientedActionPerformed(evt);
            }
        });

        volverd.setText("Volver a jugar");
        volverd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opc3d)
                            .addComponent(opc2d)
                            .addComponent(opc4d)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(atrasd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(siguiented, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(terminard, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(volverd, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(preguntaD, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(opc1d)
                    .addContainerGap(629, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(preguntaD, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(opc2d)
                        .addGap(18, 18, 18)
                        .addComponent(opc3d)
                        .addGap(18, 18, 18)
                        .addComponent(opc4d)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(terminard, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(siguiented, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atrasd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volverd, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addComponent(opc1d)
                    .addContainerGap(325, Short.MAX_VALUE)))
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

    private void siguientedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguientedActionPerformed
        if(posd == 3)
            siguiented.setEnabled(false); //Boton Siguiente desactivado cuando llegue a la ultima pregunta
            terminard.setEnabled(true);//Boton terminar habilitado cuando termine el examen
            volverd.setEnabled(true);
                    
        if(posd < 5){
            atrasd.setEnabled(true);//Boton atras habilitado 
            posd++;
            //Establecemos las preguntas en el labbel(pregunta)
            preguntaD.setText(pd.getPreguntaDificil(posd));
            String[] Respd = rd.setRespuestasDificil(posd);
            
            //Metodo para borrar la seleccion en los radio botones
            buttonGroupd.clearSelection();
            //Establecemos el texto de las posibles respuestas de los labbel en los radio botones dependiendo el indice
            opc1d.setText(Respd[0]);
            opc2d.setText(Respd[1]);
            opc3d.setText(Respd[2]);
            opc4d.setText(Respd[3]);
            opc1d.requestFocus();
        }
    }//GEN-LAST:event_siguientedActionPerformed

    private void atrasdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasdActionPerformed
        if(posd > 0){
            posd--;//Permite regresar siempre y cuando sea mayor a la primera pregunta
        }else{
        
        }
        
        if(posd == 0){
            atrasd.setEnabled(false);//Desabilita el boton atras en la primera pregunta
        }
        if(posd > -1){
            
            siguiented.setEnabled(true);//Habilita boton siguiente desde la primera pregunta
            //Establecemos las preguntas en el labbel(pregunta)
            preguntaD.setText(pd.getPreguntaDificil(posd));
            String[] Respd = rd.setRespuestasDificil(posd);
            
            //Metodo para borrar la seleccion en los radio botones
            buttonGroupd.clearSelection();
            //Establecemos el texto de las posibles respuestas de los labbel en los radio botones dependiendo el indice
            opc1d.setText(Respd[0]);
            opc2d.setText(Respd[1]);
            opc3d.setText(Respd[2]);
            opc4d.setText(Respd[3]);
            opc1d.requestFocus();
            atrasd.setEnabled(false);
        }
    }//GEN-LAST:event_atrasdActionPerformed

    private void terminardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminardActionPerformed
         int Resultado = 0;
         
         for(int i=0; i < 5;i++){
             //Compara la respuesta seleccionada con la respuesta verdadera
             if(selecciond[i].equals(rd.getRespuestasDificil(i ))){
                 Resultado = Resultado + 1;
             }
         }
         Resultado = Resultado * 20;
         JOptionPane.showMessageDialog(null, "La calificación es "+Resultado);
    }//GEN-LAST:event_terminardActionPerformed

    private void opc1dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1dActionPerformed
        selecciond [posd] = opc1d.getLabel();
    }//GEN-LAST:event_opc1dActionPerformed

    private void opc2dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc2dActionPerformed
        selecciond [posd] = opc2d.getLabel();
    }//GEN-LAST:event_opc2dActionPerformed

    private void opc3dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc3dActionPerformed
        selecciond [posd] = opc3d.getLabel();
    }//GEN-LAST:event_opc3dActionPerformed

    private void opc4dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc4dActionPerformed
        selecciond [posd] = opc4d.getLabel();
    }//GEN-LAST:event_opc4dActionPerformed

    private void volverdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverdActionPerformed
        Inicio vistaInicio = new Inicio();//Creamos objeto de la vista inicio
        vistaInicio.setVisible(true);//Hace que la vista inicial sea visible
        dispose();//Esta vista se cierra
    }//GEN-LAST:event_volverdActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasd;
    private javax.swing.ButtonGroup buttonGroupd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton opc1d;
    private javax.swing.JRadioButton opc2d;
    private javax.swing.JRadioButton opc3d;
    private javax.swing.JRadioButton opc4d;
    private javax.swing.JLabel preguntaD;
    private javax.swing.JButton siguiented;
    private javax.swing.JButton terminard;
    private javax.swing.JButton volverd;
    // End of variables declaration//GEN-END:variables
}
