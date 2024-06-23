package Question1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Emloyeeclass implements ActionListener {
	public JFrame frame;  
	/// label
	 private JLabel id_lb=new JLabel("id");
	 private JLabel name_lb=new JLabel("name");
	 private JLabel insert_lb=new JLabel("insert");
	 private JLabel view_lb=new JLabel("view");
	 private JLabel updete_lb=new JLabel("update");
	 private JLabel position_lb=new JLabel("update");
	 
	 //TextField
	 private JTextField  id_tf=new JTextField();
	 private JTextField name_tf=new JTextField();
	 private JTextField position_tf=new JTextField();
	 
	//button
	 
	 private JButton insert_tf=new JButton();
	 private JButton update_tf=new JButton();
	 private JButton view_tf=new JButton();
	 private JButton delete_tf=new JButton();
	 
	//construct 
	 public  employeeclass(){
	 createwindows();
	 setLocationandArea();
	 AddComponenstonFrame();
	 AddActionEvents();
			
	 
		
	}

	private void AddActionEvents() {
		// TODO Auto-generated method stub
		
	}

	private void AddComponenstonFrame() {
		
	
		
	}

	private void setLocationandArea() {
		// TODO Auto-generated method stub
		//Labels
				id_lb.setBounds(20, 50, 120, 30);
				name_lb.setBounds(20, 100, 120, 30);
		
				insert_lb.setBounds(20, 200, 120, 30);

				//Textfields
				id_tf.setBounds(170, 50, 120, 30);
				name_tf.setBounds(170, 100, 120, 30);
	            position_tf.setBounds(170, 150, 120, 30);
				

				//Buttons
	            insert_btn.setBounds(20, 200, 120, 30);
			}
	}

	private void createwindows() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
