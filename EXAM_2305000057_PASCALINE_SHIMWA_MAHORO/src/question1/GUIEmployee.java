//Pascaline Shimwa2305000057
package question1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.HashMap;
import java.util.Map;


import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import javax.swing.JTextField;
import javax.swing.SwingUtilities;




public class GUIEmployee implements ActionListener{

	private JFrame frame;
	//labels
	private JLabel id_lb=new JLabel("id");
	private JLabel name_lb=new JLabel(" name");
	private JLabel position_lb=new JLabel("position");
	private JLabel level_lb=new JLabel("Level");
	//textfield
	private JTextField id_tf=new JTextField();
	private JTextField name_tf=new JTextField();
	private JTextField position_tf=new JTextField();
	//buttons
	private JButton Insert_btn=new JButton("Insert");
	private JButton View_btn=new JButton("View");
	private JButton Update_btn=new JButton("Update");
	private JButton Delete_btn=new JButton("Delete");

	private JRadioButton level1= new JRadioButton("1");
	private JRadioButton level2= new JRadioButton("2");
	private JRadioButton level3= new JRadioButton("3");
	private JRadioButton level4= new JRadioButton("4");
	private JRadioButton level5= new JRadioButton("5");


	private ButtonGroup levelGroup;

	private Map<String, String[]> Employee = new HashMap<>();
	//contract
	public  GUIEmployee() {
		InsertWindow();
		setLocationAndSIze();
		addComponentsToFrame();
		addActionEvent();
	}



	private void addActionEvent() {
		Insert_btn.addActionListener(this);
		View_btn.addActionListener(this);
		Update_btn.addActionListener(this);
		Delete_btn.addActionListener(this);


	}





	private void addComponentsToFrame() {
		// TODO Auto-generated method stub
		frame.add(id_lb);
		frame.add(name_lb);
		frame.add(id_tf);
		frame.add(name_tf);
		frame.add(position_lb);
		frame.add(position_tf);

		frame.add(Insert_btn);
		frame.add(View_btn);
		frame.add(Update_btn);
		frame.add(Delete_btn);
		frame.add(level_lb);
		frame.add(level1);
		frame.add(level2);
		frame.add(level3);
		frame.add(level4);
		frame.add(level5);

		levelGroup = new ButtonGroup();
		levelGroup.add(level1);
		levelGroup.add(level2);
		levelGroup.add(level3);
		levelGroup.add(level4);
		levelGroup.add(level5);


	}







	private void setLocationAndSIze() {
		// TODO Auto-generated method stub
		id_lb.setBounds(30, 30, 100, 30);
		name_lb.setBounds(30,70,100,30);
		position_lb.setBounds(30,110,100,30);

		level_lb.setBounds(30, 200, 100, 30);

		level1.setBounds(150, 200, 50, 30);
		level2.setBounds(200, 200, 50, 30);
		level3.setBounds(250, 200, 50, 30);
		level4.setBounds(300, 200, 50, 30);
		level5.setBounds(350, 200, 50, 30);

		id_tf.setBounds(150,30,200,30);
		name_tf.setBounds(150,70,200,30);
		position_tf.setBounds(150,110,200,30);


		//for buttons
		Insert_btn.setBounds(30,300,100,30);
		View_btn.setBounds(140,300,100,30);
		Update_btn.setBounds(250,300,100,30);
		Delete_btn.setBounds(360,300,100,30);


	}








	private void InsertWindow() {
		frame=new JFrame();

		frame.setTitle("Simple User Form");
		frame.setSize(500,400);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

	}


	public static void main(String[]args) {
		GUIEmployee GUIEmployee =new GUIEmployee();
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new GUIEmployee().setVisible(true);
			}
		});
	}



	protected void setVisible(boolean b) {
		// TODO Auto-generated method stub

	}



	@Override
	public void actionPerformed(ActionEvent e) {


		String id = id_tf.getText();

		if (e.getSource() == Insert_btn) {
			String level = getSelectedLevel();
			if (level == null) {
				JOptionPane.showMessageDialog(Insert_btn, this, "Please select a level", 0);
				return;
			}
			String[] userDetails = {
					id_tf.getText(),
					name_tf.getText(),
					position_tf.getText(),

					level
			};

			Employee.put(id, userDetails);
			JOptionPane.showMessageDialog(Insert_btn, this, "User Inserted successfully", 0);


		} else if (e.getSource() == View_btn) {
			if (Employee.containsKey(id)) {
				String[] userDetails1 = Employee.get(id);
				id_tf.setText(userDetails1[0]);
				name_tf.setText(userDetails1[1]);
				position_tf.setText(userDetails1[2]);

				setSelectedLevel(userDetails1[3]);
				JOptionPane.showMessageDialog(Insert_btn, this, "User Viewed successfully", 0);
			} else {
				JOptionPane.showMessageDialog(Insert_btn, this, "User not found", 0);
			}

		} else if (e.getSource() == Update_btn) {
			if (Employee.containsKey(id)) {
				String level1 = getSelectedLevel();
				if (level1 == null) {
					JOptionPane.showMessageDialog(Insert_btn, this, "Please select a level", 0);
					return;
				}
				String[] userDetails1 = Employee.get(id);
				userDetails1[0]=id_tf.getText();
				userDetails1[1] = name_tf.getText();
				userDetails1[2] = position_tf.getText();

				userDetails1[3] = level1;

				JOptionPane.showMessageDialog(Insert_btn, this, "User updated successfully", 0);
			} else {
				JOptionPane.showMessageDialog(Insert_btn, this, "User not found", 0);
			}

		} else if (e.getSource() == Delete_btn) {
			if (Employee.containsKey(id)) {
				Employee.remove(id);
				clearFields();
				JOptionPane.showMessageDialog(Insert_btn, this, "User deleted successfully", 0);
			} else {
				JOptionPane.showMessageDialog(Insert_btn, this, "User not found", 0);
			}
		}
	}


	private String getSelectedLevel() {
		if (level1.isSelected()) return "1";
		if (level2.isSelected()) return "2";
		if (level3.isSelected()) return "3";
		if (level4.isSelected()) return "4";
		if (level5.isSelected()) return "5";
		return null;
	}

	private void setSelectedLevel(String level) {
		switch (level) {
		case "1": level1.setSelected(true); break;
		case "2": level2.setSelected(true); break;
		case "3": level3.setSelected(true); break;
		case "4": level4.setSelected(true); break;
		case "5": level5.setSelected(true); break;
		}
	}



	private void clearFields() {
		id_tf.setText("");
		name_tf.setText("");
		position_tf.setText("");

		levelGroup.clearSelection();
	}





}




