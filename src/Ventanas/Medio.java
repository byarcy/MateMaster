
package Ventanas;

import clases.*;
import javax.swing.JOptionPane;

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
            volverm.setEnabled(false);
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
        volverm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MateMaster Medio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 36))); // NOI18N

        preguntaM.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        preguntaM.setText("Pregunta");

        buttonGroupm.add(opc1m);
        opc1m.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        opc1m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc1mActionPerformed(evt);
            }
        });

        buttonGroupm.add(opc2m);
        opc2m.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        opc2m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc2mActionPerformed(evt);
            }
        });

        buttonGroupm.add(opc4m);
        opc4m.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        opc4m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc4mActionPerformed(evt);
            }
        });

        buttonGroupm.add(opc3m);
        opc3m.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        opc3m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc3mActionPerformed(evt);
            }
        });

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

        volverm.setText("Volver a jugar");
        volverm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volvermActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(preguntaM, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(atrasm, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(siguientem, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(terminarm, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(volverm, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(preguntaM, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(opc1m)
                .addGap(18, 18, 18)
                .addComponent(opc2m)
                .addGap(18, 18, 18)
                .addComponent(opc3m)
                .addGap(18, 18, 18)
                .addComponent(opc4m)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(atrasm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(terminarm, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(siguientem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(volverm, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
            volverm.setEnabled(true);
       
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
       int Resultado = 0;
         
         for(int i=0; i < 5;i++){
             //Compara la respuesta seleccionada con la respuesta verdadera
             if(seleccionm[i].equals(rm.getRespuestasMedio(i))){
                 Resultado = Resultado + 1;
             }
         }
         Resultado = Resultado * 20;
         JOptionPane.showMessageDialog(null, "La calificación es "+Resultado);
    }//GEN-LAST:event_terminarmActionPerformed

    private void opc1mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1mActionPerformed
        seleccionm [posm] = opc1m.getLabel();
    }//GEN-LAST:event_opc1mActionPerformed

    private void opc2mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc2mActionPerformed
        seleccionm [posm] = opc2m.getLabel();
    }//GEN-LAST:event_opc2mActionPerformed

    private void opc3mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc3mActionPerformed
        seleccionm [posm] = opc3m.getLabel();
    }//GEN-LAST:event_opc3mActionPerformed

    private void opc4mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc4mActionPerformed
        seleccionm [posm] = opc4m.getLabel();
    }//GEN-LAST:event_opc4mActionPerformed

    private void volvermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volvermActionPerformed
        Inicio vistaInicio = new Inicio();//Creamos objeto de la vista inicio
        vistaInicio.setVisible(true);//Hace que la vista inicial sea visible
        dispose();//Esta vista se cierra
    }//GEN-LAST:event_volvermActionPerformed



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
    private javax.swing.JButton volverm;
    // End of variables declaration//GEN-END:variables
}
