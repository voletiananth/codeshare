/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeshare;

import java.io.IOException;

/**
 *
 * @author voleti
 */
public class WorkspaceFrame extends javax.swing.JFrame{
    Thread t ;
    private final String PARENT_WORKSPACE = "workspace";
    private final String PATH_IN_SETTINGS = "location";
    private final String  PATH;
    private final WorkspaceSettings workspacePath;
    public static  String  filename ;
    private Boolean checkBoxState = false ;
    private FileChooserWorkspace fileChooser;
    /**
     * Creates new form WorkspaceFrame
     */
    public WorkspaceFrame() {
        
        setLocationRelativeTo(this);
        workspacePath  = new WorkspaceSettings(PARENT_WORKSPACE,PATH_IN_SETTINGS);
        PATH = workspacePath.getSettings();
        filename = PATH;
        initComponents();
   
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        chooseField = new javax.swing.JTextField();
        choosebutton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        checkBoxDefault = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WorkSpace");
        setMaximumSize(new java.awt.Dimension(343, 112));
        setResizable(false);

        chooseField.setText(PATH);
        chooseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFieldActionPerformed(evt);
            }
        });

        choosebutton.setText("Choose");
        choosebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosebuttonActionPerformed(evt);
            }
        });

        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        checkBoxDefault.setText("Set Default");
        checkBoxDefault.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxDefaultItemStateChanged(evt);
            }
        });
        checkBoxDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxDefaultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chooseField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(choosebutton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(okButton)
                        .addGap(40, 40, 40)
                        .addComponent(cancelButton)
                        .addGap(18, 18, 18)
                        .addComponent(checkBoxDefault)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choosebutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton)
                    .addComponent(checkBoxDefault))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("null")
    private void choosebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosebuttonActionPerformed
       
        try {
            fileChooser = new FileChooserWorkspace(filename);
        } catch (IOException ex) {
           
        }
        if(fileChooser.getPath() == null) {
        } else {
            chooseField.setText(fileChooser.getPath());
            filename = fileChooser.getPath();
        }
            
    }//GEN-LAST:event_choosebuttonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
         
        if(checkBoxState){
                if(!PATH.equals(filename)){
                workspacePath.setSettings(filename);
            
                
        
        }
        else
            if(!PATH.equals(filename)){
                
                workspacePath.temporarySettings(filename);
                }
        
        }
        setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void checkBoxDefaultItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkBoxDefaultItemStateChanged
        // TODO add your handling code here:
          checkBoxState =  (evt.getStateChange()==1)?(true ): (false);
    }//GEN-LAST:event_checkBoxDefaultItemStateChanged

    private void checkBoxDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxDefaultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxDefaultActionPerformed

    private void chooseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chooseFieldActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JCheckBox checkBoxDefault;
    private javax.swing.JTextField chooseField;
    private javax.swing.JButton choosebutton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables

   
    
}
