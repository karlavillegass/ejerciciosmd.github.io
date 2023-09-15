import java.util.Scanner;
public class numeropar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingresa un número");
        n = leer.nextInt();
        if (n % 2 == 0){
            System.out.println("El número es par");
        }
        else{
            System.out.println("El número es impar");
        }
        leer.close();
    }
}
