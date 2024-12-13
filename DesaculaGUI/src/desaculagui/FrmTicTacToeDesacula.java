package desaculagui;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author desac
 */
public class FrmTicTacToeDesacula extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    
    public FrmTicTacToeDesacula() {
        initComponents();
    }
    
    private void gameScore()
    {
        jblPlayerX.setText(String.valueOf(xCount));
        jblPlayerO.setText(String.valueOf(oCount));
    }
    
    private void choose_a_player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    }
    
    private void winningGame()
    {
        String b1 = j1.getText();
        String b2 = j2.getText();
        String b3 = j3.getText();
        String b4 = j4.getText();
        String b5 = j5.getText();
        String b6 = j6.getText();
        String b7 = j7.getText();
        String b8 = j8.getText();
        String b9 = j9.getText();
        
        if(b1 == ("X") && b2 == ("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j1.setBackground(Color.ORANGE);
            j2.setBackground(Color.ORANGE);
            j3.setBackground(Color.ORANGE);
            xCount++;
            gameScore();
        }
        if(b4 == ("X") && b5 == ("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j4.setBackground(Color.CYAN);
            j5.setBackground(Color.CYAN);
            j6.setBackground(Color.CYAN);
            xCount++;
            gameScore();
        }
        if(b7 == ("X") && b8 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j7.setBackground(Color.GREEN);
            j8.setBackground(Color.GREEN);
            j9.setBackground(Color.GREEN);
            xCount++;
            gameScore();
        }
        
        if(b1 == ("O") && b2 == ("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j1.setBackground(Color.ORANGE);
            j2.setBackground(Color.ORANGE);
            j3.setBackground(Color.ORANGE);
            oCount++;
            gameScore();
        }
        if(b4 == ("O") && b5 == ("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j4.setBackground(Color.CYAN);
            j5.setBackground(Color.CYAN);
            j6.setBackground(Color.CYAN);
            oCount++;
            gameScore();
        }
        if(b7 == ("O") && b8 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j7.setBackground(Color.YELLOW);
            j8.setBackground(Color.YELLOW);
            j9.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
        }
        //X
        if(b1 == ("X") && b4 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j1.setBackground(Color.BLUE);
            j4.setBackground(Color.BLUE);
            j7.setBackground(Color.BLUE);
            xCount++;
            gameScore();
        }
        //O
        if(b1 == ("O") && b4 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j1.setBackground(Color.PINK);
            j4.setBackground(Color.PINK);
            j7.setBackground(Color.PINK);
            oCount++;
            gameScore();
        }
        //X
        if(b2 == ("X") && b5 == ("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j2.setBackground(Color.BLACK);
            j5.setBackground(Color.BLACK);
            j8.setBackground(Color.BLACK);
            xCount++;
            gameScore();    
        }
        //O
        if(b2 == ("O") && b5 == ("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j2.setBackground(Color.GREEN);
            j5.setBackground(Color.GREEN);
            j8.setBackground(Color.GREEN);
            oCount++;
            gameScore();
        }
        //X
        if(b3 == ("O") && b6 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j3.setBackground(Color.GREEN);
            j6.setBackground(Color.GREEN);
            j9.setBackground(Color.GREEN);
            oCount++;
            gameScore();
        }
        //O
        if(b3 == ("X") && b6 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j3.setBackground(Color.GREEN);
            j6.setBackground(Color.GREEN);
            j9.setBackground(Color.GREEN);
            xCount++;
            gameScore();
        }
        if(b1 == ("O") && b5 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j1.setBackground(Color.GREEN);
            j5.setBackground(Color.GREEN);
            j9.setBackground(Color.GREEN);
            oCount++;
            gameScore();
        }
        
        if(b1 == ("X") && b5 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j1.setBackground(Color.GREEN);
            j5.setBackground(Color.GREEN);
            j9.setBackground(Color.GREEN);
            xCount++;
            gameScore();
        }
        
        if(b3 == ("O") && b5 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j3.setBackground(Color.GREEN);
            j5.setBackground(Color.GREEN);
            j7.setBackground(Color.GREEN);
            oCount++;
            gameScore();
        }
        
        if(b3 == ("X") && b5 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j3.setBackground(Color.GREEN);
            j5.setBackground(Color.GREEN);
            j7.setBackground(Color.GREEN);
            xCount++;
            gameScore();
        }
    }
    
    private JFrame frame;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        j2 = new javax.swing.JButton();
        j3 = new javax.swing.JButton();
        j1 = new javax.swing.JButton();
        j4 = new javax.swing.JButton();
        j5 = new javax.swing.JButton();
        j6 = new javax.swing.JButton();
        j7 = new javax.swing.JButton();
        j8 = new javax.swing.JButton();
        j9 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jblPlayerX = new javax.swing.JLabel();
        jblPlayerO = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnNewGame = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnclose_Desacula = new javax.swing.JButton();
        btnminimize_Desacula = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        jLabel3.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Student ID: 0322-1416\n");

        jLabel4.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Student Name: Angel Anne H. Desacula");

        jLabel5.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Section: BSCS 3GAV-1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText(" Desacula's Tic Tac Toe Game ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        j2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        j2.setMaximumSize(new java.awt.Dimension(65, 25));
        j2.setMinimumSize(new java.awt.Dimension(65, 25));
        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });

        j3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        j3.setMaximumSize(new java.awt.Dimension(65, 25));
        j3.setMinimumSize(new java.awt.Dimension(65, 25));
        j3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3ActionPerformed(evt);
            }
        });

        j1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        j1.setMaximumSize(new java.awt.Dimension(65, 25));
        j1.setMinimumSize(new java.awt.Dimension(65, 25));
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });

        j4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        j4.setMaximumSize(new java.awt.Dimension(65, 25));
        j4.setMinimumSize(new java.awt.Dimension(65, 25));
        j4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4ActionPerformed(evt);
            }
        });

        j5.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        j5.setMaximumSize(new java.awt.Dimension(65, 25));
        j5.setMinimumSize(new java.awt.Dimension(65, 25));
        j5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5ActionPerformed(evt);
            }
        });

        j6.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        j6.setMaximumSize(new java.awt.Dimension(65, 25));
        j6.setMinimumSize(new java.awt.Dimension(65, 25));
        j6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6ActionPerformed(evt);
            }
        });

        j7.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        j7.setMaximumSize(new java.awt.Dimension(65, 25));
        j7.setMinimumSize(new java.awt.Dimension(65, 25));
        j7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j7ActionPerformed(evt);
            }
        });

        j8.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        j8.setMaximumSize(new java.awt.Dimension(65, 25));
        j8.setMinimumSize(new java.awt.Dimension(65, 25));
        j8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j8ActionPerformed(evt);
            }
        });

        j9.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        j9.setMaximumSize(new java.awt.Dimension(65, 25));
        j9.setMinimumSize(new java.awt.Dimension(65, 25));
        j9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(j8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(j9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel9.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 255, 255));
        jLabel9.setText("Player O:");

        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 255, 255));
        jLabel10.setText("Player X:");

        jblPlayerX.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jblPlayerX.setForeground(new java.awt.Color(51, 255, 255));
        jblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerX.setText("0");
        jblPlayerX.setOpaque(true);

        jblPlayerO.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jblPlayerO.setForeground(new java.awt.Color(51, 255, 255));
        jblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerO.setText("0");
        jblPlayerO.setOpaque(true);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jblPlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jblPlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jblPlayerX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jblPlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnNewGame.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        btnNewGame.setForeground(new java.awt.Color(0, 51, 51));
        btnNewGame.setText("New Game");
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 51, 51));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        btnReset.setForeground(new java.awt.Color(0, 51, 51));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addGap(13, 13, 13)
                        .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                    .addComponent(btnNewGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 255, 255));
        jLabel12.setText("CREATED BY:");

        jLabel15.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 255, 255));
        jLabel15.setText("ANGEL ANNE H. DESACULA");

        jLabel14.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 255, 255));
        jLabel14.setText("3GAV- 1\n");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(353, 353, 353))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(59, 59, 59)))
                        .addGap(307, 307, 307))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        btnclose_Desacula.setBackground(new java.awt.Color(255, 255, 255));
        btnclose_Desacula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desaculagui/cancel.png"))); // NOI18N
        btnclose_Desacula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnclose_Desacula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclose_DesaculaActionPerformed(evt);
            }
        });

        btnminimize_Desacula.setBackground(new java.awt.Color(255, 255, 255));
        btnminimize_Desacula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desaculagui/minimize-sign.png"))); // NOI18N
        btnminimize_Desacula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnminimize_Desacula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminimize_DesaculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnclose_Desacula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnminimize_Desacula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnclose_Desacula, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnminimize_Desacula, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
      frame = new JFrame("Exit");
      
      if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Tic Tac Toe",
              JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
      {
          System.exit(0);
      }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        j1.setEnabled(true);
        j2.setEnabled(true);
        j3.setEnabled(true);
        j4.setEnabled(true);
        j5.setEnabled(true);
        j6.setEnabled(true);
        j7.setEnabled(true);
        j8.setEnabled(true);
        j9.setEnabled(true);
        
        jblPlayerX.setText("0");
        jblPlayerO.setText("0");
        
        j1.setText("");
        j2.setText("");
        j3.setText("");
        j4.setText("");
        j5.setText("");
        j6.setText("");
        j7.setText("");
        j8.setText("");
        j9.setText("");
        
        j1.setBackground(Color.WHITE);
        j2.setBackground(Color.WHITE);
        j3.setBackground(Color.WHITE);
        j4.setBackground(Color.WHITE);
        j5.setBackground(Color.WHITE);
        j6.setBackground(Color.WHITE);
        j7.setBackground(Color.WHITE);
        j8.setBackground(Color.WHITE);
        j9.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnResetActionPerformed

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed
        j1.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
           checker = true;
        }
        choose_a_player();
        winningGame();
        
        
        
    }//GEN-LAST:event_j1ActionPerformed

    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed
        j2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
           checker = true;
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_j2ActionPerformed

    private void j3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3ActionPerformed
       j3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
           checker = true;
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_j3ActionPerformed

    private void j4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4ActionPerformed
       j4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
           checker = true;
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_j4ActionPerformed

    private void j5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5ActionPerformed
        j5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
           checker = true;
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_j5ActionPerformed

    private void j6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j6ActionPerformed
        j6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
           checker = true;
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_j6ActionPerformed

    private void j7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j7ActionPerformed
        j7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
           checker = true;
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_j7ActionPerformed

    private void j8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j8ActionPerformed
        j8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
           checker = true;
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_j8ActionPerformed

    private void j9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j9ActionPerformed
        j9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
           checker = true;
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_j9ActionPerformed

    private void btnminimize_DesaculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminimize_DesaculaActionPerformed
         this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnminimize_DesaculaActionPerformed

    private void btnclose_DesaculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclose_DesaculaActionPerformed
          this.dispose();
    }//GEN-LAST:event_btnclose_DesaculaActionPerformed

    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        j1.setEnabled(true);
        j2.setEnabled(true);
        j3.setEnabled(true);
        j4.setEnabled(true);
        j5.setEnabled(true);
        j6.setEnabled(true);
        j7.setEnabled(true);
        j8.setEnabled(true);
        j9.setEnabled(true);
        
        j1.setText("");
        j2.setText("");
        j3.setText("");
        j4.setText("");
        j5.setText("");
        j6.setText("");
        j7.setText("");
        j8.setText("");
        j9.setText("");
        
        j1.setBackground(Color.WHITE);
        j2.setBackground(Color.WHITE);
        j3.setBackground(Color.WHITE);
        j4.setBackground(Color.WHITE);
        j5.setBackground(Color.WHITE);
        j6.setBackground(Color.WHITE);
        j7.setBackground(Color.WHITE);
        j8.setBackground(Color.WHITE);
        j9.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnNewGameActionPerformed
 
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
            java.util.logging.Logger.getLogger(FrmTicTacToeDesacula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTicTacToeDesacula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTicTacToeDesacula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTicTacToeDesacula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTicTacToeDesacula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnclose_Desacula;
    private javax.swing.JButton btnminimize_Desacula;
    private javax.swing.JButton j1;
    private javax.swing.JButton j2;
    private javax.swing.JButton j3;
    private javax.swing.JButton j4;
    private javax.swing.JButton j5;
    private javax.swing.JButton j6;
    private javax.swing.JButton j7;
    private javax.swing.JButton j8;
    private javax.swing.JButton j9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel jblPlayerO;
    private javax.swing.JLabel jblPlayerX;
    // End of variables declaration//GEN-END:variables
}
