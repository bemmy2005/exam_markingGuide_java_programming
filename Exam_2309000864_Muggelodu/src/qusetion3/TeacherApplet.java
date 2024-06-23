package qusetion3;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.sql.*;

	public class TeacherApplet extends JFrame implements ActionListener {

	    // Labels
	    JLabel idLabel = new JLabel("ID:");
	    JLabel nameLabel = new JLabel("Name:");
	    JLabel subjectLabel = new JLabel("Subject:");

	    // Text fields
	    JTextField idField = new JTextField();
	    JTextField nameField = new JTextField();
	    JTextField subjectField = new JTextField();

	    // Buttons
	    JButton insertButton = new JButton("Insert");
	    JButton viewButton = new JButton("View");
	    JButton updateButton = new JButton("Update");
	    JButton deleteButton = new JButton("Delete");

	    public TeacherApplet() {
	        createWindow();
	        setLocationAndSize();
	        addComponentsToTheWindow();
	        addActionEvent();
	    }

	    private void createWindow() {
	        setTitle("Teacher Management");
	        setBounds(100, 100, 400, 300);
	        getContentPane().setLayout(null);
	        setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setResizable(false);
	        getContentPane().setBackground(Color.lightGray);
	    }

	    private void setLocationAndSize() {
	        idLabel.setBounds(20, 20, 100, 30);
	        nameLabel.setBounds(20, 70, 100, 30);
	        subjectLabel.setBounds(20, 120, 100, 30);

	        idField.setBounds(130, 20, 200, 30);
	        nameField.setBounds(130, 70, 200, 30);
	        subjectField.setBounds(130, 120, 200, 30);

	        insertButton.setBounds(20, 170, 80, 30);
	        viewButton.setBounds(110, 170, 80, 30);
	        updateButton.setBounds(200, 170, 80, 30);
	        deleteButton.setBounds(290, 170, 80, 30);
	    }

	    private void addComponentsToTheWindow() {
	        add(idLabel);
	        add(nameLabel);
	        add(subjectLabel);

	        add(idField);
	        add(nameField);
	        add(subjectField);

	        add(insertButton);
	        add(viewButton);
	        add(updateButton);
	        add(deleteButton);
	    }

	    private void addActionEvent() {
	        insertButton.addActionListener(this);
	        viewButton.addActionListener(this);
	        updateButton.addActionListener(this);
	        deleteButton.addActionListener(this);
	    }

	    public static void main(String[] args) {
	        new TeacherApplet();
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == insertButton) {
	            insertTeacher();
	        } else if (e.getSource() == viewButton) {
	            viewTeacher();
	        } else if (e.getSource() == updateButton) {
	            updateTeacher();
	        } else if (e.getSource() == deleteButton) {
	            deleteTeacher();
	        }
	    }

	    private Connection getConnection() throws SQLException {
	        String dbUrl = "jdbc:mysql://localhost:3306/exam2";
	        String dbUsername = "root";
	        String dbPassword = "";
	        return DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
	    }

	    private void insertTeacher() {
	        Teacher teacher = new Teacher();
	        teacher.setId(Integer.parseInt(idField.getText()));
	        teacher.setName(nameField.getText());
	        teacher.setSubject(subjectField.getText());

	        String sql = "INSERT INTO teacher (id, name, subject) VALUES (?, ?, ?)";

	        try (Connection con = getConnection();
	             PreparedStatement pstmt = con.prepareStatement(sql)) {
	            pstmt.setInt(1, teacher.getId());
	            pstmt.setString(2, teacher.getName());
	            pstmt.setString(3, teacher.getSubject());
	            pstmt.executeUpdate();
	            JOptionPane.showMessageDialog(this, "Teacher Inserted Successfully!");
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	            JOptionPane.showMessageDialog(this, "Error inserting teacher!");
	        }
	    }

	    private void viewTeacher() {
	        int id = Integer.parseInt(idField.getText());

	        String sql = "SELECT * FROM teacher WHERE id = ?";

	        try (Connection con = getConnection();
	             PreparedStatement pstmt = con.prepareStatement(sql)) {
	            pstmt.setInt(1, id);
	            ResultSet rs = pstmt.executeQuery();

	            if (rs.next()) {
	                nameField.setText(rs.getString("name"));
	                subjectField.setText(rs.getString("subject"));
	            } else {
	                JOptionPane.showMessageDialog(this, "Teacher not found!");
	            }
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	            JOptionPane.showMessageDialog(this, "Error viewing teacher!");
	        }
	    }

	    private void updateTeacher() {
	        Teacher teacher = new Teacher();
	        teacher.setId(Integer.parseInt(idField.getText()));
	        teacher.setName(nameField.getText());
	        teacher.setSubject(subjectField.getText());

	        String sql = "UPDATE teacher SET name = ?, subject = ? WHERE id = ?";

	        try (Connection con = getConnection();
	             PreparedStatement pstmt = con.prepareStatement(sql)) {
	            pstmt.setString(1, teacher.getName());
	            pstmt.setString(2, teacher.getSubject());
	            pstmt.setInt(3, teacher.getId());
	            pstmt.executeUpdate();
	            JOptionPane.showMessageDialog(this, "Teacher Updated Successfully!");
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	            JOptionPane.showMessageDialog(this, "Error updating teacher!");
	        }
	    }

	    private void deleteTeacher() {
	        int id = Integer.parseInt(idField.getText());

	        String sql = "DELETE FROM teacher WHERE id = ?";

	        try (Connection con = getConnection();
	             PreparedStatement pstmt = con.prepareStatement(sql)) {
	            pstmt.setInt(1, id);
	            pstmt.executeUpdate();
	            JOptionPane.showMessageDialog(this, "Teacher Deleted Successfully!");
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	            JOptionPane.showMessageDialog(this, "Error deleting teacher!");
	        }
	    }
	}


