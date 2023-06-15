/*
    Car Accessory Management System
    Version 1.0
    Author : Manish Gurung, Ashutosh Sunar, Samir Baniya, Bishal Pertel.
*/
import java.io.BufferedReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileNotFoundException;

public class CAD_Info extends javax.swing.JFrame {

    /**
     * Creates new form CAD_Info
     */
    public CAD_Info() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);//it opens the frame to its full size
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        accessoryPanel = new javax.swing.JPanel();
        accessoryLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        idValidation = new javax.swing.JLabel();
        priceValidation = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lowButton = new javax.swing.JRadioButton();
        mediumButton = new javax.swing.JRadioButton();
        highButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        accessoryField = new javax.swing.JTextField();
        recommendationLabel = new javax.swing.JLabel();
        companyButton = new javax.swing.JRadioButton();
        communityButton = new javax.swing.JRadioButton();
        notButton = new javax.swing.JRadioButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        tableName = new javax.swing.JLabel();
        clearTable = new javax.swing.JButton();
        priceSearchPanel = new javax.swing.JPanel();
        priceSearchButton = new javax.swing.JButton();
        priceSearchLabel = new javax.swing.JLabel();
        priceSearchField = new javax.swing.JTextField();
        clearSearchButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        categorySearchButton = new javax.swing.JButton();
        categorySearchLabel = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        open = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        help = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Car Accessories Management System");
        setLocation(new java.awt.Point(0, 0));
        setName("mainFrame\n"); // NOI18N

        accessoryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Accessory Entry", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        accessoryLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        accessoryLabel.setText("Accessory Name");

        idLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        idLabel.setText("Accessory ID");

        idField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idFieldKeyTyped(evt);
            }
        });

        idValidation.setForeground(java.awt.Color.red);

        priceValidation.setForeground(java.awt.Color.red);

        priceField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceFieldKeyTyped(evt);
            }
        });

        priceLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        priceLabel.setText("Price");

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        add.setText("Add Accessory");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Price Range");

        lowButton.setText("Low");
        lowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowButtonActionPerformed(evt);
            }
        });

        mediumButton.setText("Medium");
        mediumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumButtonActionPerformed(evt);
            }
        });

        highButton.setText("High");
        highButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Category");

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comfort", "Ambience", "Media", "Safety", "Interior", "Exterior" }));

        recommendationLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        recommendationLabel.setText("Recommendation");

        companyButton.setText("Company");
        companyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyButtonActionPerformed(evt);
            }
        });

        communityButton.setText("Community");
        communityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityButtonActionPerformed(evt);
            }
        });

        notButton.setText("Not Recommended");
        notButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accessoryPanelLayout = new javax.swing.GroupLayout(accessoryPanel);
        accessoryPanel.setLayout(accessoryPanelLayout);
        accessoryPanelLayout.setHorizontalGroup(
            accessoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accessoryPanelLayout.createSequentialGroup()
                .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(accessoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accessoryPanelLayout.createSequentialGroup()
                        .addComponent(priceField)
                        .addGap(542, 542, 542))
                    .addGroup(accessoryPanelLayout.createSequentialGroup()
                        .addComponent(priceValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accessoryPanelLayout.createSequentialGroup()
                .addGroup(accessoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accessoryPanelLayout.createSequentialGroup()
                        .addGroup(accessoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accessoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(accessoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(accessoryPanelLayout.createSequentialGroup()
                                .addGroup(accessoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idField)
                                    .addGroup(accessoryPanelLayout.createSequentialGroup()
                                        .addComponent(accessoryField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(131, 131, 131))
                            .addGroup(accessoryPanelLayout.createSequentialGroup()
                                .addComponent(idValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(accessoryPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(accessoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mediumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(highButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recommendationLabel)
                    .addComponent(communityButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(companyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notButton, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addGap(253, 253, 253))
        );
        accessoryPanelLayout.setVerticalGroup(
            accessoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accessoryPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accessoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accessoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(accessoryField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accessoryLabel))
                    .addGroup(accessoryPanelLayout.createSequentialGroup()
                        .addComponent(lowButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mediumButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(highButton)
                .addGap(23, 23, 23)
                .addGroup(accessoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(accessoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accessoryPanelLayout.createSequentialGroup()
                        .addComponent(idValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(accessoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceLabel))
                        .addGap(18, 18, 18)
                        .addComponent(priceValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(accessoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add)
                            .addComponent(clear)))
                    .addGroup(accessoryPanelLayout.createSequentialGroup()
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(recommendationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(companyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(communityButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(notButton)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Table Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        tablePanel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"10101", "Reflective Panel", "Safety", "Low", "200", "Community"},
                {"20201", "Seat Cover", "Interior", "Medium", "10000", "Company"},
                {"10102", "Steering Cover", "Interior", "Low", "2000", "Company"},
                {"10103", "Cushion", "Comfort", "Low", "2000", "Company"},
                {"10104", "Air Freshner", "Ambience", "Low ", "300", "Not recommended"},
                {"20202", "Dash Cam", "Safety", "Medium", "12000", "Not recommended"},
                {"20203", "Music System", "Media", "Medium", "5000", "Community"},
                {"30301", "Alloy Wheels", "Exterior", "High", "50000", "Community"},
                {"10105", "Rain Wiper", "Exterior", "Low", "4000", "Company"},
                {"30302", "Blind Spot Detection Sensor", "Safety", "High", "25000", "Company"},
                {"20204", "Seat heater", "Comfort", "Medium", "10000", "Company"},
                {"10106", "Vaccum Cleaner", "Ambience", "Low", "3000", "Community"},
                {"10107", "Mobile Charger", "Media", "Low", "1000", "Not recommended"},
                {"20205", "Projector headlight", "Exterior", "Medium", "12000", "Not Recommended"},
                {"30303", "Spoiler", "Exterior", "High", "20000", "Not Recommended"}
            },
            new String [] {
                "Accessory ID", "Accessory Name", "Category", "Range", "Price", "Recommendation"
            }
        ));
        jScrollPane1.setViewportView(table);

        tableName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tableName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableName.setText("Car Accessories Detail");

        clearTable.setText("Clear Table");
        clearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearTable, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(tableName, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addComponent(tableName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clearTable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        priceSearchPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Accessory Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        priceSearchButton.setText("Search");
        priceSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceSearchButtonActionPerformed(evt);
            }
        });

        priceSearchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        priceSearchLabel.setText("Price");

        clearSearchButton.setText("Clear");
        clearSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout priceSearchPanelLayout = new javax.swing.GroupLayout(priceSearchPanel);
        priceSearchPanel.setLayout(priceSearchPanelLayout);
        priceSearchPanelLayout.setHorizontalGroup(
            priceSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, priceSearchPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(priceSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(priceSearchPanelLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(priceSearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(priceSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );
        priceSearchPanelLayout.setVerticalGroup(
            priceSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, priceSearchPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(priceSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceSearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(priceSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceSearchButton)
                    .addComponent(clearSearchButton))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Accessory Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        categorySearchButton.setText("Search");
        categorySearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorySearchButtonActionPerformed(evt);
            }
        });

        categorySearchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        categorySearchLabel.setText("Category");

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comfort", "Ambience", "Media", "Safety", "Interior", "Exterior" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(categorySearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(categorySearchButton)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categorySearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(categorySearchButton)
                .addContainerGap())
        );

        jLabel3.setBackground(new java.awt.Color(51, 153, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Baniya Car Accessory Dealer");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(priceSearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(accessoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accessoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(priceSearchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jMenu1.setText("File");

        open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK));
        open.setText("Open File");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        jMenu1.add(open);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_MASK));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        help.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK));
        help.setText("Help");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        jMenu2.add(help);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // This method is activated when exit is selected in menu. It closes the program.
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        // This method is activated when open is selected in menu. It opens a dialog box to select and open a .txt file.
        JFileChooser chooser = new JFileChooser();
        int i = chooser.showOpenDialog(this);
        if(i == JFileChooser.APPROVE_OPTION){
            File file = chooser.getSelectedFile();
            try {
                FileReader reader = new FileReader(file);
                BufferedReader br = new BufferedReader(reader);
                JFrame openTextFile = new JFrame();
                openTextFile.setSize(400,600);
                openTextFile.setVisible(true);
                openTextFile.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
                jScrollPane1 = new javax.swing.JScrollPane();
                JTextArea textArea = new javax.swing.JTextArea();
                textArea.setEditable(false);

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                openTextFile.setTitle("Open File");

                textArea.setColumns(20);
                textArea.setRows(5);
                jScrollPane1.setViewportView(textArea);
        
                openTextFile.add(textArea);
                textArea.read(br, null);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CAD_Info.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CAD_Info.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
    }//GEN-LAST:event_openActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        // This method creates a new frame when help is selected in menu bar.
        // It shows a document with the description and instructions of the car accessory management software.
        JFrame helpFrame = new JFrame();
        helpFrame.setSize(400,600);
        helpFrame.setVisible(true);
        helpFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        jScrollPane1 = new javax.swing.JScrollPane();
        JTextArea textArea = new javax.swing.JTextArea();
        textArea.setEditable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        helpFrame.setTitle("Help");

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setText("Car Accessory Management System\n-----------------------------------------\n+The system has menu. "
                + "File menu has open option and exit option. \n Help menu has help option."
                + "\n+Open menu opens a dialog box to choose a .txt file. Exit option\n closes the system."
                + "\n+Help menu opens up a .txt file that has guides of the system.\n+The system has a part "
                + "to enter details about accessories after\n pressing add button, the data is added in table. "
                + "Clear button clears\n all the textfields.\n+ There are two searchs button one search option with"
                + " price entry \n searchs all the data with the same price. Only the first data with \n same price is"
                + " displayed. Another search has category and all the \n data of the selected category is displayed.");
        jScrollPane1.setViewportView(textArea);
        
        helpFrame.add(textArea);
     
    }//GEN-LAST:event_helpActionPerformed

    private void clearSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearSearchButtonActionPerformed
        // This method clears all the text field 
        priceSearchField.setText("");
    }//GEN-LAST:event_clearSearchButtonActionPerformed

    private void highButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highButtonActionPerformed
        // // when high is selected in price range other ranges cannot be selected
        mediumButton.setSelected(false);
        lowButton.setSelected(false);
    }//GEN-LAST:event_highButtonActionPerformed

    private void mediumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumButtonActionPerformed
        // when medium is selected in price range other ranges cannot be selected
        lowButton.setSelected(false);
        highButton.setSelected(false);
    }//GEN-LAST:event_mediumButtonActionPerformed

    private void lowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowButtonActionPerformed
        // when low is selected in price range other ranges cannot be selected
        mediumButton.setSelected(false);
        highButton.setSelected(false);
    }//GEN-LAST:event_lowButtonActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // This method inserts data in the table
        try{
            accessory=accessoryField.getText();
            id=Integer.parseInt(idField.getText());
            price=Integer.parseInt(priceField.getText());
            if(accessory.equals("") || id==0 || price==0){
                JOptionPane.showMessageDialog(rootPane,"Accessory name cannot be left empty.");
            }
            else{
                if(lowButton.isSelected() || mediumButton.isSelected() || highButton.isSelected()){
                    if(companyButton.isSelected() || communityButton.isSelected() || notButton.isSelected()){  
                        String selectedRange="";
                        String recommendation="";
                        idValidation.setText("");
                        priceValidation.setText("");
                        if(lowButton.isSelected()){
                            selectedRange = lowButton.getText();
                        }
                        else if(mediumButton.isSelected()){
                            selectedRange = mediumButton.getText();
                        }
                        else if(highButton.isSelected()){
                            selectedRange = highButton.getText();
                        }
                        if(companyButton.isSelected()){
                            recommendation = companyButton.getText();
                        }
                        else if(communityButton.isSelected()){
                            recommendation = communityButton.getText();
                        }
                        else if(notButton.isSelected()){
                            recommendation = notButton.getText();
                        }
                        if(checkId(id)==true){
                            JOptionPane.showMessageDialog(this,"The id is already inserted. Please insert another id.");
                        }else{
                            String selectedCategory = comboBox.getSelectedItem().toString();
                            DefaultTableModel obj= (DefaultTableModel) table.getModel();
                            table.setModel(obj);
                            Object row[]={id.toString(),accessory,selectedCategory,selectedRange,price.toString(),recommendation};
                            obj.addRow(row);
                            JOptionPane.showMessageDialog(this,"Accessory Added");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(rootPane,"Please select recommendation.");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(rootPane,"Please select the price range.");
                }
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(rootPane,"Accessory ID and price cannot be left empty and can be only numbers.");
        }
    }//GEN-LAST:event_addActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // This method clears all the text fields and price range selected.
        accessoryField.setText("");
        idField.setText("");
        priceField.setText("");
        mediumButton.setSelected(false);
        lowButton.setSelected(false);
        highButton.setSelected(false);
        priceValidation.setText("");
        idValidation.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void priceFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceFieldKeyTyped
        // TODO add your handling code here:
        try{
            price=Integer.parseInt(priceField.getText());
            priceValidation.setText("");
        }
        catch(NumberFormatException nfe){
            priceValidation.setText("Please insert price only in numbers.");
        }
    }//GEN-LAST:event_priceFieldKeyTyped

    private void idFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idFieldKeyTyped
        // TODO add your handling code here:
        try{
            id=Integer.parseInt(idField.getText());
            idValidation.setText("");
        }
        catch(NumberFormatException nfe){
            idValidation.setText("Please insert id only in numbers.");
        }
    }//GEN-LAST:event_idFieldKeyTyped

    private void priceSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceSearchButtonActionPerformed
        // TODO add your handling code here:
        sort();//sort function is called.
            try{
            if(priceSearchField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(rootPane,"Please enter a price to search");
            }
            else{
                int key = Integer.parseInt(priceSearchField.getText());
                int low =0;
                int high = arraysize-1;
                int found = binarySearch(low,high,key);
                if (found == -1)
                {
                    JOptionPane.showMessageDialog(rootPane, "No accessories are available at this price: " +priceSearchField.getText() );
                }
                else{   
                    String tosearch=priceSearchField.getText();
                    for (int i=0; i<table.getRowCount();i++){
                        String foundval=table.getValueAt(i,4).toString();
                        if(foundval.equals(tosearch)){
                            JOptionPane.showMessageDialog(rootPane,"The following accessories are available at this price."+
                                "\nAccessory ID: "+table.getValueAt(i,0).toString()+"  Accessory Name: "+table.getValueAt(i,1).toString()+
                                "    Category: "+ table.getValueAt(i,2).toString()+"    Range: "+ table.getValueAt(i,3).toString()+"   Price: "+table.getValueAt(i,4).toString()+"   Recommendation: "+table.getValueAt(i,5).toString());
                        break;
                    }
                }
            }
        }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,
                                "Enter Suitable Input Value!!",
                                "Error",
                                JOptionPane.WARNING_MESSAGE); 
            }
    }//GEN-LAST:event_priceSearchButtonActionPerformed

    private void categorySearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorySearchButtonActionPerformed
        // TODO add your handling code here:
        String category=(String)combo.getSelectedItem();
        ArrayList<String> array=new ArrayList<>();
        int ab=0;
        
        do{
            String bc=(String)table.getValueAt(ab,1);
            if(bc!=null && bc.length()!=0){
                array.add(bc);
            }
            ab++;
        }
        while(ab<table.getRowCount());
        {
            String dNameTxt="";
            int counter=0;
            for(int z=0;z<array.size();z++){
            if(category==table.getValueAt(z,2))
            {
                if(counter==0){
                dNameTxt=dNameTxt+table.getValueAt(z,1);
                }
                else{
                    dNameTxt=dNameTxt+","+table.getValueAt(z,1);
                }
                counter++;
            }
         }
            switch (counter) {
                case 0:
                    JOptionPane.showMessageDialog(rootPane,"No accessory found of the category: " + combo.getSelectedItem(), "Error!!!",JOptionPane.ERROR_MESSAGE);
                    break;
                case 1:
                    JOptionPane.showMessageDialog(rootPane, "There is " +counter +" accessory under the category " + combo.getSelectedItem()+
                            " and the accessory is: \n"+ dNameTxt, combo.getSelectedItem()+ "  ", JOptionPane.INFORMATION_MESSAGE );
                    break;
                default:
                    JOptionPane.showMessageDialog(rootPane, "There are "+counter +" accessories under the category " + combo.getSelectedItem()+
                            " and the accessories are : \n"+ dNameTxt, combo.getSelectedItem()+" ", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
           
      }
    }//GEN-LAST:event_categorySearchButtonActionPerformed

    private void companyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyButtonActionPerformed
        // TODO add your handling code here:
        communityButton.setSelected(false);
        notButton.setSelected(false);
    }//GEN-LAST:event_companyButtonActionPerformed

    private void communityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityButtonActionPerformed
        // TODO add your handling code here:
        companyButton.setSelected(false);
        notButton.setSelected(false);
    }//GEN-LAST:event_communityButtonActionPerformed

    private void notButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notButtonActionPerformed
        // TODO add your handling code here:
        communityButton.setSelected(false);
        companyButton.setSelected(false);
    }//GEN-LAST:event_notButtonActionPerformed

    private void clearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearTableActionPerformed
        // TODO add your handling code here:
        int p=JOptionPane.showConfirmDialog(null,"Do you want to clear the table?","Exit",JOptionPane.YES_NO_OPTION );
        if (p==0){  
        int rowCount=table.getRowCount();
        int colCount=table.getColumnCount();
        for(int i=0; i<rowCount;i++){
            for(int j=0; j<colCount;j++){
               table.setValueAt("",i,j);
            }
        }
        JOptionPane.showMessageDialog(this,"The table has been successfully cleared."); 
        }
    }//GEN-LAST:event_clearTableActionPerformed

    public void sort(){//sort function is created.
        int a =0;
        for(int i=0; i<table.getRowCount(); i++){            
            String s = (String)table.getValueAt(a,4);
            a++;
            if(s!=null && s.length()!=0 ){ 
                   arraysize++;
                }
        }          
        priceArray = new int[arraysize];
        int i=0;
        a=0;
        do{
        String s1 = (String)table.getValueAt(a,4);
        if(s1!=null && s1.length()!=0){
            priceArray[i]=Integer.parseInt(s1);
            i++;
        }
        a++;
        }
        while(a<table.getRowCount());
        sort(priceArray);
    }
    public static void sort(int[] a)
    {  
        for (int i = 0; i < a.length - 1; i++)
        {  
         int minPos = minimumPosition(a, i);
         swap(a, minPos, i);
        }
    }
    private static int minimumPosition(int[] a, int from)
    {  
      int minPos = from;
      for (int i = from + 1; i < a.length; i++)
      {
         if (a[i] < a[minPos]) { 
            minPos = i; 
            }
      }
      return minPos;
   }
    
     public static void swap(int[] a, int i, int j)
   {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
     
     public int binarySearch(int low, int high, int key){
        if(low<=high){
            int mid =(low+high)/2;
            if (priceArray[mid]==key){
                return priceArray[mid];
            }
            else if(priceArray[mid]>key){
                return binarySearch(low,mid-1,key) ;
            }
            else if(priceArray[mid]<key){
                return binarySearch(mid+1,high,key);
            }
        }
   return -1;    
   }
    public boolean checkId(int id) {
        for(int i = 0;i<table.getModel().getRowCount();i++){
            if(String.valueOf(table.getModel().getValueAt(i,0)).equals(idField.getText())){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CAD_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accessoryField;
    private javax.swing.JLabel accessoryLabel;
    private javax.swing.JPanel accessoryPanel;
    private javax.swing.JButton add;
    private javax.swing.JButton categorySearchButton;
    private javax.swing.JLabel categorySearchLabel;
    private javax.swing.JButton clear;
    private javax.swing.JButton clearSearchButton;
    private javax.swing.JButton clearTable;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JRadioButton communityButton;
    private javax.swing.JRadioButton companyButton;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem help;
    private javax.swing.JRadioButton highButton;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idValidation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton lowButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton mediumButton;
    private javax.swing.JRadioButton notButton;
    private javax.swing.JMenuItem open;
    private javax.swing.JTextField priceField;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton priceSearchButton;
    private javax.swing.JTextField priceSearchField;
    private javax.swing.JLabel priceSearchLabel;
    private javax.swing.JPanel priceSearchPanel;
    private javax.swing.JLabel priceValidation;
    private javax.swing.JLabel recommendationLabel;
    private javax.swing.JTable table;
    private javax.swing.JLabel tableName;
    private javax.swing.JPanel tablePanel;
    // End of variables declaration//GEN-END:variables
    public String accessory;
    public Integer id;
    public Integer price;
    int []priceArray=new int[0];
    public int priceSearch;
    int arraysize;
}
