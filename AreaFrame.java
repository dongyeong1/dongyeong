package javagit;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AreaFrame extends JFrame implements ActionListener {
	
	private JTextField Field;
	
	private JTextArea area;

	 public AreaFrame() {
		setTitle("areatest");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Field = new JTextField(30);
		Field.addActionListener(this);
		
		area = new JTextArea(10,30);
		JScrollPane sb = new JScrollPane(area);
		
		
		
		area.setEditable(false);
		
		add(Field,BorderLayout.NORTH);
		add(sb,BorderLayout.CENTER);
		
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text =Field.getText();
		area.append(text+"\n");
		Field.selectAll();
		area.setCaretPosition(area.getDocument().getLength());
	}
	
	
	public static void main(String[] args) {
		new AreaFrame();
	}

}
