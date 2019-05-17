package event;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Event extends JFrame {
	static Random rand = new Random();
	static int click = 0;
	
	public Event() {
		
		Random rand = new Random();
		int[] num = new int[8];
		for (int i = 0; i < 8; i++) {
			num[i] = rand.nextInt(8);
			for (int j = 0; j <= i; j++) // 현재 발생시킨 지점까지 검색해서 같은수 비교
			{
				if (num[i] == num[j] && j != i) {
					i = i - 1; // 같은수 있으면 i하나 감소해서 다시 발생
				}
			}
		}
		
		for(int n : num) {
			System.out.println(n);
		}

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
		ImageIcon icon_explosion = new ImageIcon("explosion.png");
		ImageIcon icon_oneFinger = new ImageIcon("oneFinger.jpg");
		ImageIcon icon_twoFingers = new ImageIcon("twoFingers.jpg");

		JButton buttonBox1 = new JButton();
		buttonBox1.setIcon(icon_search);
		buttonBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(33, 59, 419, 44);
		getContentPane().add(lblNewLabel_1);
		buttonBox1.setBounds(12, 113, 110, 110);
		getContentPane().add(buttonBox1);

		JButton buttonBox2 = new JButton();
		buttonBox2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
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
		buttonBox5.setIcon(icon_search);
		buttonBox5.setBounds(12, 233, 110, 110);
		getContentPane().add(buttonBox5);

		JButton buttonBox6 = new JButton();
		buttonBox6.setIcon(icon_search);
		buttonBox6.setBounds(134, 233, 110, 110);
		getContentPane().add(buttonBox6);

		JButton buttonBox7 = new JButton();
		buttonBox7.setIcon(icon_search);
		buttonBox7.setBounds(256, 233, 110, 110);
		getContentPane().add(buttonBox7);

		JButton buttonBox8 = new JButton();
		buttonBox8.setIcon(icon_search);
		buttonBox8.setBounds(378, 233, 110, 110);
		getContentPane().add(buttonBox8);

		setVisible(true);
	}

	public static void main(String[] args) {
		Event e = new Event();
	}
}
