package questionOne;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class GUIEmployee implements ActionListener{
	private JFrame Jframe;
	// Labels
	private Label id_lb = new Label("ID : ");
	private Label name_lb = new Label("Name : ");
	private Label position_lb = new Label("Position: ");

	// Text fields
	private TextField id_tf = new TextField();
	private TextField name_tf = new TextField();
	private TextField position_tf = new TextField();

	// Buttons
	private Button insert_btn = new Button("Insert");
	private Button view_btn = new Button("View");
	private Button update_btn = new Button("Update");
	private Button delete_btn = new Button("Delete");


	// Constructor
	public GUIEmployee() {
		createWindow();
		setLocationAndSize();
		addComponentsToFrame();
		addActionEvent();
	}


	private void addActionEvent() {
		insert_btn.addActionListener(this);
		view_btn.addActionListener(this);
		update_btn.addActionListener(this);
		delete_btn.addActionListener(this);
		delete_btn.addActionListener(this);

	}	

	private void addComponentsToFrame() {
		Jframe.add(id_lb);
		Jframe.add(name_lb);
		Jframe.add(position_lb);
		Jframe.add(id_tf);
		Jframe.add(name_tf);
		Jframe.add(position_tf);
		Jframe.add(insert_btn);
		Jframe.add(view_btn);
		Jframe.add(update_btn);
		Jframe.add(delete_btn);	
	}

	private void setLocationAndSize() {
		id_lb.setBounds(20, 40, 100, 20);
		name_lb.setBounds(20, 70, 100, 20);
		position_lb.setBounds(20, 100, 100, 20);
		id_tf.setBounds(180, 40, 165, 20);
		name_tf.setBounds(180, 70, 165, 20);
		position_tf.setBounds(180, 100, 165, 20);
		insert_btn.setBounds(20, 150, 60, 20);
		view_btn.setBounds(90, 150, 60, 20);
		update_btn.setBounds(160, 150, 60, 20);
		delete_btn.setBounds(230, 150, 60, 20);
	}

	private void createWindow() {
		Jframe=new JFrame();
		Jframe.setTitle("2D_Shapes");
		Jframe.setBounds(20, 20, 400, 300);
		Jframe.getContentPane().setLayout(null);
		Jframe.getContentPane().setBackground(Color.LIGHT_GRAY);
		Jframe.setVisible(true);
		Jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Jframe.setResizable(true);

	}




	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == insert_btn) {
			String id = id_tf.getText();
			String name = name_tf.getText();
			String position = position_tf.getText();

			// Perform some action with the retrieved values
			System.out.println("Inserting Employee: ID = " + id + ", Name = " + name + ", Position = " + position);
			
			
		} else if (e.getSource() == view_btn) {
			 // Display information about the currently entered employee details
	        String id = id_tf.getText();
	        String name = name_tf.getText();
	        String position = position_tf.getText();
	        System.out.println("Employee Information: ID = " + id + ", Name = " + name + ", Position = " + position);
	    	
			
		} else if (e.getSource() == update_btn) {
			  // Perform action for update button
	        String id = id_tf.getText();
	        String name = name_tf.getText();
	        String position = position_tf.getText();
	        
	        // Perform update operation (if needed)
	        System.out.println("Updating Employee: ID = " + id + ", New Name = " + name + ", New Position = " + position);
	        
			
		} else if (e.getSource() == delete_btn) {
			String id = id_tf.getText();
	        String name = name_tf.getText();
	        String position = position_tf.getText();
	        System.out.println("");
	        System.out.println("");
	        System.out.println("");
		
		}
	}
	public static void main(String[] args) {
		GUIEmployee gu = new GUIEmployee();
	}
}
