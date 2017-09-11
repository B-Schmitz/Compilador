
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Tela extends javax.swing.JFrame {

    private final ImageIcon icone;
    private final Tokens tokens = new Tokens();
    private final Automato automato = new Automato();
    private final JFileChooser fc = new JFileChooser();
    private String arquivo, texto, textobackup;

    public Tela() {

        // Configurações de Janela
        initComponents();
        this.setLocationRelativeTo(null);
        icone = new ImageIcon("src/icones/source_code.png");
        this.setIconImage(icone.getImage());
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        textobackup = Texto.getText();

        // Linhas do texto
        TextLineNumber tln = new TextLineNumber(Texto);
        javax.swing.JScrollPane sp = new javax.swing.JScrollPane(Texto, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sp.setRowHeaderView(tln);
        this.setContentPane(sp);

        // Fechar no X
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                if (textobackup.equals(Texto.getText())) {
                    //Não aparece a tela e simplesmente fecha
                    System.exit(0);
                } else {
                    int op = JOptionPane.showConfirmDialog(null, "Deseja salvar o arquivo antes?", "Sair", 1);
                    if (op == 0) {
                        menu_salvar.doClick();
                        System.exit(0);
                    }
                    if (op == 1) {
                        System.exit(0);
                    } else {
                        setVisible(true);
                    }
                }
            }
        });
    }

    // Função Abrir
    private String Abrir(String nomeArquivo) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(nomeArquivo);
            bufferedReader = new BufferedReader(fileReader);
            StringBuilder sb = new StringBuilder();
            while (bufferedReader.ready()) {
                sb.append(bufferedReader.readLine());
                sb.append("\n");
            }
            return sb.toString();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao abrir o arquivo: "
                    + ex.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao abrir o arquivo: "
                            + ex.getMessage());
                }
            }
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao abrir o arquivo: "
                            + ex.getMessage());
                }
            }
        }
        return null;
    }

    // Função Salvar
    private void Salvar(String nomeArquivo, String textoArquivo) {

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(nomeArquivo + ".txt", false);
            bufferedWriter = new BufferedWriter(fileWriter);
            String conteudo = textoArquivo.replaceAll("\n",
                    System.getProperty("line.separator"));
            bufferedWriter.write(conteudo);
            bufferedWriter.flush();
            JOptionPane.showMessageDialog(this, "Salvo com sucesso");
            textobackup = Texto.getText();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar o arquivo: " + ex.getMessage());
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao salvar o arquivo: "
                            + ex.getMessage());
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao salvar o arquivo: "
                            + ex.getMessage());
                }
            }
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

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Texto = new javax.swing.JTextArea();
        menu_bar = new javax.swing.JMenuBar();
        menu_arquivo = new javax.swing.JMenu();
        menu_novo = new javax.swing.JMenuItem();
        menu_abrir = new javax.swing.JMenuItem();
        menu_salvar = new javax.swing.JMenuItem();
        menu_sair = new javax.swing.JMenuItem();
        menu_executar = new javax.swing.JMenu();
        menu_compilar = new javax.swing.JMenuItem();
        menu_tokens = new javax.swing.JMenuItem();
        menu_sobre = new javax.swing.JMenu();
        menu_ajuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compilador Léxico HUE+-");

        Texto.setBackground(new java.awt.Color(246, 246, 246));
        Texto.setColumns(20);
        Texto.setRows(5);
        jScrollPane1.setViewportView(Texto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
        );

        menu_arquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/folder_vertical_document.png"))); // NOI18N
        menu_arquivo.setText("Arquivo");
        menu_arquivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menu_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/document_empty.png"))); // NOI18N
        menu_novo.setText("Novo");
        menu_novo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_novoActionPerformed(evt);
            }
        });
        menu_arquivo.add(menu_novo);

        menu_abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/document_import.png"))); // NOI18N
        menu_abrir.setText("Abrir");
        menu_abrir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_abrirActionPerformed(evt);
            }
        });
        menu_arquivo.add(menu_abrir);

        menu_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/file_save_as.png"))); // NOI18N
        menu_salvar.setText("Salvar");
        menu_salvar.setContentAreaFilled(false);
        menu_salvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_salvarActionPerformed(evt);
            }
        });
        menu_arquivo.add(menu_salvar);

        menu_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/door_out.png"))); // NOI18N
        menu_sair.setText("Sair");
        menu_sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_sairActionPerformed(evt);
            }
        });
        menu_arquivo.add(menu_sair);

        menu_bar.add(menu_arquivo);

        menu_executar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/application_lightning.png"))); // NOI18N
        menu_executar.setText("Executar");
        menu_executar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menu_compilar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        menu_compilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/compile.png"))); // NOI18N
        menu_compilar.setText("Compilar");
        menu_compilar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_compilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_compilarActionPerformed(evt);
            }
        });
        menu_executar.add(menu_compilar);

        menu_tokens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/token_comment.png"))); // NOI18N
        menu_tokens.setText("Tokens");
        menu_tokens.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_tokens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_tokensActionPerformed(evt);
            }
        });
        menu_executar.add(menu_tokens);

        menu_bar.add(menu_executar);

        menu_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/support.png"))); // NOI18N
        menu_sobre.setText("Sobre");
        menu_sobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menu_ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/help.png"))); // NOI18N
        menu_ajuda.setText("Ajuda");
        menu_ajuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ajudaActionPerformed(evt);
            }
        });
        menu_sobre.add(menu_ajuda);

        menu_bar.add(menu_sobre);

        setJMenuBar(menu_bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_salvarActionPerformed
        //Exibe o diálogo. Deve ser passado por parâmetro o JFrame de origem.
        fc.showSaveDialog(this);
        //Captura o objeto File que representa o arquivo selecionado.
        File selFile = fc.getSelectedFile();
        arquivo = selFile.getAbsolutePath();
        texto = Texto.getText();
        Salvar(arquivo, texto);
    }//GEN-LAST:event_menu_salvarActionPerformed

    private void menu_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_abrirActionPerformed
        //Exibe o diálogo. Deve ser passado por parâmetro o JFrame de origem.
        fc.showOpenDialog(this);
        File selFile = fc.getSelectedFile();
        arquivo = selFile.getAbsolutePath();
        String text = Abrir(arquivo);
        Texto.setText(text);
    }//GEN-LAST:event_menu_abrirActionPerformed

    private void menu_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_novoActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Deseja salvar o arquivo antes?", "Novo arquivo", 1);
        if (op == 0) {
            menu_salvar.doClick();
            Texto.setText("");
        }
        if (op == 1) {
            Texto.setText("");
        }
    }//GEN-LAST:event_menu_novoActionPerformed

    private void menu_ajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ajudaActionPerformed
        JOptionPane.showMessageDialog(null, "Compilador Léxico da Linguaguem HUE+-\n\nEquipe: Bernardo e Michael\nVersão: 1.0\nData: 05/09/2017\n\nUNESC (Universidade do Extremo Sul Catarinense)", "Ajuda", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/icones/support.png"));


    }//GEN-LAST:event_menu_ajudaActionPerformed

    private void menu_tokensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_tokensActionPerformed
        tokens.setVisible(true);
    }//GEN-LAST:event_menu_tokensActionPerformed

    private void menu_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_sairActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Deseja salvar o arquivo antes?", "Sair", 1);
        if (textobackup.equals(Texto.getText())) {
            //Não aparece a tela e simplesmente fecha
            System.exit(0);
        } else {
            if (op == 0) {
                menu_salvar.doClick();
                System.exit(0);
            }
            if (op == 1) {
                System.exit(0);
            } else {
                setVisible(true);
            }
    }//GEN-LAST:event_menu_sairActionPerformed
    }
    private void menu_compilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_compilarActionPerformed

        TokenGetSet t = automato.getToken(Texto.getText() + "@");
        tokens.setVisible(true);
        tokens.setToken(t);

    }//GEN-LAST:event_menu_compilarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Tela().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Texto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menu_abrir;
    private javax.swing.JMenuItem menu_ajuda;
    private javax.swing.JMenu menu_arquivo;
    private javax.swing.JMenuBar menu_bar;
    private javax.swing.JMenuItem menu_compilar;
    private javax.swing.JMenu menu_executar;
    private javax.swing.JMenuItem menu_novo;
    private javax.swing.JMenuItem menu_sair;
    private javax.swing.JMenuItem menu_salvar;
    private javax.swing.JMenu menu_sobre;
    private javax.swing.JMenuItem menu_tokens;
    // End of variables declaration//GEN-END:variables
}
