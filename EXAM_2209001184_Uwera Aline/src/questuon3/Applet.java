package questuon3;

import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Applet extends Applet {
	//labels
	private JLabel id_lb=new JLabel("id");
	private JLabel name_lb=new JLabel("name");
	private JLabel subject_lb=new JLabel("subject");
//
	//textfield
	private JTextField id_tf=new JTextField();
	private JTextField name_tf=new JTextField();
	private JTextField subject_tf=new JTextField();
	//Buttons
	private JButton insert_btn=new JButton("insert");
	private JButton view_btn=new JButton("view");
	private JButton update_btn=new JButton("update");
	private JButton delete_btn=new JButton("delete");
	private Container id;
	private Container name;
	private Container frame;
	//constructor
	public Applet(){
			CreateWindow();
			setLocationandSize();
			addComponentsonTheFrame();
			addActionEvent();
			
		}
	
	private void addActionEvent() 
	{
    insert_btn.addActionListener((ActionListener)this);
	view_btn.addActionListener((ActionListener) this);
	update_btn.addActionListener((ActionListener) this);
	delete_btn.addActionListener((ActionListener) this);
	
		
	}

	private void addComponentsonTheFrame() {
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

	private void setLocationandSize() {
		id_lb.setBounds(30,60,100,20);
	name_lb.setBounds(30,100,100,20);
	subject_lb.setBounds(30,140,100,20);
	
	//textfield
	id_tf.setBounds(170,60,100,20);
	name_tf.setBounds(170,100,100,20);
	subject_tf.setBounds(170,140,100,20);
	
	//Buttons
	insert_btn.setBounds(100,230,100,20);
	view_btn.setBounds(100,280,100,20);
	update_btn.setBounds(100,300,100,20);
	delete_btn.setBounds(100,320,100,20);
	
	
		
		
	}

	private void CreateWindow() {
		frame= new JFrame();
		frame.setName("APPLET");
		frame.setBounds(160,230,340,450);
		frame.setVisible(true);
		((JFrame) frame).getContentPane().setLayout(null);
		
		
		
		
	}

	public static void main(String[] args) {
		if(e.getSource()==APPLET_btn){
			int id=Integer.parseInt(id_tf.getText());
			String name=String.parseInt(name_tf.getText());
			String interest=String.parseInt(Stringrest_tf.getText());
			
			//Integer.toString(res);
		
		}
		else{
			id_tf.setText(" ");
			name_tf.setText(" ");
			subject_tf.setText(" ");
			
	}
		
		

	}
	public static void main1(String[] args){
        Applet app=new Applet();	
}

}
