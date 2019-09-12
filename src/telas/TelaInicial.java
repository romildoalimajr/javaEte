/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import static java.awt.Color.red;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormatSymbols;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.Timer;
/**
 *
 * @author Romildo A. Lima Jr.
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        getContentPane().setBackground(red);

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaInterna = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jlbHora = new javax.swing.JLabel();
        jlbData = new javax.swing.JLabel();
        jlbDia = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuCadCarro = new javax.swing.JMenuItem();
        menuCadFuncionario = new javax.swing.JMenuItem();
        menuCadProdutos = new javax.swing.JMenuItem();
        menuCadUsuario = new javax.swing.JMenuItem();
        menuConsulta = new javax.swing.JMenu();
        menuConFuncionario = new javax.swing.JMenuItem();
        menuConVeiculo = new javax.swing.JMenuItem();
        menuBalcao = new javax.swing.JMenu();
        menuBalcCaixa = new javax.swing.JMenuItem();
        menuBalPreco = new javax.swing.JMenuItem();
        menuBalProduto = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        menuRelOs = new javax.swing.JMenuItem();
        menuRelVendas = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenu();
        menuSairEncerrar = new javax.swing.JMenuItem();
        menuSairFechar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Oficina Quebra Tudo");
        setBackground(new java.awt.Color(255, 0, 51));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telaInterna.setBackground(new java.awt.Color(255, 0, 0));
        telaInterna.setMinimumSize(new java.awt.Dimension(800, 1000));

        javax.swing.GroupLayout telaInternaLayout = new javax.swing.GroupLayout(telaInterna);
        telaInterna.setLayout(telaInternaLayout);
        telaInternaLayout.setHorizontalGroup(
            telaInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        telaInternaLayout.setVerticalGroup(
            telaInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        getContentPane().add(telaInterna, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 730, -1));

        jInternalFrame1.setBackground(new java.awt.Color(255, 0, 0));
        jInternalFrame1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(0, 0, 0)));
        jInternalFrame1.setForeground(new java.awt.Color(255, 0, 0));
        jInternalFrame1.setVisible(true);

        jlbHora.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jlbHora.setForeground(new java.awt.Color(255, 255, 0));
        jlbHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbHora.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(255, 51, 51), new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jlbHora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlbData.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jlbData.setForeground(new java.awt.Color(255, 255, 0));
        jlbData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbData.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0)));
        jlbData.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlbDia.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jlbDia.setForeground(new java.awt.Color(255, 255, 0));
        jlbDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbDia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0)));
        jlbDia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quebra1.png"))); // NOI18N

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlbDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbHora, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jlbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        menuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeCadastro.png"))); // NOI18N
        menuCadastro.setText("Cadastro");

        menuCadCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeVeiculo.png"))); // NOI18N
        menuCadCarro.setText("Carros");
        menuCadCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadCarroActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadCarro);

        menuCadFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconePessoas.png"))); // NOI18N
        menuCadFuncionario.setText("Funcionário");
        menuCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadFuncionarioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadFuncionario);

        menuCadProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeProd.png"))); // NOI18N
        menuCadProdutos.setText("Produtos");
        menuCadProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadProdutosActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadProdutos);

        menuCadUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeUsuario (2).png"))); // NOI18N
        menuCadUsuario.setText("Usuário");
        menuCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadUsuario);

        jMenuBar1.add(menuCadastro);

        menuConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeConsulta.png"))); // NOI18N
        menuConsulta.setText("Consulta");

        menuConFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeBuscPessoa.png"))); // NOI18N
        menuConFuncionario.setText("Funcionário");
        menuConFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConFuncionarioActionPerformed(evt);
            }
        });
        menuConsulta.add(menuConFuncionario);

        menuConVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeBuscarCarro.png"))); // NOI18N
        menuConVeiculo.setText("Veículos");
        menuConVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConVeiculoActionPerformed(evt);
            }
        });
        menuConsulta.add(menuConVeiculo);

        jMenuBar1.add(menuConsulta);

        menuBalcao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeBalcao.png"))); // NOI18N
        menuBalcao.setText("Balcão");

        menuBalcCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeCaixa (2).png"))); // NOI18N
        menuBalcCaixa.setText("Caixa");
        menuBalcao.add(menuBalcCaixa);

        menuBalPreco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeCaixa.png"))); // NOI18N
        menuBalPreco.setText("Preço");
        menuBalcao.add(menuBalPreco);

        menuBalProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeCaixaProd.png"))); // NOI18N
        menuBalProduto.setText("Produto");
        menuBalProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBalProdutoActionPerformed(evt);
            }
        });
        menuBalcao.add(menuBalProduto);

        jMenuBar1.add(menuBalcao);

        menuRelatorio.setBackground(new java.awt.Color(255, 51, 51));
        menuRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeRel.png"))); // NOI18N
        menuRelatorio.setText("Relatórios");

        menuRelOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeRelOS.png"))); // NOI18N
        menuRelOs.setText("Ordem de Serviço");
        menuRelOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelOsActionPerformed(evt);
            }
        });
        menuRelatorio.add(menuRelOs);

        menuRelVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeRelVenda.png"))); // NOI18N
        menuRelVendas.setText("Vendas");
        menuRelatorio.add(menuRelVendas);

        jMenuBar1.add(menuRelatorio);

        menuAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeHelp.png"))); // NOI18N
        menuAjuda.setText("Ajuda");
        jMenuBar1.add(menuAjuda);

        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeSair.png"))); // NOI18N
        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });

        menuSairEncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeTrocar.png"))); // NOI18N
        menuSairEncerrar.setText("Encerrar Sessão");
        menuSairEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairEncerrarActionPerformed(evt);
            }
        });
        menuSair.add(menuSairEncerrar);

        menuSairFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeSairSistema.png"))); // NOI18N
        menuSairFechar.setText("Sair do Sistema");
        menuSairFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairFecharActionPerformed(evt);
            }
        });
        menuSair.add(menuSairFechar);

        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(901, 643));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setExtendedState(MAXIMIZED_BOTH);
        
        
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAtual = new Date();
        jlbData.setText(formatar.format(dataAtual));
        
        SimpleDateFormat formatarHora = new SimpleDateFormat("HH:mm:ss");
        Date horaAtual = new Date();
        jlbHora.setText(formatarHora.format(horaAtual));
        
        Timer timer = new Timer(1000, new hora());
        timer.start();
        
        SimpleDateFormat formatarDia = new SimpleDateFormat("F");
        Date diaAtual = new Date();
        String dia = formatarDia.format(diaAtual);
        
        switch (dia){
            case "1":
                jlbDia.setText("Domingo");
                break;
            case "2":
                jlbDia.setText("Segunda-feira");
                break;
            case "3":
                jlbDia.setText("Terça-feira");
                break;
            case "4":
                jlbDia.setText("Quarta-feira");
                break;
            case "5":
                jlbDia.setText("Quinta-feira");
                break;
            case "6":
                jlbDia.setText("Sexta-feira");
                break;
            case "7":
                jlbDia.setText("Sábado");
                break;   
        } 
        
    }//GEN-LAST:event_formWindowOpened

    
    public String weekDay(Calendar cal) { 
            return new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)]; 
        }
//    jlbDia.setText(weekDay);
    
    private void menuCadCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadCarroActionPerformed
        // Chamar a tela de veículos
        telaInterna.removeAll(); //limpa o container
        //Dimension resolucao = telaInterna.getSize(); //captura resolução do container
        TelaVeiculos veiculos = new TelaVeiculos();
        //veiculos.setSize(resolucao); //seta a resolução da tela
        telaInterna.add(veiculos); //adiciona a tela ao container
        veiculos.setLocation(0, 0); //seta a posição da tela
        veiculos.setVisible(true); 
    }//GEN-LAST:event_menuCadCarroActionPerformed

    private void menuCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadFuncionarioActionPerformed
        // Chamar a tela de funcionários
        telaInterna.removeAll(); //limpa o container
        //Dimension resolucao = telaInterna.getSize(); //captura resolução do container
        TelaFuncionarios funcionarios = new TelaFuncionarios();
        //funcionarios.setSize(resolucao);
        telaInterna.add(funcionarios);
        funcionarios.setLocation(0,0);
        funcionarios.setVisible(true);
    }//GEN-LAST:event_menuCadFuncionarioActionPerformed

    private void menuCadProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadProdutosActionPerformed
        // Chamar a tela de Produtos
        telaInterna.removeAll(); //limpa o container
        //Dimension resolucao = telaInterna.getSize(); //captura resolução do container
        TelaProdutos produtos = new TelaProdutos();
        //produtos.setSize(resolucao);
        telaInterna.add(produtos);
        produtos.setLocation(0,0);
        produtos.setVisible(true);
    }//GEN-LAST:event_menuCadProdutosActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        // TODO add your handling code here:]
       
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadUsuarioActionPerformed
        // TODO add your handling code here:
        //telaInterna.removeAll(); //limpa o container
        //Dimension resolucao = telaInterna.getSize(); //captura resolução do container
        TelaUsuario usuario = new TelaUsuario();
        //usuario.setSize(resolucao);
        telaInterna.add(usuario);
        usuario.setLocation(0,0);
        usuario.setVisible(true);
    }//GEN-LAST:event_menuCadUsuarioActionPerformed

    private void menuSairEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairEncerrarActionPerformed
        // Encerrar Sessão
        
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_menuSairEncerrarActionPerformed

    private void menuSairFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairFecharActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuSairFecharActionPerformed

    private void menuConVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConVeiculoActionPerformed
        // Chama a tela de consulta de veículos
        telaInterna.removeAll(); //limpa o container
        //Dimension resolucao = telaInterna.getSize(); //captura resolução do container
        TelaVeiculosConsulta consulta = new TelaVeiculosConsulta();
        //consulta.setSize(resolucao);
        telaInterna.add(consulta);
        consulta.setLocation(0,0);
        consulta.setVisible(true);
    }//GEN-LAST:event_menuConVeiculoActionPerformed

    private void menuConFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConFuncionarioActionPerformed
        // chama a tela de consulta de funcionarios
        telaInterna.removeAll(); //limpa o container
        //Dimension resolucao = telaInterna.getSize(); //captura resolução do container
        TelaConsultaFuncionario conFunc = new TelaConsultaFuncionario();
        //conFunc.setSize(resolucao);
        telaInterna.add(conFunc);
        conFunc.setLocation(0,0);
        conFunc.setVisible(true);
    }//GEN-LAST:event_menuConFuncionarioActionPerformed

    private void menuBalProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBalProdutoActionPerformed
        // Chama a tela de consulta de produtos.
        telaInterna.removeAll(); //limpa o container
        //Dimension resolucao = telaInterna.getSize(); //captura resolução do container
        TelaConsultaProdutos conProd = new TelaConsultaProdutos();
        //conProd.setSize(resolucao);
        telaInterna.add(conProd);
        conProd.setLocation(0,0);
        conProd.setVisible(true);
    }//GEN-LAST:event_menuBalProdutoActionPerformed

    private void menuRelOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelOsActionPerformed
        // Chama a tela de Ordem de Serviço
        telaInterna.removeAll(); //limpa o container
        //Dimension resolucao = telaInterna.getSize(); //captura resolução do container
        TelaOrdemServicos os = new TelaOrdemServicos();
        //os.setSize(resolucao);
        telaInterna.add(os);
        os.setLocation(0,0);
        os.setVisible(true);
    }//GEN-LAST:event_menuRelOsActionPerformed

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
                if ("Liquid".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jlbData;
    private javax.swing.JLabel jlbDia;
    private javax.swing.JLabel jlbHora;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuBalPreco;
    private javax.swing.JMenuItem menuBalProduto;
    private javax.swing.JMenuItem menuBalcCaixa;
    private javax.swing.JMenu menuBalcao;
    private javax.swing.JMenuItem menuCadCarro;
    private javax.swing.JMenuItem menuCadFuncionario;
    private javax.swing.JMenuItem menuCadProdutos;
    private javax.swing.JMenuItem menuCadUsuario;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuConFuncionario;
    private javax.swing.JMenuItem menuConVeiculo;
    private javax.swing.JMenu menuConsulta;
    private javax.swing.JMenuItem menuRelOs;
    private javax.swing.JMenuItem menuRelVendas;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenuItem menuSairEncerrar;
    private javax.swing.JMenuItem menuSairFechar;
    private javax.swing.JDesktopPane telaInterna;
    // End of variables declaration//GEN-END:variables

    
    class hora implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            Calendar agora = Calendar.getInstance();
            jlbHora.setText(String.format("%1$tH:%1$tM:%1$tS", agora));
        
        }
    }
}

