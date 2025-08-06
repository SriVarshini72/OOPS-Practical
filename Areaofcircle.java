package example;

	class Circle {
	    double radius = 5.0;

	    // Method without parameters
	    void Area() {
	        double area = 3.14159 * radius * radius;
	        System.out.println("Radius: " + radius);
	        System.out.println("Area of the circle: " + area);
	    }
	}

	public class Areaofcircle { // File name should now be circle.java
	    public static void main(String[] args) {
	        Circle c = new Circle();
	        c.Area();
	    }
	}


