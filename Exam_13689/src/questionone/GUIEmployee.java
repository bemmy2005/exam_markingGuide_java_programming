package questionone;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIEmployee implements ActionListener{
	private JLabel ID_lbl=new JLabel("ID");
	private JLabel NAME_lbl=new JLabel("NAME");
	private JLabel POSITION_lbl=new JLabel("POSITION");

	private JTextField ID_tf=new JTextField();
	private JTextField NAME_tf=new JTextField();
	private JTextField POSITION_tf=new JTextField();

	private JButton INSERT_btn=new JButton();
	private JButton VIEW_btn=new JButton();
	private JButton UPDATE_btn=new JButton();
	private JButton DELETE_btn=new JButton();

	public GUIEmployee(){
		insertwindow();
		addlocationandsize();
		addcomponentandframe();
		addactionevent();
	}

	private void addactionevent() {
	ID_lbl.addActionListener(this);
	NAME_lbl.addActionListener(this);
	POSITION_lbl.addActionListener(this);
	}

	private void addcomponentandframe() {
		Frame.add(ID_lbl);
		Frame.add(NAME_lbl);
		Frame.add(POSITION_lbl);
		Frame.add(ID_tf);
		Frame.add(NAME_tf);
		Frame.add(POSITION_tf);
		Frame.add(INSERT_btn);
		Frame.add(VIEW_btn);
		Frame.add(UPDATE_btn);
		Frame.add(DELETE_btn);
		

	}

	private void addlocationandsize() {
		// TODO Auto-generated method stub
ID_lbl.setBounds(20,20,100,20);
NAME_lbl.setBounds(20,60,100,20);
POSITION_lbl.setBounds(20,20,100,20);
ID_tf.setBounds(25,20,100,40);
NAME_tf.setBounds(20,40,100,20);
POSITION_tf.setBounds(20,20,100,20);
INSERT_btn.setBounds(30,25,150,20);
VIEW_btn.setBounds(30,30,150,20);
UPDATE_btn.setBounds(30,35,150,20);
DELETE_btn.setBounds(30,40,150,20);
	}

	private void insertwindow() {
		// TODO Auto-generated method stub
		JFrame Frame = new JFrame();
Frame.setTitle("GUIEmployee");
Frame.setBackground("color=green");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
