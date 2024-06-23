import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIEmployee {
	


	private static final Container frame_tf = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frome;
		
		//labels
		JLabel id_lb=new JLabel("id");
		JLabel name_lb=new JLabel("name");
		JLabel position_lb=new JLabel("position");
		//Textfailds
		
		
		
		TextField id_tf=new TextField("");
	TextField name_tf=new TextField("");
	TextField position_tf=new TextField("");
	//JBUTTOM
	JButton Insert_btn=new JButton("Insert");
	JButton View_btn=new JButton("View");
	JButton Update_btn=new JButton("Update");
	JButton Delete_btn=new JButton("Delete");


	private Object id_lb;	
	private Object name_lb;
	private Component position_lb;
	
	
	private Object position_tf;
	private Object name_tf;
	private Object id_tf;
	//constructor
		public GUIEmployee() {
			
		
		CeateWindow();
		setLocotionAndSize();
		AddActionEvent();
		AddComponentsTOfrome();
		
		
		
		private void addComponentsToFrame() {
			
			Frame.add( id_lb);
			frame_tf.add(name_lb);
			frame_tf.add(position_lb);
			frame_tf.add(position_lb);
		
		}
		frame_btn.add(Insert_btn);
		frame_btn.add(View_btn);
		frame_btn.add(Update_btn);
		frame_btn.add(Delete_btn);
		
	private void addActionEvent() {
		
	}
		insert_btn.addActionListener(this)
		view_btn.addActionListener(this);
		update_btn.addActionListener(this);
		delete_btn.addActionListener(this);
		
		private void setLocationAndSize() {
		
		id_lb.setBounds(10,10,60,25);
		name_lb.setBounds(10,10,60,25);
		position_lb.setBounds(10,10,80,25);
		id_tf.setBounds(10,10,80,25);
		name_tf.setBounds(10,10,80,25);
		position_tf.setBounds(10,10,80,25);
		Insert_btn.setBounds(10,10,80,25);
		View_btn.setBounds(10,10,80,25);
		Update_btn.setBounds(10,10,80,25);
		Delete_btn.setBounds(10,10,80,25);

		private void createWindow() {
			frame=new JFrame();
			Frame.set titile("");
			frame.setBounds(10,10,50,25);
			frame.setbackground(calor. RED);
			frame.setvisible(null);
			frame.setloyerout(true);
			frame.setrezible(false);
		
			
			public void ActionPerformed(Action )
			
			(get)