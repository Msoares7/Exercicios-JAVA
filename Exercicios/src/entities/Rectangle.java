package entities;

public class Rectangle {

public double altura;
public double largura;

public double area() {
	return altura * largura;
}

public double Perimeter() {
return 2*( altura + largura);
}
	
public double Diagonal() {
return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
}

public String toString() {
 return String.format("Area: %.2f" ,area())
		 +"\n"		
 + String.format("Perimeter: %.2f" ,Perimeter())
         +"\n" + 
  String.format("Diagonal: %.2f" ,Diagonal());
}



}
