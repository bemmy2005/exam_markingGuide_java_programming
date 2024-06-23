package questinthree;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import questionone.GUI;

public class Applet implements ActionListener{
	JFrame frame;
	//labels
	private JLabel id_lb=new JLabel("id:");
	private JLabel name_lb=new JLabel("fullname:");
	private JLabel subject_lb=new JLabel("code of subject:");
	////TextField
	private JTextField id_tf=new JTextField();
	private JTextField name_tf=new JTextField();
	private JTextField subject_tf=new JTextField ();
	//Button
	
		private JButton insert_btn=new JButton("");
		private JButton view_btn=new JButton("");
		private JButton update_btn=new JButton("");
		private JButton Delete_btn=new JButton("");
		//Constructors
		public Applet() {
			createWindow();
			setLocationAndSize();
			addComponentsOnFrame();
			addActionEvent();	
		}
	

	private void addActionEvent() { 
		insert_btn.addActionListener(this);
		view_btn.addActionListener(this);
		update_btn.addActionListener(this);
		Delete_btn.addActionListener(this);
			// TODO Auto-generated method stub
			
		}


	private void addComponentsOnFrame() { 
		// add frame
		frame.add(id_lb);
		frame.add(name_lb);
		frame.add(subject_lb);
		// add TEXTField
		frame.add(id_tf);
		frame.add(name_tf);
		frame.add(subject_tf);
		// add Button
		frame.add(insert_btn);
		frame.add(view_btn);
		frame.add(update_btn);
		frame.add(Delete_btn);
		
		
			// TODO Auto-generated method stub
			
		}


	private void setLocationAndSize() { 
		
		id_lb.setBounds(20, 50, 120, 30);
		name_lb.setBounds(20, 100, 120, 30);
		subject_lb.setBounds(20, 150, 120, 30);


		//Textfields
		id_tf.setBounds(170, 50, 120, 30);
		name_tf.setBounds(170, 100, 120, 30);
		subject_tf.setBounds(170, 150, 120, 30);


		//Buttons
		insert_btn.setBounds(100, 250, 200, 30);
		view_btn.setBounds(100, 300, 200, 30);
		update_btn.setBounds(100, 300, 200, 30);
		Delete_btn.setBounds(100, 300, 200, 30);
			// TODO Auto-generated method stub
			
		}


	private void createWindow() { 
		
		
		frame=new JFrame();
		frame.setTitle("Applet");
		frame.setBounds(20, 20, 700, 600);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
			// TODO Auto-generated method stub
			
		}


	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	} 
	
	public static void main(String[] args) {
		Applet pt=new Applet();
}
}

