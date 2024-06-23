package questionOne;

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
public class GuiEmployee extends Employee {

	public GuiEmployee(int id, String name, String position) {
		super(id, name, position);
		
	}

public class Employee implements ActionListener {
	//label
    private Frame frame;
    private Label id1 = new Label("id:");
    private Label name1 = new Label("name:");
    private Label position1 = new Label("Interest Rate (per month):");
   
    //text fields
    private TextField id = new TextField();
    private TextField name = new TextField();
    private TextField position= new TextField();
    
    //Buttons
    private Button calculateButton = new Button("Calculate");
    private Button resetButton = new Button("Reset");

    // Constructor
    public Employee() {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        addActionEvent();
    }

    private void createWindow() {
        frame = new Frame();
        frame.setTitle("Loan Calculator");
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
        id1.setBounds(50, 50, 150, 30);
        name1.setBounds(50, 100, 150, 30);
        position1.setBounds(50, 150, 150, 30);
       
     id1.setBounds(200, 50, 150, 30);
        name1.setBounds(200, 100, 150, 30);
        position1.setBounds(200, 150, 150, 30);
       

        calculateButton.setBounds(100, 250, 80, 30);
        resetButton.setBounds(200, 250, 80, 30);
    }

    private void addComponentsToFrame() {
        frame.add(id1);
        frame.add(name1);
        frame.add(position1);
        frame.add(id1);
        frame.add(name1);
        frame.add(position1);
     
    }

    private void addActionEvent() {
        calculateButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double Amount = Double.parseDouble(AmountField.getText());
            int durationMonths = Integer.parseInt(durationField.getText());
            double monthlyInterestRate = Double.parseDouble(interestField.getText());

            // Calculate the total amount using the formula
            double totalAmount = Amount * (1 + (monthlyInterestRate * durationMonths) / 100);

            // Format the total amount to two decimal places
            DecimalFormat df = new DecimalFormat("#.0");

            if (e.getSource() == calculateButton) {
                resultField.setText(df.format(totalAmount));
            } else if (e.getSource() == resetButton) {
               id1.setText("");
             name1.setText("");
              position1.setText("");
              
            }
        } catch (NumberFormatException ex) {
            resultField.setText("Error: Invalid input");
        }
    }

    public void main(String[] args) {
        new Employee();
    }
}

}
