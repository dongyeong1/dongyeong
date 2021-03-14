package javagit;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.xml.soap.Text;

class Myframe extends JFrame implements ActionListener{
	private int sum,temp1,temp2,temp3;
	private JButton orderButton, cancelButton;
	
	private JPanel downpanel;
	private JTextField text;
	
	welcomepanel wp = new welcomepanel();
	
	typepanel tp = new typepanel();
	sizepanel sp =new sizepanel();
	toppingpanel top = new toppingpanel();
	
	
	
	
	public Myframe() {
		setTitle("피자주문");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,300);
		
		
		
		
		
		downpanel =new JPanel();
		text=new JTextField();
		text.setEditable(false);
		text.setColumns(6);
		
		
		orderButton = new JButton("주문");
		orderButton.addActionListener(this);
		cancelButton=new JButton("취소");
		cancelButton.addActionListener(this);
		downpanel.add(orderButton);
		downpanel.add(cancelButton);
		downpanel.add(text);
		
		this.setLayout(new BorderLayout());
		
		this.add(wp,BorderLayout.NORTH);
		this.add(tp,BorderLayout.WEST);
		this.add(sp,BorderLayout.EAST);
		this.add(top,BorderLayout.CENTER);
		this.add(downpanel,BorderLayout.SOUTH);
		
		setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==this.orderButton) {
			this.text.setText(" "+20000);
			
		}
		if(e.getSource()==this.cancelButton) {
			temp1=0;
			temp2=0;
			temp3=0;
			sum=0;
			this.text.setText(""+sum);
		}
	}
	
}

class welcomepanel extends JPanel{
	public JLabel message;
	
	public welcomepanel() {
		message=new JLabel("자바 피자에 오신걸을 환영합니다");
		add(message);
	}
	
}

class sizepanel extends JPanel{
	public  JRadioButton small,medium,large;
	public  ButtonGroup bg;
	
	public sizepanel() {
		setLayout(new GridLayout(3,1));
		
		small=new JRadioButton("small");
		medium=new JRadioButton("medium");
		large=new JRadioButton("large");
		
		bg=new ButtonGroup();
		bg.add(small);
		bg.add(medium);
		bg.add(large);
		setBorder(BorderFactory.createTitledBorder("크기"));
		
		add(small);
		add(medium);
		add(large);
	}
}
class typepanel extends JPanel{
	public  JRadioButton combo,potato,gogi;
	public  ButtonGroup bg;
	
	public typepanel() {
		setLayout(new GridLayout(3,1));
		
		combo =new JRadioButton("콤보");
		potato=new JRadioButton("포테이토");
		gogi= new JRadioButton("불고기");
		
		bg =new ButtonGroup();
		bg.add(combo);
		bg.add(potato);
		bg.add(gogi);
		setBorder(BorderFactory.createTitledBorder("종류"));
		
		add(combo);
		add(potato);
		add(gogi);
		
	}
	
}

class toppingpanel extends JPanel{
	
	public  JRadioButton pimang,cheese,pepe,baken;
	public  ButtonGroup bg;
	
	public toppingpanel() {
		pimang=new JRadioButton("피망");
		cheese=new JRadioButton("치즈");
		pepe=new JRadioButton("페페로니");
		baken=new JRadioButton("baken");
		
		bg=new ButtonGroup();
		bg.add(pimang);
		bg.add(cheese);
		bg.add(pepe);
		bg.add(baken);
		setBorder(BorderFactory.createTitledBorder("추가토핑"));
		
		add(pimang);
		add(cheese);
		add(pepe);
		add(baken);
		
	}
	
}
public class Pizzatest {

	public static void main(String[] args) {
		new Myframe();
		
	}

}
