package entities;

public class Rectangle {

public double Width;
public double Height;

public double area() {
	return Width * Height;
}

public double Perimeter() {
return 2*( Width + Height);
}
	
public double Diagonal() {
return Math.sqrt(Math.pow(Width, 2) + Math.pow(Height, 2));
}

public String toString() {
 return String.format("Area: %.2f" ,area())
		 +"\n"		
 + String.format("Perimeter: %.2f" ,Perimeter())
         +"\n" + 
  String.format("Diagonal: %.2f" ,Diagonal());
}



}
