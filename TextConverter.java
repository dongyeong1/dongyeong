package javagit;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextConverter extends JFrame implements ActionListener{
	
	JButton converter, canceler;
	JTextArea textin,textout;
	
	public TextConverter() {
		super("텍스트변환");
		
		textin = new JTextArea(10,14);
		textout = new JTextArea(10,14);
		textin.setLineWrap(true);
		textout.setLineWrap(true);
		textout.setEditable(false);
		
		JPanel textareaPanel = new JPanel(new GridLayout(1,2,20,20));
		textareaPanel.add(textin);
		textareaPanel.add(textout);
		
		converter =new JButton("변환");
		canceler=new JButton("취소");
		converter.addActionListener(this);
		canceler.addActionListener(this);
		
		JPanel buttonpanel = new JPanel(new FlowLayout());
		buttonpanel.add(converter);
		buttonpanel.add(canceler);
		
		JPanel mainpanel =new JPanel(new BorderLayout(10,10));
		mainpanel.add(textareaPanel,BorderLayout.CENTER);
		mainpanel.add(buttonpanel,BorderLayout.SOUTH);
		
		setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		add(mainpanel);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new TextConverter();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==converter) {
			textout.setText("");
			String result =toEnglish(textin.getText());
			textout.append(result);
		}
		if(e.getSource()==canceler) {
			textout.setText("");
		}
	}
	
	public String toEnglish(String korean) {
		String result=korean;
		result=result.replace("텍스트 영어", "Text English");
		return result;
	}

}
