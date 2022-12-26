
import java.awt.Color;
import static java.awt.Color.magenta;
import static java.awt.Color.orange;
import static java.awt.Color.white;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hp
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     * 
     */
    private String turn = "O";
    private int xCount = 0;
    private int oCount = 0;
    
    
    public NewJFrame() {
        initComponents();
    }
    
    private void ChoosePlayer(){
        if(turn.equalsIgnoreCase("X")){
            turn = "O";
        }else{
            turn = "X";
        }
    }
    
    private void setScore(){
        xScore.setText(String.valueOf(xCount));
        oScore.setText(String.valueOf(oCount));
    }
    
    private void reset(){
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        
        button1.setBackground(white);
        button2.setBackground(white);
        button3.setBackground(white);
        button4.setBackground(white);
        button5.setBackground(white);
        button6.setBackground(white);
        button7.setBackground(white);
        button8.setBackground(white);
        button9.setBackground(white);
        
        turn = "O";
    }
    private void WinningPlayer(){
        String btn1 = button1.getText();
        String btn2 = button2.getText();
        String btn3 = button3.getText();
        String btn4 = button4.getText();
        String btn5 = button5.getText();
        String btn6 = button6.getText();
        String btn7 = button7.getText();
        String btn8 = button8.getText();
        String btn9 = button9.getText();
        
        if(btn1 == btn2 && btn2 == btn3 && btn1 != ""){
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg = "Player O Wins";
                oCount++;
            }
            else{
                msg = "Player X Wins";
                xCount++;
            }
            setScore();
            JOptionPane.showMessageDialog(this, msg, "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            
            button1.setBackground(orange);
            button2.setBackground(orange);
            button3.setBackground(orange);
            
            reset();
        }
        if(btn4 == btn5 && btn5 == btn6 && btn4 != ""){
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg = "Player O Wins";
                oCount++;
            }
            else{
                msg = "Player X Wins";
                xCount++;
            }
            setScore();
            JOptionPane.showMessageDialog(this, msg, "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            
            button4.setBackground(orange);
            button5.setBackground(orange);
            button6.setBackground(orange);
            
            reset();
        }
        if(btn7 == btn8 && btn8 == btn9 && btn7 != ""){
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg = "Player O Wins";
                oCount++;
            }
            else{
                msg = "Player X Wins";
                xCount++;
            }
            setScore();
            JOptionPane.showMessageDialog(this, msg, "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            
            button7.setBackground(orange);
            button8.setBackground(orange);
            button9.setBackground(orange);
            
            reset();
        }
        if(btn1 == btn4 && btn4 == btn7 && btn1 != ""){
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg = "Player O Wins";
                oCount++;
            }
            else{
                msg = "Player X Wins";
                xCount++;
            }
            setScore();
            JOptionPane.showMessageDialog(this, msg, "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            
            button1.setBackground(orange);
            button4.setBackground(orange);
            button7.setBackground(orange);
            
            reset();
        }
        if(btn2 == btn5 && btn5 == btn8 && btn2 != ""){
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg = "Player O Wins";
                oCount++;
            }
            else{
                msg = "Player X Wins";
                xCount++;
            }
            setScore();
            JOptionPane.showMessageDialog(this, msg, "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            
            button2.setBackground(orange);
            button5.setBackground(orange);
            button8.setBackground(orange);
            
            reset();
        }
        if(btn3 == btn6 && btn6 == btn9 && btn6 != ""){
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg = "Player O Wins";
                oCount++;
            }
            else{
                msg = "Player X Wins";
                xCount++;
            }
            setScore();
            JOptionPane.showMessageDialog(this, msg, "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            
            button3.setBackground(orange);
            button6.setBackground(orange);
            button9.setBackground(orange);
            
            reset();
        }
        if(btn1 == btn5 && btn5 == btn9 && btn5 != ""){
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg = "Player O Wins";
                oCount++;
            }
            else{
                msg = "Player X Wins";
                xCount++;
            }
            setScore();
            JOptionPane.showMessageDialog(this, msg, "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            
            button1.setBackground(orange);
            button5.setBackground(orange);
            button9.setBackground(orange);
            
            reset();
        }
        if(btn3 == btn5 && btn5 == btn7 && btn5 != ""){
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg = "Player O Wins";
                oCount++;
            }
            else{
                msg = "Player X Wins";
                xCount++;
            }
            setScore();
            JOptionPane.showMessageDialog(this, msg, "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            
            button3.setBackground(orange);
            button5.setBackground(orange);
            button7.setBackground(orange);
            
            reset();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button4 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        xScore = new javax.swing.JLabel();
        oScore = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        button4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        button4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        button7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        button5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button8.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        button8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button6.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        button6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        button3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 42)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SCORECARD");
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 30)); // NOI18N
        jLabel2.setText("PLAYER X :");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 30)); // NOI18N
        jLabel3.setText("PLAYER O :");

        xScore.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 30)); // NOI18N
        xScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xScore.setText("_ _ _ ");

        oScore.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 30)); // NOI18N
        oScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oScore.setText("_ _ _ ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xScore, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oScore, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(xScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oScore, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jButton10.setBackground(new java.awt.Color(255, 0, 0));
        jButton10.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 40)); // NOI18N
        jButton10.setText("EXIT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(102, 255, 51));
        jButton11.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 40)); // NOI18N
        jButton11.setText("RESET");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        button9.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        button9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        button1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        button1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        button2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 153, 153));
        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 56)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        JFrame confirmExit = new JFrame("EXIT");
        
        if(JOptionPane.showConfirmDialog(confirmExit, "Confirm if you want to exit?", "TIC TAC TOE", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        if(button1.getText() != "") return;
        button1.setText(turn);
        
        if(turn.equalsIgnoreCase("x")){
            button1.setForeground(Color.red);
        }else{
            button1.setForeground(magenta);
        }
        ChoosePlayer();
        WinningPlayer();
        //button1.setEnabled(false);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        if(button2.getText() != "") return;
        button2.setText(turn);
        
        if(turn.equalsIgnoreCase("x")){
            button2.setForeground(Color.red);
        }else{
            button2.setForeground(magenta);
        }
        ChoosePlayer();
        WinningPlayer();
        //button2.setEnabled(false);
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        if(button3.getText() != "") return;
        button3.setText(turn);
        
        if(turn.equalsIgnoreCase("x")){
            button3.setForeground(Color.red);
        }else{
            button3.setForeground(magenta);
        }
        ChoosePlayer();
        WinningPlayer();
        //button3.setEnabled(false);
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        if(button4.getText() != "") return;
        button4.setText(turn);
        
        if(turn.equalsIgnoreCase("x")){
            button4.setForeground(Color.red);
        }else{
            button4.setForeground(magenta);
        }
        ChoosePlayer();
        //button4.setEnabled(false);
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
        if(button5.getText() != "") return;
        button5.setText(turn);
        
        if(turn.equalsIgnoreCase("x")){
            button5.setForeground(Color.red);
        }else{
            button5.setForeground(magenta);
        }
        ChoosePlayer();
        WinningPlayer();
        //button5.setEnabled(false);
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
        if(button6.getText() != "") return;
        button6.setText(turn);
        
        if(turn.equalsIgnoreCase("x")){
            button6.setForeground(Color.red);
        }else{
            button6.setForeground(magenta);
        }
        ChoosePlayer();
        WinningPlayer();
        //button6.setEnabled(false);
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        // TODO add your handling code here:
        if(button7.getText() != "") return;
        button7.setText(turn);
        
        if(turn.equalsIgnoreCase("x")){
            button7.setForeground(Color.red);
        }else{
            button7.setForeground(magenta);
        }
        ChoosePlayer();
        WinningPlayer();
        //button7.setEnabled(false);
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        // TODO add your handling code here:
        if(button8.getText() != "") return;
        button8.setText(turn);
        
        if(turn.equalsIgnoreCase("x")){
            button8.setForeground(Color.red);
        }else{
            button8.setForeground(magenta);
        }
        ChoosePlayer();
        WinningPlayer();
        //button8.setEnabled(false);
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        // TODO add your handling code here:
        if(button9.getText() != "") return;
        button9.setText(turn);
        
        if(turn.equalsIgnoreCase("x")){
            button9.setForeground(Color.red);
        }else{
            button9.setForeground(magenta);
        }
        ChoosePlayer();
        WinningPlayer();
        //button9.setEnabled(false);
    }//GEN-LAST:event_button9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        xScore.setText("_ _ _");
        oScore.setText("_ _ _");
        
        xCount = 0;
        oCount = 0;
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel oScore;
    private javax.swing.JLabel xScore;
    // End of variables declaration//GEN-END:variables

    private void jButton11ActionPerformed() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
