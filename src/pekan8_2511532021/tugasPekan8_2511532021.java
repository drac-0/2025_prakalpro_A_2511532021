package pekan8_2511532021;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class tugasPekan8_2511532021 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField texthasil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tugasPekan8_2511532021 frame = new tugasPekan8_2511532021();
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
	public tugasPekan8_2511532021() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERASI LOGIKA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(152, 14, 129, 24);
		contentPane.add(lblNewLabel);
		
		JLabel ddd = new JLabel("boolean 1");
		ddd.setFont(new Font("Tahoma", Font.BOLD, 12));
		ddd.setBounds(10, 63, 62, 18);
		contentPane.add(ddd);
		
		JLabel asd = new JLabel("boolean 2");
		asd.setFont(new Font("Tahoma", Font.BOLD, 12));
		asd.setBounds(10, 105, 62, 18);
		contentPane.add(asd);
		
		JLabel bool1_1_1 = new JLabel("operasi");
		bool1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		bool1_1_1.setBounds(10, 152, 62, 18);
		contentPane.add(bool1_1_1);
		
		JLabel bool1_1_2 = new JLabel("hasil");
		bool1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		bool1_1_2.setBounds(10, 198, 62, 18);
		contentPane.add(bool1_1_2);
		
		JComboBox bool1 = new JComboBox();
		bool1.setModel(new DefaultComboBoxModel(new String[] {"True", "False"}));
		bool1.setBounds(88, 63, 68, 20);
		contentPane.add(bool1);
		
		JComboBox bool2 = new JComboBox();
		bool2.setModel(new DefaultComboBoxModel(new String[] {"True", "False"}));
		bool2.setBounds(88, 105, 68, 20);
		contentPane.add(bool2);
		
		JComboBox operasibool = new JComboBox();
		operasibool.setModel(new DefaultComboBoxModel(new String[] {"&&", "||", "!"}));
		operasibool.setBounds(89, 154, 68, 20);
		contentPane.add(operasibool);
		operasibool.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String o = operasibool.getSelectedItem().toString();
		        if (o == "!") {
		            bool2.setEnabled(false);
		        } else {
		            bool2.setEnabled(true);
		        }
		    }
		});

		
		texthasil = new JTextField();
		texthasil.setEditable(false);
		texthasil.setBounds(88, 199, 68, 18);
		contentPane.add(texthasil);
		texthasil.setColumns(10);
		
		JButton butt = new JButton("Process");
		butt.addActionListener(new ActionListener() {
			boolean hasil ; 
			public void actionPerformed(ActionEvent e) {
				String a = bool1.getSelectedItem().toString();
				String b = bool2.getSelectedItem().toString();
				String c = operasibool.getSelectedItem().toString();
				
				boolean d = Boolean.parseBoolean(a);
				boolean z = Boolean.parseBoolean(b);
				
				if (c == "&&") {
					hasil = d && z;
				}
				
				if (c == "||") {
					hasil = d || z;
				}
				
				if (c == "!") {
					hasil = !d;
				}
				texthasil.setText(String.valueOf(hasil));
			}
		});
		butt.setBounds(171, 154, 84, 20);
		contentPane.add(butt);
		

	}
}
