package QUESTION_1;

import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIEmployee extends JFrame {

	private JFrame frame;
	private JLabel id=new JLabel("id");
	private JLabel name =new JLabel("name");
	private JLabel position =new JLabel("postion");

	private JTextField id_tf=new JTextField("");
	private JTextField name_tf=new JTextField("");
	private JTextField position_tf=new JTextField("");
	
	private JButton insert_btn=new JButton("insert");
	private JButton view_btn=new JButton("view");
	private JButton update_btn=new JButton("update");
	private JButton delete_btn=new JButton("delete");
	
	public GUIEmployee(){

		createWindow();
		SetLocationAndSize();
		AddComponentAndFrame1();
		//AddActionEvent();

}

	//private void AddActionEvent() {
		// TODO Auto-generated method stub

		private void AddActionEvent1(AbstractButton reset_btn, AbstractButton back_btn) {
			update_btn.addActionListener((ActionListener) this);
			reset_btn.addActionListener((ActionListener) this);
			back_btn.addActionListener((ActionListener) this);

		}



		private void AddComponentAndFrame1() {

			//lABEL

			frame.add(id);
			frame.add(name);
			frame.add(position);
			
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

	private void AddComponentAndFrame() {
		// TODO Auto-generated method stub
		
	}

	private void SetLocationAndSize() {
		// TODO Auto-generated method stub
		
	}

	private void createWindow() {
		// TODO Auto-generated method stub
		
	}
	}
