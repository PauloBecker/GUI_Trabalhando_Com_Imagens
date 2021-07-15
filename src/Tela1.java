import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class Tela1 implements ActionListener {
	
	JLabel label;
	ImageIcon icon1,icon2;
	boolean trocar = true;
	int cont = 0;
	JButton button;
	
	public Tela1() {

		JFrame frame = new JFrame("Título da tela");
		frame.setVisible(true);
		frame.setSize(140, 240);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		icon1 = new ImageIcon("img/facebook.png");
		icon2 = new ImageIcon("img/instagram.png");
		
//		
//		label = new JLabel(icon1);
//		frame.add(label);
		
//		JButton button = new JButton("Trocar");
//		button.addActionListener(this);
//		frame.add(button);
		
		button = new JButton(icon1);
		button.addActionListener(this);
		frame.add(button);
			
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {

			new Tela1();
			
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//### Trabalhando com imagens, condição para trocar as imagens
//		if(trocar) {
//			label.setIcon(icon2);
//		}else {
//			label.setIcon(icon1);
//		}
//		
//		trocar = !trocar;
		
		//### Outra forma de fazer a condição na apresentação das imagens
		if(cont++ %2 ==0) {
			button.setIcon(icon2);
		}else {
			button.setIcon(icon1);
		}
		
		trocar = !trocar;
		
		
	}

}
