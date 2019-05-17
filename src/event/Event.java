package event;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Event extends JFrame{
	static Random rand = new Random();
	public Event() {
		setSize(518, 396);
		getContentPane().setBackground(new Color(204, 255, 255));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("랜 덤 박 스");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 10, 488, 39);
		getContentPane().add(lblNewLabel);
		
		ImageIcon icon_search = new ImageIcon("search.jpg"); 
		ImageIcon icon_present = new ImageIcon("present.jpg"); 
		ImageIcon icon_explosion = new ImageIcon("explosion.jpg"); 
		
		JButton buttonBox1 = new JButton();
		buttonBox1.setIcon(icon_search);
		buttonBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i = rand.nextInt(100);
				if(i == 50) {
					buttonBox1.setIcon(icon_present);
				}else {
					buttonBox1.setIcon(icon_explosion);
				}
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(33, 59, 419, 44);
		getContentPane().add(lblNewLabel_1);
		buttonBox1.setBounds(12, 113, 110, 110);
		getContentPane().add(buttonBox1);
		
		JButton buttonBox2 = new JButton();
		buttonBox2.setIcon(icon_search);
		buttonBox2.setBounds(134, 113, 110, 110);
		getContentPane().add(buttonBox2);
		
		JButton buttonBox3 = new JButton();
		buttonBox3.setIcon(icon_search);
		buttonBox3.setBounds(256, 113, 110, 110);
		getContentPane().add(buttonBox3);
		
		JButton buttonBox4 = new JButton();
		buttonBox4.setIcon(icon_search);
		buttonBox4.setBounds(378, 113, 110, 110);
		getContentPane().add(buttonBox4);
		
		JButton buttonBox5 = new JButton();
		buttonBox5.setBounds(12, 233, 110, 110);
		getContentPane().add(buttonBox5);
		
		JButton buttonBox6 = new JButton();
		buttonBox6.setBounds(134, 233, 110, 110);
		getContentPane().add(buttonBox6);
		
		JButton buttonBox7 = new JButton();
		buttonBox7.setBounds(256, 233, 110, 110);
		getContentPane().add(buttonBox7);
		
		JButton buttonBox8 = new JButton();
		buttonBox8.setBounds(378, 233, 110, 110);
		getContentPane().add(buttonBox8);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Event e = new Event();
	}
}
