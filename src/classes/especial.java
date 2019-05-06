
package classes;

import javax.swing.JOptionPane;


public class especial extends javax.swing.JFrame {

   
    public especial() {
        initComponents();
        this.setTitle("Conta especial");
        this.setLocationRelativeTo(null);
    }
    public static ContaEspecial e = new ContaEspecial();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel373 = new javax.swing.JLabel();
        jLabel374 = new javax.swing.JLabel();
        jLabel375 = new javax.swing.JLabel();
        jLabel376 = new javax.swing.JLabel();
        jLabel377 = new javax.swing.JLabel();
        jLabel378 = new javax.swing.JLabel();
        nomeEspecial = new javax.swing.JTextField();
        saldoEspecial = new javax.swing.JTextField();
        numeroEspecial = new javax.swing.JTextField();
        limiteEspecial = new javax.swing.JTextField();
        multaEspecial = new javax.swing.JTextField();
        jToggleButton149 = new javax.swing.JToggleButton();
        jToggleButton150 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setPreferredSize(new java.awt.Dimension(250, 300));

        jLabel373.setText("Nome");

        jLabel375.setText("Número");

        jLabel376.setText("Saldo");

        jLabel377.setText("Limite");

        jLabel378.setText("Multa");

        nomeEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeEspecialActionPerformed(evt);
            }
        });

        jToggleButton149.setText("Sair");
        jToggleButton149.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton149ActionPerformed(evt);
            }
        });

        jToggleButton150.setText("Cadastrar");
        jToggleButton150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton150ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel373)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeEspecial))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel377)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limiteEspecial))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel378)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multaEspecial))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel376)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saldoEspecial))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel375)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroEspecial))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel374)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jToggleButton149)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(jToggleButton150)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel373, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel375)
                    .addComponent(numeroEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel374)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel376)
                    .addComponent(saldoEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel377)
                    .addComponent(limiteEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel378)
                    .addComponent(multaEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton149)
                    .addComponent(jToggleButton150))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeEspecialActionPerformed
       
    }//GEN-LAST:event_nomeEspecialActionPerformed

    private void jToggleButton150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton150ActionPerformed
        if (conta.comum.getNumero()== Integer.parseInt(numeroEspecial.getText()) || poupanca.p.getNumero()== Integer.parseInt(numeroEspecial.getText())){
            JOptionPane.showMessageDialog(null, "Número de conta existente");
            this.dispose();
            especial e = new especial();
            e.setVisible(true);
            this.dispose();
        }
        e.setNome(nomeEspecial.getText());
        e.setNumero(Integer.parseInt(numeroEspecial.getText()));
        e.setSaldo(Double.parseDouble(saldoEspecial.getText()));
        e.setLimite(Double.parseDouble(limiteEspecial.getText()));
        e.setMulta1(Double.parseDouble(multaEspecial.getText()));
        menu m = new menu();
        m.setVisible(true);
        this.dispose();      
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_jToggleButton150ActionPerformed

    private void jToggleButton149ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton149ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jToggleButton149ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new especial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel373;
    private javax.swing.JLabel jLabel374;
    private javax.swing.JLabel jLabel375;
    private javax.swing.JLabel jLabel376;
    private javax.swing.JLabel jLabel377;
    private javax.swing.JLabel jLabel378;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton149;
    private javax.swing.JToggleButton jToggleButton150;
    private javax.swing.JTextField limiteEspecial;
    private javax.swing.JTextField multaEspecial;
    private javax.swing.JTextField nomeEspecial;
    private javax.swing.JTextField numeroEspecial;
    private javax.swing.JTextField saldoEspecial;
    // End of variables declaration//GEN-END:variables
}
