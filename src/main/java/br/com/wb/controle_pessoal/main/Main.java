package br.com.wb.controle_pessoal.main;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import br.com.wb.controle_pessoal.form.Form;
import br.com.wb.controle_pessoal.menu.EventMenu;
import br.com.wb.controle_pessoal.menu.MainForm;
import br.com.wb.controle_pessoal.menu.MenuItem;
import br.com.wb.controle_pessoal.telas.CadastroInstituicao;
import java.awt.Component;
import java.awt.EventQueue;

/**
 *
 * @author wb
 */

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        menu.addEventMenuSelected(new EventMenu() {
            @Override
            public void mainMenuSelected(MainForm mainForm, int index, MenuItem menuItem) {
            }

            @Override
            public void subMenuSelected(MainForm mainForm, int index, int subMenuIndex, Component menuItem) {
                //mainForm.displayForm(new Form("Form " + index + "-" + subMenuIndex)); // Para teste 
                escolhaMenu(index, subMenuIndex);
            }           
        });
        menu.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new br.com.wb.controle_pessoal.menu.Menu();
        jLabel1 = new javax.swing.JLabel();
        menuItem1 = new br.com.wb.controle_pessoal.menu.MenuItem();
        menuItem2 = new br.com.wb.controle_pessoal.menu.MenuItem();
        menuItem3 = new br.com.wb.controle_pessoal.menu.MenuItem();
        menuItem4 = new br.com.wb.controle_pessoal.menu.MenuItem();
        menuItem5 = new br.com.wb.controle_pessoal.menu.MenuItem();
        subMenuPanel1 = new br.com.wb.controle_pessoal.menu.SubMenuPanel();
        mainForm = new br.com.wb.controle_pessoal.menu.MainForm();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuSair = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        chDarkMode = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle Pessoal");

        menu.setMainForm(mainForm);
        menu.setSubMenuPanel(subMenuPanel1);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wb/controle_pessoal/icon/logo.png"))); // NOI18N
        menu.add(jLabel1);

        menuItem1.setBackground(new java.awt.Color(118, 194, 193));
        menuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wb/controle_pessoal/icon/menu1.png"))); // NOI18N
        menuItem1.setText("menuItem1");
        menuItem1.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "br/com/wb/controle_pessoal/icon/s1_7.png", "br/com/wb/controle_pessoal/icon/s1_4.png", "br/com/wb/controle_pessoal/icon/s1_6.png", "br/com/wb/controle_pessoal/icon/s3_3.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menuItem1.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Cadastro Instituições", "Cadastro de dividas", "Cadastro de Projeto", "Cadastro Mural" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem1ActionPerformed(evt);
            }
        });
        menu.add(menuItem1);

        menuItem2.setBackground(new java.awt.Color(119, 194, 193));
        menuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wb/controle_pessoal/icon/menu2.png"))); // NOI18N
        menuItem2.setText("menuItem2");
        menuItem2.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "br/com/wb/controle_pessoal/icon/s3_1.png", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menuItem2.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Controle Mensal" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu.add(menuItem2);

        menuItem3.setBackground(new java.awt.Color(119, 194, 193));
        menuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wb/controle_pessoal/icon/menu3.png"))); // NOI18N
        menuItem3.setText("menuItem3");
        menuItem3.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "br/com/wb/controle_pessoal/icon/s4_2.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menuItem3.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Visualizar lucros" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu.add(menuItem3);

        menuItem4.setBackground(new java.awt.Color(119, 194, 193));
        menuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wb/controle_pessoal/icon/menu4.png"))); // NOI18N
        menuItem4.setText("menuItem4");
        menuItem4.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "br/com/wb/controle_pessoal/icon/s4_3.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menuItem4.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Simula investimento" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu.add(menuItem4);

        menuItem5.setBackground(new java.awt.Color(119, 194, 193));
        menuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wb/controle_pessoal/icon/menu5.png"))); // NOI18N
        menuItem5.setText("menuItem5");
        menuItem5.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "br/com/wb/controle_pessoal/icon/s4_1.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menuItem5.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Lembrete Mural" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem5ActionPerformed(evt);
            }
        });
        menu.add(menuItem5);

        subMenuPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(80, 1, 1, 1));

        menuSair.setText("Exit");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSair);

        jMenu3.setText("Options");

        chDarkMode.setText("Dark Mode");
        chDarkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chDarkModeActionPerformed(evt);
            }
        });
        jMenu3.add(chDarkMode);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(subMenuPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainForm, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
            .addComponent(subMenuPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chDarkModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chDarkModeActionPerformed
        if (chDarkMode.isSelected()) {
            EventQueue.invokeLater(() -> {
                FlatAnimatedLafChange.showSnapshot();
                FlatDarculaLaf.setup();
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
            });
        } else {
            EventQueue.invokeLater(() -> {
                FlatAnimatedLafChange.showSnapshot();
                FlatIntelliJLaf.setup();
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
            });
        }
    }//GEN-LAST:event_chDarkModeActionPerformed

    private void menuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItem5ActionPerformed

    private void menuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItem1ActionPerformed

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuSairMouseClicked

    public static void main(String args[]) {
        FlatLaf.registerCustomDefaultsSource("br.com.wb.controle_pessoal.style");
        FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem chDarkMode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private br.com.wb.controle_pessoal.menu.MainForm mainForm;
    private br.com.wb.controle_pessoal.menu.Menu menu;
    private br.com.wb.controle_pessoal.menu.MenuItem menuItem1;
    private br.com.wb.controle_pessoal.menu.MenuItem menuItem2;
    private br.com.wb.controle_pessoal.menu.MenuItem menuItem3;
    private br.com.wb.controle_pessoal.menu.MenuItem menuItem4;
    private br.com.wb.controle_pessoal.menu.MenuItem menuItem5;
    private javax.swing.JMenu menuSair;
    private br.com.wb.controle_pessoal.menu.SubMenuPanel subMenuPanel1;
    // End of variables declaration//GEN-END:variables

   private void escolhaMenu(int index, int subMenuIndex) {
        
       if(index == 0 && subMenuIndex == 0){
           mainForm.displayForm(new CadastroInstituicao());
       } else if(index == 0 && subMenuIndex == 1){
           mainForm.displayForm(new Form("Form " + index + "-" + subMenuIndex));
       } else if(index == 0 && subMenuIndex == 2){
           mainForm.displayForm(new Form("Form " + index + "-" + subMenuIndex));
       } else if(index == 0 && subMenuIndex == 3){
           mainForm.displayForm(new Form("Form " + index + "-" + subMenuIndex));
       } else if(index == 1 && subMenuIndex == 0){
           mainForm.displayForm(new Form("Form " + index + "-" + subMenuIndex));
       } else if(index == 2 && subMenuIndex == 0){
           mainForm.displayForm(new Form("Form " + index + "-" + subMenuIndex));
       } else if(index == 3 && subMenuIndex == 0){
           mainForm.displayForm(new Form("Form " + index + "-" + subMenuIndex));
       } else if(index == 4 && subMenuIndex == 0){
           mainForm.displayForm(new Form("Form " + index + "-" + subMenuIndex));
       } else {
           mainForm.displayForm(new Form("Form " + index + "-" + subMenuIndex));
       }       
    }
}
