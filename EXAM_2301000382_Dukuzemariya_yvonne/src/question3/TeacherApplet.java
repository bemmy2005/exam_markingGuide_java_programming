package question3;




import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class  TeacherApplet  implements ActionListener{
	

		private JFrame frame;
		//labels
		private JLabel Insert_lb=new JLabel("Insert");
		private JLabel View_lb=new JLabel(" View");
		private JLabel Update_lb=new JLabel("Update");
	//textfield
		private JTextField Insert_tf=new JTextField();
		private JTextField View_tf=new JTextField();
		private JTextField Update_tf=new JTextField();
		//buttons
		private JButton insert_btn=new JButton("insert");
		private JButton View_btn=new JButton("View");
		private JButton Update_btn=new JButton("Upadate");
		private JButton delete_btn=new JButton("delete");
		
		private AbstractButton Updatet_btn;
		//contract
		public TeacherApplet() {
			createWindow();
			setLocationAndSIze();
			addComponentsToFrame();
			addActionEvent();
		}



	private void addActionEvent() {
			insert_btn.addActionListener(this);
			View_btn.addActionListener(this);
			Updatet_btn.addActionListener(this);
			delete_btn.addActionListener(this);
			
			
		}





	private void addComponentsToFrame() {
			// TODO Auto-generated method stub
		frame.add(Insert_lb);
		frame.add(View_lb);
		frame.add(Insert_tf);
		frame.add(View_tf);
		frame.add(Update_lb);
		frame.add(Update_tf);
		frame.add(insert_btn);
		frame.add(View_btn);
		frame.add(Update_btn);
		frame.add(delete_btn);
		
	}







	private void setLocationAndSIze() {
			// TODO Auto-generated method stub
		Insert_lb.setBounds(30,30,100,30);
		View_lb.setBounds(30,80,100,30);
		Insert_tf.setBounds(150,30,200,30);
		View_tf.setBounds(150,80,200,30);
		Update_lb.setBounds(30,130,100,30);
		Update_tf.setBounds(150,130,200,30);
		
		insert_btn.setBounds(30,180,60,30);
		View_btn.setBounds(100,180,60,30);
		Update_btn.setBounds(170,180,60,30);
		delete_btn.setBounds(240,180,60,30);
		
			
		}








	private void createWindow() {
		frame=new JFrame();
		
		frame.setTitle("Simple insert");
		frame.setSize(400,300);
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		
		
		
		
	}





	public void actionPerformed1(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	



	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	}







