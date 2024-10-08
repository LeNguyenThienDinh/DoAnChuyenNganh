/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vungnuoi;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class frmDangKyNguoiDung extends javax.swing.JFrame {

    /**
     * Creates new form frmDangKyNguoiDung
     */
    public frmDangKyNguoiDung() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DKY_TaiKhoan = new javax.swing.JTextField();
        DKY_MatKhau = new javax.swing.JTextField();
        btn_DangKy = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_TenKhachHang = new javax.swing.JTextField();
        txt_DiaChi = new javax.swing.JTextField();
        txt_SoDienThoai = new javax.swing.JTextField();
        btn_return = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ĐĂNG KÝ KHÁCH HÀNG");

        jLabel2.setText("Tài Khoản đăng nhập");

        jLabel3.setText("Mật khẩu đăng nhập");

        btn_DangKy.setText("Đăng ký");
        btn_DangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangKyActionPerformed(evt);
            }
        });

        jLabel4.setText("Tên khách hàng");

        jLabel5.setText("Địa chỉ");

        jLabel6.setText("Số điện thoại");

        btn_return.setText("Trở về");
        btn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_DangKy)
                                .addComponent(jLabel3)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DKY_TaiKhoan)
                            .addComponent(DKY_MatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(txt_TenKhachHang)
                            .addComponent(txt_DiaChi)
                            .addComponent(txt_SoDienThoai)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(btn_return)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(DKY_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DKY_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_TenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_DangKy)
                    .addComponent(btn_return))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangKyActionPerformed
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe"; 
        String dbUsername = "C##VUNGNUOI"; 
        String dbPassword = "vungnuoi"; 

        String username = DKY_TaiKhoan.getText();
        String password = DKY_MatKhau.getText();
        String tenKhachHang = txt_TenKhachHang.getText();
        String diaChi = txt_DiaChi.getText();
        String soDienThoai = txt_SoDienThoai.getText();
        String role = "USER"; 

        if (username.isEmpty() || password.isEmpty() || tenKhachHang.isEmpty() || diaChi.isEmpty() || soDienThoai.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.");
            return;
        }

        try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
             CallableStatement callableStatement = connection.prepareCall("{call Tao_NguoiDung(?, ?, ?, ?, ?, ?)}")) {

            
            callableStatement.setString(1, username);
            callableStatement.setString(2, password);
            callableStatement.setString(3, tenKhachHang);
            callableStatement.setString(4, diaChi);
            callableStatement.setString(5, soDienThoai);
            callableStatement.setString(6, role);

            
            callableStatement.execute();

            JOptionPane.showMessageDialog(this, "Người dùng đã được tạo thành công.");

            this.dispose();

            frmQLKhachHang qlKhachHangFrame = new frmQLKhachHang();
            qlKhachHangFrame.setVisible(true);

        } catch (SQLException e) {
            if (e.getErrorCode() == 1) 
            { 
                JOptionPane.showMessageDialog(this, "Khách hàng đã tồn tại.");
            } else {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi khi tạo người dùng: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_DangKyActionPerformed

    private void btn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnActionPerformed
        this.dispose();
        frmQLKhachHang qlKhachHangFrame = new frmQLKhachHang();
        qlKhachHangFrame.setVisible(true);
    }//GEN-LAST:event_btn_returnActionPerformed

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
            java.util.logging.Logger.getLogger(frmDangKyNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDangKyNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDangKyNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDangKyNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDangKyNguoiDung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DKY_MatKhau;
    private javax.swing.JTextField DKY_TaiKhoan;
    private javax.swing.JButton btn_DangKy;
    private javax.swing.JButton btn_return;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_DiaChi;
    private javax.swing.JTextField txt_SoDienThoai;
    private javax.swing.JTextField txt_TenKhachHang;
    // End of variables declaration//GEN-END:variables
}
