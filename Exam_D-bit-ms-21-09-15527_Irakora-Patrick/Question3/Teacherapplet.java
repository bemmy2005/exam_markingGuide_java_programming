package Question3;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Teacherapplet extends Applet implements ActionListener{


	private JFrame frame;



	//labels
	private JLabel username_lb=new JLabel("username");
	private JLabel Phone_lb=new JLabel("Phone ");
	private JLabel Id_lb=new JLabel(" Id");
	
     //textfields
	private JTextField Tfname_tf=new JTextField("Tfname");
	private JTextField Tlname_tf=new JTextField("Tlname ");
	private JTextField Tid_tf=new JTextField("Tid ");
	
	
	//buttons
	private JButton insert_btn=new JButton("insert");
	private JButton view_btn=new JButton("view");
	private JButton update_btn=new JButton("update");
	private JButton Delete_btn=new JButton("Delete");



	private Component Tfname_lb;
	
	//contract
	public Teacherapplet() {
		createWindow();
		setLocationAndSIze();
		addComponentsToFrame();
		addActionEvent();
	}



private void addActionEvent() {
		 insert_btn.addActionListener(this);
		view_btn.addActionListener(this);
		update_btn.addActionListener(this);
		Delete_btn.addActionListener(this);
		
	}





private void addComponentsToFrame() {
		// TODO Auto-generated method stub
	frame.add(Tfname_lb);
	frame.add(Tlname_tf);
	frame.add(Tid_tf);
	frame.add(view_btn);
	frame.add(update_btn);
	frame.add(Delete_btn);
}







private void setLocationAndSIze() {
		// TODO Auto-generated method stub
	username_lb.setBounds(20,20,100,20);
	Phone_lb.setBounds(20,70,100,20);
	Id_lb.setBounds(20,70,100,20);
	
	
	Tfname_tf.setBounds(180,20,100,20);
	Tlname_tf.setBounds(180,70,100,20);
	Tid_tf.setBounds(180,70,100,20);
	
	insert_btn.setBounds(20,120,100,20);
	view_btn.setBounds(20,120,100,20);
	update_btn.setBounds(20,120,100,20);
	Delete_btn.setBounds(180,120,100,20);
		
	}








private void createWindow() {
	frame=new JFrame();
	
	frame.setTitle("Teacherapplet");
	frame.setBounds(20,20,380,200);
	frame.getContentPane().setBackground(Color.cyan);
	frame.getContentPane().setLayout(null);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(true);
	
	
	
	
	
}





@Override
public void actionPerformed(ActionEvent e) {

	if(e.getSource()==insert_btn) {
		if(Tfname_tf.getText()=="Hey"&& Tlname_tf.getText()=="Hey!@") {
			System.out.println("Your credintials are ok!");
		}else {
			System.out.println("Wrong credintials");
		}
	}
	if(e.getSource()==view_btn) {
		Tfname_tf.setText("");
		Tlname_tf.setText("");
	}
	
}

public static void main(String[]args) {
	Teacherapplet Applet=new Teacherapplet();
}



	}


