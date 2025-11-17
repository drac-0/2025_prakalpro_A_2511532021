package pekan8_2511532021;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511532021 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel FRAME;
	private JTextField txtbil1;
	private JTextField txtbil2;
	private JTextField txthasil;
	public void pesanPeringatan (String pessan) {
		JOptionPane.showMessageDialog(FRAME, pessan, "Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	
	public void pesanError(String pessan) {
		JOptionPane.showMessageDialog(FRAME, pessan, "Kesalahan", JOptionPane.WARNING_MESSAGE);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511532021 frame = new OperatorAritmatikaGUI_2511532021();
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
	public OperatorAritmatikaGUI_2511532021() {
		setTitle("OPERATOR ARITMATIKA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		FRAME = new JPanel();
		FRAME.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(FRAME);
		FRAME.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Operator Aritmatika");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblNewLabel.setBounds(141, 10, 147, 44);
		FRAME.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(10, 64, 103, 32);
		FRAME.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bilangan 2");
		lblNewLabel_1_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 10));
		lblNewLabel_1_1.setBounds(10, 106, 103, 32);
		FRAME.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Operator ");
		lblNewLabel_1_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 10));
		lblNewLabel_1_2.setBounds(10, 148, 103, 32);
		FRAME.add(lblNewLabel_1_2);
		
		JLabel txt = new JLabel("Hasil");
		txt.setFont(new Font("Segoe UI Black", Font.PLAIN, 10));
		txt.setBounds(10, 190, 103, 32);
		FRAME.add(txt);
		
		txtbil1 = new JTextField();
		txtbil1.setBounds(76, 71, 96, 18);
		FRAME.add(txtbil1);
		txtbil1.setColumns(10);
		
		txtbil2 = new JTextField();
		txtbil2.setBounds(76, 113, 96, 18);
		FRAME.add(txtbil2);
		txtbil2.setColumns(10);
		
		txthasil = new JTextField();
		txthasil.setEditable(false);
		txthasil.setColumns(10);
		txthasil.setBounds(76, 197, 96, 18);
		FRAME.add(txthasil);
		
		JComboBox cboperator = new JComboBox();
		cboperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cboperator.setBounds(76, 154, 96, 20);
		FRAME.add(cboperator);
		
		JButton btnNewButton = new JButton("Process");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if (txtbil1.getText().trim().isEmpty()) {
					pesanPeringatan("Silahkan masukkan bilangan 1");
				}
				else if (txtbil2.getText().trim().isEmpty()) {
					pesanPeringatan("Silahkan masukkan bilangan 2");
				}
				
				else {
					try {
						int a = Integer.parseInt(txtbil1.getText());
						int b = Integer.parseInt(txtbil2.getText());
						int c = cboperator.getSelectedIndex();
						
						if (c == 0) {
							hasil = a + b;
						}
						
						if (c == 1) {
							hasil = a - b;
						}
						
						if (c == 2) {
							hasil = a * b;
						}
						
						if (c == 3) {
							if (b != 0) {
							hasil = a / b;}
							
							else {
								pesanError("Tidak dapat dibagi dengan 0");
							}
						}
						
						if (c == 4) {
							hasil = a % b;
						}
						
						txthasil.setText(String.valueOf(hasil));
					} catch (NumberFormatException ex) {
						pesanError("Bilangan 1 dan 2 harus angka");
					}
				}
				
			}
		});
		btnNewButton.setBounds(197, 154, 84, 20);
		FRAME.add(btnNewButton);

	}
}
