package br.com.biblioteca.view;

import br.com.biblioteca.controller.AlunoDB;
import br.com.biblioteca.controller.EditoraDB;
import br.com.biblioteca.controller.EmprestimoDB;
import br.com.biblioteca.controller.FuncionarioDB;
import br.com.biblioteca.controller.LivroDB;
import br.com.biblioteca.model.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ViewWindows extends javax.swing.JFrame {

    AlunoDB alunos;
    EditoraDB editoras;
    FuncionarioDB funcionarios;
    LivroDB livros;
    EmprestimoDB emprestimos;
    
    public ViewWindows() {
        initComponents();
        this.setLocationRelativeTo(null); 
        alunos = new AlunoDB();
        editoras = new EditoraDB();
        funcionarios = new FuncionarioDB();
        livros = new LivroDB();
        emprestimos = new EmprestimoDB();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeAluno = new javax.swing.JTextField();
        btnGravarAluno = new javax.swing.JButton();
        txtMatricula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlunos = new javax.swing.JTextArea();
        btnLocalizarAlunos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoEditora = new javax.swing.JTextField();
        txtNomeEditora = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnGravarEditora = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtEditoras = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        btnLocalizarEditoras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbEditorasLivro = new javax.swing.JComboBox();
        btnCarregarEditoras = new javax.swing.JButton();
        btnGravarLivro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNomeLivro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLivros = new javax.swing.JTextArea();
        btnLocalizarLivros = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtCodigoLivro = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtCPFFuncionario = new javax.swing.JTextField();
        txtNomeFuncionario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnGravarFuncionario = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtFuncionarios = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        btnLocalizarFuncionarios = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        cbLivrosEmprestimo = new javax.swing.JComboBox();
        cbAlunosEmprestimo = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtDataEntregaEmprestimo = new javax.swing.JTextField();
        cbFuncionariosEmprestimo = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtEmprestimos = new javax.swing.JTextArea();
        btnLocalizarEmprestimos = new javax.swing.JButton();
        btnGravarEmprestimo = new javax.swing.JButton();
        btnCarregarFuncionarios = new javax.swing.JButton();
        btnCarregarLivros = new javax.swing.JButton();
        btnCarregarAlunos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Locadora");

        jLabel1.setText("Nome:");

        btnGravarAluno.setText("Gravar");
        btnGravarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarAlunoActionPerformed(evt);
            }
        });

        jLabel4.setText("Matrícula:");

        txtAlunos.setColumns(20);
        txtAlunos.setRows(5);
        jScrollPane1.setViewportView(txtAlunos);

        btnLocalizarAlunos.setText("Localizar todos");
        btnLocalizarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarAlunosActionPerformed(evt);
            }
        });

        jLabel5.setText("Alunos cadastrados:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLocalizarAlunos)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGravarAluno)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 21, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGravarAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocalizarAlunos)
                .addGap(23, 23, 23))
        );

        txtNomeAluno.getAccessibleContext().setAccessibleName("txtNomeLocadora");

        jTabbedPane1.addTab("Aluno", jPanel1);

        jLabel7.setText("Código:");

        txtCodigoEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEditoraActionPerformed(evt);
            }
        });

        jLabel8.setText("Nome:");

        btnGravarEditora.setText("Gravar");
        btnGravarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarEditoraActionPerformed(evt);
            }
        });

        txtEditoras.setColumns(20);
        txtEditoras.setRows(5);
        jScrollPane3.setViewportView(txtEditoras);

        jLabel9.setText("Editoras cadastradas:");

        btnLocalizarEditoras.setText("Localizar todas");
        btnLocalizarEditoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarEditorasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCodigoEditora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomeEditora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnGravarEditora)
                            .addComponent(btnLocalizarEditoras))))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGravarEditora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocalizarEditoras)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Editora", jPanel3);

        jLabel2.setText("Editora:");

        cbEditorasLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEditorasLivroActionPerformed(evt);
            }
        });

        btnCarregarEditoras.setText("...");
        btnCarregarEditoras.setToolTipText("Carregar locadoras");
        btnCarregarEditoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarEditorasActionPerformed(evt);
            }
        });

        btnGravarLivro.setText("Gravar");
        btnGravarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarLivroActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome:");

        jLabel6.setText("Livros cadastrados:");
        jLabel6.setToolTipText("");

        txtLivros.setColumns(20);
        txtLivros.setRows(5);
        jScrollPane2.setViewportView(txtLivros);

        btnLocalizarLivros.setText("Localizar todas");
        btnLocalizarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarLivrosActionPerformed(evt);
            }
        });

        jLabel18.setText("Código:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnLocalizarLivros)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGravarLivro)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbEditorasLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCarregarEditoras)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel18)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCodigoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbEditorasLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarregarEditoras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGravarLivro)
                .addGap(1, 1, 1)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocalizarLivros)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Livro", jPanel2);

        jLabel10.setText("CPF:");

        txtCPFFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFFuncionarioActionPerformed(evt);
            }
        });

        jLabel11.setText("Nome:");

        btnGravarFuncionario.setText("Gravar");
        btnGravarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarFuncionarioActionPerformed(evt);
            }
        });

        txtFuncionarios.setColumns(20);
        txtFuncionarios.setRows(5);
        jScrollPane4.setViewportView(txtFuncionarios);

        jLabel12.setText("Funcionários cadastrados:");

        btnLocalizarFuncionarios.setText("Localizar todas");
        btnLocalizarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarFuncionariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnLocalizarFuncionarios)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGravarFuncionario)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCPFFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGravarFuncionario)
                .addGap(17, 17, 17)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocalizarFuncionarios)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Funcionário", jPanel4);

        jLabel13.setText("Livro:");

        jLabel14.setText("Aluno:");

        jLabel15.setText("Funcionário:");

        jLabel16.setText("Data de Entrega:");

        cbFuncionariosEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFuncionariosEmprestimoActionPerformed(evt);
            }
        });

        jLabel17.setText("Empréstimos realizados:");

        txtEmprestimos.setColumns(20);
        txtEmprestimos.setRows(5);
        jScrollPane5.setViewportView(txtEmprestimos);

        btnLocalizarEmprestimos.setText("Localizar todos");
        btnLocalizarEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarEmprestimosActionPerformed(evt);
            }
        });

        btnGravarEmprestimo.setText("Gravar");
        btnGravarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarEmprestimoActionPerformed(evt);
            }
        });

        btnCarregarFuncionarios.setText("...");
        btnCarregarFuncionarios.setToolTipText("Carregar locadoras");
        btnCarregarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarFuncionariosActionPerformed(evt);
            }
        });

        btnCarregarLivros.setText("...");
        btnCarregarLivros.setToolTipText("Carregar locadoras");
        btnCarregarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarLivrosActionPerformed(evt);
            }
        });

        btnCarregarAlunos.setText("...");
        btnCarregarAlunos.setToolTipText("Carregar locadoras");
        btnCarregarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarAlunosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnLocalizarEmprestimos)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGravarEmprestimo)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cbAlunosEmprestimo, javax.swing.GroupLayout.Alignment.LEADING, 0, 204, Short.MAX_VALUE)
                                            .addComponent(cbLivrosEmprestimo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbFuncionariosEmprestimo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnCarregarFuncionarios)
                                            .addComponent(btnCarregarLivros)
                                            .addComponent(btnCarregarAlunos)))
                                    .addComponent(txtDataEntregaEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtDataEntregaEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnCarregarLivros))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(cbLivrosEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(btnCarregarAlunos))
                    .addComponent(cbAlunosEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cbFuncionariosEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarregarFuncionarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGravarEmprestimo)
                .addGap(1, 1, 1)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocalizarEmprestimos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Empréstimo", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLocalizarEditorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarEditorasActionPerformed
        for (Editora a : editoras.retornarTodas()){
            txtEditoras.append("Editora: " + a.getNome() + " - ");
            txtEditoras.append("Código: " + a.getCodigo() + "\n");
            txtEditoras.append("###\n");
        }
    }//GEN-LAST:event_btnLocalizarEditorasActionPerformed

    private void btnGravarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarEditoraActionPerformed
        
        if(txtNomeEditora.getText().trim().equals("")){
             JOptionPane.showMessageDialog(rootPane, "Você deve preencher todos os campos!");
             return;
        }
        
        Editora editora = new Editora();
        editora.setCodigo(txtCodigoEditora.getText());
        editora.setNome(txtNomeEditora.getText());
        
        txtNomeEditora.setText("");
        txtCodigoEditora.setText("");
        
        editoras.inserirEditora(editora);
        
        JOptionPane.showMessageDialog(rootPane, "Editora incluída com sucesso");
    }//GEN-LAST:event_btnGravarEditoraActionPerformed

    private void btnLocalizarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarLivrosActionPerformed
        txtLivros.setText("");
        for(Livro l : livros.retornarTodos()){
            txtLivros.append("Nome: " + l.getNome() + "\n");
            txtLivros.append("Código: " + l.getCodigo() + "\n");
            txtLivros.append("Editora: " + l.getEditora() + "\n");
            txtLivros.append("###\n");
        }
    }//GEN-LAST:event_btnLocalizarLivrosActionPerformed

    private void btnGravarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarLivroActionPerformed
        if(editoras.retornarTodas().size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Você deve cadastrar uma editora.");
            return;
        }
        if(cbEditorasLivro.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(rootPane, "Você deve selecionar uma editora.");
            return;
        
        }
        if(txtNomeLivro.getText().trim().equals("") || txtCodigoLivro.getText().trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Você deve preencher todos os campos!");
            return;
        }
        Editora editora = (Editora) cbEditorasLivro.getSelectedItem();
        Livro livro = new Livro(editora);
        livro.setNome(txtNomeLivro.getText());
        livro.setCodigo(txtCodigoLivro.getText());
        
        livros.inserirLivro(livro);
        
        JOptionPane.showMessageDialog(rootPane, "Livro cadastrado com sucesso!");
        txtCodigoLivro.setText("");
        txtNomeLivro.setText("");
        cbEditorasLivro.setSelectedIndex(-1);
    }//GEN-LAST:event_btnGravarLivroActionPerformed

    private void btnCarregarEditorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarEditorasActionPerformed
        cbEditorasLivro.removeAllItems();
        for(Editora e : editoras.retornarTodas()){
            cbEditorasLivro.addItem(e);
        }
    }//GEN-LAST:event_btnCarregarEditorasActionPerformed

    private void btnLocalizarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarAlunosActionPerformed
        for (Aluno a : alunos.retornarTodos()){
            txtAlunos.append("Nome: " + a.getNome() + " - ");
            txtAlunos.append("Matrícula: " + a.getMatricula() + "\n");
            txtAlunos.append("###\n");
        }
    }//GEN-LAST:event_btnLocalizarAlunosActionPerformed

    private void btnGravarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarAlunoActionPerformed
        
        if(txtMatricula.getText().trim().equals("") || txtNomeAluno.getText().trim().equals("")){
             JOptionPane.showMessageDialog(rootPane, "Você deve preencher todos os campos!");
             return;
        }
        
        Aluno aluno = new Aluno();
        aluno.setMatricula(txtMatricula.getText());
        aluno.setNome(txtNomeAluno.getText());
        
        txtNomeAluno.setText("");
        txtMatricula.setText("");
        
        alunos.inserirAluno(aluno);
        
        JOptionPane.showMessageDialog(rootPane, "Aluno incluído com sucesso");
    }//GEN-LAST:event_btnGravarAlunoActionPerformed

    private void btnGravarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarFuncionarioActionPerformed
        if(txtCPFFuncionario.getText().trim().equals("") || txtNomeFuncionario.getText().trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Você deve preencher todos os campos!");
            return;
        }
        Funcionario funcionario = new Funcionario();
        funcionario.setCpf(txtCPFFuncionario.getText());
        funcionario.setNome(txtNomeFuncionario.getText());
        
        funcionarios.inserirFuncionario(funcionario);
        
        JOptionPane.showMessageDialog(rootPane, "Funcionário cadastrado com sucesso!");
        txtCPFFuncionario.setText("");
        txtNomeFuncionario.setText("");
    }//GEN-LAST:event_btnGravarFuncionarioActionPerformed

    private void btnLocalizarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarFuncionariosActionPerformed
        txtFuncionarios.setText("");
        for(Funcionario f : funcionarios.retornarTodos()){
            txtFuncionarios.append("Nome: " + f.getNome() + "\n");
            txtFuncionarios.append("CPF: " + f.getCpf()+ "\n");
            txtFuncionarios.append("###\n");
        }
    }//GEN-LAST:event_btnLocalizarFuncionariosActionPerformed

    private void cbFuncionariosEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFuncionariosEmprestimoActionPerformed
        
    }//GEN-LAST:event_cbFuncionariosEmprestimoActionPerformed

    private void btnLocalizarEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarEmprestimosActionPerformed
        txtEmprestimos.setText("");
        FileWriter arq = null; 
        try {
            arq = new FileWriter("c:\\emprestimos.txt");
        } catch (IOException ex) {
            Logger.getLogger(ViewWindows.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter gravarArq = new PrintWriter(arq); 
        gravarArq.printf("Empréstimos da Diblioteca:%n%n"); 
        gravarArq.printf("###%n%n"); 
        
        for(Emprestimo e : emprestimos.retornarTodos()){
            txtEmprestimos.append(e.toString());
            txtEmprestimos.append("###\n");
            gravarArq.printf( e.toStringArq() + "%n###%n" );
        }
        
        
        
        gravarArq.close(); 
        
        System.out.printf("\nRelatório foi gerado com sucesso em \"c:\\emprestimos.txt\".\n");
    }//GEN-LAST:event_btnLocalizarEmprestimosActionPerformed

    private void btnGravarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarEmprestimoActionPerformed
        if(livros.retornarTodos().size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Você deve cadastrar um livro.");
            return;
        }
        if(funcionarios.retornarTodos().size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Você deve cadastrar um funcionário.");
            return;
        }
        if(alunos.retornarTodos().size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Você deve cadastrar um aluno.");
            return;
        }
        if(cbLivrosEmprestimo.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(rootPane, "Você deve selecionar um livro.");
            return;        
        }
        if(cbAlunosEmprestimo.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(rootPane, "Você deve selecionar um aluno.");
            return;        
        }
        if(cbFuncionariosEmprestimo.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(rootPane, "Você deve selecionar um funcionário.");
            return;        
        }
        if(txtDataEntregaEmprestimo.getText().trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Você deve preencher todos os campos!");
            return;
        }
        Livro livro = (Livro) cbLivrosEmprestimo.getSelectedItem();
        Aluno aluno = (Aluno) cbAlunosEmprestimo.getSelectedItem();        
        Funcionario funcionario = (Funcionario) cbFuncionariosEmprestimo.getSelectedItem();
               
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setLivro(livro);
        emprestimo.setFuncionario(funcionario);
        emprestimo.setAluno(aluno);
        emprestimo.setDataEntrega(txtDataEntregaEmprestimo.getText());
        
        emprestimos.inserirEmprestimo(emprestimo);
        
        JOptionPane.showMessageDialog(rootPane, "Emprestimo cadastrado com sucesso!");
        txtDataEntregaEmprestimo.setText("");
        cbLivrosEmprestimo.setSelectedIndex(-1);
        cbAlunosEmprestimo.setSelectedIndex(-1);
        cbFuncionariosEmprestimo.setSelectedIndex(-1);
    }//GEN-LAST:event_btnGravarEmprestimoActionPerformed

    private void btnCarregarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarFuncionariosActionPerformed
        cbFuncionariosEmprestimo.removeAllItems();
        for(Funcionario f : funcionarios.retornarTodos()){
            cbFuncionariosEmprestimo.addItem(f);
        }
    }//GEN-LAST:event_btnCarregarFuncionariosActionPerformed

    private void btnCarregarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarLivrosActionPerformed
        cbLivrosEmprestimo.removeAllItems();
        for(Livro l : livros.retornarTodos()){
            cbLivrosEmprestimo.addItem(l);
        }
    }//GEN-LAST:event_btnCarregarLivrosActionPerformed

    private void btnCarregarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarAlunosActionPerformed
        cbAlunosEmprestimo.removeAllItems();
        for (Aluno a : alunos.retornarTodos()){
            cbAlunosEmprestimo.addItem(a);
            
        }
    }//GEN-LAST:event_btnCarregarAlunosActionPerformed

    private void txtCodigoEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEditoraActionPerformed

    private void txtCPFFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFFuncionarioActionPerformed

    private void cbEditorasLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEditorasLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEditorasLivroActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ViewWindows().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarregarAlunos;
    private javax.swing.JButton btnCarregarEditoras;
    private javax.swing.JButton btnCarregarFuncionarios;
    private javax.swing.JButton btnCarregarLivros;
    private javax.swing.JButton btnGravarAluno;
    private javax.swing.JButton btnGravarEditora;
    private javax.swing.JButton btnGravarEmprestimo;
    private javax.swing.JButton btnGravarFuncionario;
    private javax.swing.JButton btnGravarLivro;
    private javax.swing.JButton btnLocalizarAlunos;
    private javax.swing.JButton btnLocalizarEditoras;
    private javax.swing.JButton btnLocalizarEmprestimos;
    private javax.swing.JButton btnLocalizarFuncionarios;
    private javax.swing.JButton btnLocalizarLivros;
    private javax.swing.JComboBox cbAlunosEmprestimo;
    private javax.swing.JComboBox cbEditorasLivro;
    private javax.swing.JComboBox cbFuncionariosEmprestimo;
    private javax.swing.JComboBox cbLivrosEmprestimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea txtAlunos;
    private javax.swing.JTextField txtCPFFuncionario;
    private javax.swing.JTextField txtCodigoEditora;
    private javax.swing.JTextField txtCodigoLivro;
    private javax.swing.JTextField txtDataEntregaEmprestimo;
    private javax.swing.JTextArea txtEditoras;
    private javax.swing.JTextArea txtEmprestimos;
    private javax.swing.JTextArea txtFuncionarios;
    private javax.swing.JTextArea txtLivros;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextField txtNomeEditora;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtNomeLivro;
    // End of variables declaration//GEN-END:variables
}
