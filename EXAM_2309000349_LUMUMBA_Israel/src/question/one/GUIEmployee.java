package question.one;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.*;

public class GUIEmployee implements ActionListener {
private JFrame frame=new JFrame();
//labels
private JLabel id_lb=new JLabel("IDENTITY: ");
private JLabel name_lb=new JLabel("NAME: ");
private JLabel position_lb=new JLabel("POSITION: ");
//textfields
private JTextField id_tf=new JTextField("");
private JTextField name_tf=new JTextField("");
private JTextField position_tf=new JTextField("");
//buttons
private JButton insert_btn=new JButton("Insert");
private JButton view_btn=new JButton("View");
private JButton update_btn=new JButton("Update");
private JButton delete_btn=new JButton("Delete");
 
//const
public GUIEmployee(){
	createWindow();
	addComponentonFrame();
	setSizeandLocation();
	addActionEvent();
	
}
	private void addActionEvent() {
	insert_btn.addActionListener(this);
	view_btn.addActionListener(this);
	update_btn.addActionListener(this);
	delete_btn.addActionListener(this);
	
}
	private void setSizeandLocation() {
		//labels
	id_lb.setBounds(20,60,100,30);
	name_lb.setBounds(20,120,100,30);
	position_lb.setBounds(20,180,100,30);
	//textfield
	id_tf.setBounds(100,60,100,30);
	name_tf.setBounds(100,120,100,30);
	position_tf.setBounds(100,180,100,30);
	//buttons 
	insert_btn.setBounds(20,250,100,30);
	view_btn.setBounds(100,250,100,30);
	update_btn.setBounds(180,250,100,30);
}
	private void addComponentonFrame() {
	//label
		frame.add(id_lb);
		frame.add(name_lb);
		frame.add(position_lb);
		//textfield
		frame.add(id_tf);
		frame.add(name_tf);
		frame.add(position_tf);
	//buttons
		frame.add(insert_btn);
		frame.add(view_btn);
		frame.add(update_btn);
		frame.add(delete_btn);
}
	private void createWindow() {
	frame=new JFrame();
	frame.setTitle("Employee");
	frame.setBounds(20,20,300,400);
	frame.setLayout(null);
	frame.setVisible(true);
	frame.setResizable(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
	public void actionPerformed(ActionEvent e) {
	
		
	}
	public static void main(String[] args){
		GUIEmployee gui=new GUIEmployee();
		
	}

}
