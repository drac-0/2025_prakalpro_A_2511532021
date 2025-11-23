package pekan8_2511532021;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TugasPekan8Assignment_2511532021 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtHasil;
	private int hasil=0;

	
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TugasPekan8Assignment_2511532021 frame = new TugasPekan8Assignment_2511532021();
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
	public TugasPekan8Assignment_2511532021() {
		setTitle("OPERATOR ASSIGNMENT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 295);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ASSIGNMENT");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Formula1 Display Bold", Font.PLAIN, 12));
		lblNewLabel.setBounds(38, 32, 213, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Angka");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 73, 78, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Operator");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(10, 126, 78, 31);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Hasil");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(10, 167, 78, 31);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		txtBil1 = new JTextField();
		txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil1.setBounds(98, 80, 56, 19);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+=", "-=", "*=", "/=", "%="}));
		cbOperator.setBounds(98, 132, 41, 21);
		contentPane.add(cbOperator);
		
		txtHasil = new JTextField();
		txtHasil.setEditable(false);
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setColumns(10);
		txtHasil.setBounds(98, 174, 56, 19);
		contentPane.add(txtHasil);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				
				if(txtBil1.getText().trim().isEmpty()) pesanPeringatan("Angka harus diisi");
				else {
					int nilai;
					try {
						nilai = Integer.parseInt(txtBil1.getText().trim());
						int op = cbOperator.getSelectedIndex(); 
						
						switch (op) {
                        case 0: hasil += nilai; break;  
                        case 1: hasil -= nilai; break;  
                        case 2: hasil *= nilai; break;  
                        case 3: 
                            if (nilai == 0) {
                                JOptionPane.showMessageDialog(null, "Tidak bisa membagi dengan 0!");
                                return;
                            }
                            hasil /= nilai;
                            break;                       
                        case 4: 
                            if (nilai == 0) {
                                JOptionPane.showMessageDialog(null, "Tidak bisa modulus dengan 0!");
                                return;
                            }
                            hasil %= nilai;
                            break;                       
                    }
					} catch (NumberFormatException ex) {
						pesanError("Input harus berupa angka!");
					}
				}
					
				
				txtHasil.setText(String.valueOf(hasil));
			}
		});
		btnNewButton.setBounds(166, 132, 63, 21);
		contentPane.add(btnNewButton);

	}
}