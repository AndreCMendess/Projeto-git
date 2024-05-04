
package visao;


import Classes.Cliente;
import Classes.ListaCliente;
import Classes.ListaProduto;
import Classes.ListaProduto.dadosProdutoException;
import Classes.ListaVenda;
import Classes.Produto;
import Classes.Venda;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.DefaultTableModel;



public class Principal extends javax.swing.JFrame {

 

  
    public Principal() {
    
        initComponents();
        Produto p = (Produto) jcbProduto.getSelectedItem();    
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        btnEfeito();
        alertaDataVenda();
      
       
        
    }
   

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSide = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnAdicionarProduto = new javax.swing.JButton();
        btnRegistroClientes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrarCliente = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnVendas = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        JPprincipal = new javax.swing.JPanel();
        telaInicial = new javax.swing.JPanel();
        telaCadastroProduto = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtTamanho = new javax.swing.JTextField();
        txtValorCompra = new javax.swing.JTextField();
        txtValorVenda = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        btnCadastrar1 = new javax.swing.JButton();
        telaCliente = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        btnDeletar1 = new javax.swing.JButton();
        btnAtualizar2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        btnNovoCliente = new javax.swing.JButton();
        telaCadastroCliente = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        txtNomeCliente = new javax.swing.JTextField();
        btnCadastrarCliente = new javax.swing.JButton();
        telaVenda = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPCadastroVenda = new javax.swing.JPanel();
        jcbCliente = new javax.swing.JComboBox<>();
        cbStatus = new javax.swing.JCheckBox();
        txtClienteNaoRegistrado = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        cbNao = new javax.swing.JCheckBox();
        cbSim = new javax.swing.JCheckBox();
        txtDataPagamento = new javax.swing.JFormattedTextField();
        txtDataVenda = new javax.swing.JFormattedTextField();
        jcbProduto = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnCadastrarVenda = new javax.swing.JButton();
        jcbQuantidadeProduto = new javax.swing.JComboBox<>();
        txtValorTotal = new javax.swing.JTextField();
        jPRegistroVendas = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaVendas = new javax.swing.JTable();
        btnDeletarVenda = new javax.swing.JButton();
        telaEstoque = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        btnValorTotal = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnAtualizar1 = new javax.swing.JButton();
        btnNovoProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1500, 1500));
        setPreferredSize(new java.awt.Dimension(1500, 1695));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        pnlSide.setBackground(new java.awt.Color(17, 24, 39));
        pnlSide.setForeground(new java.awt.Color(255, 255, 255));
        pnlSide.setPreferredSize(new java.awt.Dimension(90, 0));

        jButton1.setBackground(new java.awt.Color(17, 24, 39));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loja.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEstoque.setBackground(new java.awt.Color(17, 24, 39));
        btnEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estoque.png"))); // NOI18N
        btnEstoque.setBorder(null);
        btnEstoque.setPreferredSize(new java.awt.Dimension(40, 40));
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });

        btnAdicionarProduto.setBackground(new java.awt.Color(17, 24, 39));
        btnAdicionarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar-produto.png"))); // NOI18N
        btnAdicionarProduto.setBorder(null);
        btnAdicionarProduto.setPreferredSize(new java.awt.Dimension(40, 40));
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });

        btnRegistroClientes.setBackground(new java.awt.Color(17, 24, 39));
        btnRegistroClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista-de-precos.png"))); // NOI18N
        btnRegistroClientes.setBorder(null);
        btnRegistroClientes.setPreferredSize(new java.awt.Dimension(40, 40));
        btnRegistroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroClientesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estoque");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Produto");

        btnRegistrarCliente.setBackground(new java.awt.Color(17, 24, 39));
        btnRegistrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar-usuario (1).png"))); // NOI18N
        btnRegistrarCliente.setBorder(null);
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Registro De");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Clientes");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Novo");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cliente");

        btnVendas.setBackground(new java.awt.Color(17, 24, 39));
        btnVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista-de-precos.png"))); // NOI18N
        btnVendas.setBorder(null);
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        jLabel36.setBackground(new java.awt.Color(21, 25, 28));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Vendas");

        javax.swing.GroupLayout pnlSideLayout = new javax.swing.GroupLayout(pnlSide);
        pnlSide.setLayout(pnlSideLayout);
        pnlSideLayout.setHorizontalGroup(
            pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSideLayout.createSequentialGroup()
                        .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRegistrarCliente)
                                    .addComponent(jLabel14))
                                .addComponent(btnVendas))
                            .addGroup(pnlSideLayout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(10, 10, 10)))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(pnlSideLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRegistroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlSideLayout.setVerticalGroup(
            pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(btnRegistroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(39, 39, 39)
                .addComponent(btnRegistrarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(34, 34, 34)
                .addComponent(btnVendas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addContainerGap())
        );

        getContentPane().add(pnlSide, java.awt.BorderLayout.WEST);

        JPprincipal.setLayout(new java.awt.CardLayout());

        telaInicial.setBackground(new java.awt.Color(17, 24, 39));
        telaInicial.setForeground(new java.awt.Color(204, 255, 0));

        javax.swing.GroupLayout telaInicialLayout = new javax.swing.GroupLayout(telaInicial);
        telaInicial.setLayout(telaInicialLayout);
        telaInicialLayout.setHorizontalGroup(
            telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1202, Short.MAX_VALUE)
        );
        telaInicialLayout.setVerticalGroup(
            telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1372, Short.MAX_VALUE)
        );

        JPprincipal.add(telaInicial, "telaInicial");

        telaCadastroProduto.setBackground(new java.awt.Color(17, 24, 39));

        jPanel2.setBackground(new java.awt.Color(17, 24, 39));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cadastrar Produto");

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Dados do produto para cadastro");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome*");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Descrição*");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tamanho*");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Valor Venda*");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantidade*");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Valor Compra*");

        txtNomeProduto.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeProduto.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeProduto.setToolTipText("Insira o nome do produto.");
        txtNomeProduto.setBorder(null);
        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });

        txtDescricao.setBackground(new java.awt.Color(255, 255, 255));
        txtDescricao.setForeground(new java.awt.Color(0, 0, 0));
        txtDescricao.setToolTipText("Aqui sera escrito a descriçao do produto , caracteristicas etc...");
        txtDescricao.setBorder(null);

        txtTamanho.setBackground(new java.awt.Color(255, 255, 255));
        txtTamanho.setForeground(new java.awt.Color(0, 0, 0));
        txtTamanho.setToolTipText("Insira o tamanho do produto (M, U, P, G ou GG).");
        txtTamanho.setBorder(null);

        txtValorCompra.setBackground(new java.awt.Color(255, 255, 255));
        txtValorCompra.setForeground(new java.awt.Color(0, 0, 0));
        txtValorCompra.setToolTipText("Insira o valor de compra do produto (entre 2 e 5 dígitos).");
        txtValorCompra.setBorder(null);

        txtValorVenda.setBackground(new java.awt.Color(255, 255, 255));
        txtValorVenda.setForeground(new java.awt.Color(0, 0, 0));
        txtValorVenda.setToolTipText("Insira o valor de venda do produto (não negativo e maior ou igual ao valor de compra).");
        txtValorVenda.setBorder(null);

        txtQuantidade.setBackground(new java.awt.Color(255, 255, 255));
        txtQuantidade.setForeground(new java.awt.Color(0, 0, 0));
        txtQuantidade.setToolTipText("Insira a quantidade do produto (nao pode ser negativa)");
        txtQuantidade.setBorder(null);

        btnCadastrar1.setBackground(new java.awt.Color(17, 24, 39));
        btnCadastrar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar1.setText("Cadastrar");
        btnCadastrar1.setActionCommand(" Voltar");
        btnCadastrar1.setPreferredSize(new java.awt.Dimension(123, 39));
        btnCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtValorCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(txtValorVenda, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTamanho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(104, 104, 104)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 876, Short.MAX_VALUE)
                .addComponent(btnCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout telaCadastroProdutoLayout = new javax.swing.GroupLayout(telaCadastroProduto);
        telaCadastroProduto.setLayout(telaCadastroProdutoLayout);
        telaCadastroProdutoLayout.setHorizontalGroup(
            telaCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        telaCadastroProdutoLayout.setVerticalGroup(
            telaCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JPprincipal.add(telaCadastroProduto, "tela1");

        telaCliente.setBackground(new java.awt.Color(17, 24, 39));

        jPanel3.setBackground(new java.awt.Color(17, 24, 39));

        tabelaCliente.setModel(montarTabela(new Cliente()));
        jScrollPane2.setViewportView(tabelaCliente);

        btnDeletar1.setBackground(new java.awt.Color(17, 24, 39));
        btnDeletar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeletar1.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        btnDeletar1.setText("Deletar");
        btnDeletar1.setActionCommand(" Voltar");
        btnDeletar1.setPreferredSize(new java.awt.Dimension(123, 39));
        btnDeletar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletar1ActionPerformed(evt);
            }
        });

        btnAtualizar2.setBackground(new java.awt.Color(17, 24, 39));
        btnAtualizar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtualizar2.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar2.setText("Atualizar");
        btnAtualizar2.setActionCommand(" Voltar");
        btnAtualizar2.setPreferredSize(new java.awt.Dimension(123, 39));
        btnAtualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizar2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Clientes");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(204, 204, 204));
        jLabel39.setText("Registro de Clientes com id , nome , cpf , telefone , email e endereço.");

        btnNovoCliente.setBackground(new java.awt.Color(17, 24, 39));
        btnNovoCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNovoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar-usuario (1).png"))); // NOI18N
        btnNovoCliente.setText("Novo Cliente");
        btnNovoCliente.setToolTipText("Registrar novo cliente a loja");
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAtualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeletar1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNovoCliente))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1067, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(btnNovoCliente))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 739, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout telaClienteLayout = new javax.swing.GroupLayout(telaCliente);
        telaCliente.setLayout(telaClienteLayout);
        telaClienteLayout.setHorizontalGroup(
            telaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaClienteLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 83, Short.MAX_VALUE))
        );
        telaClienteLayout.setVerticalGroup(
            telaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JPprincipal.add(telaCliente, "telaCliente");

        telaCadastroCliente.setBackground(new java.awt.Color(17, 24, 39));
        telaCadastroCliente.setForeground(new java.awt.Color(0, 0, 0));
        telaCadastroCliente.setPreferredSize(new java.awt.Dimension(1162, 1372));
        telaCadastroCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(17, 24, 39));
        jPanel4.setPreferredSize(new java.awt.Dimension(1162, 1372));

        txtEndereco.setBackground(new java.awt.Color(255, 255, 255));
        txtEndereco.setForeground(new java.awt.Color(0, 0, 0));
        txtEndereco.setBorder(null);
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        txtTelefone.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefone.setBorder(null);
        txtTelefone.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("9########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Telefone");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Endereço");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Email");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Cpf");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nome");

        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Dados do cliente para cadastro");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cadastrar Cliente");

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setBorder(null);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtCpf.setBackground(new java.awt.Color(255, 255, 255));
        txtCpf.setBorder(null);
        txtCpf.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtNomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeCliente.setBorder(null);
        txtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClienteActionPerformed(evt);
            }
        });

        btnCadastrarCliente.setBackground(new java.awt.Color(17, 24, 39));
        btnCadastrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarCliente.setText("Cadastrar");
        btnCadastrarCliente.setActionCommand(" Voltar");
        btnCadastrarCliente.setPreferredSize(new java.awt.Dimension(123, 39));
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(46, 46, 46)
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(62, 62, 62)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(51, 51, 51)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(27, 27, 27)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(32, 32, 32)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(274, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel16)
                .addGap(6, 6, 6)
                .addComponent(jLabel17)
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(303, 303, 303)
                .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(609, Short.MAX_VALUE))
        );

        telaCadastroCliente.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1340));

        JPprincipal.add(telaCadastroCliente, "telaCadastroCliente");

        telaVenda.setBackground(new java.awt.Color(17, 24, 39));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));

        txtValorTotal.setEditable(false);
        jPCadastroVenda.setBackground(new java.awt.Color(17, 24, 39));
        jPCadastroVenda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jcbCliente.setToolTipText("");
        jcbCliente.setEnabled(false);
        jcbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClienteActionPerformed(evt);
            }
        });

        cbStatus.setForeground(new java.awt.Color(255, 255, 255));
        cbStatus.setText("Pago");
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });

        txtClienteNaoRegistrado.setBackground(new java.awt.Color(255, 255, 255));
        txtClienteNaoRegistrado.setForeground(new java.awt.Color(0, 0, 0));
        txtClienteNaoRegistrado.setEnabled(false);

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Escreva nome, telefone e endereço");

        cbNao.setForeground(new java.awt.Color(255, 255, 255));
        cbNao.setText("Não");
        cbNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNaoActionPerformed(evt);
            }
        });

        cbSim.setForeground(new java.awt.Color(255, 255, 255));
        cbSim.setText("Sim");
        cbSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSimActionPerformed(evt);
            }
        });

        txtDataPagamento.setBackground(new java.awt.Color(255, 255, 255));
        txtDataPagamento.setBorder(null);
        txtDataPagamento.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtDataPagamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtDataVenda.setBackground(new java.awt.Color(255, 255, 255));
        txtDataVenda.setBorder(null);
        txtDataVenda.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jcbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProdutoActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Valor Venda*");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Cliente*");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cadastrar Venda");

        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Dados da venda para registro");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Data Venda*");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Data Pagamento*");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Status");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Produto*");

        btnCadastrarVenda.setBackground(new java.awt.Color(17, 24, 39));
        btnCadastrarVenda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastrarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarVenda.setText("Cadastrar");
        btnCadastrarVenda.setActionCommand(" Voltar");
        btnCadastrarVenda.setPreferredSize(new java.awt.Dimension(123, 39));
        btnCadastrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarVendaActionPerformed(evt);
            }
        });

        jcbQuantidadeProduto.setEnabled(false);
        jcbQuantidadeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbQuantidadeProdutoActionPerformed(evt);
            }
        });

        Produto p = (Produto) jcbProduto.getSelectedItem();
        if(p != null && jcbQuantidadeProduto.getSelectedItem() != null){
            int quantidade = (int) jcbQuantidadeProduto.getSelectedItem();
            String valorVendaStr = String.valueOf(p.getValorVenda() * quantidade);
            txtValorTotal.setText(valorVendaStr);
        }
        txtValorTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtValorTotal.setForeground(new java.awt.Color(0, 0, 0));
        txtValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPCadastroVendaLayout = new javax.swing.GroupLayout(jPCadastroVenda);
        jPCadastroVenda.setLayout(jPCadastroVendaLayout);
        jPCadastroVendaLayout.setHorizontalGroup(
            jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroVendaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCadastroVendaLayout.createSequentialGroup()
                        .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addGap(1613, 1613, 1613))
                    .addGroup(jPCadastroVendaLayout.createSequentialGroup()
                        .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCadastroVendaLayout.createSequentialGroup()
                                .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPCadastroVendaLayout.createSequentialGroup()
                                        .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(136, 136, 136))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadastroVendaLayout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadastroVendaLayout.createSequentialGroup()
                                        .addComponent(cbSim)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbNao)
                                        .addGap(38, 38, 38)))
                                .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtClienteNaoRegistrado, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbStatus)
                                        .addGroup(jPCadastroVendaLayout.createSequentialGroup()
                                            .addComponent(jcbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jcbQuantidadeProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadastroVendaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(681, 681, 681))
        );
        jPCadastroVendaLayout.setVerticalGroup(
            jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroVendaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jcbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(cbSim)
                    .addComponent(cbNao)
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClienteNaoRegistrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(cbStatus))
                .addGap(12, 12, 12)
                .addComponent(btnCadastrarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPRegistroVendas.setBackground(new java.awt.Color(17, 24, 39));
        jPRegistroVendas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Vendas");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("Registro de vendas com todas as informaçoes da venda.");

        jScrollPane3.setBackground(new java.awt.Color(17, 24, 39));

        tabelaVendas.setModel(montarTabela(new Venda()));
        jScrollPane3.setViewportView(tabelaVendas);

        btnDeletarVenda.setBackground(new java.awt.Color(17, 24, 39));
        btnDeletarVenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDeletarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        btnDeletarVenda.setText("Deletar");
        btnDeletarVenda.setActionCommand(" Voltar");
        btnDeletarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPRegistroVendasLayout = new javax.swing.GroupLayout(jPRegistroVendas);
        jPRegistroVendas.setLayout(jPRegistroVendasLayout);
        jPRegistroVendasLayout.setHorizontalGroup(
            jPRegistroVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistroVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPRegistroVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegistroVendasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeletarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPRegistroVendasLayout.setVerticalGroup(
            jPRegistroVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistroVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeletarVenda)
                .addGap(218, 218, 218))
        );

        javax.swing.GroupLayout telaVendaLayout = new javax.swing.GroupLayout(telaVenda);
        telaVenda.setLayout(telaVendaLayout);
        telaVendaLayout.setHorizontalGroup(
            telaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaVendaLayout.createSequentialGroup()
                .addGroup(telaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaVendaLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel35)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaVendaLayout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addGroup(telaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPRegistroVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPCadastroVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addGap(15, 15, 15))
        );
        telaVendaLayout.setVerticalGroup(
            telaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaVendaLayout.createSequentialGroup()
                .addGroup(telaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaVendaLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel31))
                    .addGroup(telaVendaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPCadastroVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPRegistroVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(555, 555, 555))
        );

        JPprincipal.add(telaVenda, "telaVendas");

        telaEstoque.setBackground(new java.awt.Color(17, 24, 39));
        telaEstoque.setForeground(new java.awt.Color(204, 255, 0));
        telaEstoque.setPreferredSize(new java.awt.Dimension(1000, 1000));

        jPanel1.setBackground(new java.awt.Color(17, 24, 39));

        tabelaProduto.setModel(montarTabela(new Produto()));
        jScrollPane1.setViewportView(tabelaProduto);

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Estoque");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setText("Lista com todos os produtos com nome,valor,tamanho,descrição. ");

        btnValorTotal.setBackground(new java.awt.Color(17, 24, 39));
        btnValorTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnValorTotal.setForeground(new java.awt.Color(255, 255, 255));
        btnValorTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nota-de-dolar (1).png"))); // NOI18N
        btnValorTotal.setText("ValorTotal");
        btnValorTotal.setActionCommand(" Voltar");
        btnValorTotal.setPreferredSize(new java.awt.Dimension(123, 39));
        btnValorTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnValorTotalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnValorTotalMouseExited(evt);
            }
        });
        btnValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValorTotalActionPerformed(evt);
            }
        });

        btnDeletar.setBackground(new java.awt.Color(17, 24, 39));
        btnDeletar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.setActionCommand(" Voltar");
        btnDeletar.setMaximumSize(new java.awt.Dimension(123, 39));
        btnDeletar.setMinimumSize(new java.awt.Dimension(123, 39));
        btnDeletar.setPreferredSize(new java.awt.Dimension(163, 39));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnAtualizar1.setBackground(new java.awt.Color(17, 24, 39));
        btnAtualizar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizar1.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar1.setText("Atualizar");
        btnAtualizar1.setActionCommand(" Voltar");
        btnAtualizar1.setMaximumSize(new java.awt.Dimension(123, 39));
        btnAtualizar1.setMinimumSize(new java.awt.Dimension(123, 39));
        btnAtualizar1.setPreferredSize(new java.awt.Dimension(123, 39));
        btnAtualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizar1ActionPerformed(evt);
            }
        });

        btnNovoProduto.setBackground(new java.awt.Color(17, 24, 39));
        btnNovoProduto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNovoProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar-produto.png"))); // NOI18N
        btnNovoProduto.setText("Novo Produto");
        btnNovoProduto.setToolTipText("Registrar novo produto a loja");
        btnNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 562, Short.MAX_VALUE)
                        .addComponent(btnNovoProduto)))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38))
                    .addComponent(btnNovoProduto))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 698, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout telaEstoqueLayout = new javax.swing.GroupLayout(telaEstoque);
        telaEstoque.setLayout(telaEstoqueLayout);
        telaEstoqueLayout.setHorizontalGroup(
            telaEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        telaEstoqueLayout.setVerticalGroup(
            telaEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JPprincipal.add(telaEstoque, "tela2");

        getContentPane().add(JPprincipal, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
            
        CardLayout cl = (CardLayout) JPprincipal.getLayout();
        cl.show(JPprincipal,"tela2");
     
        
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed
       
                
        CardLayout cl = (CardLayout) JPprincipal.getLayout();
        cl.show(JPprincipal,"tela1");
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private void btnCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar1ActionPerformed
       
        String nome = txtNomeProduto.getText();
        String descricao = txtDescricao.getText();
        String tamanho = txtTamanho.getText().toUpperCase();
        String quantidade = txtQuantidade.getText();
        String valorCompra = txtValorCompra.getText();
        String valorVenda   = txtValorVenda.getText();
       
      /* if(txtQuantidade.getText().isBlank() || txtValorCompra.getText().isBlank() || txtValorVenda.getText().isBlank()){
            JOptionPane.showMessageDialog(rootPane, "Por favor, preencha todos os campos.");
            return;
       }*/
        
      if(nome.isEmpty() || descricao.isEmpty() || tamanho.isEmpty() || quantidade.isEmpty() || valorCompra.isEmpty() || valorVenda.isEmpty()){
          JOptionPane.showMessageDialog(rootPane, "Todos os campos devem ser preenchidos");
      }else {
          
        try {
            ListaProduto.validarDados(nome,descricao,tamanho,valorCompra,valorVenda,quantidade);
            int qnt = Integer.parseInt(quantidade);
            double vCompra = Double.parseDouble(valorCompra);
            double vVenda = Double.parseDouble(valorVenda);
             Produto p = new Produto();
             p.setNome(nome);
             p.setDescricao(descricao);
             p.setTamanho(tamanho);
             p.setValorCompra(vCompra);
             p.setValorVenda(vVenda);
             p.setQuantidade(qnt);
             
             ListaProduto.adicionar(p) ;

             txtNomeProduto.setText("");
             txtDescricao.setText("");
             txtTamanho.setText("");
             txtValorCompra.setText("");
             txtValorVenda.setText("");
             txtQuantidade.setText("");
             
            JOptionPane.showMessageDialog(rootPane,
                    "Produto Cadastrado com Sucesso");
          
              
              
         } catch (NumberFormatException e){
             JOptionPane.showMessageDialog(null, "A quantidade do produto deve ser um numero inteiro");
         }   catch (dadosProdutoException ex) {
           JOptionPane.showMessageDialog(rootPane, ex.getMessage());
           
        }
      }
       

    }//GEN-LAST:event_btnCadastrar1ActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
         deletar(getPosicaoNaTabela(tabelaProduto));
       
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValorTotalActionPerformed
        btnValorTotal.setText(String.valueOf(calcularValorTotal()));
    }//GEN-LAST:event_btnValorTotalActionPerformed

    private void btnAtualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizar1ActionPerformed
        TelaAtualizarProdutoo att = new TelaAtualizarProdutoo(this, getPosicaoNaTabela(tabelaProduto));/*Instancia da tela de atualizar que recebe a tela principal e
                                                                                              um metodo para obter a linha da tabela que precisa como parametro um id e uma variavel table*/
        att.setVisible(true);

        /* if(tabelaProduto.getSelectedRow() != -1){
            att.setVisible(true);
            att.txtNomeProduto.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 1).toString());
            att.txtDescricao.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(),2).toString());
            att.txtTamanho.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(),3).toString());
            att.txtValorCompra.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(),4).toString().replace(".", ""));
            att.txtValorVenda.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(),5).toString().replace(".", ""));
            att.txtQuantidade.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(),6).toString());
           
        }*/

    }//GEN-LAST:event_btnAtualizar1ActionPerformed

    private void btnValorTotalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValorTotalMouseEntered

        btnValorTotal.setText(String.valueOf(calcularValorTotal()));
    }//GEN-LAST:event_btnValorTotalMouseEntered

    private void btnValorTotalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValorTotalMouseExited
        btnValorTotal.setText("Valor Total");  
    }//GEN-LAST:event_btnValorTotalMouseExited

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        tabelaProduto.setModel(montarTabela(new Produto()));
        tabelaCliente.setModel(montarTabela(new Cliente()));
        tabelaVendas.setModel(montarTabela(new Venda()));
        preencherBox();
        alertaDataVenda();
        
        
        /*Produto p = (Produto) jcbProduto.getSelectedItem();
        
          if (p != null && jcbQuantidadeProduto.getSelectedItem() != null) {
         int quantidade = (int) jcbQuantidadeProduto.getSelectedItem();
         String valorVendaStr = String.valueOf(p.getValorVenda() * quantidade);
         txtValorTotal.setText(valorVendaStr);
         }*/
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout c1 = (CardLayout) JPprincipal.getLayout();   
        c1.show(JPprincipal,"telaInicial");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegistroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroClientesActionPerformed
        CardLayout c1 = (CardLayout) JPprincipal.getLayout();
        c1.show(JPprincipal, "telaCliente");
    }//GEN-LAST:event_btnRegistroClientesActionPerformed

    private void btnAtualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizar2ActionPerformed
        TelaAtualizarCliente att = new TelaAtualizarCliente(this,getPosicaoNaTabela(tabelaCliente));
        att.setVisible(true);
    }//GEN-LAST:event_btnAtualizar2ActionPerformed

    private void btnDeletar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletar1ActionPerformed
         
       ListaCliente.excluirCliente(getPosicaoNaTabela(tabelaCliente));
    }//GEN-LAST:event_btnDeletar1ActionPerformed

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        CardLayout c1 = (CardLayout) JPprincipal.getLayout();
        c1.show(JPprincipal, "telaCadastroCliente");
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void txtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeClienteActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed

        
         
             
             String[] dados = {txtNomeCliente.getText(),txtCpf.getText(),txtEmail.getText(),txtEndereco.getText(),txtTelefone.getText()};
             if(ListaCliente.validarDados(dados)){
                 Cliente c = new Cliente();
                 c.setNome(txtNomeCliente.getText());
                 c.setCpf(txtCpf.getText());
                 c.setEmail(txtEmail.getText());
                 c.setEndereco(txtEndereco.getText());
                 c.setTelefone(Integer.parseInt(txtTelefone.getText()));
                 ListaCliente.adicionar(c);
                 JOptionPane.showMessageDialog(rootPane, "Cliente Cadastrado Com Sucesso");
                 txtNomeCliente.setText("");
                 txtCpf.setText("");
                 txtEmail.setText("");
                 txtEndereco.setText("");
                 txtTelefone.setText("");
                 
             }
             
         

    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private void btnCadastrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarVendaActionPerformed

        Produto p = (Produto) jcbProduto.getSelectedItem();
        Cliente c = (Cliente) jcbCliente.getSelectedItem();

        String dataVenda = txtDataVenda.getText();
        String dataPagamento = txtDataPagamento.getText();
        boolean status = cbStatus.isSelected();
        String naoCliente = txtClienteNaoRegistrado.getText();

        try {

            if (ListaVenda.validarDados(p, dataVenda, dataPagamento, jcbQuantidadeProduto)) {

                int quantidade = (int) jcbQuantidadeProduto.getSelectedItem();
                String valorVendaStr = String.valueOf(p.getValorVenda() * quantidade);
                Venda v = new Venda();
                v.setDataVenda(criarData(dataVenda));
                v.setDataPagamento(criarData(dataPagamento));
                v.setProduto((Produto) jcbProduto.getSelectedItem());
                v.setValorVenda(Double.parseDouble(valorVendaStr));

                if (c != null) {
                    v.setCliente((Cliente) jcbCliente.getSelectedItem());
                } else if (c == null && naoCliente.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "Atençao , o cliente deve ser selecionado se ja for cliente ,"
                            + " e se nao for deve reigstrar os dados do novo cliente");
                    return;
                }
              
                v.setNaoCliente(naoCliente);
                v.setStatus(status);
                v.setQuantidade(quantidade);

                if (ListaVenda.adicionarVenda(v)) {

                    p.setQuantidade(p.getQuantidade() - ((Integer) jcbQuantidadeProduto.getSelectedItem()).intValue());

                    JOptionPane.showMessageDialog(rootPane, "Venda Realizada Com Sucesso");

                    limparDados();

                   
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar a venda");
                }

                ListaVenda.listar().toString();

            }
        } catch (ParseException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            
        }


    }//GEN-LAST:event_btnCadastrarVendaActionPerformed

    
     public void limparDados(){
            
                        jcbProduto.setSelectedIndex(-1);
                        jcbQuantidadeProduto.setSelectedIndex(-1);
                        txtDataVenda.setText("");
                        txtDataPagamento.setText("");
                        txtClienteNaoRegistrado.setText("");
                        txtValorTotal.setText("");
                        cbSim.setSelected(false);
                        cbNao.setSelected(false);
                        cbStatus.setSelected(false);
        }
    
    private void jcbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProdutoActionPerformed

        Produto produtoSelecionado = (Produto) jcbProduto.getSelectedItem();
     
        if(produtoSelecionado != null){
              DefaultComboBoxModel<Object> comboBoxModelQuantidade = new DefaultComboBoxModel<>();
        
              for(int qnt = 1; qnt < produtoSelecionado.getQuantidade(); qnt++){
                    comboBoxModelQuantidade.addElement(qnt);
                    
              }
            
           jcbQuantidadeProduto.setModel(comboBoxModelQuantidade);
           jcbQuantidadeProduto.setEnabled(true);
               
        }
    }//GEN-LAST:event_jcbProdutoActionPerformed

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStatusActionPerformed

    private void cbSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSimActionPerformed
     
        if(cbSim.isSelected()){
            jcbCliente.setEnabled(true);
            cbNao.setSelected(false);
            txtClienteNaoRegistrado.setEnabled(false);
        }else{
            jcbCliente.setEnabled(false);
             txtClienteNaoRegistrado.setEnabled(false);
        }
        
      

    }//GEN-LAST:event_cbSimActionPerformed

    private void cbNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNaoActionPerformed
       
        if(cbNao.isSelected()){
            
            jcbCliente.setEnabled(false);
            cbSim.setSelected(false);
             txtClienteNaoRegistrado.setEnabled(true);
        }else{
            jcbCliente.setEnabled(false);
            txtClienteNaoRegistrado.setEnabled(false);
        }
    }//GEN-LAST:event_cbNaoActionPerformed

    private void btnDeletarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarVendaActionPerformed
        ListaVenda.deletarVenda(getPosicaoNaTabela(tabelaVendas));
    }//GEN-LAST:event_btnDeletarVendaActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        CardLayout c1 = (CardLayout) JPprincipal.getLayout();
        c1.show(JPprincipal, "telaVendas");
        
    }//GEN-LAST:event_btnVendasActionPerformed

    private void jcbQuantidadeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbQuantidadeProdutoActionPerformed
        Produto p = (Produto) jcbProduto.getSelectedItem();

        if (p != null && jcbQuantidadeProduto.getSelectedItem() != null) {
            int quantidade = (int) jcbQuantidadeProduto.getSelectedItem();
            String valorVendaStr = String.valueOf(p.getValorVenda() * quantidade);
            txtValorTotal.setText(valorVendaStr);
        }   
    }//GEN-LAST:event_jcbQuantidadeProdutoActionPerformed

    private void txtValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorTotalActionPerformed

    private void jcbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbClienteActionPerformed

    private void btnNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProdutoActionPerformed
       CardLayout cl = (CardLayout) JPprincipal.getLayout();
       
        
        cl.show(JPprincipal,"tela1");
    }//GEN-LAST:event_btnNovoProdutoActionPerformed

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
       CardLayout cl = (CardLayout) JPprincipal.getLayout();
       cl.show(JPprincipal, "telaCadastroCliente");

    }//GEN-LAST:event_btnNovoClienteActionPerformed

    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    private DefaultTableModel montarTabela(Object o){
        
        DefaultTableModel modeloTabela = null;
        
        if(o instanceof Produto){
        String [] colunas = {"Id","Nome","Descrição","Tamanho","ValorCompra","ValorVenda","Quantidade"};
        
        modeloTabela = new DefaultTableModel(colunas,0);
        
        ArrayList<Produto> listaProduto = ListaProduto.listar();
        
        for(int i=0; i<listaProduto.size(); i++){
            Produto p = listaProduto.get(i);
            String [] linha = {String.valueOf(p.getId()),p.getNome(),p.getDescricao(),
                p.getTamanho(),String.valueOf(p.getValorCompra()),
                String.valueOf(p.getValorVenda()),String.valueOf(p.getQuantidade())};
            modeloTabela.addRow(linha);
          }
        
        tabelaProduto.setModel(modeloTabela);
        
        
        }else if (o instanceof Cliente) {
            
            String [] colunas = {"Id","Nome","Cpf","Email","Endereço","Telefone"};
            
             modeloTabela = new DefaultTableModel(colunas,0);
            
            ArrayList<Cliente> listaCliente = ListaCliente.listar();
            for(int i=0; i<listaCliente.size(); i++){
                Cliente c = listaCliente.get(i);
                String [] linha = {String.valueOf(c.getId()),c.getNome(),c.getCpf(),c.getEmail(),c.getEndereco(),String.valueOf(c.getTelefone())
                };
                modeloTabela.addRow(linha);
            }
            tabelaCliente.setModel(modeloTabela);
            
        }else if (o instanceof Venda){
            
           String [] colunas = {"Id","Quantidade","Produto","ValorVenda","dataVenda","dataPagamento","Cliente","NãoCliente","Status"};
           
           modeloTabela = new DefaultTableModel(colunas, 0);
           ArrayList<Venda> listaVenda = ListaVenda.listar();
           
           for(Venda v : listaVenda){
               
               String validarCliente =(v.getCliente()!= null) ? v.getCliente().toString() : "";
               String validarDataPagamento = (v.getDataPagamento() != null) ? v.dataPagamento().toString() : "";
               String validarDataVenda = (v.getDataVenda() != null ) ? v.dataVenda() : "";
   
               String pago = (v.isStatus()) ? "Pago" : "Em aberto";
               String [] linhas = {Integer.toString(v.getId()),String.valueOf(v.getQuantidade()),v.getProduto().toString(),Double.toString(v.getValorVenda()),validarDataVenda,
               validarDataPagamento,validarCliente,v.getNaoCliente(),pago};
               modeloTabela.addRow(linhas);
           }
           tabelaVendas.setModel(modeloTabela);
        }
          
        
        
        return modeloTabela;    
      
    }
    
   
    
     private int getPosicaoNaTabela(JTable tabela){
       int pos = tabela.getSelectedRow();
       
       if(pos <= -1){
           JOptionPane.showMessageDialog(null, "Selecione uma iten na tabela");
       }
       return pos;
   }
    
  
    
    public void deletar(int posicao){
        
        if(posicao >=0 && posicao < ListaProduto.listar().size()){
        
            String[] options = {"Sim", "Não"};
            
            int deletar = JOptionPane.showOptionDialog(rootPane,
                    "Tem certeza que deseja excluir?",
                    "Exclusão de Produto",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if (deletar == 0) {
                
                ListaProduto.listar().remove(posicao);
              
            }else{
               tabelaProduto.clearSelection();
            }
        }
        
        }
    
    public double calcularValorTotal(){
         double total = 0;
         for(Produto p: ListaProduto.listar()){
            total += p.getValorVenda() * p.getQuantidade();
                  
        }
      return total;
    }
    
    public void preencherBox() {
        
        if(!ListaProduto.listar().isEmpty()){
            
        DefaultComboBoxModel<Object> comboBoxModel = new DefaultComboBoxModel<>();
       
        for (Object produto : ListaProduto.listar()) {
            comboBoxModel.addElement((Produto) produto);
            
        }         
        
        jcbProduto.setModel(comboBoxModel);
      
                
       
        }else{
            DefaultComboBoxModel<Object> comboBoxVazio = new DefaultComboBoxModel<>();
            comboBoxVazio.addElement("Estoque Vazio");
            jcbProduto.setModel(comboBoxVazio);
            DefaultComboBoxModel<Object> cbVazio = new DefaultComboBoxModel<>();
            cbVazio.addElement("Selecione um Produto");
            jcbQuantidadeProduto.setModel(cbVazio);
        }
        
      
        
        
        if(!ListaCliente.listar().isEmpty()){
            
            DefaultComboBoxModel<Object> comboBoxModel = new DefaultComboBoxModel<>();
            for(Object cliente : ListaCliente.listar()){
                comboBoxModel.addElement((Cliente) cliente);
            }
                jcbCliente.setModel(comboBoxModel);
            
        }
        
      
        
      
        
    }
    
     public  static Calendar criarData(String data ) throws ParseException{
                Date date;
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                date = sdf.parse(data);
                Calendar c = Calendar.getInstance();
                c.setTime(date);
            return c;
                
            }
     
     
       
    
     
     public  void btnEfeito(){
          JButton [] buttons = {jButton1,btnEstoque,btnAdicionarProduto,btnRegistroClientes,btnRegistrarCliente,btnAtualizar1,btnAtualizar2,btnCadastrar1,btnCadastrarCliente,
              btnCadastrarVenda,btnDeletar,btnDeletar1,btnDeletarVenda,btnNovoCliente,btnNovoProduto,btnValorTotal,btnVendas};
        for(JButton btn : buttons){
            btn.setBackground(new Color(17,24,39));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                 
                }

                @Override
                public void mousePressed(MouseEvent e) {
                   
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                   
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                       btn.setBackground(new Color(79,79,207));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(17,24,39));
                   
                }
            });
        }
     }
     
     
     public void alertaDataVenda() {

        Calendar dataAtual = Calendar.getInstance(TimeZone.getDefault());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (Venda v : ListaVenda.listar()) {
            Calendar dataPagamento = v.getDataPagamento();
            dataPagamento.setTimeZone(TimeZone.getDefault());
            
            String produtoInfo = "Produto Venda: " + v.getProduto().getNome() + "\nData Venda: " + sdf.format(v.getDataVenda().getTime());
            String dataPagamentoInfo = "Data Pagamento: " + sdf.format(dataPagamento.getTime());
            String clienteInfo = (v.getCliente() != null) ? "Cliente: " + v.getCliente().getNome() + "\nTelefone: " + v.getCliente().getTelefone() :
                                  "Cliente Dados: " + v.getNaoCliente();
            
            
            if(!v.isStatus()){
                if(v.getDataPagamento().getTimeInMillis() < dataAtual.getTimeInMillis()){
                    JOptionPane.showMessageDialog(rootPane, produtoInfo+ "\n" + dataPagamentoInfo + "(Vencida)" + "\n" + clienteInfo
                    ,"Essa Venda Passou do dia do pagamento",JOptionPane.INFORMATION_MESSAGE);
                }else if (v.getDataPagamento().getTimeInMillis() == dataAtual.getTimeInMillis()){
                    JOptionPane.showMessageDialog(rootPane, produtoInfo + "\n" + dataPagamentoInfo + "\n" + clienteInfo,
                            "Essa Venda vence hoje, ligue para o cliente",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
           /* if (v.getClass() != null) {
                if (v.getDataPagamento().getTimeInMillis() > dataAtual.getTimeInMillis() && !v.isStatus()) {
                    JOptionPane.showMessageDialog(rootPane, "Produto Venda:    " + v.getProduto() +
                            "\nData Venda: " + sdf.format(v.getDataVenda().getTime())
                            + " \nData Pagamento: " + sdf.format(dataPagamento.getTime()) +
                            "(Vencida)" + "\nCliente: " + v.getCliente().getNome() +
                            ("\nTelefone : " + v.getCliente().getTelefone()),
                            "Essa Venda Passou do Dia Do Pagamento", 
                            JOptionPane.INFORMATION_MESSAGE);
                } else if (v.getDataPagamento().getTimeInMillis() == dataAtual.getTimeInMillis() && !v.isStatus()) {
                    JOptionPane.showMessageDialog(rootPane, "Produto Venda:    " +  v.getProduto() + 
                            "\nData Venda: " + sdf.format(v.getDataVenda().getTime()) +
                             " \nData Pagamento: " + sdf.format(dataPagamento.getTime()) + 
                            "\nCliente: " + v.getCliente().getNome() + 
                            "\nTelefone : " + v.getCliente().getTelefone(), 
                            "Essa Venda vence hoje , ligue para o cliente", 
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                if (v.getDataPagamento().getTimeInMillis() > dataAtual.getTimeInMillis() && !v.isStatus()) {
                    JOptionPane.showMessageDialog(rootPane, "Produto Venda: " + v.getProduto() +
                            "\nData Venda: " + sdf.format(v.getDataVenda().getTime()) +
                            "\nData Pagamento: " + sdf.format(dataPagamento.getTime()) + "(Vencida)" +
                            "\nCliente Dados: " + v.getNaoCliente(),
                           "Essa Venda Passou do Dia Do Pagamento",
                            JOptionPane.INFORMATION_MESSAGE);
                }else if(v.getDataPagamento().getTimeInMillis() == dataAtual.getTimeInMillis() && !v.isStatus()) {
                    JOptionPane.showMessageDialog(rootPane, "Produto Venda:    " + v.getProduto() +
                            "\nData Venda: " + sdf.format(v.getDataVenda().getTime()) +
                            " \nData Pagamento: " + sdf.format(dataPagamento.getTime()) +
                            "\nCliente Dados" + v.getNaoCliente(),
                            "Essa Venda vence hoje , ligue para o cliente", 
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }*/
        }

    }

     
     
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPprincipal;
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnAtualizar1;
    private javax.swing.JButton btnAtualizar2;
    private javax.swing.JButton btnCadastrar1;
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnCadastrarVenda;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnDeletar1;
    private javax.swing.JButton btnDeletarVenda;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnNovoProduto;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistroClientes;
    protected javax.swing.JButton btnValorTotal;
    private javax.swing.JButton btnVendas;
    private javax.swing.JCheckBox cbNao;
    private javax.swing.JCheckBox cbSim;
    private javax.swing.JCheckBox cbStatus;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPCadastroVenda;
    private javax.swing.JPanel jPRegistroVendas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    protected javax.swing.JComboBox<Object> jcbCliente;
    private javax.swing.JComboBox<Object> jcbProduto;
    protected javax.swing.JComboBox<Object> jcbQuantidadeProduto;
    private javax.swing.JPanel pnlSide;
    protected javax.swing.JTable tabelaCliente;
    public javax.swing.JTable tabelaProduto;
    public javax.swing.JTable tabelaVendas;
    private javax.swing.JPanel telaCadastroCliente;
    private javax.swing.JPanel telaCadastroProduto;
    private javax.swing.JPanel telaCliente;
    private javax.swing.JPanel telaEstoque;
    private javax.swing.JPanel telaInicial;
    private javax.swing.JPanel telaVenda;
    private javax.swing.JTextField txtClienteNaoRegistrado;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataPagamento;
    private javax.swing.JFormattedTextField txtDataVenda;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTamanho;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JTextField txtValorCompra;
    private javax.swing.JTextField txtValorTotal;
    private javax.swing.JTextField txtValorVenda;
    // End of variables declaration//GEN-END:variables
}
