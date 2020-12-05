
package visao;

import java.util.ArrayList;
import modelo.Calculo;

public class appCalculadora extends javax.swing.JFrame {
    
    private Calculo calc = new Calculo();
    //private ArrayList operando;
    
    private ArrayList operando = new ArrayList();
    
    public appCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTeclado = new javax.swing.JPanel();
        jButton_0 = new javax.swing.JButton();
        jButton_1 = new javax.swing.JButton();
        jButton_2 = new javax.swing.JButton();
        jButton_3 = new javax.swing.JButton();
        jButton_4 = new javax.swing.JButton();
        jButton_5 = new javax.swing.JButton();
        jButton_6 = new javax.swing.JButton();
        jButton_7 = new javax.swing.JButton();
        jButton_8 = new javax.swing.JButton();
        jButton_9 = new javax.swing.JButton();
        jButton_Divide = new javax.swing.JButton();
        jButton_Multiplica = new javax.swing.JButton();
        jButton_Subtrai = new javax.swing.JButton();
        jButton_Soma = new javax.swing.JButton();
        jButton_Igual = new javax.swing.JButton();
        jButton_AC = new javax.swing.JButton();
        lbCalculadora = new javax.swing.JLabel();
        lbDisplay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_0.setText("0");
        jButton_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_0ActionPerformed(evt);
            }
        });

        jButton_1.setText("1");
        jButton_1.setPreferredSize(new java.awt.Dimension(41, 41));
        jButton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_1ActionPerformed(evt);
            }
        });

        jButton_2.setText("2");
        jButton_2.setPreferredSize(new java.awt.Dimension(41, 41));
        jButton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_2ActionPerformed(evt);
            }
        });

        jButton_3.setText("3");
        jButton_3.setPreferredSize(new java.awt.Dimension(41, 41));
        jButton_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_3ActionPerformed(evt);
            }
        });

        jButton_4.setText("4");
        jButton_4.setPreferredSize(new java.awt.Dimension(41, 41));
        jButton_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_4ActionPerformed(evt);
            }
        });

        jButton_5.setText("5");
        jButton_5.setPreferredSize(new java.awt.Dimension(41, 41));
        jButton_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_5ActionPerformed(evt);
            }
        });

        jButton_6.setText("6");
        jButton_6.setPreferredSize(new java.awt.Dimension(41, 41));
        jButton_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_6ActionPerformed(evt);
            }
        });

        jButton_7.setText("7");
        jButton_7.setPreferredSize(new java.awt.Dimension(41, 41));
        jButton_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_7ActionPerformed(evt);
            }
        });

        jButton_8.setText("8");
        jButton_8.setPreferredSize(new java.awt.Dimension(41, 41));
        jButton_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_8ActionPerformed(evt);
            }
        });

        jButton_9.setText("9");
        jButton_9.setPreferredSize(new java.awt.Dimension(41, 41));
        jButton_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_9ActionPerformed(evt);
            }
        });

        jButton_Divide.setText("/");
        jButton_Divide.setPreferredSize(new java.awt.Dimension(41, 41));
        jButton_Divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DivideActionPerformed(evt);
            }
        });

        jButton_Multiplica.setText("X");
        jButton_Multiplica.setPreferredSize(new java.awt.Dimension(41, 41));

        jButton_Subtrai.setText("-");
        jButton_Subtrai.setPreferredSize(new java.awt.Dimension(41, 41));

        jButton_Soma.setText("+");
        jButton_Soma.setPreferredSize(new java.awt.Dimension(41, 41));
        jButton_Soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SomaActionPerformed(evt);
            }
        });

        jButton_Igual.setText("=");
        jButton_Igual.setPreferredSize(new java.awt.Dimension(41, 41));

        jButton_AC.setText("AC");
        jButton_AC.setToolTipText("");
        jButton_AC.setAlignmentY(0.0F);
        jButton_AC.setAutoscrolls(true);
        jButton_AC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_AC.setName(""); // NOI18N
        jButton_AC.setPreferredSize(new java.awt.Dimension(41, 41));
        jButton_AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ACActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpTecladoLayout = new javax.swing.GroupLayout(jpTeclado);
        jpTeclado.setLayout(jpTecladoLayout);
        jpTecladoLayout.setHorizontalGroup(
            jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTecladoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTecladoLayout.createSequentialGroup()
                        .addComponent(jButton_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpTecladoLayout.createSequentialGroup()
                        .addGroup(jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpTecladoLayout.createSequentialGroup()
                                .addComponent(jButton_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpTecladoLayout.createSequentialGroup()
                                .addComponent(jButton_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton_0, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpTecladoLayout.createSequentialGroup()
                        .addComponent(jButton_Divide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_AC, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                    .addGroup(jpTecladoLayout.createSequentialGroup()
                        .addGroup(jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Multiplica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Subtrai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Soma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpTecladoLayout.setVerticalGroup(
            jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTecladoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Divide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_AC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTecladoLayout.createSequentialGroup()
                        .addGroup(jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Multiplica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Subtrai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_Soma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton_Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        lbCalculadora.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbCalculadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCalculadora.setText("CALCULADORA");
        lbCalculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbCalculadora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbDisplay.setEditable(false);
        lbDisplay.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lbDisplay.setCursor(new java.awt.Cursor(java.awt.Cursor.E_RESIZE_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDisplay, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_0ActionPerformed
        lbDisplay.setText("0");
        int num0 = Integer.parseInt(lbDisplay.getText());
        operando.add(num0);
        apagar();
        
        String retorno0 = "";
        for (Object a : operando){
            retorno0 += (a+"");
        }
        this.lbDisplay.setText(retorno0);
    }//GEN-LAST:event_jButton_0ActionPerformed

    private void jButton_ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ACActionPerformed
        // TODO add your handling code here:
        ac();
    }//GEN-LAST:event_jButton_ACActionPerformed

    private void jButton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_1ActionPerformed
        // TODO add your handling code here:
        lbDisplay.setText("1");
        int num1 = Integer.parseInt(lbDisplay.getText());
                
        String retorno1 = "";
        for (Object a : operando){
            retorno1 += (a+"");
        }
        this.lbDisplay.setText(retorno1);
        
        //apagar();
    }//GEN-LAST:event_jButton_1ActionPerformed

    private void jButton_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_2ActionPerformed
        // TODO add your handling code here:
        lbDisplay.setText("2");
        int num2 = Integer.parseInt(lbDisplay.getText());
        operando.add(num2);
        apagar();
        
        String retorno2 = "";
        for (Object a : operando){
            retorno2 += (a+"");
        }
        this.lbDisplay.setText(retorno2);
    }//GEN-LAST:event_jButton_2ActionPerformed

    private void jButton_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_3ActionPerformed
        // TODO add your handling code here:
        lbDisplay.setText("3");
        int num3 = Integer.parseInt(lbDisplay.getText());
        operando.add(num3);
        apagar();
        
        String retorno3 = "";
        for (Object a : operando){
            retorno3 += (a+"");
        }
        this.lbDisplay.setText(retorno3);
    }//GEN-LAST:event_jButton_3ActionPerformed

    private void jButton_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_4ActionPerformed
        // TODO add your handling code here:
        lbDisplay.setText("4");
        int num4 = Integer.parseInt(lbDisplay.getText());
        operando.add(num4);
        apagar();
        
        String retorno4 = "";
        for (Object a : operando){
            retorno4 += (a+"");
        }
        this.lbDisplay.setText(retorno4);
    }//GEN-LAST:event_jButton_4ActionPerformed

    private void jButton_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_5ActionPerformed
        // TODO add your handling code here:
        lbDisplay.setText("5");
        int num5 = Integer.parseInt(lbDisplay.getText());
        operando.add(num5);
        apagar();
        
        String retorno5 = "";
        for (Object a : operando){
            retorno5 += (a+"");
        }
        this.lbDisplay.setText(retorno5);
    }//GEN-LAST:event_jButton_5ActionPerformed

    private void jButton_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_6ActionPerformed
        // TODO add your handling code here:
        lbDisplay.setText("6");
        int num6 = Integer.parseInt(lbDisplay.getText());
        operando.add(num6);
        apagar();
        
        String retorno6 = "";
        for (Object a : operando){
            retorno6 += (a+"");
        }
        this.lbDisplay.setText(retorno6);
    }//GEN-LAST:event_jButton_6ActionPerformed

    private void jButton_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_7ActionPerformed
        // TODO add your handling code here:
        lbDisplay.setText("7");
        int num7 = Integer.parseInt(lbDisplay.getText());
        operando.add(num7);
        apagar();
        
        String retorno7 = "";
        for (Object a : operando){
            retorno7 += (a+"");
        }
        this.lbDisplay.setText(retorno7);
    }//GEN-LAST:event_jButton_7ActionPerformed

    private void jButton_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_8ActionPerformed
        // TODO add your handling code here:
        lbDisplay.setText("8");
        int num8 = Integer.parseInt(lbDisplay.getText());
        operando.add(num8);
        apagar();
        
        String retorno8 = "";
        for (Object a : operando){
            retorno8 += (a+"");
        }
        this.lbDisplay.setText(retorno8);
    }//GEN-LAST:event_jButton_8ActionPerformed

    private void jButton_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_9ActionPerformed
        // TODO add your handling code here:
        lbDisplay.setText("9");
        int num9 = Integer.parseInt(lbDisplay.getText());
        operando.add(num9);
        apagar();
        
        String retorno9 = "";
        for (Object a : operando){
            retorno9 += (a+"");
        }
        this.lbDisplay.setText(retorno9);
    }//GEN-LAST:event_jButton_9ActionPerformed

    private void jButton_DivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DivideActionPerformed
        // TODO add your handling code here:
        String retornoDiv = "";
        for (Object a : operando){
            retornoDiv += (a+"");
        }
        this.lbDisplay.setText(retornoDiv);
        
        Calculo div = new Calculo();
        div.setOperando(operando);
        
        String divisao = "";
        for (Object Div : div.getOperando()){
            divisao += (Div+"");
        }
        lbDisplay.setText("/");
        div.getOperado().add("/");
        
        String divisao1 = "";
        for (Object Div : div.getOperado()){
            divisao1 += (Div+"");
        }
        System.out.println(divisao);
        System.out.println(divisao1);
        System.out.println((divisao) + (divisao1));
        //ac();
        
        //int numDiv = Integer.parseInt(lbDisplay.getText());
        //operando.add(numDiv);
        //apagar();
        //lbDisplay.setText("/");
        //int numDiv = Integer.parseInt(lbDisplay.getText());
        //String retorno2 = "";
        //for (Object a : operando){
        //    retorno2 += (a+"");
        //}
        //this.lbDisplay.setText(retorno2);
    }//GEN-LAST:event_jButton_DivideActionPerformed

    private void jButton_SomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SomaActionPerformed
        // TODO add your handling code here:
        String retornoSom = "";
        for (Object a : operando){
            retornoSom += (a+"");
        }
        this.lbDisplay.setText(retornoSom);
        
        Calculo som = new Calculo();
        som.setOperando(operando);
        
        String soma = "";
        for (Object Som : som.getOperando()){
            soma += (Som+"");
        }
        lbDisplay.setText("+");
        som.getOperado().add("+");
        
        String soma1 = "";
        for (Object Som : som.getOperado()){
            soma1 += (Som+"");
        }
        System.out.println(soma);
        System.out.println(soma1);
        System.out.println((soma) + (soma1));
        //ac();
    }//GEN-LAST:event_jButton_SomaActionPerformed

    public void apagar(){
        lbDisplay.setText(null);
    }
    
    public void ac(){
        operando = new ArrayList();
        apagar();
    }
        
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(appCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_0;
    private javax.swing.JButton jButton_1;
    private javax.swing.JButton jButton_2;
    private javax.swing.JButton jButton_3;
    private javax.swing.JButton jButton_4;
    private javax.swing.JButton jButton_5;
    private javax.swing.JButton jButton_6;
    private javax.swing.JButton jButton_7;
    private javax.swing.JButton jButton_8;
    private javax.swing.JButton jButton_9;
    private javax.swing.JButton jButton_AC;
    private javax.swing.JButton jButton_Divide;
    private javax.swing.JButton jButton_Igual;
    private javax.swing.JButton jButton_Multiplica;
    private javax.swing.JButton jButton_Soma;
    private javax.swing.JButton jButton_Subtrai;
    private javax.swing.JPanel jpTeclado;
    private javax.swing.JLabel lbCalculadora;
    private javax.swing.JTextField lbDisplay;
    // End of variables declaration//GEN-END:variables
}
