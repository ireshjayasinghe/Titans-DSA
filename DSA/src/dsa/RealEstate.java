package dsa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Damitha
 */
public class RealEstate extends javax.swing.JFrame {

    private SortedList HouseList = new SortedList();
    ListHouse HOUSE;
    int index=0;
     HouseFile HouseFileObject;
    /**
     * Creates new form RealEstate
     */
    public RealEstate() {
        initComponents();
         HouseFileObject = new HouseFile();
         setLocationRelativeTo(null);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2_lotNumber = new javax.swing.JLabel();
        jTextField1_lotnumber = new javax.swing.JTextField();
        jLabel2_Fname = new javax.swing.JLabel();
        jTextField1_Fname = new javax.swing.JTextField();
        jLabel2_Lname = new javax.swing.JLabel();
        jTextField2_Lname = new javax.swing.JTextField();
        jLabel2_price = new javax.swing.JLabel();
        jTextField2_Price = new javax.swing.JTextField();
        jLabel2_SF = new javax.swing.JLabel();
        jTextField2_SF = new javax.swing.JTextField();
        jLabel2_NB = new javax.swing.JLabel();
        jTextField2_NB = new javax.swing.JTextField();
        jButton1_reset = new javax.swing.JButton();
        jButton2_add = new javax.swing.JButton();
        jButton3_clear = new javax.swing.JButton();
        jButton4_next = new javax.swing.JButton();
        jButton5_delete = new javax.swing.JButton();
        jButton6_find = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Next House Displayed");

        jLabel2_lotNumber.setText("Lot Number");

        jTextField1_lotnumber.setText(" ");

        jLabel2_Fname.setText("First Name");

        jTextField1_Fname.setText(" ");

        jLabel2_Lname.setText("Last Name");

        jTextField2_Lname.setText(" ");
        jTextField2_Lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_LnameActionPerformed(evt);
            }
        });

        jLabel2_price.setText("Price");

        jTextField2_Price.setText(" ");

        jLabel2_SF.setText("Square Feet");

        jTextField2_SF.setText(" ");

        jLabel2_NB.setText("Number of Bedrooms");

        jTextField2_NB.setText(" ");

        jButton1_reset.setText("Reset");
        jButton1_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_resetActionPerformed(evt);
            }
        });

        jButton2_add.setText("Add");
        jButton2_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_addActionPerformed(evt);
            }
        });

        jButton3_clear.setText("Clear");
        jButton3_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_clearActionPerformed(evt);
            }
        });

        jButton4_next.setText("Next");
        jButton4_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_nextActionPerformed(evt);
            }
        });

        jButton5_delete.setText("Delete");
        jButton5_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_deleteActionPerformed(evt);
            }
        });

        jButton6_find.setText("Find");
        jButton6_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6_findActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2_add, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4_next, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6_find, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2_lotNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2_Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2_price, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2_SF, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2_NB, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2_NB, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2_SF, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1_lotnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2_Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2_lotNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_lotnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2_Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2_Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2_price, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2_SF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2_SF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2_NB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2_NB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4_next, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2_add, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6_find, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2_LnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_LnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_LnameActionPerformed

    private void jButton1_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_resetActionPerformed
        // TODO add your handling code here:
        DispalyHouse(0);
        index=1;
    }//GEN-LAST:event_jButton1_resetActionPerformed

    private void jButton3_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_clearActionPerformed

     
        clearForm();
        
    }                                              
    private void clearForm()
    {
    
      jTextField1_Fname.setText("");
       jTextField1_lotnumber.setText("");
       jTextField2_Lname.setText("");
      jTextField2_Lname.setText("");
      jTextField2_NB.setText("");
      jTextField2_Price.setText("");
      jTextField2_SF.setText("");
    

    }//GEN-LAST:event_jButton3_clearActionPerformed

    private void jButton2_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_addActionPerformed
         HOUSE = new ListHouse();

        HOUSE.FIRSTNAME = jTextField1_Fname.getText().trim();
        HOUSE.LASTNAME = jTextField2_Lname.getText().trim();
        HOUSE.LOTNUMBER = Integer.parseInt(jTextField1_lotnumber.getText().trim());
        HOUSE.NUMBEROFBEDROOMS = Integer.parseInt(jTextField2_NB.getText().trim());
        HOUSE.PRICE= (int)Integer.parseInt(jTextField2_Price.getText().trim());
        HOUSE.SQUAREFEET = Integer.parseInt(jTextField2_SF.getText().trim());
        
        HouseList.insert(HOUSE); 
        clearForm();
        
        HouseFileObject.WriteToFile(HouseList.Houselist);
        
    }//GEN-LAST:event_jButton2_addActionPerformed

    private void jButton5_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_deleteActionPerformed
        try {
            
          int  lotNumber = Integer.parseInt(jTextField1_lotnumber.getText());
         HouseList.remove(lotNumber);
     
        } catch (NumberFormatException e) {
        }
     
      //  HouseList.delete(HOUSE);
     
     
        
    }//GEN-LAST:event_jButton5_deleteActionPerformed

    private void jButton6_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6_findActionPerformed
      
        // TODO add your handling code here:
        
      int  lotNumber = Integer.parseInt(jTextField1_lotnumber.getText().trim());
         // HOUSE = new ListHouse(lotNumber,"", "",  0, 0, 0);
           HOUSE = HouseList.findHouse(lotNumber);
           if (HOUSE==null) {
               
              return;
            
        }
           
      jTextField1_Fname.setText(HOUSE.FIRSTNAME);
      jTextField1_lotnumber.setText(Integer.toString(HOUSE.LOTNUMBER));
      jTextField2_Lname.setText(HOUSE.LASTNAME);
      jTextField2_NB.setText(Integer.toString(HOUSE.NUMBEROFBEDROOMS));
      jTextField2_Price.setText(Integer.toString(HOUSE.PRICE));
      jTextField2_SF.setText(Integer.toString(HOUSE.SQUAREFEET));      

           
    }//GEN-LAST:event_jButton6_findActionPerformed

    private void jButton4_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_nextActionPerformed
        // TODO add your handling code here:
        DispalyHouse(index);
        ++index;
    }//GEN-LAST:event_jButton4_nextActionPerformed


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
            java.util.logging.Logger.getLogger(RealEstate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealEstate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealEstate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealEstate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealEstate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_reset;
    private javax.swing.JButton jButton2_add;
    private javax.swing.JButton jButton3_clear;
    private javax.swing.JButton jButton4_next;
    private javax.swing.JButton jButton5_delete;
    private javax.swing.JButton jButton6_find;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2_Fname;
    private javax.swing.JLabel jLabel2_Lname;
    private javax.swing.JLabel jLabel2_NB;
    private javax.swing.JLabel jLabel2_SF;
    private javax.swing.JLabel jLabel2_lotNumber;
    private javax.swing.JLabel jLabel2_price;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1_Fname;
    private javax.swing.JTextField jTextField1_lotnumber;
    private javax.swing.JTextField jTextField2_Lname;
    private javax.swing.JTextField jTextField2_NB;
    private javax.swing.JTextField jTextField2_Price;
    private javax.swing.JTextField jTextField2_SF;
    // End of variables declaration//GEN-END:variables

 void DispalyHouse(int index){
        
          ListHouse[] listHouse = HouseList.bubbleSort();
        if (listHouse.length<=index ) {
           
             return;
        }
        
            int LOTNUMBER=0;
          String FIRSTNAME=null;
          String LASTNAME=null;
          int NO_OFROOMS=0;
          int PRICE=0;
          int SF=0;
        
        
          for (int i = 0; i <= index ; i++) {
            
                if (listHouse[i]==null) {
                    return;
                  
              }
                if (listHouse[i]!=null) {
                    
                LOTNUMBER=listHouse[i].LOTNUMBER;
                FIRSTNAME=listHouse[i].FIRSTNAME;
                LASTNAME=listHouse[i].LASTNAME;
                NO_OFROOMS=listHouse[i].NUMBEROFBEDROOMS;
                PRICE=listHouse[i].PRICE;
                SF=listHouse[i].SQUAREFEET;
                }
              
                
                
           }
    
                jTextField1_lotnumber.setText(""+LOTNUMBER);
                jTextField1_Fname.setText(FIRSTNAME);
                jTextField2_Lname.setText(LASTNAME);
                jTextField2_NB.setText(""+NO_OFROOMS);
                jTextField2_Price.setText(""+PRICE);
                jTextField2_SF.setText(""+SF);
    
    
    
        
        
    }



}
