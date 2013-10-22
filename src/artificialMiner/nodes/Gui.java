package artificialMiner.nodes;

import artificialMiner.artificialMiner;

public class Gui extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel4;

    public Gui() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Start Mining");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("ArtificialMiner");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(
                new String[]{"Copper", "Tin", "Clay", "Iron", "Silver",
                        "Coal", "Gold", "Mithril", "Adamante", "Runite"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
                getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout
                .createParallelGroup(
                        javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                        javax.swing.GroupLayout.Alignment.TRAILING,
                        layout.createSequentialGroup()
                                .addGap(0, 25, Short.MAX_VALUE)
                                .addComponent(jLabel4).addGap(50, 50, 50))
                .addComponent(jComboBox1, 0,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                .addComponent(jButton1,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE));
        layout.setVerticalGroup(layout
                .createParallelGroup(
                        javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                        javax.swing.GroupLayout.Alignment.TRAILING,
                        layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(
                                        jComboBox1,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        15, Short.MAX_VALUE)
                                .addComponent(jButton1)));

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String str = jComboBox1.getSelectedItem().toString();
        if (str.equals("Copper")) {
            artificialMiner.toMine = new int[]{2551, 2550};
            artificialMiner.drop = 436;
            artificialMiner.toMines = "Copper";
        } else {
            if (str.equals("Tin")) {
                artificialMiner.toMine = new int[]{13717, 13718};
                artificialMiner.drop = 438;
                artificialMiner.toMines = "Tin";
            } else {
                if (str.equals("Clay")) {
                    artificialMiner.toMine = new int[]{1, 2, 3};
                    artificialMiner.drop = 434;
                } else {
                    if (str.equals("Silver")) {
                        artificialMiner.toMine = new int[]{1, 2, 3};
                        artificialMiner.drop = 0;
                    } else {
                        if (str.equals("Iron")) {
                            artificialMiner.toMine = new int[]{1, 2, 3};
                            artificialMiner.drop = 440;
                        } else {
                            if (str.equals("Coal")) {
                                artificialMiner.toMine = new int[]{1, 2, 3};
                                artificialMiner.drop = 0;
                            } else {
                                if (str.equals("Gold")) {
                                    artificialMiner.toMine = new int[]{1, 2, 3};
                                    artificialMiner.drop = 0;
                                } else {
                                    if (str.equals("Mithril")) {
                                        artificialMiner.toMine = new int[]{1, 2, 3};
                                        artificialMiner.drop = 0;
                                    } else {
                                        if (str.equals("Adamante")) {
                                            artificialMiner.toMine = new int[]{1, 2, 3};
                                            artificialMiner.drop = 0;
                                        } else {
                                            if (str.equals("Runite")) {
                                                artificialMiner.toMine = new int[]{1, 2, 3};
                                                artificialMiner.drop = 0;
                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }

        artificialMiner.guiStart = false;
        dispose();
    }
    // End of variables declaration
}