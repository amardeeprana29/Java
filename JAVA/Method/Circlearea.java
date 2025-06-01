package Method;

public class Circlearea {
    public static void main(String[] args) {
        double radius1 = 3;
        double radius2 = 4;
        double circlearea1 = calculatecirclearea(radius1); // block of code called
        double circlearea2 = calculatecirclearea(radius2); // block of code called
        System.out.println(circlearea1);
        System.out.println(circlearea2);
    }

    // Method : helps in code resue, a block of reusable code that runs only when called .

    public static double calculatecirclearea(double radius){
        double area = 3.14 * radius * radius;
        return area;
    }
}
