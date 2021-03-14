package javagit;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FieldFrame extends JFrame {
	
	 private JButton button;
	 private JTextField text,result;
	 
	 
	 public FieldFrame () {
		 setSize(300, 200);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setTitle("제곱 계산하기");
		 button =new JButton("ok");
		 
		 JPanel panel = new JPanel();
//		 panel.setLayout(new GridLayout(2,2));
		 panel.add(new JLabel("숫자입력:"));
		 text = new JTextField(15);
		 panel.add(text);
		 
		 panel.add(new JLabel("제곱한값"));
		 result=new JTextField(15);
		 result.setEditable(false);
		 panel.add(result);
		 
		 button.addActionListener(new ButtonListener());
		 
		 panel.add(button);
		 
		 add(panel);
		 
		 setVisible(true);
		 
	 }
	 
	 private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String name=text.getText();
			int x = Integer.valueOf(name);
			result.setText(" "+x*x);
			result.requestFocus();
			
			
		}
		 
	 }

	public static void main(String[] args) {
		new FieldFrame();
	}

}
