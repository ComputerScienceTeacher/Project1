public class Computer{
    double price;
    String color;

    public Computer(){
        price = 1999.0;
        color = "Black";
    }

    public Computer(double p, String c){
        price = p;
        color = c;
    }


    String getColor(){
        return color;
    }

    double getPrice(){
        return price;
    }
}