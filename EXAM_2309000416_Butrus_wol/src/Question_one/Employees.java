package Question_one;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public abstract class Employees implements ActionListener {
	    
	    private Label id_Label  = new Label("id");
	    private Label name_Label  = new Label("name");
	    private Label position_Label  = new Label("position");
	    
	    private TextField id_Field = new TextField();
	    private TextField name_Field = new TextField();
	    private TextField position_Field = new TextField();
	    
	    private Button Insert_Button = new Button("Insert");
	    private Button View_Button = new Button("View");
	    private Button Update_Button = new Button("Update");
	    private Button Delete_Button = new Button("Delete");
	    
	    public Employees() {
	        createWindow();
	        setLocationAndSize();
	        addComponentsToFrame();
	        addActionEvent();
	    }

		private void addActionEvent() {
			Insert_Button.addActionListener(this);
	        View_Button.addActionListener(this);
	        Update_Button.addActionListener(this);
	        Delete_Button.addActionListener(this);
	        
		}

		private void addComponentsToFrame() {
			frame.add(id_Label );
	        frame.add(name_Label );
	        frame.add(position_Label );
	        
	        frame.add(id_Field);
	        frame.add(name_Field);
	        frame.add(position_Field);
	        
	        frame.add(Insert_Button);
	        frame.add(View_Button);
	        frame.add(Update_Button);
	        frame.add(Delete_Button);
	        
	     	
		}

		private void setLocationAndSize() {
			 id_Label .setBounds(50, 50, 150, 30);
		     name_Label .setBounds(50, 100, 150, 30);
		     position_Label .setBounds(50, 150, 150, 30);
		     
		     id_Field.setBounds(200, 50, 150, 30);
		     name_Field.setBounds(200, 100, 150, 30);
		     position_Field.setBounds(200, 150, 150, 30);
		     
		     Insert_Button.setBounds(100, 250, 80, 30);
		     View_Button.setBounds(200, 250, 150, 30);
		     Update_Button.setBounds(100, 250, 80, 30);
		     Delete_Button.setBounds(200, 250, 150, 30);
			
		}

		private void createWindow() {
			 frame = new Frame();
		        frame.setTitle(" Employees");
		        frame.setBounds(20, 200, 400, 300);
		        frame.setBackground(Color.GRAY);
		        frame.setLayout(null);
		        frame.setVisible(true);
		        frame.setResizable(false);

		        frame.addWindowListener(new WindowAdapter() {
		            public void windowClosing(WindowEvent e) {
		                System.exit(0);
		            }
		        });
			
		}
	    
	    
	    

}
