package telas_tcc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JSplitPane;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import java.awt.Scrollbar;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import java.awt.Panel;
import javax.swing.JTextPane;


public class Tela1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 frame = new Tela1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela1() {
		setTitle("Sistema TCC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 573);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 35, 572, 488);
		contentPane.add(tabbedPane);
		
		JPanel Alunos = new JPanel();
		tabbedPane.addTab("Aluno", null, Alunos, "Cadastro de alunos");
		Alunos.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do aluno");
		lblNewLabel.setBounds(10, 41, 97, 14);
		Alunos.add(lblNewLabel);
		
		JLabel lblRa = new JLabel("RA");
		lblRa.setBounds(10, 81, 80, 14);
		Alunos.add(lblRa);
		
		textField = new JTextField();
		textField.setBounds(149, 38, 390, 20);
		Alunos.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(149, 78, 390, 20);
		Alunos.add(textField_1);
		
		JButton btnNewButton = new JButton("Gravar");
		btnNewButton.setBackground(new Color(216, 250, 220));
		btnNewButton.setBounds(210, 236, 89, 23);
		Alunos.add(btnNewButton);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBackground(new Color(253, 216, 200));
		btnExcluir.setBounds(320, 236, 89, 23);
		Alunos.add(btnExcluir);
		
		JLabel lblDataDeIncio = new JLabel("Data de início:");
		lblDataDeIncio.setBounds(10, 132, 80, 14);
		Alunos.add(lblDataDeIncio);
		
		JLabel lblPrevisoDeConcluso = new JLabel("Previsão de conclusão:");
		lblPrevisoDeConcluso.setBounds(10, 177, 130, 14);
		Alunos.add(lblPrevisoDeConcluso);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1 sem. 2015", "2 sem. 2015", "1 sem. 2016", "2 sem. 2016", "1 sem. 2017", "2 sem. 2017", "1 sem. 2018", "2 sem. 2018", "1 sem. 2019", "2 sem. 2019"}));
		comboBox_1.setBounds(149, 128, 200, 22);
		Alunos.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"1 sem. 2018", "2 sem. 2018", "1 sem. 2019", "2 sem. 2019", "1 sem. 2020", "2 sem. 2020", "1 sem. 2021", "2 sem. 2021"}));
		comboBox_1_1.setBounds(149, 173, 200, 22);
		Alunos.add(comboBox_1_1);
		
		JLabel lblNewLabel_6_6 = new JLabel("Registrar aluno");
		lblNewLabel_6_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_6_6.setBounds(10, 11, 145, 19);
		Alunos.add(lblNewLabel_6_6);
		
		JTabbedPane orientacao = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Manter tarefas e reuniões", null, orientacao, null);
		
		JPanel reg_ori = new JPanel();
		orientacao.addTab("Registrar orientação", null, reg_ori, null);
		reg_ori.setLayout(null);
		
		JLabel lblNewLabel_8_1_3 = new JLabel("ID grupo:");
		lblNewLabel_8_1_3.setBounds(22, 50, 141, 14);
		reg_ori.add(lblNewLabel_8_1_3);
		
		JComboBox rec_id1_1 = new JComboBox();
		rec_id1_1.setBounds(129, 46, 403, 22);
		reg_ori.add(rec_id1_1);
		
		JLabel lblNewLabel_8_1_2_1 = new JLabel("Data de entrega:");
		lblNewLabel_8_1_2_1.setBounds(22, 101, 141, 14);
		reg_ori.add(lblNewLabel_8_1_2_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("Digite sua orientação");
		lblNewLabel_9_1.setBounds(22, 186, 141, 14);
		reg_ori.add(lblNewLabel_9_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(106, 211, 426, 152);
		reg_ori.add(textField_3);
		
		JButton btnNewButton_2_2_1 = new JButton("Gravar");
		btnNewButton_2_2_1.setForeground(Color.BLACK);
		btnNewButton_2_2_1.setBackground(new Color(227, 252, 209));
		btnNewButton_2_2_1.setBounds(208, 386, 89, 23);
		reg_ori.add(btnNewButton_2_2_1);
		
		JButton btnExcluir_1_1_1 = new JButton("Limpar");
		btnExcluir_1_1_1.setBackground(new Color(253, 216, 200));
		btnExcluir_1_1_1.setBounds(333, 386, 89, 23);
		reg_ori.add(btnExcluir_1_1_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(129, 96, 117, 22);
		reg_ori.add(textArea);
		
		JLabel lblNewLabel_6_4 = new JLabel("Registrar orientação");
		lblNewLabel_6_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_6_4.setBounds(22, 11, 210, 22);
		reg_ori.add(lblNewLabel_6_4);
		
		JPanel hist_ori = new JPanel();
		orientacao.addTab("Histórico de orientação", null, hist_ori, null);
		hist_ori.setLayout(null);
		
		JLabel lblNewLabel_8_1_1_2 = new JLabel("ID grupo:");
		lblNewLabel_8_1_1_2.setBounds(10, 40, 141, 14);
		hist_ori.add(lblNewLabel_8_1_1_2);
		
		JComboBox rec_id2_1 = new JComboBox();
		rec_id2_1.setBounds(94, 36, 433, 22);
		hist_ori.add(rec_id2_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("Consultar");
		btnNewButton_2_1_1_1.setForeground(Color.BLACK);
		btnNewButton_2_1_1_1.setBackground(new Color(227, 252, 209));
		btnNewButton_2_1_1_1.setBounds(255, 83, 89, 23);
		hist_ori.add(btnNewButton_2_1_1_1);
		
		JLabel lblNewLabel_8_1_1_1_1 = new JLabel("Histórico:");
		lblNewLabel_8_1_1_1_1.setBounds(10, 145, 177, 14);
		hist_ori.add(lblNewLabel_8_1_1_1_1);
		
		JList list_3_1 = new JList();
		list_3_1.setBounds(94, 156, 417, 247);
		hist_ori.add(list_3_1);
		
		Scrollbar scrollbar_1 = new Scrollbar();
		scrollbar_1.setBounds(510, 156, 17, 247);
		hist_ori.add(scrollbar_1);
		
		JLabel lblNewLabel_6_5 = new JLabel("Histórico de orientações");
		lblNewLabel_6_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_6_5.setBounds(6, 11, 221, 18);
		hist_ori.add(lblNewLabel_6_5);
		
		JPanel Cad_grup = new JPanel();
		tabbedPane.addTab("Registro de grupo", null, Cad_grup, null);
		Cad_grup.setLayout(null);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Área do trabalho");
		lblNewLabel_2_3_1.setBounds(21, 40, 112, 14);
		Cad_grup.add(lblNewLabel_2_3_1);
		
		JComboBox comboBox_1_2_1 = new JComboBox();
		comboBox_1_2_1.setBounds(131, 36, 400, 22);
		Cad_grup.add(comboBox_1_2_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Tema");
		lblNewLabel_3_1_1.setBounds(21, 81, 46, 14);
		Cad_grup.add(lblNewLabel_3_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(131, 78, 400, 20);
		Cad_grup.add(textField_2);
		
		JComboBox comboBox_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"Professor A", "Professor B", "Professor C", "Professor D", "Professor E"}));
		comboBox_1_1_1_1.setBounds(131, 116, 400, 22);
		Cad_grup.add(comboBox_1_1_1_1);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("Orientador");
		lblNewLabel_4_2_1.setBounds(21, 120, 81, 14);
		Cad_grup.add(lblNewLabel_4_2_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Integrantes do grupo:");
		lblNewLabel_5_1_1.setBounds(21, 210, 146, 14);
		Cad_grup.add(lblNewLabel_5_1_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setBounds(128, 233, 403, 104);
		Cad_grup.add(textArea_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Gravar");
		btnNewButton_1_1_1.setBackground(new Color(216, 250, 220));
		btnNewButton_1_1_1.setBounds(228, 371, 89, 23);
		Cad_grup.add(btnNewButton_1_1_1);
		
		JButton btnExcluir_1_1_2 = new JButton("Limpar");
		btnExcluir_1_1_2.setBackground(new Color(253, 216, 200));
		btnExcluir_1_1_2.setBounds(338, 371, 89, 23);
		Cad_grup.add(btnExcluir_1_1_2);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(244, 285, 179, 25);
		Cad_grup.add(splitPane);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(338, 321, 10, -71);
		Cad_grup.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(328, 234, 0, 92);
		Cad_grup.add(separator_1);
		
		JLabel lblNewLabel_6_3 = new JLabel("Registrar grupo");
		lblNewLabel_6_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_6_3.setBounds(21, 0, 145, 29);
		Cad_grup.add(lblNewLabel_6_3);
		
		JPanel cons_grup = new JPanel();
		tabbedPane.addTab("Consultar grupo por área", null, cons_grup, null);
		cons_grup.setLayout(null);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Selecione a subárea:");
		lblNewLabel_1_2_1_1.setBounds(20, 57, 127, 14);
		cons_grup.add(lblNewLabel_1_2_1_1);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setBounds(148, 53, 393, 22);
		cons_grup.add(comboBox_2_1);
		
		JButton btnNewButton_2_1_2_1 = new JButton("Consultar");
		btnNewButton_2_1_2_1.setForeground(Color.BLACK);
		btnNewButton_2_1_2_1.setBackground(new Color(227, 252, 209));
		btnNewButton_2_1_2_1.setBounds(298, 86, 89, 23);
		cons_grup.add(btnNewButton_2_1_2_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Grupos:");
		lblNewLabel_2_2_1_1.setBounds(20, 126, 46, 14);
		cons_grup.add(lblNewLabel_2_2_1_1);
		
		JList list_1_2_1_1 = new JList();
		list_1_2_1_1.setBounds(148, 137, 370, 228);
		cons_grup.add(list_1_2_1_1);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBounds(524, 138, 17, 227);
		cons_grup.add(scrollbar);
		
		JLabel lblNewLabel_6_2 = new JLabel("Consultar grupos por área");
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_6_2.setBounds(20, 11, 217, 31);
		cons_grup.add(lblNewLabel_6_2);
		
		JPanel tr_orien = new JPanel();
		tabbedPane.addTab("Trocar orientador", null, tr_orien, null);
		tr_orien.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Selecione o novo orientador:");
		lblNewLabel_2.setBounds(25, 84, 164, 14);
		tr_orien.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Professor A", "Professor B", "Professor C", "Professor D", "Professor E"}));
		comboBox.setBounds(198, 80, 343, 22);
		tr_orien.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Informe a justificativa para análise do pedido:");
		lblNewLabel_1.setBounds(25, 134, 289, 14);
		tr_orien.add(lblNewLabel_1);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(25, 159, 502, 149);
		tr_orien.add(editorPane);
		
		JButton btnNewButton_1 = new JButton("Solicitar");
		btnNewButton_1.setBackground(new Color(249, 182, 174));
		btnNewButton_1.setBounds(225, 351, 89, 23);
		tr_orien.add(btnNewButton_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Trocar Orientador");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_6_1.setBounds(25, 26, 145, 14);
		tr_orien.add(lblNewLabel_6_1);
		
		JPanel mant_orien = new JPanel();
		tabbedPane.addTab("Manter Orientador", null, mant_orien, null);
		mant_orien.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Nome completo:");
		lblNewLabel_3.setBounds(34, 77, 114, 14);
		mant_orien.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Turno:");
		lblNewLabel_4.setBounds(32, 120, 46, 14);
		mant_orien.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Área(s) de orientação:");
		lblNewLabel_5.setBounds(32, 171, 126, 14);
		mant_orien.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(142, 74, 350, 20);
		mant_orien.add(textField_4);
		textField_4.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Manhã");
		rdbtnNewRadioButton.setBounds(142, 116, 109, 23);
		mant_orien.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnTarde = new JRadioButton("Tarde");
		rdbtnTarde.setBounds(261, 116, 109, 23);
		mant_orien.add(rdbtnTarde);
		
		JRadioButton rdbtnNoite = new JRadioButton("Noite");
		rdbtnNoite.setBounds(383, 116, 109, 23);
		mant_orien.add(rdbtnNoite);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Eng. de Software");
		rdbtnNewRadioButton_1.setBounds(142, 199, 109, 23);
		mant_orien.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Dados");
		rdbtnNewRadioButton_1_1.setBounds(280, 199, 109, 23);
		mant_orien.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("Programação");
		rdbtnNewRadioButton_1_2.setBounds(408, 199, 109, 23);
		mant_orien.add(rdbtnNewRadioButton_1_2);
		
		JRadioButton rdbtnNewRadioButton_1_3 = new JRadioButton("Segurança da info.");
		rdbtnNewRadioButton_1_3.setBounds(142, 249, 137, 23);
		mant_orien.add(rdbtnNewRadioButton_1_3);
		
		JRadioButton rdbtnNewRadioButton_1_4 = new JRadioButton("Redes");
		rdbtnNewRadioButton_1_4.setBounds(280, 249, 109, 23);
		mant_orien.add(rdbtnNewRadioButton_1_4);
		
		JRadioButton rdbtnNewRadioButton_1_4_1 = new JRadioButton("Hardware");
		rdbtnNewRadioButton_1_4_1.setBounds(408, 249, 109, 23);
		mant_orien.add(rdbtnNewRadioButton_1_4_1);
		
		JRadioButton rdbtnNewRadioButton_1_4_2 = new JRadioButton("Outra");
		rdbtnNewRadioButton_1_4_2.setBounds(142, 299, 109, 23);
		mant_orien.add(rdbtnNewRadioButton_1_4_2);
		
		JButton btnNewButton_2 = new JButton("Gravar");
		btnNewButton_2.setBackground(new Color(216, 250, 220));
		btnNewButton_2.setBounds(190, 368, 89, 23);
		mant_orien.add(btnNewButton_2);
		
		JButton btnExcluir_1 = new JButton("Excluir");
		btnExcluir_1.setBackground(new Color(253, 216, 200));
		btnExcluir_1.setBounds(365, 368, 89, 23);
		mant_orien.add(btnExcluir_1);
		
		JLabel lblNewLabel_6 = new JLabel("Manter Orientador");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_6.setBounds(34, 22, 145, 14);
		mant_orien.add(lblNewLabel_6);
		
		Panel consul_orien = new Panel();
		tabbedPane.addTab("Consultar orientador por área", null, consul_orien, null);
		consul_orien.setLayout(null);
		
		JLabel lblNewLabel_6_7 = new JLabel("Consultar orientadores por área");
		lblNewLabel_6_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_6_7.setBounds(23, 30, 246, 31);
		consul_orien.add(lblNewLabel_6_7);
		
		JLabel lblNewLabel_7 = new JLabel("Selecione a área de interesse:");
		lblNewLabel_7.setBounds(23, 84, 163, 14);
		consul_orien.add(lblNewLabel_7);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Eng. de software", "Dados", "Programação", "Redes", "Segurançã da informação"}));
		comboBox_2.setBounds(191, 80, 353, 22);
		consul_orien.add(comboBox_2);
		
		JButton btnNewButton_2_1_2_1_1 = new JButton("Consultar");
		btnNewButton_2_1_2_1_1.setForeground(Color.BLACK);
		btnNewButton_2_1_2_1_1.setBackground(new Color(227, 252, 209));
		btnNewButton_2_1_2_1_1.setBounds(301, 124, 89, 23);
		consul_orien.add(btnNewButton_2_1_2_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Lista de professores nessa especialidade:");
		lblNewLabel_2_2_1_1_1.setBounds(23, 164, 246, 14);
		consul_orien.add(lblNewLabel_2_2_1_1_1);
		
		JList list_1_2_1_1_1 = new JList();
		list_1_2_1_1_1.setBounds(151, 184, 370, 207);
		consul_orien.add(list_1_2_1_1_1);
		
		Scrollbar scrollbar_2 = new Scrollbar();
		scrollbar_2.setBounds(527, 184, 17, 207);
		consul_orien.add(scrollbar_2);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Autorização de publicação", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_6_7_1 = new JLabel("Termos de publicação");
		lblNewLabel_6_7_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_6_7_1.setBounds(10, 23, 246, 31);
		panel.add(lblNewLabel_6_7_1);
		
		JLabel lblNewLabel_8 = new JLabel("Leia atentamente o termo:");
		lblNewLabel_8.setBounds(10, 88, 158, 14);
		panel.add(lblNewLabel_8);
		
		JTextPane txtpnAutorizoComBase = new JTextPane();
		txtpnAutorizoComBase.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnAutorizoComBase.setText("Autorizo com base no disposto na Lei Federal nº 9.610, de 19 de fevereiro de 1998 e na Lei n o 10.973, de 2 de dezembro de 2004, a Fatec Zona Lesta a disponibilizar gratuitamente sem ressarcimento dos direitos autorais, o documento supracitado, de minha autoria, na Biblioteca da Fatec ZL para fins de leitura e/ou impressão pela Internet a título de divulgação da produção científica gerada pela Universidade. ");
		txtpnAutorizoComBase.setBounds(10, 113, 530, 135);
		panel.add(txtpnAutorizoComBase);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Li e aceito");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_2.setBounds(163, 288, 109, 23);
		panel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("Não aceito");
		rdbtnNewRadioButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_2_1.setBounds(294, 288, 109, 23);
		panel.add(rdbtnNewRadioButton_2_1);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBackground(new Color(216, 250, 220));
		btnConfirmar.setBounds(232, 358, 109, 23);
		panel.add(btnConfirmar);
	}
}