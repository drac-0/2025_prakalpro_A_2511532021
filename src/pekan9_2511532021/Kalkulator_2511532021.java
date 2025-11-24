package pekan9_2511532021;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kalkulator_2511532021 extends JFrame {
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inorout;

	double first;
	double second;
	double result;
	String operation;
	String answer;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator_2511532021 frame = new Kalkulator_2511532021();
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
	public Kalkulator_2511532021() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 296, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		inorout = new JTextField();
		inorout.setEditable(false);
		inorout.setBounds(10, 25, 262, 39);
		contentPane.add(inorout);
		inorout.setColumns(10);
		
		JButton btnNewButton = new JButton("<--");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if (inorout.getText().length() > 0) {
					StringBuilder str = new StringBuilder(inorout.getText());
					str.deleteCharAt(inorout.getText().length()-1);
					backspace =str.toString();
					inorout.setText(backspace);
				}
			}
		});
		btnNewButton.setBounds(10, 94, 58, 31);
		contentPane.add(btnNewButton);
		
		JButton tujuh = new JButton("7");
		tujuh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = inorout.getText()+tujuh.getText();
				inorout.setText(number);
			}
		});
		tujuh.setBounds(10, 135, 58, 31);
		contentPane.add(tujuh);
		
		JButton empat = new JButton("4");
		empat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = inorout.getText()+empat.getText();
				inorout.setText(number);
			}
		});
		empat.setBounds(10, 176, 58, 31);
		contentPane.add(empat);
		
		JButton satu = new JButton("1");
		satu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = inorout.getText()+satu.getText();
				inorout.setText(number);
			}
		});
		satu.setBounds(10, 217, 58, 31);
		contentPane.add(satu);
		
		JButton nol = new JButton("0");
		nol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = inorout.getText()+nol.getText();
				inorout.setText(number);
			}
		});
		nol.setBounds(10, 258, 58, 31);
		contentPane.add(nol);
		
		JButton Clear = new JButton("C");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inorout.setText(null);
			}
		});
		Clear.setBounds(78, 94, 58, 31);
		contentPane.add(Clear);
		
		JButton lapan = new JButton("8");
		lapan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = inorout.getText()+lapan.getText();
				inorout.setText(number);
			}
		});
		lapan.setBounds(78, 135, 58, 31);
		contentPane.add(lapan);
		
		JButton lima = new JButton("5");
		lima.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = inorout.getText()+lima.getText();
				inorout.setText(number);
			}
		});
		lima.setBounds(78, 176, 58, 31);
		contentPane.add(lima);
		
		JButton dua = new JButton("2");
		dua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = inorout.getText()+dua.getText();
				inorout.setText(number);
				
			}
		});
		dua.setBounds(78, 217, 58, 31);
		contentPane.add(dua);
		
		JButton titik = new JButton(".");
		titik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = inorout.getText()+titik.getText();
				inorout.setText(number);
			}
		});
		titik.setBounds(78, 258, 58, 31);
		contentPane.add(titik);
		
		JButton nolnol = new JButton("00");
		nolnol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = inorout.getText()+nolnol.getText();
				inorout.setText(number);
			}
		});
		nolnol.setBounds(146, 94, 58, 31);
		contentPane.add(nolnol);
		
		JButton sembilan = new JButton("9");
		sembilan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = inorout.getText()+sembilan.getText();
				inorout.setText(number);
			}
		});
		sembilan.setBounds(146, 135, 58, 31);
		contentPane.add(sembilan);
		
		JButton enam = new JButton("6");
		enam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = inorout.getText()+enam.getText();
				inorout.setText(number);
			}
		});
		enam.setBounds(146, 176, 58, 31);
		contentPane.add(enam);
		
		JButton tiga = new JButton("3");
		tiga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = inorout.getText()+tiga.getText();
				inorout.setText(number);
			}
		});
		tiga.setBounds(146, 217, 58, 31);
		contentPane.add(tiga);
		
		JButton hasbut_2511532021 = new JButton("=");
		hasbut_2511532021.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(inorout.getText());
				
				if (operation == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					inorout.setText(answer);
				}
				else if (operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					inorout.setText(answer);
				}
				
				else if (operation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					inorout.setText(answer);
				}
				
				else if (operation == "/") {
					if (second == 0) {
						answer = "TIDAK BOLEH 0";
					}
					
					else {
						result = first / second;
						answer = String.format("%.2f", result);}
					
					inorout.setText(answer);
				}
				
				else if (operation == "%") {
					if (second == 0) {
						answer = "TIDAK BOLEH 0";
					}
					
					else {
						result = first % second;
						answer = String.format("%.2f", result);}
					
					inorout.setText(answer);
				}
				
			}
		});
		hasbut_2511532021.setBounds(146, 258, 58, 31);
		contentPane.add(hasbut_2511532021);
		
		JButton tmbh_2511532021 = new JButton("+");
		tmbh_2511532021.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(inorout.getText());
				inorout.setText("");
				operation="+";
				
			}
		});
		tmbh_2511532021.setBounds(214, 94, 58, 31);
		contentPane.add(tmbh_2511532021);
		
		JButton kurang_2511532021 = new JButton("-");
		kurang_2511532021.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(inorout.getText());
				inorout.setText("");
				operation="-";
				
			}
		});
		kurang_2511532021.setBounds(214, 135, 58, 31);
		contentPane.add(kurang_2511532021);
		
		JButton kali_2511532021 = new JButton("*");
		kali_2511532021.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(inorout.getText());
				inorout.setText("");
				operation="*";
				
			}
		});
		kali_2511532021.setBounds(214, 176, 58, 31);
		contentPane.add(kali_2511532021);
		
		JButton bagi_2511532021 = new JButton("/");
		bagi_2511532021.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(inorout.getText());
				inorout.setText("");
				operation="/";
				
			}
		});
		bagi_2511532021.setBounds(214, 217, 58, 31);
		contentPane.add(bagi_2511532021);
		
		JButton mod_2511532021 = new JButton("%");
		mod_2511532021.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(inorout.getText());
				inorout.setText("");
				operation="%";
				
			}
		});
		mod_2511532021.setBounds(214, 258, 58, 31);
		contentPane.add(mod_2511532021);

	}
}
