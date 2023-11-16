package FoodOrder;

import LeapYear.LeapYear;

import javax.swing.*;

public class FoodOrder extends JFrame{
    private JCheckBox cSundae;
    private JCheckBox cTea;
    private JCheckBox cSoftDrinks;
    private JCheckBox cFries;
    private JCheckBox cBurger;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;
    private JPanel jpanel;

    public FoodOrder(){
        FoodOrder a = this;
        boolean isTrue;

        btnOrder.addActionListener(e -> {
            float tot = 0;

            if (cPizza.isSelected()) {
                tot = tot + 100;
            }
            if (cBurger.isSelected()) {
                tot = tot + 80;
            }
            if (cFries.isSelected()) {
                tot = tot + 65;
            }
            if (cSoftDrinks.isSelected()) {
                tot = tot + 55;
            }
            if (cTea.isSelected()) {
                tot = tot + 50;
            }
            if (cSundae.isSelected()) {
                tot = tot + 40;
            }

            if(rbNone.isSelected()){
                tot = tot;
            }
            if(rb5.isSelected()){
                tot = (float) (tot - (tot * 0.05));
            }
            if(rb10.isSelected()){
                tot = (float) (tot - (tot * 0.10));
            }
            if(rb15.isSelected()){
                tot = (float) (tot - (tot * 0.15));
            }

            JOptionPane.showMessageDialog(a, "Total price is Php " + tot);
        });
    }

    public static void main(String[] args){
        FoodOrder app = new FoodOrder();
        app.setContentPane(app.jpanel);
        app.setSize(1000,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("FoodOrder");
    }
};
