package javagit;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Combobox extends JFrame implements ActionListener{
	JLabel label;
	JTextField field;
	JComboBox animallist;
	
	public Combobox() {
		setTitle("콤보박스");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		
		String[] animal= {"dog","lion"};
		field= new JTextField();
		animallist = new JComboBox(animal);
		animallist.setEditable(true);
		animallist.setSelectedIndex(0);
		animallist.addActionListener(this);
//		field.addActionListener(this);
		
		label=new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		
		changePicture(animal[animallist.getSelectedIndex()]);
		add(animallist,BorderLayout.PAGE_START);
//		add(field,BorderLayout.PAGE_START);
		add(label,BorderLayout.PAGE_END);
		setVisible(true);
	}

	public static void main(String[] args) {
	new Combobox();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String qq=(String)animallist.getSelectedItem();
		
		
		switch (qq) {
		case "dog":
			changePicture(qq);
			break;
		case "lion":
			changePicture(qq);
			break;
		default:
			break;
		}
		
//		
////		JComboBox cb = (JComboBox)e.getSource();
////		String name=(String)cb.getSelectedItem();
////		changePicture(name);
		
	}
	
	public void changePicture(String name) {
		ImageIcon icon =new ImageIcon(name+".png");
		label.setIcon(icon);
		if(icon != null) {
			label.setText(null);
			
		}else {
			label.setText("발견되지않았습니다");
		}
	}
	
}
