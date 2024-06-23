package question.three;

import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import question.one.Employee;

public class TeacherApplet extends Applet implements ActionListener{
	JFrame frame;
	

		
		//label
		JLabel id_lb = new JLabel("ID");
		JLabel name_lb = new JLabel("Name");
		JLabel subject_lb = new JLabel("Subject");
		
		//textfield
		JTextField id_tf = new JTextField();
		JTextField name_tf = new JTextField();
		JTextField subject_tf = new JTextField();
		
		//buttons
		JButton insert_btn = new JButton("Insert");
		JButton view_btn = new JButton("View");
		JButton update_btn = new JButton("Update");
		JButton delete_btn = new JButton("Delete");
		
		
		public TeacherApplet()
		{
			createWindow();
			addcomponentsToFrame();
			addSizeandLocation();
			addActionEvents();
		}

		private void addActionEvents() {
			delete_btn.addActionListener(this);
			insert_btn.addActionListener(this);
			view_btn.addActionListener(this);
			update_btn.addActionListener(this);
			
		}

		private void addSizeandLocation() {
			
			//Labels
			
			id_lb.setBounds(20, 20, 100, 30); 
			 name_lb.setBounds(20, 80, 100, 30); 
			 subject_lb.setBounds(20, 140, 100, 30);
			
			
			//Text fields
			id_tf.setBounds(150, 20, 100, 30);
			 name_tf.setBounds(150, 80, 100,30);
			 subject_tf.setBounds(150, 140, 100, 30);
			//button
			insert_btn.setBounds(20, 200, 80, 30);
			delete_btn.setBounds(105, 200, 80, 30);
			view_btn.setBounds(180, 200, 80, 30);
			update_btn.setBounds(250, 200, 80, 30);
		}

		private void addcomponentsToFrame() {
			//label
			frame.add(id_lb);
			frame.add(name_lb);
			frame.add(subject_lb);
			//textfield
			frame.add(id_tf);
			frame.add(name_tf);
			frame.add(subject_tf);
			//button
			frame.add(insert_btn);
			frame.add(view_btn);
			frame.add(update_btn);
			frame.add(delete_btn);
			
		}

		private void createWindow() {
			frame = new JFrame();
			frame.setTitle("Teacher Applet");
			frame.setVisible(true);
			frame.getContentPane().setLayout(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setBounds(20, 20, 400, 300);
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
				Employee em= new Employee();
				if(e.getSource() == insert_btn)
				{
					em.setId(Integer.parseInt(id_tf.getText()));
					em.setName(name_tf.getText());
					em.setPosition(subject_tf.getText());
					em.insertDataIntoDatabase();
				}
				
		}
	}


