
package visao.compraVenda;

import controlador.ClienteDao;
import controlador.CompraVendaDao;
import controlador.ProdutoDao;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.CompraVendaProduto;
import modelo.Produto;
import util.Message;

public class CompraVenda extends javax.swing.JFrame {

    public CompraVenda() {
        initComponents();
    }
    
    public void limpaTudo() {
        limpaProduto();
        jTextFieldClienteId.setText("");
        jTextFieldClienteNome.setText("");
        jTextFieldDesconto.setText("0,0");
        jTextFieldValorTotal.setText("0,0");
        
        DefaultTableModel dtm = (DefaultTableModel) jTableProduto.getModel();
        dtm.setRowCount(0);
    }
    
    public void limpaProduto() {
        jTextFieldProdutoId.setText("");
        jTextFieldProdutoNome.setText(""); 
        jTextFieldProdutoUnidade.setText("");
        jTextFieldProdutoQtd.setText("0,0");
        jTextFieldProdutoValor.setText("0,0");
    }
    
    public String localeFormatInput(String str) {
        return str.replace(',', '.');
    }
    
    public String localeFormatInput(Double str) {
        return str.toString().replace(',', '.');
    }
    
    public String localeFormatOutput(String str) {
        return numberFormmater(Double.parseDouble(str)).replace('.', ',');
    }
    
    public String localeFormatOutput(Double num) {
        return numberFormmater(num).toString().replace('.', ',');
    }
    
   public String numberFormmater(Double num) {
       DecimalFormat df = new DecimalFormat("##.###");
       return df.format(num);
    }

    private void atualizaValorTotal(Double valor) {
        Double valorTotal = Double.parseDouble(
                localeFormatInput(jTextFieldValorTotal.getText()));
        valorTotal += valor;
        jTextFieldValorTotal.setText(localeFormatOutput(valorTotal));
    }
    
    private void atualizaValorTotal(String valor) {
        atualizaValorTotal(Double.parseDouble(valor));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxCompraVenda = new javax.swing.JComboBox<>();
        jTextFieldClienteId = new javax.swing.JTextField();
        jTextFieldClienteNome = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldProdutoId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldProdutoQtd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldProdutoNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldProdutoValor = new javax.swing.JTextField();
        jButtonRemover = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProduto = new javax.swing.JTable();
        jButtonPesquisaProduto = new javax.swing.JButton();
        jTextFieldProdutoUnidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldValorTotal = new javax.swing.JTextField();
        jTextFieldDesconto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxFormaPagamento = new javax.swing.JComboBox<>();
        jButtonPesquisaCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compra/Venda");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Compra/Venda (Simplificada)");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Operação:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cliente:");

        jComboBoxCompraVenda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Venda", "Compra" }));

        jTextFieldClienteId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldClienteId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldClienteIdFocusLost(evt);
            }
        });

        jTextFieldClienteNome.setEditable(false);
        jTextFieldClienteNome.setFocusable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldProdutoId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldProdutoId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldProdutoIdFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Produto:");

        jTextFieldProdutoQtd.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Qtd.");

        jTextFieldProdutoNome.setEditable(false);
        jTextFieldProdutoNome.setFocusable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Valor Unit.");

        jTextFieldProdutoValor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldProdutoValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProdutoValorActionPerformed(evt);
            }
        });

        jButtonRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        jButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jTableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Un. Medida", "Qtd.", "Valor Un.", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProduto);

        jButtonPesquisaProduto.setText("...");

        jTextFieldProdutoUnidade.setEditable(false);
        jTextFieldProdutoUnidade.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldProdutoId, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(jTextFieldProdutoQtd))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 509, Short.MAX_VALUE)
                                .addComponent(jButtonRemover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAdicionar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jTextFieldProdutoNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldProdutoUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPesquisaProduto))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldProdutoValor)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldProdutoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldProdutoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldProdutoUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisaProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProdutoQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldProdutoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAdicionar)
                    .addComponent(jButtonRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Desconto:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Valor Total:");

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jTextFieldValorTotal.setEditable(false);
        jTextFieldValorTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldValorTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldValorTotal.setText("0,0");

        jTextFieldDesconto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDesconto.setText("0,0");
        jTextFieldDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldDescontoFocusLost(evt);
            }
        });
        jTextFieldDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescontoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Forma de pagamento");

        jComboBoxFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro" }));

        jButtonPesquisaCliente.setText("...");
        jButtonPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxCompraVenda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldClienteId))
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldClienteNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisaCliente)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldValorTotal)
                                    .addComponent(jComboBoxFormaPagamento, 0, 86, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSalvar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxCompraVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisaCliente))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonSalvar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPesquisaClienteActionPerformed

    private void jTextFieldProdutoIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldProdutoIdFocusLost
        if (!jTextFieldProdutoId.getText().equals("")) {

            try {
                int id = Integer.parseInt(jTextFieldProdutoId.getText());

                ProdutoDao dao = new ProdutoDao();
                Produto produto = dao.buscarProduto(id);

                if (produto == null) {
                    System.out.println("Teste");
                    Message.showMessage("Não foi encontrado o produto com o id " + id);
                    jTextFieldProdutoId.setText("");
                    jTextFieldProdutoId.requestFocus();
                    return;
                }

                jTextFieldProdutoNome.setText(produto.getNome());
                jTextFieldProdutoUnidade.setText(produto.getUnidadeDeMedida());
            } catch (Exception ex) {
                Message.showMessage("Erro inesperado " + ex.getMessage());
                ex.printStackTrace();
            }

        }
    }//GEN-LAST:event_jTextFieldProdutoIdFocusLost

    private void jTextFieldClienteIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldClienteIdFocusLost
        if (!jTextFieldClienteId.getText().equals("")) {
            int id = Integer.parseInt(jTextFieldClienteId.getText());

            try {
                ClienteDao dao = new ClienteDao();
                Cliente cliente = dao.buscarCliente(id);

                if (cliente == null) {
                    Message.showMessage("Cliente não encontrado com o id " + cliente.getId());
                    jTextFieldClienteId.setText("");
                    jTextFieldClienteId.requestFocus();
                    return;
                }

                jTextFieldClienteNome.setText(cliente.getNome());

            } catch (Exception e) {
                Message.showMessage("Erro inesperado " + e.getMessage());
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jTextFieldClienteIdFocusLost

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        String op = (String) jComboBoxCompraVenda.getSelectedItem();
        int idCliente = Integer.parseInt(jTextFieldClienteId.getText());
        int formaPagto = jComboBoxFormaPagamento.getSelectedIndex();

        Double desconto = Double.parseDouble(
                 localeFormatInput(jTextFieldDesconto.getText()));

        modelo.CompraVenda cv = new modelo.CompraVenda();
        cv.setOperacao(op.substring(0, 1));
        cv.setCliente(idCliente);
        cv.setFormaPagamento(formaPagto);
        cv.setDesconto(desconto);

        DefaultTableModel modelo = (DefaultTableModel) jTableProduto.getModel();

        for (Vector produto : modelo.getDataVector()) {
            Integer id = Integer.parseInt(
                    produto.get(0).toString());
            Double quantidade = Double.parseDouble(
                    localeFormatInput(produto.get(3).toString()));
            Double ValorUn = Double.parseDouble(
                    localeFormatInput(produto.get(4).toString()));

            CompraVendaProduto cvp = new CompraVendaProduto();
            cvp.setIdProduto(id);
            cvp.setQuantidade(quantidade);
            cvp.setValorUnitario(ValorUn);

            cv.addProdutos(cvp);
        }

        try {
            CompraVendaDao dao = new CompraVendaDao();
            dao.inserir(cv);
            Message.showMessage("Sucesso!");
        } catch (Exception e) {
            Message.showMessage("Erro inesperado, "
                    + e.getMessage());
            e.printStackTrace();
        }
        
        limpaTudo();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescontoActionPerformed

    private void jTextFieldDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDescontoFocusLost
        Double desconto = Double.parseDouble(localeFormatInput(jTextFieldDesconto.getText()));
        atualizaValorTotal(-desconto);
    }//GEN-LAST:event_jTextFieldDescontoFocusLost

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableProduto.getModel();

            Integer id = Integer.parseInt(
                    jTextFieldProdutoId.getText());
            String quantidade = jTextFieldProdutoQtd.getText();
            String valor = localeFormatInput(jTextFieldProdutoValor.getText());
            
            String valorTotal = String.valueOf(
                    Double.parseDouble(quantidade) * Double.parseDouble(valor));

            ProdutoDao dao = new ProdutoDao();
            Produto p = dao.buscarProduto(id);
            String novaLinha[] = {
                String.valueOf(p.getId()),
                p.getNome(),
                p.getUnidadeDeMedida(),
                quantidade,
                localeFormatOutput(valor),
                localeFormatOutput(valorTotal)
            };

            modelo.addRow(novaLinha);
            atualizaValorTotal(valorTotal);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        jTextFieldProdutoId.requestFocus();
        limpaProduto();
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableProduto.getModel();
            int selecionado = jTableProduto.getSelectedRow();

            Double valorUn = Double.parseDouble(localeFormatInput(jTableProduto.getModel().getValueAt(selecionado, 5).toString()));
            atualizaValorTotal(-valorUn);
            
            modelo.removeRow(selecionado);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        jTextFieldProdutoId.requestFocus();
        limpaProduto();
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jTextFieldProdutoValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProdutoValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProdutoValorActionPerformed

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
            java.util.logging.Logger.getLogger(CompraVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompraVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompraVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompraVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompraVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonPesquisaCliente;
    private javax.swing.JButton jButtonPesquisaProduto;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxCompraVenda;
    private javax.swing.JComboBox<String> jComboBoxFormaPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProduto;
    private javax.swing.JTextField jTextFieldClienteId;
    private javax.swing.JTextField jTextFieldClienteNome;
    private javax.swing.JTextField jTextFieldDesconto;
    private javax.swing.JTextField jTextFieldProdutoId;
    private javax.swing.JTextField jTextFieldProdutoNome;
    private javax.swing.JTextField jTextFieldProdutoQtd;
    private javax.swing.JTextField jTextFieldProdutoUnidade;
    private javax.swing.JTextField jTextFieldProdutoValor;
    private javax.swing.JTextField jTextFieldValorTotal;
    // End of variables declaration//GEN-END:variables
}
