
import especialidades.Dentista;
import especialidades.Nutricionista;
import especialidades.Pediatra;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import models.Agenda;
import models.dao.AgendaDAO;
import java.util.Random;
import models.Consulta;
import models.dao.MedicoDAO;
import java.sql.Time;
import models.dao.ConsultasDAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lbacc
 */
public class MarcarConsulta extends javax.swing.JFrame {

    public static String cpf;
    
    
    /**
     * Creates new form MarcarConsulta
     */
    public MarcarConsulta() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowSorter(new TableRowSorter(modelo));
        switch (Especialidade.getSelectedItem().toString()){
            case "Dentista":
                readJTable_dentista();
                break;
            case "Pediatra":
                readJTable_pediatra();
                break;
            case "Nutricionista":
                readJTable_nutricionista();
                break;
        }
    }
    
    public void readJTable_dentista(){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        AgendaDAO agdao = new AgendaDAO();
        for (Agenda ag : agdao.read_dentista()) {
            modelo.addRow(new Object[]{
                ag.getHorainicio(),
                ag.getHorafim(),
                ag.getDiasemana(),
                ag.getNome(),
                ag.getTelefone(),
                ag.getIdagenda()
            });
        }
    }
    
    public void readJTable_pediatra(){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        AgendaDAO agdao = new AgendaDAO();
        for (Agenda ag : agdao.read_pediatra()) {
            modelo.addRow(new Object[]{
                ag.getHorainicio(),
                ag.getHorafim(),
                ag.getDiasemana(),
                ag.getNome(),
                ag.getTelefone(),
                ag.getIdagenda()
            });
        }
    }
    
    public void readJTable_nutricionista(){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        AgendaDAO agdao = new AgendaDAO();
        for (Agenda ag : agdao.read_nutricionista()) {
            modelo.addRow(new Object[]{
                ag.getHorainicio(),
                ag.getHorafim(),
                ag.getDiasemana(),
                ag.getNome(),
                ag.getTelefone(),
                ag.getIdagenda()
            });
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

        Especialidade = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Especialidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dentista", "Nutricionista", "Pediatra" }));
        Especialidade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                EspecialidadeItemStateChanged(evt);
            }
        });
        Especialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspecialidadeActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selecione sua especialidade");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "HorarioInicio", "HorarioFim", "DiaSemana", "NomeMedico", "TelefoneMedico", "Id da consulta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTable1FocusLost(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(200);
        }

        jButton1.setText("Agendar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton2)))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Especialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)))
                        .addGap(353, 353, 353))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(428, 428, 428))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton2)
                .addGap(110, 110, 110)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Especialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspecialidadeActionPerformed
        switch (Especialidade.getSelectedItem().toString()){
            case "Dentista":
                readJTable_dentista();
                break;
            case "Pediatra":
                readJTable_pediatra();
                break;
            case "Nutricionista":
                readJTable_nutricionista();
                System.out.println("NUTRII");
                break;
        }
    }//GEN-LAST:event_EspecialidadeActionPerformed

    private void EspecialidadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_EspecialidadeItemStateChanged
        // System.out.println("TESTANDO");
    }//GEN-LAST:event_EspecialidadeItemStateChanged

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained
        System.out.println("TESTE");
    }//GEN-LAST:event_jTable1FocusGained

    private void jTable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusLost
        System.out.println("TESTE1");

    }//GEN-LAST:event_jTable1FocusLost

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
             
// TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String nome_medico = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
            Time DtInicio = (Time) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            Time DtFim = (Time) jTable1.getValueAt(jTable1.getSelectedRow(), 1);
            String dia_semana = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
            String msg = "Deseja marcar sua consulta com " + nome_medico + ", das "
                + DtInicio.toString() + " às " + DtFim.toString() + " na "
                + dia_semana + "?";
            int resposta = JOptionPane.showConfirmDialog(rootPane, msg);
            switch (Especialidade.getSelectedItem().toString()){
                case "Dentista":
                    Dentista.count++;
                    break;
                case "Pediatra":
                    Pediatra.count++;
                    break;
                case "Nutricionista":
                    Nutricionista.count++;
                    break;
            
            
        }
        boolean validado = Nutricionista.count > 1 || Dentista.count > 1 || Pediatra.count > 1;
        if (resposta == 0){
            if (!validado) {
                new AgendaDAO().delete((int) jTable1.getValueAt(jTable1.getSelectedRow(), 5));
                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.removeRow(jTable1.getSelectedRow());
                Consulta c = new Consulta(Integer.toString(new Random().nextInt(127800)), new MedicoDAO().retorna_crm(nome_medico), cpf, DtInicio, DtFim, dia_semana);
                new ConsultasDAO().inserir(c);
                JOptionPane.showMessageDialog(rootPane, "Consulta marcada com sucesso!");    
            } else {
                JOptionPane.showMessageDialog(rootPane, "Voce pode apenas agendar uma consulta por especialidade.");
            }
               
        }          
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(rootPane, "Você precisa selecionar um horário para agendar.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo de errado aconteceu. Reinicie o sistema.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new TelaInicio().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
        
    
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
            java.util.logging.Logger.getLogger(MarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarcarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Especialidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}