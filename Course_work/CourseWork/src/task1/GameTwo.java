/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author Dell
 */
public class GameTwo extends javax.swing.JFrame {

    /**
     * Creates new form GameTwo
     */
    public GameTwo() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Game = new javax.swing.JTable();
        Shake = new javax.swing.JButton();

        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Кликом мыши выбирается клетка с цифрой, которая может \nпереместиться только в свободное поле. Цифры в клетках можно \nперемешать нажатием на соответствующую клавишу. Когда \nвосстановлен прядок цифр, вы победили.");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jTabbedPane1.addTab("Помощь", jPanel1);

        Game.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Game.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1),  new Integer(2),  new Integer(3),  new Integer(4)},
                { new Integer(5),  new Integer(6),  new Integer(7),  new Integer(8)},
                { new Integer(9),  new Integer(10),  new Integer(11),  new Integer(12)},
                { new Integer(13),  new Integer(14),  new Integer(15), null}
            },
            new String [] {
                "", "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Game.setRowHeight(100);
        Game.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GameMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Game);

        Shake.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Shake.setText("Перемешать");
        Shake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShakeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(Shake)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Shake)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Пятнашки", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static final java.util.Random gen = new java.util.Random(); 
    
    public static int[] printRandomNumbers(int n, int maxRange) {  
        assert n <= maxRange : "cannot get more unique numbers than the size of the range";  
      
        int[] result = new int[n];  
        java.util.Set<Integer> used = new java.util.HashSet<Integer>();  
      
        for (int i = 0; i < n; i++) {  
          
            int newRandom;  
            do {  
                newRandom = gen.nextInt(maxRange+1);  
            } while (used.contains(newRandom));  
            result[i] = newRandom;  
            used.add(newRandom);  
    }  
    return result;  
}
    
    private void ShakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShakeActionPerformed
        int[] arr = new int[16];
        arr = printRandomNumbers(16, 15);
        int k = 0;
        for (int i = 0; i < 4 && k < 16; i++)
            for (int j = 0; j < 4 && k < 16; j++)
                if ((j != 3 || i != 3) && arr[k] != 0) {
                    Game.setValueAt( arr[k], i, j);
                    k++;
                }
                else if (arr[k] == 0) {
                    k++;
                    Game.setValueAt( arr[k], i, j);
                    k++;
                }
        Game.setValueAt( null, 3, 3);
    }//GEN-LAST:event_ShakeActionPerformed

    public int ip = 3;//col
    public int jp = 3;//row
    public Integer vp = null;
    
    private void onClick(int i, int j, Integer v) {
        if (v == null) {
            if ((Math.abs(j-jp) == 1 && Math.abs(i-ip) == 0) 
                    || Math.abs(j-jp) == 0 && Math.abs(i-ip) == 1) {
                Game.setValueAt(vp, j, i);
                Game.setValueAt(null, jp, ip);
                System.out.println(v + " " + j + " " + i);
                System.out.println(vp + " " + jp + " " + ip);
            }
        }
        if ((Integer)Game.getValueAt(0, 0) == 1 && (Integer)Game.getValueAt(0, 1) == 2
                && (Integer)Game.getValueAt(0, 2) == 3 && (Integer)Game.getValueAt(0, 3) == 4
                        && (Integer)Game.getValueAt(1, 0) == 5 && (Integer)Game.getValueAt(1, 1) == 6
                        && (Integer)Game.getValueAt(1, 2) == 7 && (Integer)Game.getValueAt(1, 3) == 8
                        && (Integer)Game.getValueAt(2, 0) == 9 && (Integer)Game.getValueAt(2, 1) == 10
                        && (Integer)Game.getValueAt(2, 2) == 11 && (Integer)Game.getValueAt(2, 3) == 12
                        && (Integer)Game.getValueAt(3, 0) == 13 && (Integer)Game.getValueAt(3, 1) == 14
                        && (Integer)Game.getValueAt(3, 2) == 15 && (Integer)Game.getValueAt(3, 3) == null) {
            WinFrame newWindow = new WinFrame();
            newWindow.setVisible(true);
        }
        ip = i;
        jp = j;
        vp = (Integer)Game.getValueAt(j, i);
    }
    
    private void GameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GameMouseClicked
        onClick(Game.columnAtPoint(evt.getPoint()), Game.rowAtPoint(evt.getPoint()), 
                (Integer)Game.getValueAt(Game.rowAtPoint(evt.getPoint()), 
                        Game.columnAtPoint(evt.getPoint())));
        //System.out.println((Integer)Game.getValueAt(3, 3));
    }//GEN-LAST:event_GameMouseClicked

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
            java.util.logging.Logger.getLogger(GameTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameTwo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Game;
    private javax.swing.JButton Shake;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
