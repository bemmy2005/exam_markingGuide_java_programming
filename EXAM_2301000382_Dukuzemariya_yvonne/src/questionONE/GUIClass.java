package questionONE;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class GUIClass implements ActionListener {
	private static final Component Update_btn = null;
	private static final Component Delete_btn1 = null;
	private JFrame frame;
	//labels
	private JLabel id_lb=new JLabel("id");
	private JLabel name_lb=new JLabel(" name");
	private JLabel positon_lb=new JLabel("position");
	
//textfield
	private JTextField id_tf=new JTextField();
	private JTextField name_tf=new JTextField();
	private JTextField positon_tf1=new JTextField();
	//buttons
	private JButton Insert_btn=new JButton("Insert");
	private JButton View_btn=new JButton("View");
	private JButton Update_btn1=new JButton("Update");
	private JButton Delete_btn=new JButton("Delete");
	
	//contract
	private AbstractButton positon_tf;
	private AbstractButton position_tf;
	private char[] positon;
	public GUIClass() {
		createWindow();
		setLocationAndSIze();
		addComponentsToFrame();
		addActionEvent();
	}



private void addActionEvent() {
		Insert_btn.addActionListener(this);
		View_btn.addActionListener(this);
		View_btn.addActionListener(this);
		((AbstractButton) Delete_btn1).addActionListener(this);
		
		
	}





private void addComponentsToFrame() {
		// TODO Auto-generated method stub
	frame.add(id_lb);
	frame.add(name_lb);
	frame.add(id_tf);
	frame.add(name_tf);
	frame.add(positon_lb);
	frame.add(position_tf);
	frame.add(Insert_btn);
	frame.add(View_btn);
	frame.add(Update_btn);
	frame.add(Delete_btn1);
}






private void setLocationAndSIze() {
		// TODO Auto-generated method stub
	id_lb.setBounds(30,30,100,30);
	name_lb.setBounds(30,80,100,30);
	id_tf.setBounds(150,30,200,30);
	name_tf.setBounds(150,80,200,30);
	positon_lb.setBounds(30,130,100,30);
	position_tf.setBounds(150,130,200,30);
	
	
	Insert_btn.setBounds(100,200,60,30);
	View_btn.setBounds(170,200,60,30);
	Update_btn.setBounds(240,200,60,30);
	Delete_btn1.setBounds(310,200,60,30);
		
	}








private void createWindow() {
	frame=new JFrame();
	
	frame.setTitle("Simple Calculator");
	frame.setSize(500,300);
	frame.getContentPane().setBackground(Color.GRAY);
	frame.getContentPane().setLayout(null);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(true);
	
	
	
	
	
}


public static void main(String[]args) {
	GUIClass lgfrm=new GUIClass();
}



public void actionPerformed(ActionEvent e) {
	try {
        int num1 = Integer.parseInt(id_tf.getText());
        int num2 = Integer.parseInt(name_tf.getText());
        int positon = 0;

        if (e.getSource() == Insert_btn) {
           positon = num1+num2;
        } else if (e.getSource() ==View_btn) {
           positon = num1 - num2;
        } else if (e.getSource() ==Update_btn) {
           positon = num1 * num2;
        } else if (e.getSource() == Delete_btn1) {
           positon = num1 / num2;
        
        }
        if(e.getSource()==Delete_btn){
        	id_tf.setText("");
			name_tf.setText("");
			position_tf.setText("");
			
			
		}
		

       positon_tf1.setText(String.valueOf(positon));
    } catch (NumberFormatException ex) {
        System.out.println("Please enter valid numbers"+"Error"+ JOptionPane.ERROR_MESSAGE);
    }
	
}




}





