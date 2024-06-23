package qwestion1;
 



import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;

public class GULClass implements ActionListener {
    private Frame frame;
    private Label idJLabel = new Label("id:");
    private Label namejLabel = new Label("name:");
    private Label positionJLabel = new Label("position:");
    

    private TextField idjField = new TextField();
    private TextField nameJField = new TextField();
    private TextField positionjField = new TextField();
    

    private Button insertJButton = new Button("insert");
    private Button veiwJButton = new Button("view");
    private Button updateJButton = new Button("update");
    private Button deleteJButton = new Button("delete");
    // Constructor
    public GULClass() {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        addActionEvent();
    }

    private void createWindow() {
        frame = new Frame();
        frame.setTitle("");
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

    private void setLocationAndSize() {
        idJLabel.setBounds(50, 50, 150, 30);
        namejLabel.setBounds(50, 100, 150, 30);
        positionJLabel.setBounds(50, 150, 150, 30);
        

        idjField.setBounds(200, 50, 150, 30);
        nameJField.setBounds(200, 100, 150, 30);
        positionjField.setBounds(200, 150, 150, 30);
       

        insertJButton.setBounds(100, 250, 80, 30);
        updateJButton.setBounds(200, 250, 80, 30);
        updateJButton.setBounds(100, 250, 80, 30);
        deleteJButton.setBounds(200, 250, 80, 30);
    }

    private void addComponentsToFrame() {
        frame.add(idJLabel);
        frame.add(namejLabel);
        frame.add(positionJLabel);
        
        frame.add(idjField);
        frame.add(nameJField);
        frame.add(positionjField);
        
        frame.add(insertJButton);
        frame.add(deleteJButton);
        frame.add(updateJButton);
        frame.add(deleteJButton);
    }
    private void addActionEvent() {
        insertJButton.addActionListener(this);
        veiwJButton.addActionListener(this);
        updateJButton.addActionListener(this);
        deleteJButton.addActionListener(this);
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
    

    
    
}




   