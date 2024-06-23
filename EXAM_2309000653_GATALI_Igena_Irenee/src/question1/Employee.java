package question1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Employee implements ActionListener{

	private JFrame frame;
	//label
	private JLabel id_lb=new JLabel("id");
	private JLabel name_lb=new JLabel(" name");
	private JLabel position_lb=new JLabel("position");

	//text
	private JTextField id_tf=new JTextField("");
	private JTextField name_tf=new JTextField("");
	private JTextField position_tf=new JTextField("");
	//button
	private JButton Insert_btn=new JButton("Insert");
	private JButton View_btn=new JButton("View");
	private JButton Update_btn=new JButton("update");
	private JButton Delete_btn=new JButton("delete");
	//construct
	public Employee() {
			InsertWindow();
			setLocationAndSize();
			addComponentsOntheFrame();
			addactionEvent();
		}

		private void addactionEvent() {
			Insert_btn.addActionListener(this);
			View_btn.addActionListener(this);
			Update_btn.addActionListener(this);
			Delete_btn.addActionListener(this);
		
	}

		private void addComponentsOntheFrame() {
			//label
			frame.add(id_lb);
			frame.add(name_lb);
			frame.add(position_lb);
			//field
			frame.add(id_tf);
			frame.add(name_tf);
			frame.add(position_tf);
			//button
			frame.add(Insert_btn);
			frame.add(View_btn);
			frame.add(Update_btn);
			frame.add(Delete_btn);
		
	}

		private void setLocationAndSize() {
			//label
					id_lb.setBounds(20,20,100,30);
					name_lb.setBounds(20,80,100,30);
					position_lb.setBounds(20,140,100,20);
					//field
					id_tf.setBounds(180,20,100,20);
					name_tf.setBounds(180,80,100,20);
					position_tf.setBounds(180,140,100,20);
					//button
					Insert_btn.setBounds(20,200,100,20);
					View_btn.setBounds(100,200,100,20);
					Update_btn.setBounds(180,200,100,20);
					Delete_btn.setBounds(260,200,100,20);
		
	}

		private void InsertWindow() {
			frame=new JFrame();
			frame.setTitle("Employee form");
			frame.setBounds(40,200,480,300);
			frame.getContentPane().setBackground(Color.GRAY);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(true);
	
	    }

		public static void main(String[] args) {
			Employee employee=new Employee();

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==Insert_btn) {
				int id=Integer.parseInt(id_tf.getText());
				//integer.toString(res);
				String position=String.valueOf(position_tf.getText());
				String name=String.valueOf(name_tf.getText());
				
			}else if(e.getSource()==View_btn) {
				System.out.println("person information are follow:");
				System.out.println("my id:"+id_tf.getText());
				System.out.println("my names:"+name_tf.getText());
				System.out.println("my position:"+position_tf.getText());
			}else if (e.getSource()==Update_btn) {
				update();
			}else if(e.getSource()==Delete_btn) {
				id_tf.setText("");
				name_tf.setText("");
				position_tf.setText("");

			
			
			}
		
		}

		private void update() {
			// TODO Auto-generated method stub
			
		}

	}


