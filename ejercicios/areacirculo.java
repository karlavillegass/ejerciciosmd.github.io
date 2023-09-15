import java.util.Scanner;
public class areacirculo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double area,radio;
        System.out.println("Ingrese el radio del círculo");
        radio = input.nextDouble();
        area = 3.1416 * (radio * radio);
        System.out.println("El área del círculo es: "+area+"cm2 ");
        input.close();
    }
}

