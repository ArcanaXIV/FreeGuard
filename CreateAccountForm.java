/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freeguard;

import java.awt.Color;

/**
 *
 * @author still
 */
public class CreateAccountForm extends javax.swing.JFrame
{

    /**
     * Creates new form CreateAccountForm
     */
    public CreateAccountForm()
    {
        initComponents();
        db = new DatabaseManager();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        emailTextBox = new javax.swing.JTextField();
        passwordTextBox = new javax.swing.JTextField();
        firstNameTextBox = new javax.swing.JTextField();
        lastNameTextBox = new javax.swing.JTextField();
        middleInitialTextBox = new javax.swing.JTextField();
        ssnTextBox = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        middleInitialLabel = new javax.swing.JLabel();
        ssnLabel = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        outputLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Account");
        setAlwaysOnTop(true);
        setResizable(false);

        emailTextBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                emailTextBoxActionPerformed(evt);
            }
        });

        ssnTextBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ssnTextBoxActionPerformed(evt);
            }
        });

        emailLabel.setText("Email address");

        passwordLabel.setText("Password");

        firstNameLabel.setText("First Name");

        lastNameLabel.setText("Last Name");

        middleInitialLabel.setText("Middle Initial");

        ssnLabel.setText("SSN");

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                createButtonActionPerformed(evt);
            }
        });

        outputLabel.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lastNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailLabel)
                                    .addComponent(emailTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(middleInitialLabel)
                                    .addComponent(middleInitialTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lastNameTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addComponent(firstNameTextBox)))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(passwordLabel)
                                        .addGap(92, 92, 92))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(passwordTextBox)
                                        .addGap(43, 43, 43)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ssnLabel)
                                    .addComponent(ssnTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(createButton)))
                            .addComponent(outputLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(middleInitialLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middleInitialTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(ssnLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssnTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(firstNameLabel)
                .addGap(2, 2, 2)
                .addComponent(firstNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lastNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createButton))
                .addGap(18, 18, 18)
                .addComponent(outputLabel)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_createButtonActionPerformed
    {//GEN-HEADEREND:event_createButtonActionPerformed

        String email = emailTextBox.getText().trim();
        String password = passwordTextBox.getText().trim();
        String firstName = firstNameTextBox.getText().trim();
        String lastName = lastNameTextBox.getText().trim();
        String middleInitial = middleInitialTextBox.getText().trim();
        String ssn = ssnTextBox.getText().trim();

        int pass = DatabaseManager.passwordCheck(password);
        switch (pass){
            case 1:
                outputLabel.setForeground(Color.red);
                outputLabel.setText("password too short");
                break;
            case 2:
                outputLabel.setForeground(Color.red);
                outputLabel.setText("password must contain at least 1 lowercase character");
                break;
            case 3:
                outputLabel.setForeground(Color.red);
                outputLabel.setText("password must contain at least 1 uppercase character");
                break;
            case 4:
                outputLabel.setForeground(Color.red);
                outputLabel.setText("password must contain at least 1 number");
                break;
            case 5:
                outputLabel.setForeground(Color.red);
                outputLabel.setText("password must complain at least 1 symbol");
                break;
        }
        boolean empty = emptyCheck(email, password, firstName, lastName, middleInitial, ssn);
        
        
        if (empty && pass == 0)
        {
            outputLabel.setForeground(new Color(34, 139, 34));
            outputLabel.setText("Account Created");
            db.runStatement("insert into accounts(`SSN`, `firstname`, `lastname`, `middleinitial`, `email`, `password`) "
                    + "values('" + ssn + "', '" + firstName + "', '" + lastName + "', '" + middleInitial + "', '" + email + "', '" + password + "');");
            
            dispose();
            new MainForm(email, password, firstName, lastName, middleInitial, ssn).run();

        }

    }//GEN-LAST:event_createButtonActionPerformed

    private boolean emptyCheck(String email, String password, String firstName, 
            String lastName, String middleInitial, String ssn)
    {
        if (email.isEmpty() || password.isEmpty() || firstName.isEmpty() ||
                lastName.isEmpty() || middleInitial.isEmpty() || ssn.isEmpty())
        {
            outputLabel.setForeground(Color.red);
            outputLabel.setText("field(s) left empty");
            return false;
        }
        else
            return true;
    }
    
    /*protected boolean passwordCheck(String password)
    {
        //variables for password strength verification
        String lowchars = "abcdefghijklmnopqrstuvwxyz";
        String upchars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String nums = "1234567890";
        String syms = "!@#$%^&*-=+_,.`~";
        int lowcharcount = 0;
        int upcharcount = 0;
        int numcount = 0;
        int symcount = 0;

        //get password character information
        for (int i = 0; i < password.length(); i++)
        {
            if (lowchars.contains(password.substring(i, i + 1)))
                lowcharcount++;
            if (upchars.contains(password.substring(i, i + 1)))
                upcharcount++;
            if (nums.contains(password.substring(i, i + 1)))
                numcount++;
            if (syms.contains(password.substring(i, i + 1)))
                symcount++;
        }

        //check password length
        if (password.length() < 8)
        {
            outputLabel.setForeground(Color.red);
            outputLabel.setText("password too short");
            return false;
        }
        //check for at least 1 lower case character
        if (lowcharcount == 0)
        {
            outputLabel.setForeground(Color.red);
            outputLabel.setText("password must contain at least 1 lowercase character");
            return false;
        }
        //check for at least 1 upper case character
        if (upcharcount == 0)
        {
            outputLabel.setForeground(Color.red);
            outputLabel.setText("password must contain at least 1 uppercase character");
            return false;
        }
        //check for at least number character
        if (numcount == 0)
        {
            outputLabel.setForeground(Color.red);
            outputLabel.setText("password must contain at least 1 number");
            return false;
        }
        //check for at least symbol character
        if (symcount == 0)
        {
            outputLabel.setForeground(Color.red);
            outputLabel.setText("password must complain at least 1 symbol");
            return false;
        }

        return true;
    }*/

    private void emailTextBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_emailTextBoxActionPerformed
    {//GEN-HEADEREND:event_emailTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextBoxActionPerformed

    private void ssnTextBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ssnTextBoxActionPerformed
    {//GEN-HEADEREND:event_ssnTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ssnTextBoxActionPerformed

    public void run()
    {

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new CreateAccountForm().setVisible(true);
            }
        });
    }

    private DatabaseManager db;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextBox;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextBox;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextBox;
    private javax.swing.JLabel middleInitialLabel;
    private javax.swing.JTextField middleInitialTextBox;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextBox;
    private javax.swing.JLabel ssnLabel;
    private javax.swing.JTextField ssnTextBox;
    // End of variables declaration//GEN-END:variables
}
