package Calculator;

import LeapYear.LeapYear;

import javax.swing.*;

public class Calculator extends JFrame{
    private JTextField tfNumber1;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextArea lblResult;
    private JComboBox cbOperations;
    private JPanel jpanel;

    public Calculator(){
        Calculator a = this;
        boolean isTrue;

        btnCompute.addActionListener(e -> {
            String input1Text = tfNumber1.getText();
            String input2Text = tfNumber2.getText();

            int input_1 = Integer.parseInt(input1Text);
            int input_2 = Integer.parseInt(input2Text);
            int tot=0;

            if(cbOperations.getSelectedIndex()==0) {
                tot = input_1+input_2;
            }
            else if(cbOperations.getSelectedIndex()==1) {
                tot = input_2-input_1;
            }
            else if(cbOperations.getSelectedIndex()==2) {
                tot = input_1*input_2;
            }
            else if(cbOperations.getSelectedIndex()==2) {
                tot = input_1/input_2;
            }

            lblResult.append(String.valueOf(tot+ "\n"));
        });

    }

    public static void main(String[] args){
        Calculator app = new Calculator();
        app.setContentPane(app.jpanel);
        app.setSize(1000,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Calculator");
    }
};
