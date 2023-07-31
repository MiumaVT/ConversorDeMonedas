package conversordivisasnet;

import java.awt.Image;
import java.awt.Toolkit;

public class ConversorTemperaturas extends javax.swing.JFrame {
    
    double cantidad = 0;
    double conversion = 0;
    String de = "CELSIUS";
    String para = "FAHRENHEIT";

    public ConversorTemperaturas() {
        initComponents();
        this.setTitle("Conversor de Temperaturas");
        Image icono=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/mundo.png"));
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);
    }
    
    public String differentTemperature(double cantidad, String temperatura){
        return Math.round(cantidad*100)/100 + " " + temperatura;
    }
    
    public void convertir(){
        switch(de){
            case "CELSIUS":
                if(para.equals("FAHRENHEIT")){
                    conversion = (cantidad * 9/5) + 32;
                } else if (para.equals("KELVIN")){
                    conversion = (cantidad + 273.15);
                } else { // CELSIUS
                    conversion = cantidad;
                }
                break;
                
            case "FAHRENHEIT":
                if(para.equals("KELVIN")){
                conversion = (cantidad - 32) * 5/9 + 272.039;
            } else if (para.equals("CELSIUS")){
                conversion = (cantidad - 32) * 5/9;
            } else { // FAHRENHEIT
                conversion = cantidad;
            }
                break;
                
            case "KELVIN":
                if(para.equals("CELSIUS")){
                    conversion = (cantidad - 273.15);
                } else if (para.equals("FAHRENHEIT")){
                    conversion = (cantidad - 273.15) * 9/5 + 32;
                } else { // KELVIN
                    conversion = cantidad;
                }
        }
        resultField.setText(differentTemperature(conversion, para));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleMenuCt = new javax.swing.JLabel();
        secondTitleCt = new javax.swing.JLabel();
        temperature = new javax.swing.JLabel();
        fireLogo = new javax.swing.JLabel();
        temperatureField = new javax.swing.JTextField();
        from = new javax.swing.JLabel();
        fromTemperature = new javax.swing.JComboBox<>();
        to = new javax.swing.JLabel();
        toTemperature = new javax.swing.JComboBox<>();
        convertButton = new javax.swing.JButton();
        fireLogo2 = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        resultField = new javax.swing.JTextField();
        bgFireLink = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleMenuCt.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        titleMenuCt.setForeground(new java.awt.Color(255, 255, 255));
        titleMenuCt.setText("CONVERSOR");
        getContentPane().add(titleMenuCt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        secondTitleCt.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        secondTitleCt.setForeground(new java.awt.Color(255, 255, 255));
        secondTitleCt.setText("DE TEMPERATURAS");
        getContentPane().add(secondTitleCt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        temperature.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        temperature.setForeground(new java.awt.Color(255, 255, 255));
        temperature.setText("TEMPERATURA:");
        getContentPane().add(temperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, 30));

        fireLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MedallonFuego.png"))); // NOI18N
        getContentPane().add(fireLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, 70));

        temperatureField.setBackground(new java.awt.Color(204, 204, 204));
        temperatureField.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        temperatureField.setForeground(new java.awt.Color(0, 0, 0));
        temperatureField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        temperatureField.setToolTipText("");
        temperatureField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), java.awt.Color.lightGray, new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102)));
        temperatureField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        temperatureField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperatureFieldActionPerformed(evt);
            }
        });
        getContentPane().add(temperatureField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 310, 70));

        from.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        from.setForeground(new java.awt.Color(255, 255, 255));
        from.setText("DE:");
        getContentPane().add(from, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        fromTemperature.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        fromTemperature.setForeground(new java.awt.Color(255, 255, 255));
        fromTemperature.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CELSIUS", "FAHRENHEIT", "KELVIN" }));
        fromTemperature.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fromTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromTemperatureActionPerformed(evt);
            }
        });
        getContentPane().add(fromTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 380, 30));

        to.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        to.setForeground(new java.awt.Color(255, 255, 255));
        to.setText("PARA:");
        getContentPane().add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        toTemperature.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        toTemperature.setForeground(new java.awt.Color(255, 255, 255));
        toTemperature.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FAHRENHEIT", "KELVIN", "CELSIUS" }));
        toTemperature.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toTemperatureActionPerformed(evt);
            }
        });
        getContentPane().add(toTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 380, 30));

        convertButton.setBackground(new java.awt.Color(102, 153, 0));
        convertButton.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        convertButton.setForeground(new java.awt.Color(0, 0, 0));
        convertButton.setText("CONVERTIR");
        convertButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102)));
        convertButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });
        getContentPane().add(convertButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 200, 80));

        fireLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MedallonFuego.png"))); // NOI18N
        getContentPane().add(fireLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 630, -1, 70));

        resultLabel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        resultLabel.setForeground(new java.awt.Color(255, 255, 255));
        resultLabel.setText("RESULTADO:");
        getContentPane().add(resultLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 580, -1, -1));

        resultField.setBackground(new java.awt.Color(204, 204, 204));
        resultField.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        resultField.setForeground(new java.awt.Color(0, 0, 0));
        resultField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resultField.setToolTipText("");
        resultField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), java.awt.Color.lightGray, new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102)));
        resultField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        resultField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultFieldActionPerformed(evt);
            }
        });
        getContentPane().add(resultField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 630, 330, 70));

        bgFireLink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/analisis-del-templo-del-fuego-3.png"))); // NOI18N
        getContentPane().add(bgFireLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(-920, 0, 1400, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultFieldActionPerformed

    }//GEN-LAST:event_resultFieldActionPerformed

    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        cantidad = Double.parseDouble(temperatureField.getText());
        convertir();
    }//GEN-LAST:event_convertButtonActionPerformed

    private void temperatureFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temperatureFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temperatureFieldActionPerformed

    private void fromTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromTemperatureActionPerformed
        de = fromTemperature.getSelectedItem().toString();
    }//GEN-LAST:event_fromTemperatureActionPerformed

    private void toTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toTemperatureActionPerformed
        para = toTemperature.getSelectedItem().toString();
    }//GEN-LAST:event_toTemperatureActionPerformed

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
            java.util.logging.Logger.getLogger(ConversorTemperaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorTemperaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorTemperaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorTemperaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorTemperaturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgFireLink;
    private javax.swing.JButton convertButton;
    private javax.swing.JLabel fireLogo;
    private javax.swing.JLabel fireLogo2;
    private javax.swing.JLabel from;
    private javax.swing.JComboBox<String> fromTemperature;
    private javax.swing.JTextField resultField;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel secondTitleCt;
    private javax.swing.JLabel temperature;
    private javax.swing.JTextField temperatureField;
    private javax.swing.JLabel titleMenuCt;
    private javax.swing.JLabel to;
    private javax.swing.JComboBox<String> toTemperature;
    // End of variables declaration//GEN-END:variables
}
