
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class Depart extends javax.swing.JFrame {

    ArrayList<BeanClass> bean=new ArrayList<BeanClass>();
    public Depart() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrp = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRoll = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtCourse = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        rdbtnInstitute = new javax.swing.JRadioButton();
        rdbtnDept = new javax.swing.JRadioButton();
        rdbtnFaculty = new javax.swing.JRadioButton();
        cmbAdd = new javax.swing.JComboBox<>();
        lblUni = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblCourse = new javax.swing.JLabel();
        lblCheck = new javax.swing.JLabel();
        lblbtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setText("Uni Name :");

        jLabel2.setText("City :");

        jLabel3.setText("Course :");

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btngrp.add(rdbtnInstitute);
        rdbtnInstitute.setText("Institute");

        btngrp.add(rdbtnDept);
        rdbtnDept.setText("Department");

        btngrp.add(rdbtnFaculty);
        rdbtnFaculty.setText("Faculty");

        cmbAdd.setBackground(new java.awt.Color(255, 102, 102));
        cmbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAddActionPerformed(evt);
            }
        });

        lblbtn.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUni)
                            .addComponent(lblId)
                            .addComponent(lblCourse)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdbtnInstitute)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbtnDept)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdbtnFaculty))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtRoll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCourse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblbtn)
                                    .addComponent(cmbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblCheck)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnInstitute)
                    .addComponent(rdbtnDept)
                    .addComponent(rdbtnFaculty))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblUni)
                .addGap(18, 18, 18)
                .addComponent(lblId)
                .addGap(18, 18, 18)
                .addComponent(lblCourse)
                .addGap(18, 18, 18)
                .addComponent(lblCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(lblbtn)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void clear(){
        
        txtCourse.setText(null);
        txtName.setText(null);
        txtRoll.setText(null);
        
    }
    
    
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        String name=txtName.getText();
        int Id=Integer.parseInt(txtRoll.getText());
        String course=txtCourse.getText();
        String btnDegree=null;
        if(rdbtnDept.isSelected())
            btnDegree="Department";
        else if(rdbtnFaculty.isSelected())
            btnDegree="Faculty";
        else if(rdbtnInstitute.isSelected())
            btnDegree="Institute";
        btngrp.clearSelection();
        BeanClass beaClass=new BeanClass();
        beaClass.setNameOfDeptt(name);
        beaClass.setId(Id);
        beaClass.setCourse(course);
        beaClass.setCheck(btnDegree);
        //bean.add(beaClass);
        
        DefaultComboBoxModel mod=(DefaultComboBoxModel) cmbAdd.getModel();
        mod.addElement(beaClass);
        
        clear();
        
        cmbAdd.setModel(mod);


    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAddActionPerformed
        
        BeanClass bea=(BeanClass) cmbAdd.getSelectedItem();
        
        lblUni.setText(bea.getNameOfDeptt());
        lblId.setText(""+bea.getId());
        lblCourse.setText(bea.getCourse());
        lblCheck.setText(bea.getCheck());
        
    }//GEN-LAST:event_cmbAddActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Depart().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup btngrp;
    private javax.swing.JComboBox<String> cmbAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCheck;
    private javax.swing.JLabel lblCourse;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblUni;
    private javax.swing.JLabel lblbtn;
    private javax.swing.JRadioButton rdbtnDept;
    private javax.swing.JRadioButton rdbtnFaculty;
    private javax.swing.JRadioButton rdbtnInstitute;
    private javax.swing.JTextField txtCourse;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRoll;
    // End of variables declaration//GEN-END:variables
}
