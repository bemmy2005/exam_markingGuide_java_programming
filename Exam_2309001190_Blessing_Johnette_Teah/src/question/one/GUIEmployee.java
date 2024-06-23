package question.one;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUIEmployee extends JFrame implements ActionListener{
	
	JFrame frame;
	//label
	JLabel id_lb = new JLabel("ID");
	JLabel name_lb = new JLabel("Name");
	JLabel position_lb = new JLabel("Position");
	
	//textfield
	JTextField id_tf = new JTextField();
	JTextField name_tf = new JTextField();
	JTextField position_tf = new JTextField();
	
	//buttons
	JButton insert_btn = new JButton("Insert");
	JButton view_btn = new JButton("View");
	JButton update_btn = new JButton("Update");
	JButton delete_btn = new JButton("Delete");
	
	
	public GUIEmployee()
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
		 position_lb.setBounds(20, 140, 100, 30);
		
		
		//Text fields
		id_tf.setBounds(150, 20, 100, 30);
		 name_tf.setBounds(150, 80, 100,30);
		 position_tf.setBounds(150, 140, 100, 30);
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
		frame.add(position_lb);
		//textfield
		frame.add(id_tf);
		frame.add(name_tf);
		frame.add(position_tf);
		//button
		frame.add(insert_btn);
		frame.add(view_btn);
		frame.add(update_btn);
		frame.add(delete_btn);
		
	}

	private void createWindow() {
		frame = new JFrame();
		frame.setTitle("Employee");
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(20, 20, 400, 300);
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 

		
	@Override
	public void actionPerformed(ActionEvent c) {
		
		Employee em=new Employee();
	if(c.getSource()==insert_btn) {
		em.setId(Integer.parseInt(id_tf.getText()));
		em.setName(name_tf.getText());
		em.setPosition(position_tf.getText());
		em.insertDataIntoDatabase();
	}else if(c.getSource()==view_btn){
		em.view(Integer.parseInt(id_tf.getText()));
		name_tf.setText(em.getName());
		position_tf.setText(em.getPosition());
		
	}else if(c.getSource()==update_btn) {
		int id=Integer.parseInt(id_tf.getText());
		em.setName(name_tf.getText());
		em.setPosition(position_tf.getText());
		
		em.update(id);
	}else if (c.getSource()==delete_btn) {
		int id=Integer.parseInt(id_tf.getText());
		em.delete(id);
	}
	}
	public static void main(String[] args) {
		GUIEmployee ge = new GUIEmployee();
		
		
	}

	

}
