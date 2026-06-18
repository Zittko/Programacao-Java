/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static Model.funcoes_DAO.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Laboratorio-Info
 */
public class Inicio_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_GUI
     */
    public Inicio_GUI() {
        initComponents();
    }

    // MÉTODO ATUALIZA TABELA INÍCIO
    public static DefaultTableModel cliente(ResultSet rs) { 

        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount(); 
            Vector columnNames = new Vector(); 
            // AS LINHAS ABAIXO SÃO REFERENTES AOS CAMPOS DA TABELA CLIENTE 

            columnNames.addElement("Código");
            columnNames.addElement("Nome");
            columnNames.addElement("Endereço");
            columnNames.addElement("Telefone");
            Vector rows = new Vector();
            
            while (rs.next()) {
                
                Vector newRow = new Vector(); 
                
                for (int i = 1; i <= numberOfColumns; i++) { 
                    
                    newRow.addElement(rs.getObject(i)); 

                } 

                rows.addElement(newRow); 

            } 

           return new DefaultTableModel(rows, columnNames); 
           
        } catch (Exception e) {
           
           return null; 
           
        } 
    }
    // FIM
    
    // MÉTODO REFRESH INÍCIO
    public void refresh(){
        try{
            
            Connection conn;
            conn = (Connection) DriverManager.getConnection(url, username, password);
            Controller.ConectaDB_DB.carregaDriver();
            System.out.println("realizado");
            String sql = "SELECT * FROM cliente;";
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(); 
            Cliente.setModel(cliente(rs)); 

        } catch(Exception e){ 

            JOptionPane.showMessageDialog(null, e); 

        }
    }
    // FIM
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jMenu1 = new javax.swing.JMenu();
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("Exemplo?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        clienteQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cliente c");
        clienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tel_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        end_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nome_txt = new javax.swing.JTextField();
        salvar_btn = new javax.swing.JButton();
        sair_btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Cliente = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        cod1_txt = new javax.swing.JTextField();
        nome1_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        end1_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tel1_txt = new javax.swing.JTextField();
        carrega_btn = new javax.swing.JButton();
        altera_btn = new javax.swing.JButton();
        backup_btn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cod2_txt = new javax.swing.JTextField();
        excluir_btn = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Telefone:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 130, 100, 20);

        tel_txt.setToolTipText("");
        tel_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tel_txtActionPerformed(evt);
            }
        });
        jPanel2.add(tel_txt);
        tel_txt.setBounds(120, 130, 170, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Endereço:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 100, 100, 20);

        end_txt.setToolTipText("");
        jPanel2.add(end_txt);
        end_txt.setBounds(120, 100, 170, 20);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nome:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 70, 100, 20);

        nome_txt.setToolTipText("");
        jPanel2.add(nome_txt);
        nome_txt.setBounds(120, 70, 170, 20);

        salvar_btn.setText("SALVAR");
        salvar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_btnActionPerformed(evt);
            }
        });
        jPanel2.add(salvar_btn);
        salvar_btn.setBounds(90, 210, 100, 30);

        sair_btn.setText("SAIR");
        sair_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_btnActionPerformed(evt);
            }
        });
        jPanel2.add(sair_btn);
        sair_btn.setBounds(210, 210, 100, 30);

        jTabbedPane1.addTab("CADASTRAR", jPanel2);

        jPanel3.setLayout(null);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clienteList, Cliente);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliCod}"));
        columnBinding.setColumnName("Cli Cod");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliNome}"));
        columnBinding.setColumnName("Cli Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliEnd}"));
        columnBinding.setColumnName("Cli End");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliTel}"));
        columnBinding.setColumnName("Cli Tel");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(Cliente);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 375, 100);

        jLabel4.setText("ID:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 120, 60, 20);
        jPanel3.add(cod1_txt);
        cod1_txt.setBounds(80, 120, 40, 20);

        nome1_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome1_txtActionPerformed(evt);
            }
        });
        jPanel3.add(nome1_txt);
        nome1_txt.setBounds(80, 150, 130, 20);

        jLabel5.setText("Nome:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(20, 150, 60, 20);
        jPanel3.add(end1_txt);
        end1_txt.setBounds(80, 180, 130, 20);

        jLabel6.setText("Endereço:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(20, 180, 60, 20);

        jLabel7.setText("Telefone:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(20, 210, 60, 20);
        jPanel3.add(tel1_txt);
        tel1_txt.setBounds(80, 210, 130, 20);

        carrega_btn.setText("CONSULTAR");
        carrega_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrega_btnActionPerformed(evt);
            }
        });
        jPanel3.add(carrega_btn);
        carrega_btn.setBounds(240, 120, 140, 30);

        altera_btn.setText("ALTERAR");
        altera_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altera_btnActionPerformed(evt);
            }
        });
        jPanel3.add(altera_btn);
        altera_btn.setBounds(240, 160, 140, 30);

        backup_btn.setText("BACKUP");
        backup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backup_btnActionPerformed(evt);
            }
        });
        jPanel3.add(backup_btn);
        backup_btn.setBounds(240, 200, 140, 30);

        jTabbedPane1.addTab("CONSULTAR/ALTERAR", jPanel3);

        jPanel4.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Informe o código");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(0, 30, 400, 40);

        cod2_txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cod2_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod2_txtActionPerformed(evt);
            }
        });
        jPanel4.add(cod2_txt);
        cod2_txt.setBounds(160, 110, 70, 30);

        excluir_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        excluir_btn.setText("Excluir");
        excluir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluir_btnActionPerformed(evt);
            }
        });
        jPanel4.add(excluir_btn);
        excluir_btn.setBounds(130, 190, 130, 40);

        jTabbedPane1.addTab("EXCLUIR", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
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

        bindingGroup.bind();

        setSize(new java.awt.Dimension(400, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tel_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tel_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tel_txtActionPerformed

    private void salvar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_btnActionPerformed
        Model.funcoes_DAO.salvar();
        refresh();
    }//GEN-LAST:event_salvar_btnActionPerformed

    private void sair_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sair_btnActionPerformed

    private void nome1_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome1_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome1_txtActionPerformed

    private void cod2_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod2_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cod2_txtActionPerformed

    private void excluir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluir_btnActionPerformed
        String x = JOptionPane.showInputDialog(null, "Deseja realmente excluir o registro?\n1 - Sim\n2 - Não");
        int cod = Integer.parseInt(x);
        if (cod == 1) {
            Model.funcoes_DAO.excluir();
        } else if (cod == 2) {
            JOptionPane.showMessageDialog(null, "Registro não foi excluído");
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida");
        }
        refresh();
    }//GEN-LAST:event_excluir_btnActionPerformed

    private void carrega_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrega_btnActionPerformed
        Model.funcoes_DAO.carregar();
    }//GEN-LAST:event_carrega_btnActionPerformed

    private void altera_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altera_btnActionPerformed
        Model.funcoes_DAO.alterar();
        refresh();
    }//GEN-LAST:event_altera_btnActionPerformed

    private void backup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backup_btnActionPerformed
        Model.funcoes_DAO.backup();
    }//GEN-LAST:event_backup_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Cliente;
    private javax.swing.JButton altera_btn;
    private javax.swing.JButton backup_btn;
    private javax.swing.JButton carrega_btn;
    private java.util.List<View.Cliente> clienteList;
    private javax.persistence.Query clienteQuery;
    public static javax.swing.JTextField cod1_txt;
    public static javax.swing.JTextField cod2_txt;
    public static javax.swing.JTextField end1_txt;
    public static javax.swing.JTextField end_txt;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton excluir_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTextField nome1_txt;
    public static javax.swing.JTextField nome_txt;
    private javax.swing.JButton sair_btn;
    private javax.swing.JButton salvar_btn;
    public static javax.swing.JTextField tel1_txt;
    public static javax.swing.JTextField tel_txt;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
