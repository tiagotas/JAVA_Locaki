/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LocacoesDevolucoesAtrasadas.java
 *
 * Created on 13/05/2010, 20:26:17
 */

package visualizacao.Relatorios;

import controle.relatorios.RelatorioCRUD;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import visualizacao.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.RelatoriosGerais;

/**
 *
 * @author Tiago
 */
public class LocacoesDevolucoesAtrasadas extends javax.swing.JFrame {

           ////// CLIENTES //////
    CadCliente cc = null;

    ////// FILMES //////

    CadFilme cf = null;

    ////// GENEROS //////

    CadGenero cg = null;

    ////// PROMOCOES //////

    CadPromocao cp = null;

    ////// LOCACOES //////

    CadLocacao cl = null;

    /** Creates new form LocacoesDevolucoesAtrasadas */
    public LocacoesDevolucoesAtrasadas() {
        initComponents();
        this.setBounds(420, 250, 577, 371);
        this.carregarTabela();
    }

    private void carregarTabela()
    {
        try
        {
            RelatorioCRUD rCrud = new RelatorioCRUD();

            List<RelatoriosGerais> lista = (List<RelatoriosGerais>) rCrud.getLocacoesAtrasadas(jTextField1.getText().toUpperCase());

            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.setRowCount(0);

             SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

            for (RelatoriosGerais r : lista) {
                modelo.addRow(new Object[]{
                            r.getIdFilme(),
                            r.getFilme(),
                            formatador.format(r.getDataDevolucaoPrevista())
                        });
            }
        } catch(SQLException e)
        {
             JOptionPane.showMessageDialog(this, "Desculpe, ocorreu um erro: \n "  + e.getMessage(), "Locaki ~ A Sua Locadora!", 0);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        javax.swing.JButton jButton3 = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        javax.swing.JButton jButton2 = new javax.swing.JButton();
        javax.swing.JMenuBar jMenuBar2 = new javax.swing.JMenuBar();
        javax.swing.JMenu jMenu2 = new javax.swing.JMenu();
        javax.swing.JMenu jMenu11 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem24 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem21 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem22 = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenu12 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem26 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem25 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem27 = new javax.swing.JMenuItem();
        javax.swing.JPopupMenu.Separator jSeparator2 = new javax.swing.JPopupMenu.Separator();
        javax.swing.JMenu jMenu13 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem29 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem28 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem30 = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenu14 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem32 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem31 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem33 = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenu15 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem34 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem35 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem4 = new javax.swing.JMenuItem();
        javax.swing.JPopupMenu.Separator jSeparator3 = new javax.swing.JPopupMenu.Separator();
        javax.swing.JMenuItem jMenuItem5 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem11 = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenu3 = new javax.swing.JMenu();
        javax.swing.JMenu jMenu4 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem12 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem13 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem8 = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenu5 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem6 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem7 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem15 = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenu6 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem16 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem18 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem17 = new javax.swing.JMenuItem();
        javax.swing.JPopupMenu.Separator jSeparator4 = new javax.swing.JPopupMenu.Separator();
        javax.swing.JMenu jMenu7 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem14 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem19 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem20 = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenu8 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem10 = new javax.swing.JMenuItem();
        javax.swing.JPopupMenu.Separator jSeparator1 = new javax.swing.JPopupMenu.Separator();
        javax.swing.JMenuItem jMenuItem9 = new javax.swing.JMenuItem();

        setTitle("Locaki ~ A Sua Locadora! : Relatório de Devoluções Atrasadas");
        setAlwaysOnTop(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Devoluções Atrasadas:"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa:"));

        jLabel1.setText("Filme:");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/find.png"))); // NOI18N
        jButton3.setText("Buscar!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(450, 450, 450))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código:", "Título:", "Data Devolução Prevista:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/cross.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jMenu2.setText("Cadastros");

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/group.png"))); // NOI18N
        jMenu11.setText("Clientes");

        jMenuItem24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/group_go.png"))); // NOI18N
        jMenuItem24.setText("Relação de Clientes");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem24);

        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/group_add.png"))); // NOI18N
        jMenuItem21.setText("Novo Cliente...");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem21);

        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/group_edit.png"))); // NOI18N
        jMenuItem22.setText("Editar Cliente");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem22);

        jMenu2.add(jMenu11);

        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/film.png"))); // NOI18N
        jMenu12.setText("Filmes");

        jMenuItem26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/film_go.png"))); // NOI18N
        jMenuItem26.setText("Relação de Filmes");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem26);

        jMenuItem25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/film_add.png"))); // NOI18N
        jMenuItem25.setText("Novo Filme...");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem25);

        jMenuItem27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/film_edit.png"))); // NOI18N
        jMenuItem27.setText("Editar Filme");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem27);

        jMenu2.add(jMenu12);
        jMenu2.add(jSeparator2);

        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/comments.png"))); // NOI18N
        jMenu13.setText("Gêneros");

        jMenuItem29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/comments.png"))); // NOI18N
        jMenuItem29.setText("Relação de Gêneros");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem29);

        jMenuItem28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/comments_add.png"))); // NOI18N
        jMenuItem28.setText("Novo Gênero...");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem28);

        jMenuItem30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/comment_edit.png"))); // NOI18N
        jMenuItem30.setText("Editar Gênero");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem30);

        jMenu2.add(jMenu13);

        jMenu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/heart.png"))); // NOI18N
        jMenu14.setText("Promoções");

        jMenuItem32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/heart.png"))); // NOI18N
        jMenuItem32.setText("Relação de Promoções");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem32);

        jMenuItem31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/heart_add.png"))); // NOI18N
        jMenuItem31.setText("Nova Promoção...");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem31);

        jMenuItem33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/pencil.png"))); // NOI18N
        jMenuItem33.setText("Editar Promoção");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem33);

        jMenu2.add(jMenu14);

        jMenu15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/report.png"))); // NOI18N
        jMenu15.setText("Locações");

        jMenuItem34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/report_go.png"))); // NOI18N
        jMenuItem34.setText("Relação de Locações");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem34);

        jMenuItem35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/report_add.png"))); // NOI18N
        jMenuItem35.setText("Lançar Locação!");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem35);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/report_delete.png"))); // NOI18N
        jMenuItem4.setText("Remover Locação");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem4);

        jMenu2.add(jMenu15);
        jMenu2.add(jSeparator3);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/arrow_rotate_clockwise.png"))); // NOI18N
        jMenuItem5.setText("Voltar Menu Principal");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/door_in.png"))); // NOI18N
        jMenuItem11.setText("Sair");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuBar2.add(jMenu2);

        jMenu3.setText("Relatórios");

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/group_go.png"))); // NOI18N
        jMenu4.setText("Cliente...");

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/house_go.png"))); // NOI18N
        jMenuItem12.setText("Clientes com Filmes");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/arrow_up.png"))); // NOI18N
        jMenuItem13.setText("Clientes Mais Ativos");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/arrow_down.png"))); // NOI18N
        jMenuItem8.setText("Clientes Menos Ativos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenu3.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/film_go.png"))); // NOI18N
        jMenu5.setText("Filmes...");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/add.png"))); // NOI18N
        jMenuItem6.setText("Filmes Mais Procurados");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/delete.png"))); // NOI18N
        jMenuItem7.setText("Filmes Menos Procurados");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/star.png"))); // NOI18N
        jMenuItem15.setText("Top 10 do Mês");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        jMenu3.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/report_go.png"))); // NOI18N
        jMenu6.setText("Locações...");

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/exclamation.png"))); // NOI18N
        jMenuItem16.setText("Devoluções Atrasadas");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem16);

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/accept.png"))); // NOI18N
        jMenuItem18.setText("Filmes Devolvidos Hoje");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem18);

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/coins.png"))); // NOI18N
        jMenuItem17.setText("Total de Lacações no Mês");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem17);

        jMenu3.add(jMenu6);
        jMenu3.add(jSeparator4);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/money_dollar.png"))); // NOI18N
        jMenu7.setText("Financeiro...");

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/date.png"))); // NOI18N
        jMenuItem14.setText("Receita por Período");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem14);

        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/film.png"))); // NOI18N
        jMenuItem19.setText("Receita por Filme");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem19);

        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/comments.png"))); // NOI18N
        jMenuItem20.setText("Receita por Gênero");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem20);

        jMenu3.add(jMenu7);

        jMenuBar2.add(jMenu3);

        jMenu8.setText("Ajuda");

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/lightbulb.png"))); // NOI18N
        jMenuItem10.setText("Dicas...");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem10);
        jMenu8.add(jSeparator1);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/Icones/emotion_wink.png"))); // NOI18N
        jMenuItem9.setText("Sobre o Sistema");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem9);

        jMenuBar2.add(jMenu8);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-577)/2, (screenSize.height-371)/2, 577, 371);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        // TODO add your handling code here:

        RelCliente rc = new RelCliente();
        rc.setVisible(true);
}//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        // TODO add your handling code here:
        if(cc == null)
            cc = new CadCliente();

        cc.setVisible(true);
}//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        // TODO add your handling code here:
        RelCliente ec = new RelCliente();
        ec.setVisible(true);
}//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        // TODO add your handling code here:

        RelFilme rf = new RelFilme();
        rf.setVisible(true);
}//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        // TODO add your handling code here:
        if(cf == null)
            cf = new CadFilme();

        cf.setVisible(true);
}//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        // TODO add your handling code here:

        RelFilme rf = new RelFilme();
        rf.setVisible(true);
}//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        // TODO add your handling code here:

        RelGenero rg = new RelGenero();
        rg.setVisible(true);
}//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        // TODO add your handling code here:
        if(cg == null)
            cg = new CadGenero();

        cg.setVisible(true);
}//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        // TODO add your handling code here:
        RelGenero rg = new RelGenero();
        rg.setVisible(true);
}//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        // TODO add your handling code here:
        RelPromocao rp = new RelPromocao();
        rp.setVisible(true);
}//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        // TODO add your handling code here:
        if(cp == null)
            cp = new CadPromocao();

        cp.setVisible(true);
}//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        // TODO add your handling code here:
        RelPromocao rp = new RelPromocao();
        rp.setVisible(true);
}//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        // TODO add your handling code here:

        RelLocacao rl = new RelLocacao();
        rl.setVisible(true);
}//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        // TODO add your handling code here:
        if(cl == null)
            cl = new CadLocacao();

        cl.setVisible(true);
}//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        RelLocacao rl = new RelLocacao();
        rl.setVisible(true);
}//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:

        MenuPrincipal.mp.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:

        if(JOptionPane.showConfirmDialog(this, "Tem certeza que deseja sair do sistema?", "Locaki ~ A Sua Locadora!", 2, 2) == 0)
            System.exit(0);
}//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:

        ClientesComFilmes ccf = new ClientesComFilmes();
        ccf.setVisible(true);
}//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:

        ClientesMaisAtivos cma = new ClientesMaisAtivos();
        cma.setVisible(true);
}//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        ClientesMenosAtivos cma = new ClientesMenosAtivos();
        cma.setVisible(true);
}//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:

        FilmesMaisProcurados fmp = new FilmesMaisProcurados();
        fmp.setVisible(true);
}//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:

        FilmesMenosProcurados fmp = new FilmesMenosProcurados();
        fmp.setVisible(true);
}//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:

        FilmesTopDez ftd = new FilmesTopDez();
        ftd.setVisible(true);
}//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:

        LocacoesDevolucoesAtrasadas lda = new LocacoesDevolucoesAtrasadas();
        lda.setVisible(true);
}//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:

        LocacoesFilmesDevolvidosHoje lfdh = new LocacoesFilmesDevolvidosHoje();
        lfdh.setVisible(true);
}//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:

        LocacoesTotalLocacoesMes ltlm = new LocacoesTotalLocacoesMes();
        ltlm.setVisible(true);
}//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:

        FinanceiroReceitaPorPeriodo frpp = new FinanceiroReceitaPorPeriodo();
        frpp.setVisible(true);
}//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:

        FinanceiroReceitaPorFilme frpf = new FinanceiroReceitaPorFilme();
        frpf.setVisible(true);
}//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:

        FinanceiroReceitaPorGenero frpg = new FinanceiroReceitaPorGenero();
        frpg.setVisible(true);
}//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:

        Dicas d = new Dicas();
        d.setVisible(true);
}//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:

        Sobre s = new Sobre();
        s.setVisible(true);
}//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        try
        {
            RelatorioCRUD rCrud = new RelatorioCRUD();

            List<RelatoriosGerais> lista = (List<RelatoriosGerais>) rCrud.getLocacoesAtrasadas(jTextField1.getText().toUpperCase());

            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.setRowCount(0);

             SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

            for (RelatoriosGerais r : lista) {
                modelo.addRow(new Object[]{
                            r.getIdFilme(),
                            r.getFilme(),
                            formatador.format(r.getDataDevolucaoPrevista())
                        });
            }
        } catch(SQLException e)
        {
             JOptionPane.showMessageDialog(this, "Desculpe, ocorreu um erro: \n "  + e.getMessage(), "Locaki ~ A Sua Locadora!", 0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LocacoesDevolucoesAtrasadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
