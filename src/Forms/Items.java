/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import java.awt.Color;
import java.awt.List;
import java.security.CodeSigner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phong
 */
public class Items extends javax.swing.JFrame {

    /**
     * Creates new form Items
     */
    ArrayList<ItemInfor> list = new ArrayList<ItemInfor>();

    //Khởi tạo giá trị mặc định
    public Items() {
        initComponents();
        list.add(new ItemInfor("111", "Iphone 15 Promax", 1500, "Good,Lastest", "High", "5★"));
        list.add(new ItemInfor("111", "Iphone 14 Promax", 1000, "Good", "High", "4.5★"));
        list.add(new ItemInfor("111", "Iphone 13 Promax", 600, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 12 Promax", 400, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 15 Promax", 1500, "Good,Lastest", "High", "5★"));
        list.add(new ItemInfor("111", "Iphone 14 Promax", 1000, "Good", "High", "4.5★"));
        list.add(new ItemInfor("111", "Iphone 13 Promax", 600, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 12 Promax", 400, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 15 Promax", 1500, "Good,Lastest", "High", "5★"));
        list.add(new ItemInfor("111", "Iphone 14 Promax", 1000, "Good", "High", "4.5★"));
        list.add(new ItemInfor("111", "Iphone 13 Promax", 600, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 12 Promax", 400, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 15 Promax", 1500, "Good,Lastest", "High", "5★"));
        list.add(new ItemInfor("111", "Iphone 14 Promax", 1000, "Good", "High", "4.5★"));
        list.add(new ItemInfor("111", "Iphone 13 Promax", 600, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 12 Promax", 400, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 15 Promax", 1500, "Good,Lastest", "High", "5★"));
        list.add(new ItemInfor("111", "Iphone 14 Promax", 1000, "Good", "High", "4.5★"));
        list.add(new ItemInfor("111", "Iphone 13 Promax", 600, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 12 Promax", 400, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 15 Promax", 1500, "Good,Lastest", "High", "5★"));
        list.add(new ItemInfor("111", "Iphone 14 Promax", 1000, "Good", "High", "4.5★"));
        list.add(new ItemInfor("111", "Iphone 13 Promax", 600, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 12 Promax", 400, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 15 Promax", 1500, "Good,Lastest", "High", "5★"));
        list.add(new ItemInfor("111", "Iphone 14 Promax", 1000, "Good", "High", "4.5★"));
        list.add(new ItemInfor("111", "Iphone 13 Promax", 600, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 12 Promax", 400, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 15 Promax", 1500, "Good,Lastest", "High", "5★"));
        list.add(new ItemInfor("111", "Iphone 14 Promax", 1000, "Good", "High", "4.5★"));
        list.add(new ItemInfor("111", "Iphone 13 Promax", 600, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 12 Promax", 400, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 15 Promax", 1500, "Good,Lastest", "High", "5★"));
        list.add(new ItemInfor("111", "Iphone 14 Promax", 1000, "Good", "High", "4.5★"));
        list.add(new ItemInfor("111", "Iphone 13 Promax", 600, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 12 Promax", 400, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 15 Promax", 1500, "Good,Lastest", "High", "5★"));
        list.add(new ItemInfor("111", "Iphone 14 Promax", 1000, "Good", "High", "4.5★"));
        list.add(new ItemInfor("111", "Iphone 13 Promax", 600, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 12 Promax", 400, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 15 Promax", 1500, "Good,Lastest", "High", "5★"));
        list.add(new ItemInfor("111", "Iphone 14 Promax", 1000, "Good", "High", "4.5★"));
        list.add(new ItemInfor("111", "Iphone 13 Promax", 600, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 12 Promax", 400, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 15 Promax", 1500, "Good,Lastest", "High", "5★"));
        list.add(new ItemInfor("111", "Iphone 14 Promax", 1000, "Good", "High", "4.5★"));
        list.add(new ItemInfor("111", "Iphone 13 Promax", 600, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 12 Promax", 400, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 15 Promax", 1500, "Good,Lastest", "High", "5★"));
        list.add(new ItemInfor("111", "Iphone 14 Promax", 1000, "Good", "High", "4.5★"));
        list.add(new ItemInfor("111", "Iphone 13 Promax", 600, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 12 Promax", 400, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 15 Promax", 1500, "Good,Lastest", "High", "5★"));
        list.add(new ItemInfor("111", "Iphone 14 Promax", 1000, "Good", "High", "4.5★"));
        list.add(new ItemInfor("111", "Iphone 13 Promax", 600, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 12 Promax", 400, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 15 Promax", 1500, "Good,Lastest", "High", "5★"));
        list.add(new ItemInfor("111", "Iphone 14 Promax", 1000, "Good", "High", "4.5★"));
        list.add(new ItemInfor("111", "Iphone 13 Promax", 600, "Good", "High", "4★"));
        list.add(new ItemInfor("111", "Iphone 12 Promax", 400, "Good", "High", "4★"));

        viewList();
    }

    // Lấy giá trị mặc định cho bảng 
    public void viewList() {
        DefaultTableModel model = (DefaultTableModel) this.T_items.getModel();
        model.setNumRows(0);
        int n = 1;
        for (ItemInfor x : list) {
            model.addRow(new Object[]{n++, x.getId(), x.getName(), x.getPrice(), x.getDescription(), x.getQuality(), x.getEvaluate()});
        }
    }
// sap xep ggiam dan theo gia 
    public void sortA() {
        Collections.sort(list, new Comparator<ItemInfor>() {
            @Override
            public int compare(ItemInfor o1, ItemInfor o2) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
            }
        });
        viewList();
    }
// Sap xep tang dan theo  gia
    public void sortD() {
        sortA();
        Collections.reverse(list);
        viewList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        T_items = new javax.swing.JTable();
        b_exit = new javax.swing.JButton();
        b_exit1 = new javax.swing.JButton();
        sortB = new javax.swing.JButton();
        sortA1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(null);

        T_items.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "ID", "Name", "Price", "Description", "Quality", "Evaluate", "Choice"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(T_items);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 820, 700);

        b_exit.setBackground(new java.awt.Color(153, 255, 255));
        b_exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        b_exit.setText("Order");
        b_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exitActionPerformed(evt);
            }
        });
        getContentPane().add(b_exit);
        b_exit.setBounds(840, 30, 130, 70);

        b_exit1.setBackground(new java.awt.Color(255, 0, 51));
        b_exit1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        b_exit1.setText("Exit");
        b_exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exit1ActionPerformed(evt);
            }
        });
        getContentPane().add(b_exit1);
        b_exit1.setBounds(840, 290, 130, 70);

        sortB.setBackground(new java.awt.Color(153, 255, 255));
        sortB.setText("SortDescending");
        sortB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortBActionPerformed(evt);
            }
        });
        getContentPane().add(sortB);
        sortB.setBounds(840, 200, 130, 50);

        sortA1.setBackground(new java.awt.Color(153, 255, 255));
        sortA1.setText("SortAscending");
        sortA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortA1ActionPerformed(evt);
            }
        });
        getContentPane().add(sortA1);
        sortA1.setBounds(840, 130, 130, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exitActionPerformed
        Order o = new Order();
        o.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_b_exitActionPerformed

    private void b_exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exit1ActionPerformed
        MainForm mf = new MainForm();
        mf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b_exit1ActionPerformed

// Dat ten bi sai kho hieu
    private void sortBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortBActionPerformed
        sortA();
    }//GEN-LAST:event_sortBActionPerformed

    private void sortA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortA1ActionPerformed
       sortD(); 
    }//GEN-LAST:event_sortA1ActionPerformed

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
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>;

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable T_items;
    private javax.swing.JButton b_exit;
    private javax.swing.JButton b_exit1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton sortA1;
    private javax.swing.JButton sortB;
    // End of variables declaration//GEN-END:variables
}
