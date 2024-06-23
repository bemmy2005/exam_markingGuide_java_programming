package question_three;
//your reg number is wrong 2305001214, but on this project it is 2305001212
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TeacherApplet  implements ActionListener{
	private JFrame frame;
	//labels
	private JLabel fname_lb=new JLabel("fname");
	private JLabel sname_lb=new JLabel("sname");
	private JLabel fullname_lb=new JLabel("fullname");
	//TextField
	private JTextField fname_tf=new JTextField();
	private JTextField sname_tf1=new JTextField();
	private JTextField fullname_tf=new JTextField();
	//buttons
	private JButton insert_btn=new JButton("insert");
	private JButton view_btn=new JButton("view");
	private JButton update_btn=new JButton("update");
	private JButton delete_btn=new JButton("delete");
	private Component sname_tf;
	
	//constructor
		public  TeacherApplet(){
			createWindow();
			setLocationAndSize();
			AddComponentsOnFrame();
			AddActionEvent();
			
		}
		private void createWindow() {
			frame=new JFrame();
			frame.setTitle("TeacherApplet");
			frame.setBounds(20,20,250,350);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(true);
			// TODO Auto-generated method stub
			
		}
		private void setLocationAndSize() {
			fname_lb.setBounds(20,20,100,30);
			sname_lb.setBounds(150,200,100,30);
			fullname_lb.setBounds(20,1400,100,30);
	 		
			//text fields
			fname_lb.setBounds(170,20,100,30);
			sname_lb.setBounds(170,80,100,30);
			fullname_lb.setBounds(170,140,100,30);
		  
			
			//buttons
			insert_btn.setBounds(20,240,50,30);
			view_btn.setBounds(80,240,50,30);
			update_btn.setBounds(20,240,50,30);
			delete_btn.setBounds(80,240,50,30);
			
			
			// TODO Auto-generated method stub
			
		}
		private void AddComponentsOnFrame() {
		    
			frame.add(fname_lb);
			frame.add(sname_lb);
			frame.add(fullname_lb);
		
			//Text fields
			frame.add(fname_tf);
			frame.add(sname_tf);
			frame.add(fullname_lb);
		
			//button
			frame.add(insert_btn);
			frame.add(view_btn);
			frame.add(update_btn);
			frame.add(delete_btn);
			// TODO Auto-generated method stub
			
		}
		private void AddActionEvent() {
			insert_btn.addActionListener(this);
			view_btn.addActionListener(this);
			update_btn.addActionListener(this);
			delete_btn.addActionListener(this);
			
			// TODO Auto-generated method stub
			   
		}
		public void actionPerformed(ActionEvent e) {
			
				
			// TODO Auto-generated method stub
			
		}
		public static void main(String[]args){
			TeacherApplet ta= new TeacherApplet();
		}



		
	}


