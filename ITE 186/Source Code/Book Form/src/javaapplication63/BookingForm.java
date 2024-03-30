
package javaapplication63;

import javax.swing.JOptionPane;


public class BookingForm extends javax.swing.JFrame {
    String clientsname,contactnum,address,emailadd,events,months,year,days,dc;
    double price;
    public BookingForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_CN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_CNO = new javax.swing.JTextField();
        tf_Add = new javax.swing.JTextField();
        tf_EA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cBox_TOE = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cBox_Days = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cBox_DC = new javax.swing.JComboBox<>();
        cBox_Months = new javax.swing.JComboBox<>();
        cBox_Year = new javax.swing.JComboBox<>();
        btt_Submit = new javax.swing.JButton();
        btt_Cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tA_AC = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Booking Form");
        setName("Booking Form"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(244, 238, 224));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BOOK NOW!");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 30, 150, 29);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Complete Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 160, 100, 28);

        tf_CN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_CNActionPerformed(evt);
            }
        });
        jPanel1.add(tf_CN);
        tf_CN.setBounds(189, 158, 236, 31);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact No.");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 200, 74, 28);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 240, 52, 28);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email Address");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 280, 90, 28);

        tf_CNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_CNOActionPerformed(evt);
            }
        });
        jPanel1.add(tf_CNO);
        tf_CNO.setBounds(189, 200, 236, 31);

        tf_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_AddActionPerformed(evt);
            }
        });
        jPanel1.add(tf_Add);
        tf_Add.setBounds(189, 241, 236, 31);

        tf_EA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_EAActionPerformed(evt);
            }
        });
        jPanel1.add(tf_EA);
        tf_EA.setBounds(189, 283, 236, 31);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Type of Event");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 360, 88, 28);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fill up this reservation form to reserve your slot and block the date of your event.");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 70, 450, 26);

        cBox_TOE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cBox_TOE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WEDDING", "DEBUT", "CHRISTENING", "CORPORATE EVENTS", "SPECIAL OCCASION", "OTHERS" }));
        jPanel1.add(cBox_TOE);
        cBox_TOE.setBounds(189, 357, 240, 34);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(70, 400, 30, 28);

        cBox_Days.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cBox_Days.setMaximumRowCount(31);
        cBox_Days.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(cBox_Days);
        cBox_Days.setBounds(189, 402, 56, 34);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Design Code");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(70, 450, 82, 28);

        cBox_DC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cBox_DC.setMaximumRowCount(14);
        cBox_DC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BEACH", "CLASSIC", "COBALT", "GAPAN", "LEAVES", "LOTUS", "MAGIC", "MIRROR", "TULIPS", "BROWN", "GREEN", "MAROON", "RED", "OTHERS" }));
        jPanel1.add(cBox_DC);
        cBox_DC.setBounds(189, 448, 240, 34);

        cBox_Months.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cBox_Months.setMaximumRowCount(31);
        cBox_Months.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(cBox_Months);
        cBox_Months.setBounds(251, 402, 79, 34);

        cBox_Year.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cBox_Year.setMaximumRowCount(31);
        cBox_Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027" }));
        jPanel1.add(cBox_Year);
        cBox_Year.setBounds(336, 402, 79, 34);

        btt_Submit.setBackground(new java.awt.Color(4, 169, 111));
        btt_Submit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btt_Submit.setText("Submit");
        btt_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_SubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btt_Submit);
        btt_Submit.setBounds(70, 520, 78, 35);

        btt_Cancel.setBackground(new java.awt.Color(204, 0, 0));
        btt_Cancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btt_Cancel.setText("Reset");
        btt_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_CancelActionPerformed(evt);
            }
        });
        jPanel1.add(btt_Cancel);
        btt_Cancel.setBounds(190, 520, 69, 35);

        tA_AC.setColumns(20);
        tA_AC.setRows(5);
        jScrollPane1.setViewportView(tA_AC);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(540, 110, 320, 370);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RE-SYKELL CORP");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(540, 527, 304, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Meeting will be scheduled upon confirmation of your reservation.");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 90, 350, 26);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Event Styling Portal - Reservation Form and Statement of Account.");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(540, 496, 357, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ACCOUNT & COSTING");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(542, 72, 304, 22);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG.png"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, 0, 920, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_CNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_CNActionPerformed
      
    }//GEN-LAST:event_tf_CNActionPerformed

    private void tf_CNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_CNOActionPerformed
      
    }//GEN-LAST:event_tf_CNOActionPerformed

    private void tf_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_AddActionPerformed
      
    }//GEN-LAST:event_tf_AddActionPerformed

    private void tf_EAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_EAActionPerformed
     
    }//GEN-LAST:event_tf_EAActionPerformed

    private void btt_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_SubmitActionPerformed
      events = (String) cBox_TOE.getSelectedItem();
      days =(String) cBox_Days.getSelectedItem();
      months =(String) cBox_Months.getSelectedItem();
      year = (String) cBox_Year.getSelectedItem();
      clientsname = tf_CN.getText();
      contactnum = tf_CNO.getText();
      address = tf_Add.getText();
       emailadd = tf_EA.getText();
      dc = (String) cBox_DC.getSelectedItem();
      
      if(clientsname.equals("")||contactnum.equals("")||address.equals("")||emailadd.equals("")){
          tA_AC.append("");
          JOptionPane.showMessageDialog(this,"Please input what is required!"); 
      } else if(cBox_DC.getSelectedItem().equals("BEACH")){
            price+=400000.00;
            tA_AC.append("CLIENT'S INFO:\n"+clientsname+"\n"+contactnum+"\n"+address+"\n"+emailadd+"\n\nEVENT DETAILS:\n"+events+"\n"+months+","+
                    days+" "+year+"\nDESIGNCODE: "+dc+"\n\nCOSTING:Php"+price+"\nDISCOUNT:Php"+0.0);
             JOptionPane.showMessageDialog(this,"Transaction Success!");          
        }else if(cBox_DC.getSelectedItem().equals("CLASSIC")){
            price+=400000.00;
             tA_AC.append("CLIENT'S INFO:\n"+clientsname+"\n"+contactnum+"\n"+address+"\n"+emailadd+"\n\nEVENT DETAILS:\n"+events+"\n"+months+","+
                    days+" "+year+"\nDESIGNCODE: "+dc+"\n\nCOSTING:Php"+price+"\nDISCOUNT:Php"+0.0);
              JOptionPane.showMessageDialog(this,"Transaction Success!");
        }else if(cBox_DC.getSelectedItem().equals("COBALT")){
            price+=600000.00;
             tA_AC.append("CLIENT'S INFO:\n"+clientsname+"\n"+contactnum+"\n"+address+"\n"+emailadd+"\n\nEVENT DETAILS:\n"+events+"\n"+months+","+
                    days+" "+year+"\nDESIGNCODE: "+dc+"\n\nCOSTING:Php"+price+"\nDISCOUNT:Php"+0.0);
              JOptionPane.showMessageDialog(this,"Transaction Success!");
        }else if(cBox_DC.getSelectedItem().equals("GAPAN")){
            price+=700000.00;
             tA_AC.append("CLIENT'S INFO:\n"+clientsname+"\n"+contactnum+"\n"+address+"\n"+emailadd+"\n\nEVENT DETAILS:\n"+events+"\n"+months+","+
                    days+" "+year+"\nDESIGNCODE: "+dc+"\n\nCOSTING:Php"+price+"\nDISCOUNT:Php"+0.0);
              JOptionPane.showMessageDialog(this,"Transaction Success!");
        }else if(cBox_DC.getSelectedItem().equals("LEAVES")){
            price+=400000.00;
             tA_AC.append("CLIENT'S INFO:\n"+clientsname+"\n"+contactnum+"\n"+address+"\n"+emailadd+"\n\nEVENT DETAILS:\n"+events+"\n"+months+","+
                    days+" "+year+"\nDESIGNCODE: "+dc+"\n\nCOSTING:Php"+price+"\nDISCOUNT:Php"+0.0);
              JOptionPane.showMessageDialog(this,"Transaction Success!");
        }else if(cBox_DC.getSelectedItem().equals("LOTUS")){
            price+=800.00;
             tA_AC.append("CLIENT'S INFO:\n"+clientsname+"\n"+contactnum+"\n"+address+"\n"+emailadd+"\n\nEVENT DETAILS:\n"+events+"\n"+months+","+
                    days+" "+year+"\nDESIGNCODE: "+dc+"\n\nCOSTING:Php"+price+"\nDISCOUNT:Php"+0.0);
              JOptionPane.showMessageDialog(this,"Transaction Success!");
        }else if(cBox_DC.getSelectedItem().equals("MAGIC")){
            price+=500.00;
             tA_AC.append("CLIENT'S INFO:\n"+clientsname+"\n"+contactnum+"\n"+address+"\n"+emailadd+"\n\nEVENT DETAILS:\n"+events+"\n"+months+","+
                    days+" "+year+"\nDESIGNCODE: "+dc+"\n\nCOSTING:Php"+price+"\nDISCOUNT:Php"+0.0);
             
              JOptionPane.showMessageDialog(this,"Transaction Success!");
        }else if(cBox_DC.getSelectedItem().equals("MIRROR")){
            price+=800.00;
             tA_AC.append("CLIENT'S INFO:\n"+clientsname+"\n"+contactnum+"\n"+address+"\n"+emailadd+"\n\nEVENT DETAILS:\n"+events+"\n"+months+","+
                    days+" "+year+"\nDESIGNCODE: "+dc+"\n\nCOSTING:Php"+price+"\nDISCOUNT:Php"+0.0);
              JOptionPane.showMessageDialog(this,"Transaction Success!");
        }else if(cBox_DC.getSelectedItem().equals("TULIPS")){
            price+=400000.00;
             tA_AC.append("CLIENT'S INFO:\n"+clientsname+"\n"+contactnum+"\n"+address+"\n"+emailadd+"\n\nEVENT DETAILS:\n"+events+"\n"+months+","+
                    days+" "+year+"\nDESIGNCODE: "+dc+"\n\nCOSTING:Php"+price+"\nDISCOUNT:Php"+0.0);
              JOptionPane.showMessageDialog(this,"Transaction Success!");
        }else if(cBox_DC.getSelectedItem().equals("BROWN")){
            price+=15000.00;
             tA_AC.append("CLIENT'S INFO:\n"+clientsname+"\n"+contactnum+"\n"+address+"\n"+emailadd+"\n\nEVENT DETAILS:\n"+events+"\n"+months+","+
                    days+" "+year+"\nDESIGNCODE: "+dc+"\n\nCOSTING:Php"+price+"\nDISCOUNT:Php"+0.0);
              JOptionPane.showMessageDialog(this,"Transaction Success!");
        }else if(cBox_DC.getSelectedItem().equals("GREEN")){
            price+=15000.00;
             tA_AC.append("CLIENT'S INFO:\n"+clientsname+"\n"+contactnum+"\n"+address+"\n"+emailadd+"\n\nEVENT DETAILS:\n"+events+"\n"+months+","+
                    days+" "+year+"\nDESIGNCODE: "+dc+"\n\nCOSTING:Php"+price+"\nDISCOUNT:Php"+0.0);
              JOptionPane.showMessageDialog(this,"Transaction Success!");
        }else if(cBox_DC.getSelectedItem().equals("MAROON")){
            price+=8000.00;
             tA_AC.append("CLIENT'S INFO:\n"+clientsname+"\n"+contactnum+"\n"+address+"\n"+emailadd+"\n\nEVENT DETAILS:\n"+events+"\n"+months+","+
                    days+" "+year+"\nDESIGNCODE: "+dc+"\n\nCOSTING:Php"+price+"\nDISCOUNT:Php"+0.0);
              JOptionPane.showMessageDialog(this,"Transaction Success!");
        }else if(cBox_DC.getSelectedItem().equals("RED")){
            price+=8000.00;
             tA_AC.append("CLIENT'S INFO:\n"+clientsname+"\n"+contactnum+"\n"+address+"\n"+emailadd+"\n\nEVENT DETAILS:\n"+events+"\n"+months+","+
                    days+" "+year+"\nDESIGNCODE: "+dc+"\n\nCOSTING:Php"+price+"\nDISCOUNT:Php"+0.0);
              JOptionPane.showMessageDialog(this,"Transaction Success!");
        }else if(cBox_DC.getSelectedItem().equals("OTHERS")){
            price+=30000.00;
             tA_AC.append("CLIENT'S INFO:\n"+clientsname+"\n"+contactnum+"\n"+address+"\n"+emailadd+"\n\nEVENT DETAILS:\n"+events+"\n"+months+","+
                    days+" "+year+"\nDESIGNCODE: "+dc+"\n\nCOSTING:Php"+price+"\nDISCOUNT:Php"+0.0);
              JOptionPane.showMessageDialog(this,"Transaction Success!");
        }
        else{
            JOptionPane.showMessageDialog(this,"Please input what is required!");
        }     
    }//GEN-LAST:event_btt_SubmitActionPerformed

    private void btt_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_CancelActionPerformed
        tA_AC.setText("");
        tf_CN.setText("");
        tf_CNO.setText("");
        tf_EA.setText("");
        tf_Add.setText("");
        price =0;
        cBox_TOE.setSelectedIndex(0);
        cBox_Days.setSelectedIndex(0);
        cBox_Months.setSelectedIndex(0);
        cBox_Year.setSelectedIndex(0);
        cBox_DC.setSelectedIndex(0);
    }//GEN-LAST:event_btt_CancelActionPerformed

  
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_Cancel;
    private javax.swing.JButton btt_Submit;
    private javax.swing.JComboBox<String> cBox_DC;
    private javax.swing.JComboBox<String> cBox_Days;
    private javax.swing.JComboBox<String> cBox_Months;
    private javax.swing.JComboBox<String> cBox_TOE;
    private javax.swing.JComboBox<String> cBox_Year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tA_AC;
    private javax.swing.JTextField tf_Add;
    private javax.swing.JTextField tf_CN;
    private javax.swing.JTextField tf_CNO;
    private javax.swing.JTextField tf_EA;
    // End of variables declaration//GEN-END:variables
}
