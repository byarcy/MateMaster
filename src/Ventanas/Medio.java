
package Ventanas;

import clases.*;

public class Medio extends javax.swing.JFrame {


    public Medio() {
        initComponents();
        setLocationRelativeTo(null);//Aparezca centrado en la pantalla
        setTitle("MateMaster");//Titulo en la barra
        setResizable(false);//No permite maximizar
        preguntaM.setText(pm.getPreguntaMedio(posm));
        
        String[] Respm = rm.setRespuestasMedio(posm);
            
            //Metodo para borrar la seleccion en los radio botones
            buttonGroupm.clearSelection();
            //Establecemos el texto de las posibles respuestas en los radio botones
            opc1m.setText(Respm[0]);
            opc2m.setText(Respm[1]);
            opc3m.setText(Respm[2]);
            opc4m.setText(Respm[3]);
            opc1m.requestFocus();
            atrasm.setEnabled(false);
            terminarm.setEnabled(false);
    }
    
    int posm = 0;
    //Creamos objetos de la clase respuestas y preguntas, se debe importar las clases del paquete clases
    RespuestasFacil rm = new RespuestasFacil();
    PreguntasFacil pm = new PreguntasFacil();
    
    Object[] seleccionm = {"","","","","",};

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupm = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        preguntaM = new javax.swing.JLabel();
        opc1m = new javax.swing.JRadioButton();
        opc2m = new javax.swing.JRadioButton();
        opc4m = new javax.swing.JRadioButton();
        opc3m = new javax.swing.JRadioButton();
        atrasm = new javax.swing.JButton();
        siguientem = new javax.swing.JButton();
        terminarm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MateMaster Medio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 36))); // NOI18N

        preguntaM.setText("Pregunta");

        buttonGroupm.add(opc1m);

        buttonGroupm.add(opc2m);

        buttonGroupm.add(opc4m);

        buttonGroupm.add(opc3m);

        atrasm.setText("Atras");
        atrasm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasmActionPerformed(evt);
            }
        });

        siguientem.setBackground(new java.awt.Color(255, 255, 255));
        siguientem.setText("Siguiente");
        siguientem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguientemActionPerformed(evt);
            }
        });

        terminarm.setText("Terminar");
        terminarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opc2m)
                            .addComponent(opc1m)
                            .addComponent(opc4m)
                            .addComponent(opc3m)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(preguntaM, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(atrasm, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(149, 149, 149)
                                .addComponent(siguientem, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(terminarm, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(preguntaM, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(opc1m)
                        .addGap(31, 31, 31)
                        .addComponent(opc2m)
                        .addGap(18, 18, 18)
                        .addComponent(opc3m)
                        .addGap(13, 13, 13)
                        .addComponent(opc4m)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(atrasm, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(siguientem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(terminarm, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
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

    private void siguientemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguientemActionPerformed
        
        if(posm == 3)
            siguientem.setEnabled(false); //Boton Siguiente desactivado cuando llegue a la ultima pregunta
            terminarm.setEnabled(true);//Boton terminar habilitado cuando termine el examen
       
        if(posm < 5){
            atrasm.setEnabled(true);//Boton atras habilitado 
            posm++;
            //Establecemos las preguntas en el labbel(pregunta)
            preguntaM.setText(pm.getPreguntaMedio(posm));
            String[] Respm = rm.setRespuestasMedio(posm);
            
            //Metodo para borrar la seleccion en los radio botones
            buttonGroupm.clearSelection();
            //Establecemos el texto de las posibles respuestas de los labbel en los radio botones dependiendo el indice
            opc1m.setText(Respm[0]);
            opc2m.setText(Respm[1]);
            opc3m.setText(Respm[2]);
            opc4m.setText(Respm[3]);
            opc1m.requestFocus();
        }
        
    }//GEN-LAST:event_siguientemActionPerformed

    private void atrasmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasmActionPerformed
        if(posm > 0){
            posm--;//Permite regresar siempre y cuando sea mayor a la primera pregunta
        }else{
        
        }
        
        if(posm == 0){
            atrasm.setEnabled(false);//Desabilita el boton atras en la primera pregunta
        }
        if(posm > -1){
            
            siguientem.setEnabled(true);//Habilita boton siguiente desde la primera pregunta
            //Establecemos las preguntas en el labbel(pregunta)
            preguntaM.setText(pm.getPreguntaMedio(posm));
            String[] Respm = rm.setRespuestasMedio(posm);
            
            //Metodo para borrar la seleccion en los radio botones
            buttonGroupm.clearSelection();
            //Establecemos el texto de las posibles respuestas de los labbel en los radio botones dependiendo el indice
            opc1m.setText(Respm[0]);
            opc2m.setText(Respm[1]);
            opc3m.setText(Respm[2]);
            opc4m.setText(Respm[3]);
            opc1m.requestFocus();
            atrasm.setEnabled(false);
        }
    }//GEN-LAST:event_atrasmActionPerformed

    private void terminarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarmActionPerformed
        Final vistaFinalm = new Final();//Creamos objeto de la vista final
        vistaFinalm.setVisible(true);//Hace que la final sea visible
        dispose();//Esta vista se cierra
        
        
       
    }//GEN-LAST:event_terminarmActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasm;
    private javax.swing.ButtonGroup buttonGroupm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton opc1m;
    private javax.swing.JRadioButton opc2m;
    private javax.swing.JRadioButton opc3m;
    private javax.swing.JRadioButton opc4m;
    private javax.swing.JLabel preguntaM;
    private javax.swing.JButton siguientem;
    private javax.swing.JButton terminarm;
    // End of variables declaration//GEN-END:variables
}
