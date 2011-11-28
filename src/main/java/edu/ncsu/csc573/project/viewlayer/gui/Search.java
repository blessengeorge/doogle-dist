/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Search.java
 *
 * Created on Oct 26, 2011, 1:55:55 AM
 */
package edu.ncsu.csc573.project.viewlayer.gui;

import edu.ncsu.csc573.project.commlayer.CommunicationServiceFactory;
import edu.ncsu.csc573.project.common.ByteOperationUtil;
import edu.ncsu.csc573.project.common.messages.EnumOperationType;
import edu.ncsu.csc573.project.common.messages.EnumParamsType;
import edu.ncsu.csc573.project.common.messages.IParameter;
import edu.ncsu.csc573.project.common.messages.IRequest;
import edu.ncsu.csc573.project.common.messages.IResponse;
import edu.ncsu.csc573.project.common.messages.LogoutRequestMessage;
import edu.ncsu.csc573.project.common.messages.Parameter;
import edu.ncsu.csc573.project.common.messages.PublishRequestMessage;
import edu.ncsu.csc573.project.common.messages.SearchRequestMessage;
import edu.ncsu.csc573.project.controllayer.Session;
import edu.ncsu.csc573.project.controllayer.hashspacemanagement.DigestAdaptor;

import java.io.IOException;
import java.util.logging.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author krishna
 */
public class Search extends javax.swing.JFrame {

    /** Creates new form Search */
    public Search() {

        initComponents();
        // dispUsername.setText(Login.Username); 

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        searchText = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Options = new javax.swing.JMenu();
        Settings = new javax.swing.JMenuItem();
        Publish = new javax.swing.JMenuItem();
        Logout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(450, 250, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        Options.setText("Options");

        Settings.setText("Settings");
        Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsActionPerformed(evt);
            }
        });
        Options.add(Settings);

        Publish.setText("Publish");
        Publish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PublishActionPerformed(evt);
            }
        });
        Options.add(Publish);

        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        Options.add(Logout);

        jMenuBar1.add(Options);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchText, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search)
                        .addGap(80, 80, 80)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(search)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_searchTextActionPerformed

private void publishlinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publishlinkActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_publishlinkActionPerformed

private void settingslinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingslinkActionPerformed
// TODO add your handling code here:
    SettingsFrame Settings = new SettingsFrame();
    this.setVisible(false);
    Settings.setVisible(true);
}//GEN-LAST:event_settingslinkActionPerformed

private void logoutlinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutlinkActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_logoutlinkActionPerformed

private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

	try {
        Logger logger = Logger.getLogger(Search.class);

        IRequest searchRequest = new SearchRequestMessage();
        IParameter searchParams = new Parameter();
        searchParams.add(EnumParamsType.USERNAME, "DUMMY");
        searchParams.add(EnumParamsType.SEARCHKEY, ByteOperationUtil.convertBytesToString(DigestAdaptor.getInstance().getDigest(searchText.getText())));
        searchRequest.createRequest(EnumOperationType.SEARCH, searchParams);
        
        IResponse response = CommunicationServiceFactory.getInstance().executeRequest(searchRequest);
        //logger.info("Status of response is  : " + response.getStatus().getErrorId().toString());
        //logger.info("Message is " + response.getMessage());
    } catch (IOException ex) {
        Logger.getLogger(Search.class.getName()).error("Failed to create publish request", ex);
    } catch (Exception e) {
        Logger.getLogger(Search.class.getName()).error("Failed to send request to boot strap server", e);
    }
    this.setVisible(false);
    
    Search Results = new Search();
    Results.setVisible(true);
}//GEN-LAST:event_searchActionPerformed

private void PublishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PublishActionPerformed
    try {
        Logger logger = Logger.getLogger(Search.class);

        IRequest pubRequest = PublishRequestMessage.getPublishRequest();
        IResponse response = CommunicationServiceFactory.getInstance().executeRequest(pubRequest);
        logger.info("Status of response is  : " + response.getStatus().getErrorId().toString());
        logger.info("Message is " + response.getMessage());
    } catch (IOException ex) {
        Logger.getLogger(Search.class.getName()).error("Failed to create publish request", ex);
    } catch (Exception e) {
        Logger.getLogger(Search.class.getName()).error("Failed to send request to boot strap server", e);
    }



    PublishFrame Publish = new PublishFrame();
    //this.setVisible(false);
    Publish.setVisible(true);


    // IRequest publishRequest = new PublishRequestMessage();
    //     IParameter publishparams = new Parameter();
    //Response
    Publish.setVisible(false);
    PublishFrame newPub = new PublishFrame();
    newPub.setMessage("Successfully Published");
    Publish.setVisible(false);
    newPub.setVisible(true);
    newPub.setVisible(false);

}//GEN-LAST:event_PublishActionPerformed

private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
// TODO add your handling code here:
    Logger logger = Logger.getLogger(Search.class);
    try {
        IRequest logoutRequest = new LogoutRequestMessage();
        IParameter Logoutparams = new Parameter();
        logger.debug(Session.getInstance().getUsername());
        Logoutparams.add(EnumParamsType.USERNAME, Session.getInstance().getUsername());
        logoutRequest.createRequest(EnumOperationType.LOGOUT, Logoutparams);
        IResponse response = CommunicationServiceFactory.getInstance().executeRequest(logoutRequest);
        loggedOut logout = new loggedOut();
        this.setVisible(false);
        logout.setVisible(true);
    } catch (Exception e) {
        logger.error("User not logged in", e);
    }
}//GEN-LAST:event_LogoutActionPerformed

private void SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsActionPerformed
// TODO add your handling code here:
    SettingsFrame Settings = new SettingsFrame();
    //this.setVisible(false);
    Settings.setVisible(true);
}//GEN-LAST:event_SettingsActionPerformed

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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new Search().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Logout;
    private javax.swing.JMenu Options;
    private javax.swing.JMenuItem Publish;
    private javax.swing.JMenuItem Settings;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchText;
    // End of variables declaration//GEN-END:variables
}
