package inheritance;

public class Circle extends Shape{

    private int raza;

    private int radius;

    public Circle(int raza){
        super();
        this.raza = raza;
        super.area = 2;
        calculateArea();
    }

    private void calculateArea() {
        System.out.println("Aria a fost calculata ");
    }

}
