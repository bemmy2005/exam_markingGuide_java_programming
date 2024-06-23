package questionone;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI  implements ActionListener{
	JFrame frame;
	//labels
	private JLabel id_lb=new JLabel("id:");
	private JLabel name_lb=new JLabel("fullname:");
	private JLabel position_lb=new JLabel ("position:");
	//TextField
	private JTextField id_tf=new JTextField();
	private JTextField name_tf=new JTextField();
	private JTextField position_tf=new JTextField ();
	//Button
	
	private JButton insert_btn=new JButton("");
	private JButton view_btn=new JButton("");
	private JButton update_btn=new JButton("");
	private JButton Delete_btn=new JButton("");

	
	//Constructors
			public GUI() {
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
				frame.add(position_lb);
				// add TEXTField
				frame.add(id_tf);
				frame.add(name_tf);
				frame.add(position_tf);
				// add Button
				frame.add(insert_btn);
				frame.add(view_btn);
				frame.add(update_btn);
				frame.add(Delete_btn);
			}
			private void createWindow() {
				frame=new JFrame();
				frame.setTitle("GUI Employee");
				frame.setBounds(20, 20, 700, 600);
				frame.getContentPane().setLayout(null);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setResizable(true);
				// TODO Auto-generated method stub
				
			}



			private void setLocationAndSize() {//Labels
				id_lb.setBounds(20, 50, 120, 30);
				name_lb.setBounds(20, 100, 120, 30);
				position_lb.setBounds(20, 150, 120, 30);
		

				//Textfields
				id_tf.setBounds(170, 50, 120, 30);
				name_tf.setBounds(170, 100, 120, 30);
				position_tf.setBounds(170, 150, 120, 30);
		

				//Buttons
				insert_btn.setBounds(100, 250, 200, 30);
				view_btn.setBounds(100, 300, 200, 30);
				update_btn.setBounds(100, 300, 200, 30);
				Delete_btn.setBounds(100, 300, 200, 30);
		// TODO Auto-generated method stub
		
	}


			
			public static void main(String[] args) {
				GUI Cal=new GUI();

			}



			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		
		
	}


