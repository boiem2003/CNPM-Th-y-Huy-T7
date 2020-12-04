package qlcf.GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MENUFORM extends javax.swing.JFrame {
    static JPanel jchild;
    static ArrayList<JButton> bt = new ArrayList<>();
    
    
   
    static boolean dongUngDung = false;
    
    public MENUFORM() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        bt.add(btTaikhoan);
        bt.add(btNhanvien);
        bt.add(btBanHang);
        bt.add(btTraCuu);
        bt.add(btHoaDon);
        bt.add(btNhapHang);
        bt.add(btThongKe);
        bt.add(btDanhgia);
        
        
       
        
        //Dong ho
        SimpleDateFormat sdfNgay = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdfDongHo = new SimpleDateFormat("hh:mm:ss");
        lbNgay.setText(sdfNgay.format(new Date()));
        Timer time = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbDongHo.setText(sdfDongHo.format(new Date()));
                if(dongUngDung){
                    dongUngDung = false;
                    dispose();
                }
            }
        });
        time.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        btTaikhoan = new javax.swing.JButton();
        btNhanvien = new javax.swing.JButton();
        btBanHang = new javax.swing.JButton();
        btTraCuu = new javax.swing.JButton();
        btHoaDon = new javax.swing.JButton();
        btNhapHang = new javax.swing.JButton();
        btThongKe = new javax.swing.JButton();
        btDanhgia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanelChane = new javax.swing.JPanel();
        lbNgay = new javax.swing.JLabel();
        lbDongHo = new javax.swing.JLabel();
        jLabelAnhnen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(86, 60, 98));

        jDesktopPane1.setBackground(new java.awt.Color(102, 0, 102));

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        btTaikhoan.setBackground(new java.awt.Color(255, 255, 255));
        btTaikhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlcf/hinh/ssssss.png"))); // NOI18N
        btTaikhoan.setText("Tài khoản");
        btTaikhoan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 51, 102), null, null));
        btTaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTaikhoanActionPerformed(evt);
            }
        });

        btNhanvien.setBackground(new java.awt.Color(255, 255, 255));
        btNhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlcf/hinh/enploy.png"))); // NOI18N
        btNhanvien.setText("Nhân viên");
        btNhanvien.setAlignmentX(0.1F);
        btNhanvien.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 51, 102), null, null));
        btNhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNhanvienActionPerformed(evt);
            }
        });

        btBanHang.setBackground(new java.awt.Color(255, 255, 255));
        btBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlcf/hinh/kmai.png"))); // NOI18N
        btBanHang.setText("Bán hàng");
        btBanHang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 51, 102), null, null));
        btBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBanHangActionPerformed(evt);
            }
        });

        btTraCuu.setBackground(new java.awt.Color(255, 255, 255));
        btTraCuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlcf/hinh/search.jpg"))); // NOI18N
        btTraCuu.setText("Tra cứu thông tin");
        btTraCuu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 51, 102), null, null));
        btTraCuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTraCuuActionPerformed(evt);
            }
        });

        btHoaDon.setBackground(new java.awt.Color(255, 255, 255));
        btHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlcf/hinh/nhaphang.jpg"))); // NOI18N
        btHoaDon.setText("Hóa đơn                                 ");
        btHoaDon.setToolTipText("");
        btHoaDon.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 51, 102), null, null));
        btHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHoaDonActionPerformed(evt);
            }
        });

        btNhapHang.setBackground(new java.awt.Color(255, 255, 255));
        btNhapHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlcf/hinh/nhap.png"))); // NOI18N
        btNhapHang.setText("Kho hang");
        btNhapHang.setToolTipText("");
        btNhapHang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 0, 102), null, null));
        btNhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNhapHangActionPerformed(evt);
            }
        });

        btThongKe.setBackground(new java.awt.Color(255, 255, 255));
        btThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlcf/hinh/seo-report (1).png"))); // NOI18N
        btThongKe.setText("Báo cáo-Thống kê");
        btThongKe.setToolTipText("");
        btThongKe.setActionCommand("Thống kê                                        ");
        btThongKe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 0, 102), null, null));
        btThongKe.setHideActionText(true);
        btThongKe.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThongKeActionPerformed(evt);
            }
        });

        btDanhgia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlcf/hinh/icon-chat-luong.png"))); // NOI18N
        btDanhgia.setText("Đánh giá-Chất lượng");
        btDanhgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDanhgiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btNhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btTaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btTraCuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btNhapHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDanhgia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btTraCuu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btDanhgia, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ QUÁN CAFE");

        jPanelChane.setBackground(new java.awt.Color(102, 102, 255));
        jPanelChane.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanelChanePropertyChange(evt);
            }
        });
        jPanelChane.setLayout(new java.awt.BorderLayout());

        lbNgay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNgay.setForeground(new java.awt.Color(255, 204, 0));
        lbNgay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNgay.setText("Date");

        lbDongHo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbDongHo.setForeground(new java.awt.Color(255, 204, 0));
        lbDongHo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDongHo.setText("Time");

        jLabelAnhnen.setBackground(new java.awt.Color(204, 204, 204));
        jLabelAnhnen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlcf/hinh/anhnen.jpg"))); // NOI18N
        jLabelAnhnen.setMaximumSize(new java.awt.Dimension(1080, 619));
        jLabelAnhnen.setMinimumSize(new java.awt.Dimension(1080, 619));
        jLabelAnhnen.setPreferredSize(new java.awt.Dimension(1080, 619));

        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanelChane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbNgay, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbDongHo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabelAnhnen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelChane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAnhnen, javax.swing.GroupLayout.PREFERRED_SIZE, 969, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbDongHo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelChane, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAnhnen, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(lbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jDesktopPane1.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1210, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTaikhoanActionPerformed

        formatButton(0);
    }//GEN-LAST:event_btTaikhoanActionPerformed
    
    private void btNhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNhanvienActionPerformed

        formatButton(1);
    }//GEN-LAST:event_btNhanvienActionPerformed

    private void btHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHoaDonActionPerformed

        formatButton(4);
    }//GEN-LAST:event_btHoaDonActionPerformed

    private void btNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNhapHangActionPerformed

        formatButton(5);
    }//GEN-LAST:event_btNhapHangActionPerformed

    private void btBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBanHangActionPerformed

        formatButton(2);
    }//GEN-LAST:event_btBanHangActionPerformed

    private void jPanelChanePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanelChanePropertyChange
        
    }//GEN-LAST:event_jPanelChanePropertyChange

    private void btThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThongKeActionPerformed

        formatButton(6);
    }//GEN-LAST:event_btThongKeActionPerformed

    private void btTraCuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTraCuuActionPerformed

        formatButton(3);
    }//GEN-LAST:event_btTraCuuActionPerformed

    private void btDanhgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDanhgiaActionPerformed
        // TODO add your handling code here:
        formatButton(7);
    }//GEN-LAST:event_btDanhgiaActionPerformed

    /**
     * @param args the command line arguments
     */
    
    static void formatButton(int index){
        for(int i=0;i<bt.size();i++){
            bt.get(i).setBackground(Color.WHITE);
        }
        bt.get(index).setBackground(Color.YELLOW);
        switch(index){
            case 0: jchild = new QLTK(); break;
            case 1: jchild = new QLNV(); break;
            case 2: jchild = new Banhang(); break;
            case 3: jchild = new TraCuu(); break;
            case 4: jchild = new Hoadon(); break;
            case 5: jchild = new Khohang(); break;
            case 6: jchild = new Thongke(); break;
            case 7: jchild = new DanhGia();
        }
        jPanelChane.removeAll();
        jPanelChane.add(jchild);
        jPanelChane.validate();
    }
    
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
            java.util.logging.Logger.getLogger(MENUFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENUFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENUFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENUFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MENUFORM().setVisible(true);
                

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    static javax.swing.JButton btBanHang;
    static javax.swing.JButton btDanhgia;
    static javax.swing.JButton btHoaDon;
    static javax.swing.JButton btNhanvien;
    static javax.swing.JButton btNhapHang;
    static javax.swing.JButton btTaikhoan;
    static javax.swing.JButton btThongKe;
    static javax.swing.JButton btTraCuu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAnhnen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    static javax.swing.JPanel jPanelChane;
    private javax.swing.JLabel lbDongHo;
    private javax.swing.JLabel lbNgay;
    // End of variables declaration//GEN-END:variables
}
