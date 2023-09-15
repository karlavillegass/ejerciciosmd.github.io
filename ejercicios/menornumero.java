import java.util.Scanner;
public class menornumero {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int a,b,c;  
         System.out.println("Ingrese 3 números");
        a = leer.nextInt();
        b = leer.nextInt();
        c = leer.nextInt();
        if (a != b && a != c && b != c){
            if(a < b){
                if(a < c){
                    System.out.println("El número menor es: "+a);
                }
                else{
                    System.out.println("El número menor es: "+c);
                }
            }
            else{
                if(b < c){
                    System.out.println("El número menor es: "+b);
                }
                else{
                    System.out.println("El número menor es: "+c);
                }
            }

        }
        else {
            System.out.println("Los números deben ser diferentes, ingrese otros.");

        }
        }
}
