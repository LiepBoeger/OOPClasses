import javax.swing.JOptionPane; 

class Car {
    String brand;
    Integer year;
    String color;

    public void newCar(){
        brand = JOptionPane.showInputDialog("Brand: ");
        year = Integer.parseInt(JOptionPane.showInputDialog("Year: "));
        color = JOptionPane.showInputDialog("Color: ");
    }

    String listPerYear(){
        return brand + " - " + year + " - " + color + "\n";
    }
}