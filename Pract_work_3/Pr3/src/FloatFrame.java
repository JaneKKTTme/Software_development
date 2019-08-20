/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class FloatFrame extends javax.swing.JDialog {

    /**
     * Creates new form Main
     */
    public FloatFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        outputField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        inputField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jTable2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Байт", "Б", "А", "Й", "Т", "№", "3", null, null, "Б", "А", "Й", "Т", "№", "2", null, null, "Б", "А", "Й", "Т", "№", "1", null, null, "Б", "А", "Й", "Т", "№", "1", null, null},
                {"№ бита", "31", "30", "29", "28", "27", "26", "25", "24", "23", "22", "21", "20", "19", "18", "17", "16", "15", "14", "13", "12", "11", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1", "0"},
                {"Вес бита", "256", "128", "64", "32", "16", "8", "4", "2", "1", "0.5", "0.25", "0.125", "0.0625", "0.03125", "0.015625", "0.0078125", "0.00390625", "0.001953125", "0.0009765625", "0.00048828125", "0.00024414062", "0.00012207031", "0.00006103515", "0.00003051757", "0.00001525878", "0.00000762939", "0.00000381469", "0.00000190734", "0.0000009537", "0.0000004768", "0.0000002384", "0.0000001192"},
                {"Бит", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "  ", "Зн.", "Х", "А", "Р", "А", "К", "Т", "Е", "Р.", "М", "А", "Н", "Т", "И", "С", "С", "А", "  ", "  ", "  ", "  ", "  ", "  ", "  ", " ", "  ", " ", "  ", "  ", "  ", "  ", "  "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Обратный перевод числа");

        outputField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        outputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputFieldActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Число");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        inputField.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1499, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(outputField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(inputField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void outputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputFieldActionPerformed

    public String intToBinary(int x){    
        int b;  
        String tmp = ""; 
        while(x != 0){  
            b = x % 2;  
            tmp = b + tmp;  
            x = x / 2;  
        } 
        return tmp;  
    }
    
    public String floatToBinary(float x) {
        String tmp = "";
        while (x != 0.0) {
            x = x * 2;
            tmp += Integer.toString((int)x);
            x = x - (int)x;
        }
        return tmp;
    }
    
    public void toSinglePrecision() {
        float input = Float.parseFloat(inputField.getText());
        
        if (Math.abs(input) == input)
            jTable2.getModel().setValueAt("0", 3, 1);
        else {
            jTable2.getModel().setValueAt("1", 3, 1);
            input *= (-1);
        }
        
        int first = (int)input;
        String tmp = "";
        if (first != 0) {
            tmp = tmp + intToBinary(first) + '.';
        }
        else {
            tmp += "0.";
        }
        input = input - first;
        if (input != 0.0) {
            tmp += floatToBinary(input);
        }
        else {
            tmp += "0";
        }

        int bias = 0;
        if (tmp.indexOf('.') < tmp.indexOf('1'))
            bias = tmp.indexOf('.') - tmp.indexOf('1');
        else
            bias = tmp.indexOf('.') - tmp.indexOf('1');
        bias += 127;
        
        String exponent = intToBinary(bias);
        char[] mant = exponent.toCharArray();
        if (exponent.length() >= 9)
            for (int i = 0; i < 9; i++) {
                jTable2.setValueAt(mant[i], 3, i+1);
            }
        else {
            for (int i = 0; i < 9-exponent.length(); i++) {
                jTable2.setValueAt("0", 3, i+1);
            }
            for (int i = 9-exponent.length(); i < 9; i++) {
                jTable2.setValueAt(mant[i-9+exponent.length()], 3, i+1);
            }
        }
        System.out.println(tmp);
        int k = 0;
        if (bias-127 < 0) 
            tmp = tmp.substring(tmp.indexOf('1')+1);
        else
            tmp = tmp.substring(tmp.indexOf('1')+1, tmp.indexOf('.')) + tmp.substring(tmp.indexOf('.')+1);
        mant = tmp.toCharArray();
        System.out.println(tmp);
        if (tmp.length() >= 23)
            for (int i = 0; i < 23; i++) {
                jTable2.setValueAt(mant[i], 3, i+10);
            }
        else {
            for (int i = 0; i < tmp.length(); i++) {
                jTable2.setValueAt(mant[i], 3, i+10);
            }
            for (int i = tmp.length(); i < 23; i++) {
                jTable2.setValueAt("0", 3, i+10);
            }
        }
    }
    
    public void toNormalForm() {
        float output = 0;
        
        int bias = 0;
        int pow = 128;
        for (int i = 0; i < 9; i++) {
            Object tmp1 = jTable2.getValueAt(3, i+2);
            String number = String.valueOf(tmp1);
            bias += Integer.parseInt(number) * pow;
            pow /= 2;
        }
        bias = bias - 127;
        
        String mantissa = "";
        if (bias < 0) {
            for (int i = 0; i < Math.abs(bias)-1; i++) {
                mantissa += '0';
            }
            mantissa += '1';
            for (int i = 9; i < 23-Math.abs(bias)-1; i++) {
                Object tmp1 = jTable2.getValueAt(3, i+1);
                mantissa += String.valueOf(tmp1);
            }
            char[] tmp_arr = mantissa.toCharArray();
            for (int i = 0; i < mantissa.length(); i++) {
                Object tmp_o = jTable2.getValueAt(2, i+10);
                String tmp_s = String.valueOf(tmp_o);
                output += Character.getNumericValue(tmp_arr[i])*Float.parseFloat(tmp_s);
            }
        }
        else {
            mantissa += '1';
            for (int i = 0; i < bias-1; i++) {
                Object tmp_o = jTable2.getValueAt(3, i+10);
                String tmp_s = String.valueOf(tmp_o);
                mantissa += tmp_s;
            }
            int pow_i = 1;
            char[] tmp_arr = mantissa.toCharArray();
            for (int i = mantissa.length()-1; i >= 0; i--) {
                output += pow_i*Character.getNumericValue(tmp_arr[i]);
                pow_i *= 2;
            }
            
            mantissa = "";
            for (int i = bias-1; i < 23; i++) {
                Object tmp1 = jTable2.getValueAt(3, i+10);
                mantissa += String.valueOf(tmp1);
            }
            tmp_arr = mantissa.toCharArray();
            for (int i = 0; i < mantissa.length(); i++) {
                Object tmp_o = jTable2.getValueAt(2, i+10);
                String tmp_s = String.valueOf(tmp_o);
                output += Character.getNumericValue(tmp_arr[i])*Float.parseFloat(tmp_s);
                System.out.println(output);
            }   
        }    
        
        Object o_sign = jTable2.getValueAt(3, 1);
        String s_sign = String.valueOf(o_sign);
        if (s_sign == "0") 
            output *= 1;
        else
            output *= (-1);
        outputField.setText(Float.toString(output));
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        toSinglePrecision();
        toNormalForm();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FloatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FloatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FloatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FloatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FloatFrame dialog = new FloatFrame();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField outputField;
    // End of variables declaration//GEN-END:variables
}