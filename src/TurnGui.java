/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author j40688
 */
public class TurnGui extends javax.swing.JFrame {

    
    public static AddPlayerGui addPlayer1; 
    public static GameBoardGui gameBoard1 = new GameBoardGui();

    
    public TurnGui(AddPlayerGui addPlayer) {
        
        addPlayer1 = addPlayer;
        addPlayer1.startGame();         
        
        addPlayer1.turnComplete = false;
        addPlayer1.currentPlayer = addPlayer1.players[addPlayer1.turn];
    
        addPlayer1.currentPlayer.setJustMoved(false);
        addPlayer1.currentPlayer.setHasSuggested(false);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
       
        
        initComponents();
        gameBoard1.setVisible(true);
        
        characterImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Characters/" + addPlayer1.currentPlayer.getName() + ".jpg")));
        setEnabled();

    }
    
    public static void setEnabled()
    {
        addPlayer1.currentPlayer.noteBook.setVisible(true);
        addPlayer1.currentPlayer.noteBook.setDefaultCloseOperation(HIDE_ON_CLOSE);
        
        if (addPlayer1.currentPlayer.canMove(gameBoard1, "up"))
        {
            moveUp.setEnabled(true);
        }
        
        else
        {
            moveUp.setEnabled(false);
        }
        
        if(addPlayer1.currentPlayer.canMove(gameBoard1, "down"))
        {
            moveDown.setEnabled(true);
        }
        
        else
        {
            moveDown.setEnabled(false);
        }
        
        if(addPlayer1.currentPlayer.canMove(gameBoard1, "right"))
        {
            moveRight.setEnabled(true);
        }
        
        else
        {
            moveRight.setEnabled(false);
        }
        
        if(addPlayer1.currentPlayer.canMove(gameBoard1, "left"))
        {
            moveLeft.setEnabled(true);
        }
        
        else
        {
            moveLeft.setEnabled(false);
        }
        
        if(addPlayer1.currentPlayer.canSuggest())
        {
            makeSuggestion.setEnabled(true);
        }
        
        else
        {
            makeSuggestion.setEnabled(false);
        }
        
        if(addPlayer1.currentPlayer.canMove(gameBoard1, "passage"))
        {
            secretPassage.setEnabled(true);
        }
        
        else
        {
            secretPassage.setEnabled(false);
        }
    }
    
    
    public int whoseTurnIsIt(int lastPlayerIndex)
    {
        int next;
        if(lastPlayerIndex==0)
        {
            next = addPlayer1.players.length-1;
        }
        else
        {
            next = lastPlayerIndex-1;
        }
        
        return next;
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
        characterImage = new javax.swing.JLabel();
        viewRules = new javax.swing.JButton();
        viewCards = new javax.swing.JButton();
        accuse = new javax.swing.JButton();
        endTurn = new javax.swing.JButton();
        makeSuggestion = new javax.swing.JButton();
        moveRight = new javax.swing.JButton();
        moveLeft = new javax.swing.JButton();
        moveUp = new javax.swing.JButton();
        moveDown = new javax.swing.JButton();
        secretPassage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        characterImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Characters/Mrs Scarlet.jpg"))); // NOI18N
        characterImage.setText("jLabel1");

        viewRules.setText("View Rules");
        viewRules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRulesActionPerformed(evt);
            }
        });

        viewCards.setText("View Cards");
        viewCards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCardsActionPerformed(evt);
            }
        });

        accuse.setText("Accuse");
        accuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accuseActionPerformed(evt);
            }
        });

        endTurn.setText("End Turn");
        endTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endTurnActionPerformed(evt);
            }
        });

        makeSuggestion.setText("Make Suggestion");
        makeSuggestion.setEnabled(false);
        makeSuggestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeSuggestionActionPerformed(evt);
            }
        });

        moveRight.setText("Move RIght");
        moveRight.setActionCommand("Move Right");
        moveRight.setEnabled(false);
        moveRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveRightActionPerformed(evt);
            }
        });

        moveLeft.setText("Move Left");
        moveLeft.setEnabled(false);
        moveLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveLeftActionPerformed(evt);
            }
        });

        moveUp.setText("Move Up");
        moveUp.setEnabled(false);
        moveUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveUpActionPerformed(evt);
            }
        });

        moveDown.setText("Move Down");
        moveDown.setEnabled(false);
        moveDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveDownActionPerformed(evt);
            }
        });

        secretPassage.setText("Take Secret Passage");
        secretPassage.setEnabled(false);
        secretPassage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secretPassageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(characterImage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewRules)
                    .addComponent(viewCards)
                    .addComponent(accuse)
                    .addComponent(endTurn)
                    .addComponent(makeSuggestion)
                    .addComponent(moveRight)
                    .addComponent(moveLeft)
                    .addComponent(moveUp)
                    .addComponent(moveDown)
                    .addComponent(secretPassage))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {accuse, endTurn, makeSuggestion, moveDown, moveLeft, moveRight, moveUp, secretPassage, viewCards, viewRules});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(characterImage)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(viewRules)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewCards)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accuse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endTurn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(makeSuggestion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moveLeft)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moveRight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moveUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moveDown)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secretPassage)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewRulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRulesActionPerformed
        Rules rules = new Rules();
        rules.setVisible(true);
        rules.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }//GEN-LAST:event_viewRulesActionPerformed

    private void viewCardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCardsActionPerformed

       ViewCardsGui viewCards = new ViewCardsGui(addPlayer1);
       viewCards.setVisible(true);
       viewCards.setDefaultCloseOperation(HIDE_ON_CLOSE);
      
    }//GEN-LAST:event_viewCardsActionPerformed

    private void accuseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accuseActionPerformed
        
       AccuseGUI accuse = new AccuseGUI();
       accuse.setVisible(true);
       accuse.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       endTurn.doClick();

    }//GEN-LAST:event_accuseActionPerformed

    private void endTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endTurnActionPerformed
    addPlayer1.currentPlayer.noteBook.setVisible(false);
    addPlayer1.turn = addPlayer1.whoseTurnIsIt(addPlayer1.turn);
    addPlayer1.currentPlayer = addPlayer1.players[addPlayer1.turn];
    characterImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Characters/" + addPlayer1.currentPlayer.getName() + ".jpg")));
    setEnabled();
    }//GEN-LAST:event_endTurnActionPerformed

    private void makeSuggestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeSuggestionActionPerformed
        SuggestGui suggest = new SuggestGui();
        suggest.setVisible(true);
        suggest.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        endTurn.doClick();

    }//GEN-LAST:event_makeSuggestionActionPerformed

    private void moveLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveLeftActionPerformed
        addPlayer1.currentPlayer.move(gameBoard1, "left");
        addPlayer1.currentPlayer.setJustMoved(true);
        setEnabled();
        moveDown.setEnabled(false);
        moveUp.setEnabled(false);
        moveRight.setEnabled(false);
        moveLeft.setEnabled(false);

 
    }//GEN-LAST:event_moveLeftActionPerformed

    private void moveRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveRightActionPerformed

        addPlayer1.currentPlayer.move(gameBoard1, "right");
        addPlayer1.currentPlayer.setJustMoved(true);
        setEnabled();
        moveDown.setEnabled(false);
        moveUp.setEnabled(false);
        moveRight.setEnabled(false);
        moveLeft.setEnabled(false);
    }//GEN-LAST:event_moveRightActionPerformed

    private void moveUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveUpActionPerformed

        addPlayer1.currentPlayer.move(gameBoard1, "up");
        addPlayer1.currentPlayer.setJustMoved(true);
        setEnabled();
        moveDown.setEnabled(false);
        moveUp.setEnabled(false);
        moveRight.setEnabled(false);
        moveLeft.setEnabled(false);
    }//GEN-LAST:event_moveUpActionPerformed

    private void moveDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveDownActionPerformed

        addPlayer1.currentPlayer.move(gameBoard1, "down");
        addPlayer1.currentPlayer.setJustMoved(true);
        setEnabled();
        moveDown.setEnabled(false);
        moveUp.setEnabled(false);
        moveRight.setEnabled(false);
        moveLeft.setEnabled(false);
    }//GEN-LAST:event_moveDownActionPerformed

    private void secretPassageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secretPassageActionPerformed
        addPlayer1.currentPlayer.move(gameBoard1, "passage");
        addPlayer1.currentPlayer.setJustMoved(true);
        setEnabled();
        moveDown.setEnabled(false);
        moveUp.setEnabled(false);
        moveRight.setEnabled(false);
        moveLeft.setEnabled(false);
    }//GEN-LAST:event_secretPassageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton accuse;
    private javax.swing.JLabel characterImage;
    public javax.swing.JButton endTurn;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JButton makeSuggestion;
    public static javax.swing.JButton moveDown;
    public static javax.swing.JButton moveLeft;
    public static javax.swing.JButton moveRight;
    public static javax.swing.JButton moveUp;
    public static javax.swing.JButton secretPassage;
    public javax.swing.JButton viewCards;
    public javax.swing.JButton viewRules;
    // End of variables declaration//GEN-END:variables
}
