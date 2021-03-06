package login;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class InfoUpdate {
	static JTextField tIdKey;
	private JPasswordField pFkey;
	
	public InfoUpdate() {
		JFrame f = new JFrame();
		f.setSize(400, 300);
		f.setBounds(400, 300, 400, 300);
		f.getContentPane().setLayout(null);
		
		
		JButton buttonConfirm = new JButton("\uD655\uC778");
		buttonConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginDao dao = new LoginDao();
				LoginDto dto = dao.info();
				
				String id = dto.getId();
				String pw = dto.getPw();
				
				String id2 = tIdKey.getText();
				String pw2 = pFkey.getText();
				
				if(id.equals(id2)&&pw.equals(pw2)) {
					AdminEdit aE = new AdminEdit();
					f.setVisible(false);
					
				}
				else{
					JOptionPane.showMessageDialog(null, "회원정보가 없습니다");
				}
			}
		});
		buttonConfirm.setBounds(108, 177, 97, 23);
		f.getContentPane().add(buttonConfirm);
		
		tIdKey = new JTextField();
		tIdKey.setBounds(134, 59, 170, 28);
		f.getContentPane().add(tIdKey);
		tIdKey.setColumns(10);
		tIdKey.addKeyListener(new KeyAdapter() { // 엔터 입력시 확인 버튼 누르도록 설정
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
					buttonConfirm.doClick();
			}
		});
		
		pFkey = new JPasswordField();
		pFkey.setBounds(134, 116, 170, 28);
		f.getContentPane().add(pFkey);
		pFkey.addKeyListener(new KeyAdapter() { // 엔터 입력시 확인 버튼 누르도록 설정
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
					buttonConfirm.doClick();
			}
		});
		
		JButton buttonCancel = new JButton("취소");
		buttonCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				f.setVisible(false);
			}//취소
		});
		buttonCancel.setBounds(217, 177, 97, 23);
		f.getContentPane().add(buttonCancel);
		
		JLabel labelID = new JLabel("\uC544\uC774\uB514");
		labelID.setBounds(45, 58, 77, 28);
		f.getContentPane().add(labelID);
		
		JLabel labelPW = new JLabel("\uD328\uC2A4\uC6CC\uB4DC");
		labelPW.setBounds(45, 115, 77, 28);
		f.getContentPane().add(labelPW);
		
		JLabel LabelTitle = new JLabel("\uD68C\uC6D0\uC815\uBCF4\uC218\uC815");
		LabelTitle.setFont(new Font("굴림", Font.BOLD, 20));
		LabelTitle.setBounds(134, 10, 126, 28);
		f.getContentPane().add(LabelTitle);
		
		
		
		
		
		
		f.setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		InfoUpdate infoU = new InfoUpdate();
	}
}