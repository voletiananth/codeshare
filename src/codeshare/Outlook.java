/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeshare;

import codeshare.connection.ClientConnection;
import codeshare.connection.ServerConnection;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

/**
 *
 * @author voleti
 */

public class Outlook extends javax.swing.JFrame implements KeyListener{
   private Thread t;
   private  int nooftabs = 1;
   private WorkspaceFrame reFrameWorkspace;
   private FileChooserWorkspace fileOpenButton;
   private boolean teacherButtonState = false;
   private boolean studentButtonState = false;
   Socket clientSocket ;
   Thread scThread = null ;
   ServerSocket serverSocket;
   //private int status;
   private ServerConnection sc;
   private ClientConnection cc;
    /**
     * Creates new form Outlook
     * @param a
     */
    ConcurrentHashMap<String, String> otherFiles ;
    public Outlook(Object a)  {
        otherFiles = new ConcurrentHashMap<>();
        reFrameWorkspace = (WorkspaceFrame) a;
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
            
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientsList = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        newbutton = new javax.swing.JButton();
        openbutton = new javax.swing.JButton();
        savebutton = new javax.swing.JButton();
        closebutton = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        student = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        teacher = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        runbutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();

        clientsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientsListMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 600));
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setPreferredSize(new java.awt.Dimension(617, 45));

        newbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Webp.net-resizeimage.png"))); // NOI18N
        newbutton.setToolTipText("New");
        newbutton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        newbutton.setContentAreaFilled(false);
        newbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        newbutton.setPreferredSize(new java.awt.Dimension(45, 45));
        newbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbuttonActionPerformed(evt);
            }
        });

        openbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Open-512.png"))); // NOI18N
        openbutton.setToolTipText("Open");
        openbutton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        openbutton.setBorderPainted(false);
        openbutton.setContentAreaFilled(false);
        openbutton.setName(""); // NOI18N
        openbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openbuttonActionPerformed(evt);
            }
        });

        savebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Save-512.png"))); // NOI18N
        savebutton.setToolTipText("Save");
        savebutton.setBorder(null);
        savebutton.setContentAreaFilled(false);
        savebutton.setEnabled(false);
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });

        closebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close.png"))); // NOI18N
        closebutton.setToolTipText("Close");
        closebutton.setBorder(null);
        closebutton.setBorderPainted(false);
        closebutton.setContentAreaFilled(false);
        closebutton.setEnabled(false);
        closebutton.setOpaque(true);
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttonActionPerformed(evt);
            }
        });

        student.setText("i'm student");
        student.setEnabled(false);
        student.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                studentItemStateChanged(evt);
            }
        });
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });
        jSplitPane1.setRightComponent(student);

        jPanel2.setLayout(new java.awt.BorderLayout());

        teacher.setText("i'm teacher");
        teacher.setEnabled(false);
        teacher.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                teacherItemStateChanged(evt);
            }
        });
        teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherActionPerformed(evt);
            }
        });
        jPanel2.add(teacher, java.awt.BorderLayout.CENTER);

        jButton2.setText(" V ");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, java.awt.BorderLayout.LINE_START);

        jSplitPane1.setLeftComponent(jPanel2);

        runbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/run.png"))); // NOI18N
        runbutton.setToolTipText("Run");
        runbutton.setEnabled(false);
        runbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runbuttonActionPerformed(evt);
            }
        });

        jButton1.setText("work");
        jButton1.setToolTipText("Choose Workspace");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(newbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(openbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(savebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(closebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(runbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(savebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(closebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(runbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(newbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(openbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   @SuppressWarnings("StringEquality")
    private void closebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttonActionPerformed
        // TODO add your handling code here:
           for(Component c : clientsList.getComponents()){
              JCheckBoxMenuItem jmenu =   (JCheckBoxMenuItem)  c;
               if(jmenu.getText()==jTabbedPane1.getTitleAt(jTabbedPane1.getSelectedIndex()))
                   clientsList.remove(c);
               
           }
            jTabbedPane1.remove(jTabbedPane1.getSelectedIndex());
            setEnabledFalse();
               
    }//GEN-LAST:event_closebuttonActionPerformed

    private void openbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openbuttonActionPerformed
        fileOpenButton = new FileChooserWorkspace(WorkspaceFrame.filename,"files");
        if (fileOpenButton.getPath()!=null) {
            if(!fileOpenButton.getPath().equals(WorkspaceFrame.filename+"/"+fileOpenButton.Name()))
                      otherFiles.put(fileOpenButton.Name(),fileOpenButton.getPath());
        jTabbedPane1.addTab(fileOpenButton.Name(),new NewScroll(new Fileopen(fileOpenButton.getPath())));
        jTabbedPane1.setSelectedIndex(jTabbedPane1.getTabCount()-1);
        clientsList.add(new jCheckBoxMenuItem(jTabbedPane1.getTitleAt(jTabbedPane1.getSelectedIndex()),jTabbedPane1,jTabbedPane1.getSelectedIndex()));
        JTextArea textArea=(JTextArea)(((JScrollPane)jTabbedPane1.getComponentAt(jTabbedPane1.getSelectedIndex())).getViewport()).getComponent(0);
        textArea.addKeyListener(this);
        setEnabledTrue();
        }
        
    }//GEN-LAST:event_openbuttonActionPerformed

    private void newbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbuttonActionPerformed
        
        jTabbedPane1.addTab("Untitled-"+nooftabs++,new NewScroll());
        jTabbedPane1.setSelectedIndex(jTabbedPane1.getTabCount()-1);
        JTextArea textArea=(JTextArea)(((JScrollPane)jTabbedPane1.getComponentAt(jTabbedPane1.getSelectedIndex())).getViewport()).getComponent(0);
        textArea.addKeyListener(this);
        if(teacherButtonState){
            clientsList.add(new jCheckBoxMenuItem(jTabbedPane1.getTitleAt(jTabbedPane1.getSelectedIndex()),jTabbedPane1,jTabbedPane1.getSelectedIndex()));    
        }
        setEnabledTrue();
                
    }//GEN-LAST:event_newbuttonActionPerformed

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
        // TODO add your handling code here:
        
        
       
    }//GEN-LAST:event_savebuttonActionPerformed

    private void runbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runbuttonActionPerformed
        // TODO add your handling code here:
    
       
    }//GEN-LAST:event_runbuttonActionPerformed

    private void teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherActionPerformed
            
           student.setEnabled(!teacherButtonState);
           
           if(teacherButtonState){
               try {
                   serverSocket = new ServerSocket(1235);
                   sc = new ServerConnection(serverSocket);
               } catch (IOException ex) {   
               }
             
               scThread = new Thread(sc);
               scThread.start();
              int tabCount = jTabbedPane1.getTabCount();
               for(int i=0;i<tabCount;i++){
                   String title = jTabbedPane1.getTitleAt(i);
                   if(title.contains("*"))
                       title = title.replace('*',' ').trim();      
                clientsList.add(new jCheckBoxMenuItem(title,jTabbedPane1,i));   
               
               }
               
               
               
          }
           else{
              clientsList.removeAll();
              ServerConnection.activeClients.clear();
             
              
           }
       
       
    }//GEN-LAST:event_teacherActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        if(jTabbedPane1.getTabCount()>0){
        setTitle(jTabbedPane1.getTitleAt(jTabbedPane1.getSelectedIndex()));
        if(teacherButtonState){
            ServerConnection.activeClients.values().stream().forEach((clients) -> {
                try {
                    DataOutputStream output =  new DataOutputStream(clients.getOutputStream());
                    output.writeInt(4);
                    output.writeUTF(jTabbedPane1.getTitleAt(jTabbedPane1.getSelectedIndex()));
                } catch (IOException ex) {
                    
                }
            });
        }
        }
        else
            setTitle("");
        
        
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        reFrameWorkspace.setLocationRelativeTo(this);
        reFrameWorkspace.setDefaultCloseOperation(HIDE_ON_CLOSE);
        reFrameWorkspace.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
      
        if(studentButtonState){
            teacher.setEnabled(!studentButtonState);
            
            try {
                 clientSocket = new Socket("localhost",1235);
                 } catch (IOException ex) {
                 }
            
             cc = new ClientConnection(jTabbedPane1, clientSocket);
             cc.startThread();
            
           
             
        }else{
            cc.stopThread();
            teacher.setEnabled(!studentButtonState);
            JTextArea currentTextArea;
            for(int i=0;i<jTabbedPane1.getTabCount();i++){
              currentTextArea =(JTextArea)(((JScrollPane)jTabbedPane1.getComponentAt(i)).getViewport()).getComponent(0);
              currentTextArea.setEditable(true);
            }
              
        }
        
            
       
           
        
    }//GEN-LAST:event_studentActionPerformed

    private void teacherItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_teacherItemStateChanged
        // TODO add your handling code here:
        teacherButtonState = (evt.getStateChange()==1)?(true ): (false);
    }//GEN-LAST:event_teacherItemStateChanged

    private void studentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_studentItemStateChanged
        // TODO add your handling code here:
        studentButtonState  = (evt.getStateChange()==1)?(true ): (false);
        
    }//GEN-LAST:event_studentItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your haing code here:
        if (teacherButtonState) 
            clientsList.show(jButton2,jButton2.getWidth(),jButton2.getHeight());
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void clientsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientsListMouseClicked
       // TODO add your handling code here:
      
    }//GEN-LAST:event_clientsListMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(Outlook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Outlook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Outlook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Outlook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            WorkspaceFrame w = new WorkspaceFrame();
            new Outlook(w);
        });
        
           
       
        
      
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu clientsList;
    private javax.swing.JButton closebutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton newbutton;
    private javax.swing.JButton openbutton;
    private javax.swing.JButton runbutton;
    private javax.swing.JButton savebutton;
    private javax.swing.JToggleButton student;
    private javax.swing.JToggleButton teacher;
    // End of variables declaration//GEN-END:variables

    private void setEnabledTrue(){
         if(jTabbedPane1.getTabCount()>0){
            closebutton.setEnabled(true);
            savebutton.setEnabled(true);
            runbutton.setEnabled(true);
            student.setEnabled(true);
            teacher.setEnabled(true);
            jButton2.setEnabled(true);
        }
    }
    private void setEnabledFalse(){
        if(jTabbedPane1.getTabCount()==0){
                closebutton.setEnabled(false);
                savebutton.setEnabled(false);
                runbutton.setEnabled(false);
                student.setEnabled(false);
                teacher.setEnabled(false);
                jButton2.setEnabled(false);
            nooftabs=1;
            }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        int index = jTabbedPane1.getSelectedIndex();
        String title = jTabbedPane1.getTitleAt(index);
        if(!title.contains("*"))
            jTabbedPane1.setTitleAt(index,title+"*");
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}