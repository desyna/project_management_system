/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import assets.TableActionCellEditor;
import assets.TableActionCellRender;
import assets.TableActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Connector;

/**
 *
 * @author LENOVO
 */
public class DataView extends javax.swing.JFrame {
private DefaultTableModel model;
//    Statement st;
//    ResultSet rs;
//    Connector koneksi;

    /**
     * Creates new form DataView
     */
    public DataView() {
//        koneksi = new Connector();
        initComponents();
//        Object header[] = {"NIM","Nama","Mata Kuliah","IP","Action"};
//        model = new DefaultTableModel(null,header);
//////        //digunakan untuk memberi heading / judul pada kolom di tabel buku
//        tabel_data.setModel(model); // "table_buku sesuaikan dengan variabel name"
//        model.addColumn("NIM");
//        model.addColumn("Nama");
//        model.addColumn("Mata_Kuliah");
//        model.addColumn("IPS");
//        model.addColumn("Action");
        
//        table = new JTable(model);
//        TableActionEvent event = new TableActionEvent() {
//            @Override
//            public void onEdit(int row) {
//                System.out.println("Edit row " + row);
//            }
//
//            @Override
//            public void onDelete(int row) {
//                if(tabel_data.isEditing()) {
//                    tabel_data.getCellEditor().stopCellEditing();
//                }
//                DefaultTableModel model1 = (DefaultTableModel)tabel_data.getModel();
//                model1.removeRow(row);
//            }
//        };
//        tabel_data.getColumnModel().getColumn(4).setCellRenderer(new TableActionCellRender());
//        tabel_data.getColumnModel().getColumn(4).setCellEditor(new TableActionCellEditor(event));
        
//        getData();
            dataMhs();
            dataAdmin();
    }
    
    private void dataMhs(){
        String sql = "SELECT * FROM mahasiswa";
        Object header[] = {"NIM","Nama","Mata Kuliah","IP","Action"};
        int head = header.length;
        model = new DefaultTableModel(null,header);
//////        //digunakan untuk memberi heading / judul pada kolom di tabel buku
        tabel_data.setModel(model);
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                System.out.println("Edit row " + row);
            }

            @Override
            public void onDelete(int row) {
                if(tabel_data.isEditing()) {
                    tabel_data.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model1 = (DefaultTableModel)tabel_data.getModel();
                model1.removeRow(row);
            }
        };
        tabel_data.getColumnModel().getColumn(4).setCellRenderer(new TableActionCellRender());
        tabel_data.getColumnModel().getColumn(4).setCellEditor(new TableActionCellEditor(event));
        
        getData(sql, head,1);
        
//        Object header[] = {"NIM","Nama","Mata Kuliah","IP","Action"};
//        DefaultTableModel data = new DefaultTableModel(null, header);
//        tabel_data.setModel(data);
//        
//        String query = "SELECT * FROM mahasiswa";
//        try {
//            st = koneksi.koneksi.createStatement();
//            rs = st.executeQuery(query);
//            while (rs.next()) {
//                String kolom1 = rs.getString(1);
//                String kolom2 = rs.getString(2);
//                String kolom3 = rs.getString(3);
//                String kolom4 = rs.getString(4);
//                String kolom5 = rs.getString(5);
//                
//                String kolom[] = {kolom1,kolom2,kolom3,kolom4,kolom5};
//                data.addRow(kolom);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null,"error :"+e.getMessage());
//        }
    }
    
    private void dataAdmin(){
        String sql = "SELECT nama, username, password FROM users";
        Object header[] = {"Nama","Username","Password", "Action"};
        int head = header.length;
        model = new DefaultTableModel(null,header);
//////        //digunakan untuk memberi heading / judul pada kolom di tabel buku
        tabel_admin.setModel(model);
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                System.out.println("Edit row " + row);
            }

            @Override
            public void onDelete(int row) {
                if(tabel_data.isEditing()) {
                    tabel_data.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model1 = (DefaultTableModel)tabel_data.getModel();
                model1.removeRow(row);
            }
        };  
        tabel_admin.getColumnModel().getColumn(3).setCellRenderer(new TableActionCellRender());
        tabel_admin.getColumnModel().getColumn(3).setCellEditor(new TableActionCellEditor(event));
        
        getData(sql, head,2);
    }
    
    public void getData(String sql, int head,int error){
//    
//    model.getDataVector( ).removeAllElements( );
//    model.fireTableDataChanged( );
//
    try{
        //membuat statemen untuk memanggil data table tabel_buku
        Connector connection = new Connector();   
        Statement stat = connection.koneksi.createStatement();
        String query = sql;
        ResultSet res = stat.executeQuery(query);
        
        
        //pengecekan terhadap data tabel_buku
//        Object[] obj = new Object[5];
        while(res.next()){
            String[] kolom = new String[head];
//             Object[] obj = new Object[5];
//             obj[0] = res.getString("NIM");
//             obj[1] = res.getString("Nama");
//             obj[2] = res.getString("Mata_Kuliah");
//             obj[2] = res.getString("IPS");
//             obj[4] = null;
//             obj[5] = res.getString("JUMLAH_BUKU");
//             obj[6] = res.getString("HARGA");
            for (int i = 1; i < head; i++) {
                kolom[i- 1] = res.getString(i);
            }
            
//            String kolom2 = res.getString(2);
//            String kolom3 = res.getString(3);
//            String kolom4 = res.getString(4);
//            
//            String kolom[] = {kolom1,kolom2,kolom3,kolom4};
            model.addRow(kolom);
        }
    }catch(SQLException err){
          JOptionPane.showMessageDialog(null, err.getMessage() );
    }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_data = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_admin = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabel_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Mata Kuliah", "IPS", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_data.setRowHeight(40);
        jScrollPane1.setViewportView(tabel_data);

        jTabbedPane1.addTab("Mahasiswa", jScrollPane1);

        tabel_admin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Username", "Password", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_admin.setRowHeight(40);
        jScrollPane2.setViewportView(tabel_admin);

        jTabbedPane1.addTab("Admin", jScrollPane2);

        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Tabel Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(336, 336, 336)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)))
                .addGap(63, 63, 63)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new MenuView().setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(DataView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabel_admin;
    private javax.swing.JTable tabel_data;
    // End of variables declaration//GEN-END:variables
}
