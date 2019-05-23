package membership;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlreadyMember extends JFrame{
	public AlreadyMember() {
		setTitle("버튼 누르면 경고창 닫기");
		setBounds(770, 390, 443, 198);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("이미 등록된 전화번호입니다.");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setForeground(new Color(204, 0, 51));
		btnNewButton.setBackground(new Color(255, 255, 153));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 21));
		btnNewButton.setBounds(0, 0, 437, 169);
		getContentPane().add(btnNewButton);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		AlreadyMember nof = new AlreadyMember();
	}
}