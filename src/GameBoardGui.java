/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author musa-
 */
public class GameBoardGui extends javax.swing.JFrame {

    private static String[][] boardMatrix;
    private static boolean[][] occupancyMatrix;
    
    //sets each coordinate on the board
    GameBoardGui()
    {
        initComponents();
        boardMatrix = new String[7][7];
        boardMatrix[1][1] = "Conservatory";
        boardMatrix[1][3] = "Library";
        boardMatrix[1][5] = "Study";
        boardMatrix[3][1] = "Ballroom";
        boardMatrix[3][3] = "Billiard Room";
        boardMatrix[3][5] = "Hall";
        boardMatrix[5][1] = "Kitchen";
        boardMatrix[5][3] = "Dining Room";
        boardMatrix[5][5] = "Lounge";
        
        boardMatrix[0][0] = "null";
        boardMatrix[0][1] = "null";
        boardMatrix[0][3] = "null";
        boardMatrix[0][5] = "null";
        boardMatrix[0][6] = "null";
        boardMatrix[6][0] = "null";
        boardMatrix[6][1] = "null";
        boardMatrix[6][2] = "null";
        boardMatrix[6][3] = "null";
        boardMatrix[6][5] = "null";
        boardMatrix[6][6] = "null";
        
        boardMatrix[0][0] = "null";
        boardMatrix[1][0] = "null";
        boardMatrix[3][0] = "null";
        boardMatrix[5][0] = "null";
        boardMatrix[6][0] = "null";
        boardMatrix[0][6] = "null";
        boardMatrix[1][6] = "null";
        boardMatrix[2][6] = "null";
        boardMatrix[3][6] = "null";
        boardMatrix[5][6] = "null";
        boardMatrix[6][6] = "null";
        
        boardMatrix[2][2] = "null";
        boardMatrix[2][4] = "null";
        boardMatrix[4][2] = "null";
        boardMatrix[4][4] = "null";
        
        
        boardMatrix[2][1] = "hallway";
        boardMatrix[2][3] = "hallway";
        boardMatrix[2][5] = "hallway";
        boardMatrix[4][1] = "hallway";
        boardMatrix[4][3] = "hallway";
        boardMatrix[4][5] = "hallway";
        boardMatrix[1][2] = "hallway";
        boardMatrix[1][4] = "hallway";
        boardMatrix[3][2] = "hallway";
        boardMatrix[3][4] = "hallway";
        boardMatrix[5][2] = "hallway";
        boardMatrix[5][4] = "hallway";
        
        boardMatrix[0][2] = "startPeacock";
        boardMatrix[0][4] = "startPlumb";
        boardMatrix[2][0] = "startGreen";
        boardMatrix[4][0] = "startWhite";
        boardMatrix[6][4] = "startMustard";
        boardMatrix[4][6] = "startScarlet";
        
        occupancyMatrix = new boolean[7][7];
        for(int i = 0; i < 7; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                occupancyMatrix[i][j] = false;
            }
        }
        
        occupancyMatrix[0][2] = true;
        occupancyMatrix[0][4] = true;
        occupancyMatrix[2][0] = true;
        occupancyMatrix[4][0] = true;
        occupancyMatrix[6][4] = true;
        occupancyMatrix[4][6] = true;
        
    }
    
    boolean isHallway(int x, int y)
    {
        return boardMatrix[x][y].equals("hallway");
    }
    
    boolean isRoom(int x, int y)
    {
        switch(boardMatrix[x][y])
        {
            case ("Study"):
                return true;
            case ("Library"):
                return true;   
            case ("Conservatory"):
                return true;
            case ("Hall"):
                return true;
            case ("Billiard Room"):
                return true;
            case ("Ballroom"):
                return true;
            case ("Lounge"):
                return true;
            case ("Dining Room"):
                return true;
            case ("Kitchen"):
                return true;
            default:
                return false;
        }
    }
    
    boolean isOccupied(int x, int y)
    {
        return occupancyMatrix[x][y];
    }
    
    void setOccupied(int x, int y, boolean b)
    {
        occupancyMatrix[x][y] = b;
    }
    
    boolean hasPassage(int x, int y)
    {
        return(x==1||x==5)&&(y==1||y==5);
    }
    
    String getRoom(int x, int y)
    {
        return boardMatrix[x][y];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        zeroTwo1 = new javax.swing.JLabel();
        zeroFour1 = new javax.swing.JLabel();
        oneOne1 = new javax.swing.JLabel();
        oneTwo1 = new javax.swing.JLabel();
        oneThree1 = new javax.swing.JLabel();
        oneFour1 = new javax.swing.JLabel();
        oneFive1 = new javax.swing.JLabel();
        twoZero1 = new javax.swing.JLabel();
        twoOne1 = new javax.swing.JLabel();
        twoTwo1 = new javax.swing.JLabel();
        twoThree1 = new javax.swing.JLabel();
        twoFour1 = new javax.swing.JLabel();
        twoFive1 = new javax.swing.JLabel();
        threeOne1 = new javax.swing.JLabel();
        threeTwo1 = new javax.swing.JLabel();
        threeThree1 = new javax.swing.JLabel();
        threeFour1 = new javax.swing.JLabel();
        threeFive1 = new javax.swing.JLabel();
        fourZero1 = new javax.swing.JLabel();
        fourOne1 = new javax.swing.JLabel();
        fourTwo1 = new javax.swing.JLabel();
        fourThree1 = new javax.swing.JLabel();
        fourFour1 = new javax.swing.JLabel();
        fourFive1 = new javax.swing.JLabel();
        fourSix1 = new javax.swing.JLabel();
        fiveOne1 = new javax.swing.JLabel();
        fiveTwo1 = new javax.swing.JLabel();
        fiveThree1 = new javax.swing.JLabel();
        fiveFour1 = new javax.swing.JLabel();
        fiveFive1 = new javax.swing.JLabel();
        sixFour1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 51, 255));
        setLocation(new java.awt.Point(500, 0));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        zeroTwo1.setBackground(new java.awt.Color(255, 204, 0));
        zeroTwo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Characters/Mrs Peacock.jpg"))); // NOI18N
        zeroTwo1.setToolTipText("");
        zeroTwo1.setIconTextGap(0);
        zeroTwo1.setOpaque(true);
        zeroTwo1.setPreferredSize(new java.awt.Dimension(24, 16));

        zeroFour1.setBackground(new java.awt.Color(255, 204, 0));
        zeroFour1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Characters/Prof Plumb.jpg"))); // NOI18N
        zeroFour1.setToolTipText("");
        zeroFour1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        zeroFour1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        zeroFour1.setOpaque(true);
        zeroFour1.setPreferredSize(new java.awt.Dimension(24, 16));
        zeroFour1.setVerifyInputWhenFocusTarget(false);
        zeroFour1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        oneOne1.setBackground(new java.awt.Color(255, 153, 0));
        oneOne1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rooms/Conservatory.jpg"))); // NOI18N
        oneOne1.setOpaque(true);
        oneOne1.setPreferredSize(new java.awt.Dimension(24, 16));

        oneTwo1.setBackground(new java.awt.Color(255, 204, 0));
        oneTwo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hallway.jpg"))); // NOI18N
        oneTwo1.setOpaque(true);
        oneTwo1.setPreferredSize(new java.awt.Dimension(24, 16));

        oneThree1.setBackground(new java.awt.Color(255, 153, 0));
        oneThree1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rooms/Library.jpg"))); // NOI18N
        oneThree1.setOpaque(true);
        oneThree1.setPreferredSize(new java.awt.Dimension(24, 16));

        oneFour1.setBackground(new java.awt.Color(255, 204, 0));
        oneFour1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hallway.jpg"))); // NOI18N
        oneFour1.setOpaque(true);
        oneFour1.setPreferredSize(new java.awt.Dimension(24, 16));

        oneFive1.setBackground(new java.awt.Color(255, 153, 0));
        oneFive1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rooms/Study.jpg"))); // NOI18N
        oneFive1.setOpaque(true);
        oneFive1.setPreferredSize(new java.awt.Dimension(24, 16));

        twoZero1.setBackground(new java.awt.Color(255, 204, 0));
        twoZero1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Characters/Mr Green.jpg"))); // NOI18N
        twoZero1.setOpaque(true);
        twoZero1.setPreferredSize(new java.awt.Dimension(24, 16));

        twoOne1.setBackground(new java.awt.Color(255, 153, 0));
        twoOne1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hallway.jpg"))); // NOI18N
        twoOne1.setOpaque(true);
        twoOne1.setPreferredSize(new java.awt.Dimension(24, 16));

        twoTwo1.setBackground(new java.awt.Color(255, 204, 0));
        twoTwo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SecretPassage.jpg"))); // NOI18N
        twoTwo1.setOpaque(true);
        twoTwo1.setPreferredSize(new java.awt.Dimension(24, 16));

        twoThree1.setBackground(new java.awt.Color(255, 153, 0));
        twoThree1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hallway.jpg"))); // NOI18N
        twoThree1.setOpaque(true);
        twoThree1.setPreferredSize(new java.awt.Dimension(24, 16));

        twoFour1.setBackground(new java.awt.Color(255, 204, 0));
        twoFour1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SecretPassage.jpg"))); // NOI18N
        twoFour1.setOpaque(true);
        twoFour1.setPreferredSize(new java.awt.Dimension(24, 16));

        twoFive1.setBackground(new java.awt.Color(255, 153, 0));
        twoFive1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hallway.jpg"))); // NOI18N
        twoFive1.setOpaque(true);
        twoFive1.setPreferredSize(new java.awt.Dimension(24, 16));

        threeOne1.setBackground(new java.awt.Color(255, 153, 0));
        threeOne1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rooms/Ballroom.jpg"))); // NOI18N
        threeOne1.setOpaque(true);
        threeOne1.setPreferredSize(new java.awt.Dimension(24, 16));

        threeTwo1.setBackground(new java.awt.Color(255, 204, 0));
        threeTwo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hallway.jpg"))); // NOI18N
        threeTwo1.setOpaque(true);
        threeTwo1.setPreferredSize(new java.awt.Dimension(24, 16));

        threeThree1.setBackground(new java.awt.Color(255, 153, 0));
        threeThree1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rooms/Billiard Room.jpg"))); // NOI18N
        threeThree1.setOpaque(true);
        threeThree1.setPreferredSize(new java.awt.Dimension(24, 16));

        threeFour1.setBackground(new java.awt.Color(255, 204, 0));
        threeFour1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hallway.jpg"))); // NOI18N
        threeFour1.setOpaque(true);
        threeFour1.setPreferredSize(new java.awt.Dimension(24, 16));

        threeFive1.setBackground(new java.awt.Color(255, 153, 0));
        threeFive1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rooms/Hall.jpg"))); // NOI18N
        threeFive1.setOpaque(true);
        threeFive1.setPreferredSize(new java.awt.Dimension(24, 16));

        fourZero1.setBackground(new java.awt.Color(255, 204, 0));
        fourZero1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Characters/Mrs White.jpg"))); // NOI18N
        fourZero1.setOpaque(true);
        fourZero1.setPreferredSize(new java.awt.Dimension(24, 16));

        fourOne1.setBackground(new java.awt.Color(255, 153, 0));
        fourOne1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hallway.jpg"))); // NOI18N
        fourOne1.setOpaque(true);
        fourOne1.setPreferredSize(new java.awt.Dimension(24, 16));

        fourTwo1.setBackground(new java.awt.Color(255, 204, 0));
        fourTwo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SecretPassage.jpg"))); // NOI18N
        fourTwo1.setOpaque(true);
        fourTwo1.setPreferredSize(new java.awt.Dimension(24, 16));

        fourThree1.setBackground(new java.awt.Color(255, 153, 0));
        fourThree1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hallway.jpg"))); // NOI18N
        fourThree1.setOpaque(true);
        fourThree1.setPreferredSize(new java.awt.Dimension(24, 16));

        fourFour1.setBackground(new java.awt.Color(255, 204, 0));
        fourFour1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SecretPassage.jpg"))); // NOI18N
        fourFour1.setOpaque(true);
        fourFour1.setPreferredSize(new java.awt.Dimension(24, 16));

        fourFive1.setBackground(new java.awt.Color(255, 153, 0));
        fourFive1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hallway.jpg"))); // NOI18N
        fourFive1.setOpaque(true);
        fourFive1.setPreferredSize(new java.awt.Dimension(24, 16));

        fourSix1.setBackground(new java.awt.Color(255, 204, 0));
        fourSix1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Characters/Mrs Scarlet.jpg"))); // NOI18N
        fourSix1.setOpaque(true);
        fourSix1.setPreferredSize(new java.awt.Dimension(24, 16));

        fiveOne1.setBackground(new java.awt.Color(255, 153, 0));
        fiveOne1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rooms/Kitchen.jpg"))); // NOI18N
        fiveOne1.setOpaque(true);
        fiveOne1.setPreferredSize(new java.awt.Dimension(24, 16));

        fiveTwo1.setBackground(new java.awt.Color(255, 204, 0));
        fiveTwo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hallway.jpg"))); // NOI18N
        fiveTwo1.setOpaque(true);
        fiveTwo1.setPreferredSize(new java.awt.Dimension(24, 16));

        fiveThree1.setBackground(new java.awt.Color(255, 153, 0));
        fiveThree1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rooms/Dining Room.jpg"))); // NOI18N
        fiveThree1.setOpaque(true);
        fiveThree1.setPreferredSize(new java.awt.Dimension(24, 16));

        fiveFour1.setBackground(new java.awt.Color(255, 204, 0));
        fiveFour1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hallway.jpg"))); // NOI18N
        fiveFour1.setOpaque(true);
        fiveFour1.setPreferredSize(new java.awt.Dimension(24, 16));

        fiveFive1.setBackground(new java.awt.Color(255, 153, 0));
        fiveFive1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rooms/Lounge.jpg"))); // NOI18N
        fiveFive1.setOpaque(true);
        fiveFive1.setPreferredSize(new java.awt.Dimension(24, 16));

        sixFour1.setBackground(new java.awt.Color(255, 204, 0));
        sixFour1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Characters/Col Mustard.jpg"))); // NOI18N
        sixFour1.setOpaque(true);
        sixFour1.setPreferredSize(new java.awt.Dimension(24, 16));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(zeroTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(zeroFour1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(oneOne1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oneTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oneThree1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oneFour1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oneFive1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(twoZero1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twoOne1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twoTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twoThree1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twoFour1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twoFive1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(threeOne1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(threeTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(threeThree1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(threeFour1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(threeFive1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fourZero1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fourOne1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fourTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fourThree1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fourFour1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fourFive1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fourSix1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(fiveOne1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiveTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiveThree1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiveFour1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiveFive1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(488, 488, 488)
                        .addComponent(sixFour1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fiveFive1, fiveFour1, fiveOne1, fiveThree1, fiveTwo1, fourFive1, fourFour1, fourOne1, fourSix1, fourThree1, fourTwo1, fourZero1, oneFive1, oneFour1, oneThree1, oneTwo1, sixFour1, threeFive1, threeFour1, threeOne1, threeThree1, threeTwo1, twoFive1, twoFour1, twoOne1, twoThree1, twoTwo1, twoZero1});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zeroTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zeroFour1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oneOne1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(oneTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(oneThree1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(oneFour1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(oneFive1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twoZero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoOne1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoThree1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoFour1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoFive1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(threeFour1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(threeOne1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(threeTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(threeThree1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(threeFive1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourZero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourOne1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourThree1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourFour1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourFive1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourSix1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fiveOne1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveThree1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveFour1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveFive1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sixFour1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {fiveFive1, fiveFour1, fiveOne1, fiveThree1, fiveTwo1, fourFive1, fourFour1, fourOne1, fourSix1, fourThree1, fourTwo1, fourZero1, oneFive1, oneFour1, oneOne1, oneThree1, oneTwo1, sixFour1, threeFive1, threeFour1, threeOne1, threeThree1, threeTwo1, twoFive1, twoFour1, twoOne1, twoThree1, twoTwo1, twoZero1, zeroFour1, zeroTwo1});

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1230, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GameBoardGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameBoardGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameBoardGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameBoardGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new GameBoardGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fiveFive1;
    private javax.swing.JLabel fiveFour1;
    private javax.swing.JLabel fiveOne1;
    private javax.swing.JLabel fiveThree1;
    private javax.swing.JLabel fiveTwo1;
    private javax.swing.JLabel fourFive1;
    private javax.swing.JLabel fourFour1;
    private javax.swing.JLabel fourOne1;
    private javax.swing.JLabel fourSix1;
    private javax.swing.JLabel fourThree1;
    private javax.swing.JLabel fourTwo1;
    private javax.swing.JLabel fourZero1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel oneFive1;
    private javax.swing.JLabel oneFour1;
    private javax.swing.JLabel oneOne1;
    private javax.swing.JLabel oneThree1;
    private javax.swing.JLabel oneTwo1;
    private javax.swing.JLabel sixFour1;
    private javax.swing.JLabel threeFive1;
    private javax.swing.JLabel threeFour1;
    private javax.swing.JLabel threeOne1;
    private javax.swing.JLabel threeThree1;
    private javax.swing.JLabel threeTwo1;
    private javax.swing.JLabel twoFive1;
    private javax.swing.JLabel twoFour1;
    private javax.swing.JLabel twoOne1;
    private javax.swing.JLabel twoThree1;
    private javax.swing.JLabel twoTwo1;
    private javax.swing.JLabel twoZero1;
    private javax.swing.JLabel zeroFour1;
    private javax.swing.JLabel zeroTwo1;
    // End of variables declaration//GEN-END:variables
}
