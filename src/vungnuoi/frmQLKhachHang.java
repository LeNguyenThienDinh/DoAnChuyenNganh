/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vungnuoi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

/**
 *
 * @author admin
 */
public class frmQLKhachHang extends javax.swing.JFrame {

    /**
     * Creates new form frmQLKhachHang
     */
    
    public frmQLKhachHang() {
        initComponents();
        loadCustomerData();
        this.pack();
    }
    private void loadCustomerData() 
    {
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        DefaultTableModel model = new DefaultTableModel();

        try {

            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String dbUser = "C##VUNGNUOI";
            String dbPassword = "vungnuoi";
            connection = DriverManager.getConnection(url, dbUser, dbPassword);

            String sql = "SELECT u.USERNAME, u.MaKH, k.TENKH, k.DIACHI, k.SODIENTHOAI "
                       + "FROM USERS u "
                       + "JOIN KhachHang k ON u.MaKH = k.MaKH";
            stmt = connection.createStatement();
            rs = stmt.executeQuery(sql);

            model.setColumnIdentifiers(new String[]{"Username", "Mã KH", "Tên KH", "Địa chỉ", "Số điện thoại"});

            while (rs.next()) {
                Object[] row = new Object[5];
                row[0] = rs.getString("USERNAME");
                row[1] = rs.getString("MaKH");
                row[2] = rs.getString("TENKH");
                row[3] = rs.getString("DIACHI");
                row[4] = rs.getString("SODIENTHOAI");
                model.addRow(row);
            }

            table_thongtinKH.setModel(model);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu khách hàng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_thongtinKH = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btn_DkyTaiKhoan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_khachhang = new javax.swing.JTable();
        btn_XoaTaikhoan = new javax.swing.JButton();
        btn_ChinhSuaTaiKhoan = new javax.swing.JButton();
        btn_DangXuat = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("QUẢN LÝ KHÁCH HÀNG");

        table_thongtinKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table_thongtinKH);

        jLabel2.setText("Thông tin khách hàng");

        btn_DkyTaiKhoan.setText("Tạo tài khoản khách hàng");
        btn_DkyTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DkyTaiKhoanActionPerformed(evt);
            }
        });

        table_khachhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(table_khachhang);

        btn_XoaTaikhoan.setText("Xóa tài khoản");
        btn_XoaTaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaTaikhoanActionPerformed(evt);
            }
        });

        btn_ChinhSuaTaiKhoan.setText("Chỉnh sửa tài khoản");
        btn_ChinhSuaTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChinhSuaTaiKhoanActionPerformed(evt);
            }
        });

        btn_DangXuat.setText("Đăng xuất");
        btn_DangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangXuatActionPerformed(evt);
            }
        });

        jButton1.setText("Theo dõi chi phí");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_DangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_DkyTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_ChinhSuaTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_XoaTaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_DkyTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ChinhSuaTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_XoaTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_DangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DkyTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DkyTaiKhoanActionPerformed
        this.dispose();
        frmDangKyNguoiDung dangKyFrame = new frmDangKyNguoiDung();
        dangKyFrame.setVisible(true);
    }//GEN-LAST:event_btn_DkyTaiKhoanActionPerformed

    private void btn_DangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangXuatActionPerformed
        this.dispose();
        frmDangNhap dangNhapFrame = new frmDangNhap();
        dangNhapFrame.setVisible(true);
    }//GEN-LAST:event_btn_DangXuatActionPerformed

    private void btn_ChinhSuaTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChinhSuaTaiKhoanActionPerformed

        int selectedRow = table_thongtinKH.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một khách hàng để chỉnh sửa.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String username = table_thongtinKH.getValueAt(selectedRow, 0).toString();
        String tenKhachHang = table_thongtinKH.getValueAt(selectedRow, 2).toString();
        String diaChi = table_thongtinKH.getValueAt(selectedRow, 3).toString();
        String sdt = table_thongtinKH.getValueAt(selectedRow, 4).toString();
        this.dispose();
        frmChinhSuaTaiKhoan chinhSuaFrame = new frmChinhSuaTaiKhoan(username, tenKhachHang, diaChi, sdt);
        chinhSuaFrame.setVisible(true);
    }//GEN-LAST:event_btn_ChinhSuaTaiKhoanActionPerformed

    private void btn_XoaTaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaTaikhoanActionPerformed
        int selectedRow = table_thongtinKH.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một khách hàng để xóa.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String maKH = table_thongtinKH.getValueAt(selectedRow, 1).toString();

        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa khách hàng có mã: " + maKH + "?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            Connection connection = null;
            Statement stmt = null;
            try {
                String url = "jdbc:oracle:thin:@localhost:1521:xe";
                String dbUser = "C##VUNGNUOI";
                String dbPassword = "vungnuoi";
                connection = DriverManager.getConnection(url, dbUser, dbPassword);

                String sql = "DELETE FROM KhachHang WHERE MaKH = '" + maKH + "'";
                stmt = connection.createStatement();
                int rowsAffected = stmt.executeUpdate(sql);

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Xóa khách hàng thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    loadCustomerData();  
                } else {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy khách hàng để xóa.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                }

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi khi xóa khách hàng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (stmt != null) stmt.close();
                    if (connection != null) connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_btn_XoaTaikhoanActionPerformed

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
            java.util.logging.Logger.getLogger(frmQLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmQLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmQLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmQLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmQLKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ChinhSuaTaiKhoan;
    private javax.swing.JButton btn_DangXuat;
    private javax.swing.JButton btn_DkyTaiKhoan;
    private javax.swing.JButton btn_XoaTaikhoan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_khachhang;
    private javax.swing.JTable table_thongtinKH;
    // End of variables declaration//GEN-END:variables
}
