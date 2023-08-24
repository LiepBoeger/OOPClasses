import java.util.ArrayList;
import javax.swing.JOptionPane;

public class main {
    public static void principal(String[] args){
        ArrayList<Car> cars = new ArrayList<Car>();
        String menu = "1 - New Car\n"
                    + "2 - List by year\n"
                    + "3 - Log out";

        int op = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            if (op == 1){
                Car c = new Car();
                c.newCar();
                cars.add(c);
            }

            if (op == 2){
                String result = "Cars:\n";
                for (Car c: cars){
                    result += c.listPerYear();
                }
                JOptionPane.showMessageDialog(null, result);
            }
        } while(op != 3);
    }
}