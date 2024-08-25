package application;
import java.util.Scanner;
import entities.Rectangle;
import java.util.Locale;
public class Program {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
Locale.setDefault(Locale.US);		
	
Rectangle rectangle = new Rectangle();
System.out.println("Enter rectangle width and height: ");
rectangle.Width = sc.nextDouble();
rectangle.Height = sc.nextDouble();
System.out.println(rectangle.toString());	

sc.close();
    }

}
