package question_one;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//your reg number is wrong 2305001214, but on this project it is 2305001212

public class GUI implements ActionListener {
	//label
		private JLabel fname_lb=new JLabel("fname");
		private JLabel sname_lb=new JLabel("sname");
		private JLabel number_lb=new JLabel("numbr");


		//text
		private JTextField fname_tf=new JTextField();
		private JTextField sname_tf=new JTextField();
		private JTextField number_tf=new JTextField();
		

		//button

		private JButton insert_btn=new JButton("insert");
		private JButton view_btn=new JButton("view");
		private JButton update_btn=new JButton("update");
		private JButton delete_btn=new JButton("delete");
		//constract
		//constructor
		public  GUI(){
			createWindow();
			setLocationAndSize();
			AddComponentsOnFrame();
			AddActionEvent();
			
		}
		private void createWindow() {
			JFrame frame = new JFrame();
			frame.setTitle("simple operation");
			frame.setBounds(20,20,250,350);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(true);
			// TODO Auto-generated method stub
			
		}
		private void setLocationAndSize() {
			
		
			id_lb.setBounds(20,20,100,30);
			name_lb.setBounds(150,200,100,30);
			position_lb.setBounds(20,1400,100,30);
	 		
			//text fields
			id_lb.setBounds(170,20,100,30);
			name_lb.setBounds(170,80,100,30);
			position_lb.setBounds(170,140,100,30);
		   
			
			//buttons
			insert_btn.setBounds(20,240,50,30);
			view_btn.setBounds(80,240,50,30);
			
			
			// TODO Auto-generated method stub
			
		}
		private void AddComponentsOnFrame() {
			
			// TODO Auto-generated method stub
			
		}
		private void AddActionEvent() {
			calculate_btn.addActionListener(this);
			result_btn.addActionListener(this);
			// TODO Auto-generated method stub
			   
		}
		public void actionPerformed(ActionEvent arg0) {
			
				
			// TODO Auto-generated method stub
			
		}
		public static void main(String[]args){

		
		
		public void actionPerformed1(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	 


}
