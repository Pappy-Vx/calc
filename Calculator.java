package calc;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private javax.swing.JButton btn7;
	
	double firstnum;
	double secondnum;
	double results;
	String operations;
	String answer;
	
	
	
		/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 312, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 246, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Y = textField.getText() + btn8.getText();
				textField.setText(Y);
			}
		});
		btn8.setForeground(Color.BLACK);
		btn8.setBackground(Color.WHITE);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(64, 117, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String z = textField.getText() + btn9.getText();
				textField.setText(z);	
			}
		});
		btn9.setForeground(Color.BLACK);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBackground(Color.WHITE);
		btn9.setBounds(124, 117, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setForeground(Color.BLUE);
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBackground(Color.WHITE);
		btnPlus.setBounds(184, 117, 50, 50);
		frame.getContentPane().add(btnPlus);

		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String x= textField.getText() + btn6.getText();
				textField.setText(x);
			}
		});
		btn6.setForeground(Color.BLACK);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(124, 178, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String x= textField.getText() + btn3.getText();
				textField.setText(x);
			}
		});
		btn3.setForeground(Color.BLACK);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(124, 239, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Y = textField.getText() + btn4.getText();
				textField.setText(Y);
			}
		});
		btn4.setForeground(Color.BLACK);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(10, 178, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String x= textField.getText() + btn2.getText();
				textField.setText(x);
			}
		});
		btn2.setForeground(Color.BLACK);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(64, 239, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnMinus.setForeground(Color.BLUE);
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMinus.setBackground(Color.WHITE);
		btnMinus.setBounds(184, 178, 50, 50);
		frame.getContentPane().add(btnMinus);
		
		JButton btnMply = new JButton("*");
		btnMply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMply.setForeground(Color.BLUE);
		btnMply.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMply.setBackground(Color.WHITE);
		btnMply.setBounds(184, 239, 50, 50);
		frame.getContentPane().add(btnMply);
		
		JButton btnBack = new JButton("Del");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String del = null;
				if (textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					del = strB.toString();
					textField.setText(del);
				}
			}
		});
		btnBack.setForeground(Color.RED);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBack.setBackground(Color.DARK_GRAY);
		btnBack.setBounds(199, 56, 87, 50);
		frame.getContentPane().add(btnBack);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnClear.setForeground(Color.RED);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBackground(Color.DARK_GRAY);
		btnClear.setBounds(10, 56, 50, 50);
		frame.getContentPane().add(btnClear);
		
		JButton btnPer = new JButton("%");
		btnPer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnPer.setForeground(Color.BLUE);
		btnPer.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPer.setBackground(Color.DARK_GRAY);
		btnPer.setBounds(64, 56, 65, 50);
		frame.getContentPane().add(btnPer);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btndiv.setForeground(Color.BLUE);
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndiv.setBackground(Color.DARK_GRAY);
		btndiv.setBounds(139, 56, 50, 50);
		frame.getContentPane().add(btndiv);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String x= textField.getText() + btn0.getText();
				textField.setText(x);
			}
		});
		btn0.setForeground(Color.BLACK);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBackground(Color.DARK_GRAY);
		btn0.setBounds(10, 300, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnDec = new JButton(".");
		btnDec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String x= textField.getText() + btnDec.getText();
				textField.setText(x);
			}
		});
		btnDec.setForeground(Color.BLACK);
		btnDec.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDec.setBackground(Color.DARK_GRAY);
		btnDec.setBounds(64, 300, 50, 50);
		frame.getContentPane().add(btnDec);
		
		JButton btnPM = new JButton("+/-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setForeground(Color.BLACK);
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPM.setBackground(Color.DARK_GRAY);
		btnPM.setBounds(124, 300, 72, 50);
		frame.getContentPane().add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if (operations == "+") {
					results = firstnum + secondnum;
					answer = String.format("%.2f", results);
					textField.setText(answer);
				}
				else if (operations == "-") {
					results = firstnum - secondnum;
					answer = String.format("%.2f", results);
					textField.setText(answer);
				}
				else if (operations == "*") {
					results = firstnum * secondnum;
					answer = String.format("%.2f", results);
					textField.setText(answer);
				}
				else if (operations == "/") {
					results = firstnum / secondnum;
					answer = String.format("%.2f", results);
					textField.setText(answer);
				}
				else if (operations == "%") {
					results = firstnum % secondnum;
					answer = String.format("%.2f", results);
					textField.setText(answer);
				}
				
			}
		});
		btnEqual.setForeground(Color.BLUE);
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBackground(Color.DARK_GRAY);
		btnEqual.setBounds(206, 300, 80, 50);
		frame.getContentPane().add(btnEqual);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String x= textField.getText() + btn7.getText();
				textField.setText(x);
			}
		});
		btn7.setForeground(Color.ORANGE);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBackground(Color.WHITE);
		btn7.setBounds(10, 117, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String x= textField.getText() + btn5.getText();
				textField.setText(x);
			}
		});
		btn5.setForeground(Color.BLACK);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(64, 178, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String x= textField.getText() + btn1.getText();
				textField.setText(x);
			}
		});
		btn1.setForeground(Color.BLACK);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBackground(Color.WHITE);
		btn1.setBounds(10, 239, 50, 50);
		frame.getContentPane().add(btn1);
		
		
	}
}
