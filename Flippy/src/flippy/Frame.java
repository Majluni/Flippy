package flippy;

import javax.swing.ImageIcon;

/**
 * User interface for Flippy simulations.
 * 
 * @author Maurice Ajluni, Tanner Lisonbee
 * @version 1.0
 */
public class Frame extends javax.swing.JFrame
{
    /**
     * Creates new form Frame
     */
    public Frame()
    {
        initComponents();
        this.setIconImage(new ImageIcon("src/quarter.png").getImage());
        this.setTitle("Flippy (AKA Penney Ante)");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        settingsPanel = new javax.swing.JPanel();
        player2Label = new java.awt.Label();
        player1Input = new javax.swing.JTextField();
        player2Input = new javax.swing.JTextField();
        numberLabel = new java.awt.Label();
        numberInput = new javax.swing.JTextField();
        simulate = new javax.swing.JButton();
        player1Label = new java.awt.Label();
        theoretical = new javax.swing.JButton();
        outputPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        settingsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Settings"));
        settingsPanel.setPreferredSize(new java.awt.Dimension(800, 400));
        settingsPanel.setLayout(new java.awt.GridBagLayout());

        player2Label.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        player2Label.setText("Player 2:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        settingsPanel.add(player2Label, gridBagConstraints);

        player1Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1InputActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        settingsPanel.add(player1Input, gridBagConstraints);

        player2Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2InputActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        settingsPanel.add(player2Input, gridBagConstraints);

        numberLabel.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        numberLabel.setText("Number of Simulations:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        settingsPanel.add(numberLabel, gridBagConstraints);

        numberInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberInputActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        settingsPanel.add(numberInput, gridBagConstraints);

        simulate.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        simulate.setText("Simulate...");
        simulate.setEnabled(false);
        simulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        settingsPanel.add(simulate, gridBagConstraints);

        player1Label.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        player1Label.setText("Player 1:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        settingsPanel.add(player1Label, gridBagConstraints);

        theoretical.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        theoretical.setText("Find Chances...");
        theoretical.setEnabled(false);
        theoretical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theoreticalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        settingsPanel.add(theoretical, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(settingsPanel, gridBagConstraints);

        outputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        outputPanel.setPreferredSize(new java.awt.Dimension(800, 400));

        output.setEditable(false);
        output.setColumns(20);
        output.setRows(5);
        output.setText("Console ouput:");
        jScrollPane2.setViewportView(output);

        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(outputPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void player1InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1InputActionPerformed
        input1 = player1Input.getText();
        length = input1.length();
        
        if(!isValidString(input1.toUpperCase()))
        {
            ready1 = false;
            simulate.setEnabled(false);
            output.append("\n[ERROR]: \"" + input1 + "\" is not a valid entry!"
                    + "\n\tMust only include \"H\" or \"T\".");
        }
        else
        {
            ready1 = true;
            output.append("\nPlayer 1's input is now \"" + input1.toUpperCase() + "\".");
            
            if(ready2 && ready3)
                simulate.setEnabled(true);
            if(ready2)
                theoretical.setEnabled(true);
        }
    }//GEN-LAST:event_player1InputActionPerformed

    private void player2InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2InputActionPerformed
        input2 = player2Input.getText();
        
        if(!isValidString(input2.toUpperCase()))
        {
            ready2 = false;
            simulate.setEnabled(false);
            output.append("\n[ERROR]: \"" + input2 + "\" is not a valid entry!"
                    + "\n\tMust only include \"H\" or \"T\".");
        }
        else
        {
            ready2 = true;
            output.append("\nPlayer 2's input is now \"" + input2.toUpperCase() + "\".");
            
            if(ready1 && ready3)
                simulate.setEnabled(true);
            if(ready1)
                theoretical.setEnabled(true);
        }
    }//GEN-LAST:event_player2InputActionPerformed

    private void numberInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberInputActionPerformed
        if(!isValidInt(numberInput.getText()))
        {
            ready3 = false;
            simulate.setEnabled(false);
            output.append("\n[ERROR]: \"" + numberInput.getText() + "\" is not a valid entry!"
                    + "\n\tMust be an integer greater than zero.");
        }
        else
        {
            ready3 = true;
            num = Integer.parseInt(numberInput.getText());
            output.append("\nThe number of simulations to run is now \"" + num + "\".");
            
            if(ready1 && ready2)
                simulate.setEnabled(true);
        }
    }//GEN-LAST:event_numberInputActionPerformed

    private void simulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulateActionPerformed
        int length1 = input1.length();
        int length2 = input2.length();
        
        if(ready1 && ready2 && ready3 && length1 == length2 && !input1.equalsIgnoreCase(input2))
        {
            Flippy flippy = new Flippy(input1, input2, num);
            flippy.run();
            output.append("\n" + flippy.toString());
        }
        else if (length1 != length2)
            output.append("\n[ERROR]: Player inputs do not match in length!");
        else if (input1.equalsIgnoreCase(input2))
            output.append("\n[ERROR]: Player inputs cannot be the same!");
        else
            output.append("\n[ERROR]: Simulation is not ready! Check inputs.");
    }//GEN-LAST:event_simulateActionPerformed

    private void theoreticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theoreticalActionPerformed
        int length1 = input1.length();
        int length2 = input2.length();
        
        if(ready1 && ready2 && length1 == length2 && !input1.equalsIgnoreCase(input2))
        {
            Flippy flippy = new Flippy(input1, input2, 0);
            output.append("\n" + flippy.getTheoretical());
        }
        else if (length1 != length2)
            output.append("\n[ERROR]: Player inputs do not match in length!");
        else
            output.append("\n[ERROR]: Simulation is not ready! Check inputs.");
    }//GEN-LAST:event_theoreticalActionPerformed

    /**
     * @param choice
     * @return whether or not the input String is a valid entry
     */
    public boolean isValidString(String choice)
    {
        choice = choice.toUpperCase();

        //if any char's in the String is not h or t returns false
        for(int i = 0; i < choice.length(); i++)
        {
            if(choice.charAt(i) != 'H' && choice.charAt(i) != 'T')
                return false;
        }
        
        return true;
    }
    
    /**
     * @param num
     * @return whether or not the input integer is a valid entry
     */
    public boolean isValidInt(String num)
    {
        for(int i = 0; i < num.length(); i++)
        {
            try //attempts to parse the String, if no numbers present returns false
            {
                Integer.parseInt(num);
            }
            catch(NumberFormatException e)
            {
                return false;
            }
        }
        
        if (Integer.parseInt(num) > 0)
            return true;
        else
            return false;
    }
    
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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }
    
    private String input1, input2;
    private int num, length;
    private boolean ready1, ready2, ready3;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField numberInput;
    private java.awt.Label numberLabel;
    private javax.swing.JTextArea output;
    private javax.swing.JPanel outputPanel;
    private javax.swing.JTextField player1Input;
    private java.awt.Label player1Label;
    private javax.swing.JTextField player2Input;
    private java.awt.Label player2Label;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JButton simulate;
    private javax.swing.JButton theoretical;
    // End of variables declaration//GEN-END:variables
}