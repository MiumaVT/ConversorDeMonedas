package conversordivisasnet;

import java.awt.Image;
import java.awt.Toolkit;

public class ConversorDivisas extends javax.swing.JFrame {
    //Variables para la logica//
    double cantidad = 0;
    double conversion = 0;
    String de = "MXN";
    String para = "USD";
    
    public ConversorDivisas() {
        initComponents();
        //Colocar titulo en ventana//
        this.setTitle("Conversor de Divisas");
        //Usar imagen en codigo Java//
        Image icono=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/mundo.png"));
        this.setIconImage(icono);
        //Para que la ventana salga en medio de la pantalla//
        this.setLocationRelativeTo(null);
    }
    
    
    public String paraMoneda(double cantidad, String moneda){
        return "$ " + Math.round(cantidad*100.0)/100.0 + " " + moneda;
    }
    
    public void convertir(){
        switch(de){
            case "MXN":
                if(para.equals("USD")){
                    conversion = cantidad * 0.058;
                } else if (para.equals("EUR")){
                    conversion = cantidad * 0.053;
                } else if (para.equals("GBP")){
                    conversion = cantidad * 0.045;
                } else if (para.equals("YEN")){
                    conversion = cantidad * 8.35;
                } else if (para.equals("KRW")){
                    conversion = cantidad * 75.98;
                } else { //MXN
                    conversion = cantidad;
                }
                break;
                
                case "USD":
                if(para.equals("EUR")){
                    conversion = cantidad * 0.92;
                } else if (para.equals("GBP")){
                    conversion = cantidad * 0.78;
                } else if (para.equals("YEN")){
                    conversion = cantidad * 144.16;
                } else if (para.equals("KRW")){
                    conversion = cantidad * 1311.04;
                } else if (para.equals("MXN")){
                    conversion = cantidad * 17.25;
                } else { //USD
                    conversion = cantidad;
                }
                break;
                
                case "EUR":
                if(para.equals("GBP")){
                    conversion = cantidad * 0.85;
                } else if (para.equals("YEN")){
                    conversion = cantidad * 156.86;
                } else if (para.equals("KRW")){
                    conversion = cantidad * 1426.67;
                } else if (para.equals("MXN")){
                    conversion = cantidad * 18.77;
                } else if (para.equals("USD")){
                    conversion = cantidad * 1.09;
                } else { //EUR
                    conversion = cantidad;
                }
                break;
                
                case "GBP":
                if(para.equals("YEN")){
                    conversion = cantidad * 183.64;
                } else if (para.equals("KRW")){
                    conversion = cantidad * 1670.46;
                } else if (para.equals("MXN")){
                    conversion = cantidad * 21.98;
                } else if (para.equals("USD")){
                    conversion = cantidad * 1.27;
                } else if (para.equals("EUR")){
                    conversion = cantidad * 1.17;
                } else { //GBP
                    conversion = cantidad;
                }
                break;
                
                case "YEN":
                if(para.equals("KRW")){
                    conversion = cantidad * 9.10;
                } else if (para.equals("MXN")){
                    conversion = cantidad * 0.12;
                } else if (para.equals("USD")){
                    conversion = cantidad * 0.0069;
                } else if (para.equals("EUR")){
                    conversion = cantidad * 0.0064;
                } else if (para.equals("GBP")){
                    conversion = cantidad * 0.0054;
                } else { //YEN
                    conversion = cantidad;
                }
                break;
                
                case "KRW":
                if(para.equals("MXN")){
                    conversion = cantidad * 0.013;
                } else if (para.equals("USD")){
                    conversion = cantidad * 0.00076;
                } else if (para.equals("EUR")){
                    conversion = cantidad * 0.00070;
                } else if (para.equals("GBP")){
                    conversion = cantidad * 0.00060;
                } else if (para.equals("YEN")){
                    conversion = cantidad * 0.11;
                } else { //KRW
                    conversion = cantidad;
                }
                break;
        }
        ResultField.setText(paraMoneda(conversion,para));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TitleConv = new javax.swing.JLabel();
        SubTitleMon = new javax.swing.JLabel();
        Rupia = new javax.swing.JLabel();
        MoneyField = new javax.swing.JTextField();
        From = new javax.swing.JLabel();
        DivisasFrom = new javax.swing.JComboBox<>();
        SwitchBotton = new javax.swing.JButton();
        To = new javax.swing.JLabel();
        DivisasTo = new javax.swing.JComboBox<>();
        ConvertBotton = new javax.swing.JButton();
        Result = new javax.swing.JLabel();
        Rupia2 = new javax.swing.JLabel();
        ResultField = new javax.swing.JTextField();
        BackgroundZelda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleConv.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        TitleConv.setForeground(new java.awt.Color(0, 0, 0));
        TitleConv.setText("CONVERSOR");
        jPanel1.add(TitleConv, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 290, 70));

        SubTitleMon.setBackground(new java.awt.Color(0, 0, 0));
        SubTitleMon.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        SubTitleMon.setForeground(new java.awt.Color(0, 0, 0));
        SubTitleMon.setText("MONTO:");
        jPanel1.add(SubTitleMon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, 40));

        Rupia.setBackground(new java.awt.Color(255, 255, 255));
        Rupia.setForeground(new java.awt.Color(255, 255, 255));
        Rupia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RupiaZelda.png"))); // NOI18N
        Rupia.setToolTipText("");
        jPanel1.add(Rupia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 40, 70));

        MoneyField.setBackground(new java.awt.Color(255, 255, 255));
        MoneyField.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        MoneyField.setForeground(new java.awt.Color(0, 0, 0));
        MoneyField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MoneyField.setToolTipText("");
        MoneyField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), java.awt.Color.lightGray, new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102)));
        MoneyField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        MoneyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoneyFieldActionPerformed(evt);
            }
        });
        jPanel1.add(MoneyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 310, 70));

        From.setBackground(new java.awt.Color(0, 0, 0));
        From.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        From.setForeground(new java.awt.Color(0, 0, 0));
        From.setText("DE:");
        jPanel1.add(From, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 40, -1));

        DivisasFrom.setBackground(new java.awt.Color(51, 51, 51));
        DivisasFrom.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        DivisasFrom.setForeground(new java.awt.Color(255, 255, 255));
        DivisasFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MXN", "USD", "EUR", "GBP", "YEN", "KRW" }));
        DivisasFrom.setToolTipText("");
        DivisasFrom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DivisasFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisasFromActionPerformed(evt);
            }
        });
        jPanel1.add(DivisasFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 370, 30));

        SwitchBotton.setBackground(new java.awt.Color(51, 51, 51));
        SwitchBotton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SwitchBotton.setForeground(new java.awt.Color(255, 255, 255));
        SwitchBotton.setText("🡫 🡩");
        SwitchBotton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102)));
        SwitchBotton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SwitchBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SwitchBottonActionPerformed(evt);
            }
        });
        jPanel1.add(SwitchBotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 60, 50));

        To.setBackground(new java.awt.Color(0, 0, 0));
        To.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        To.setForeground(new java.awt.Color(0, 0, 0));
        To.setText("PARA:");
        jPanel1.add(To, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 70, -1));

        DivisasTo.setBackground(new java.awt.Color(51, 51, 51));
        DivisasTo.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        DivisasTo.setForeground(new java.awt.Color(255, 255, 255));
        DivisasTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "GBP", "YEN", "KRW", "MXN" }));
        DivisasTo.setToolTipText("");
        DivisasTo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DivisasTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisasToActionPerformed(evt);
            }
        });
        jPanel1.add(DivisasTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 370, 30));

        ConvertBotton.setBackground(new java.awt.Color(102, 153, 0));
        ConvertBotton.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        ConvertBotton.setForeground(new java.awt.Color(0, 0, 0));
        ConvertBotton.setText("CONVERTIR");
        ConvertBotton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102)));
        ConvertBotton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConvertBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertBottonActionPerformed(evt);
            }
        });
        jPanel1.add(ConvertBotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 200, 80));

        Result.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Result.setForeground(new java.awt.Color(0, 0, 0));
        Result.setText("RESULTADO:");
        Result.setToolTipText("");
        jPanel1.add(Result, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 570, 150, -1));

        Rupia2.setBackground(new java.awt.Color(255, 255, 255));
        Rupia2.setForeground(new java.awt.Color(255, 255, 255));
        Rupia2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RupiaZelda.png"))); // NOI18N
        Rupia2.setToolTipText("");
        jPanel1.add(Rupia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, 40, 70));

        ResultField.setBackground(new java.awt.Color(255, 255, 255));
        ResultField.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        ResultField.setForeground(new java.awt.Color(0, 0, 0));
        ResultField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ResultField.setToolTipText("");
        ResultField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), java.awt.Color.lightGray, new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102)));
        ResultField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ResultField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultFieldActionPerformed(evt);
            }
        });
        jPanel1.add(ResultField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, 310, 70));

        BackgroundZelda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ZeldaWallpaper.jpg"))); // NOI18N
        BackgroundZelda.setText("jLabel1");
        jPanel1.add(BackgroundZelda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MoneyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoneyFieldActionPerformed
        
    }//GEN-LAST:event_MoneyFieldActionPerformed

    private void SwitchBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SwitchBottonActionPerformed
        
    }//GEN-LAST:event_SwitchBottonActionPerformed

    private void ConvertBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertBottonActionPerformed
        cantidad = Double.parseDouble(MoneyField.getText());
        convertir();
    }//GEN-LAST:event_ConvertBottonActionPerformed

    private void DivisasToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisasToActionPerformed
        para = DivisasTo.getSelectedItem().toString();
    }//GEN-LAST:event_DivisasToActionPerformed

    private void ResultFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultFieldActionPerformed
       
    }//GEN-LAST:event_ResultFieldActionPerformed

    private void DivisasFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisasFromActionPerformed
        de = DivisasFrom.getSelectedItem().toString();
    }//GEN-LAST:event_DivisasFromActionPerformed

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
            java.util.logging.Logger.getLogger(ConversorDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorDivisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundZelda;
    private javax.swing.JButton ConvertBotton;
    private javax.swing.JComboBox<String> DivisasFrom;
    private javax.swing.JComboBox<String> DivisasTo;
    private javax.swing.JLabel From;
    private javax.swing.JTextField MoneyField;
    private javax.swing.JLabel Result;
    private javax.swing.JTextField ResultField;
    private javax.swing.JLabel Rupia;
    private javax.swing.JLabel Rupia2;
    private javax.swing.JLabel SubTitleMon;
    private javax.swing.JButton SwitchBotton;
    private javax.swing.JLabel TitleConv;
    private javax.swing.JLabel To;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
