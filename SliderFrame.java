package javagit;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderFrame extends JFrame implements ChangeListener {

	static final int VALUE =15;
	private JButton butotnOk;
	private JSlider slider;
	private JButton button;
	
	public SliderFrame() {
		JPanel panel;
		
		setTitle("슬라이더테스트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel=new JPanel();
		JLabel label = new JLabel("슬라이더를 움직여보세요",JLabel.CENTER);
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(label);
		
		slider=new JSlider(0,30,VALUE);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(this);
		panel.add(slider);
		
		button = new JButton(" ");
		ImageIcon icon = new ImageIcon("dog.gif");
		button.setIcon(icon);
		button.setSize(VALUE*10,VALUE*10);
		panel.add(button);
		
		add(panel);
		setSize(500,500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new SliderFrame();
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider source =(JSlider)e.getSource();
		if(!source.getValueIsAdjusting()) {
			int value=(int)source.getValue();
			button.setSize(value*10,value*10);
		}
	}

}
