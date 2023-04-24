interface Shape {
    public double calculateArea();
}

class Rectangle implements Shape {
    public double length;
    public double width;

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }
}

class Circle implements Shape {
    public double radius;

    @Override
    public double calculateArea() {
        return (22/7) * this.radius * this.radius;
    }
}
class AreaCalculator {
     public double calculateShapeArea(Shape shape) {
         return shape.calculateArea();
     }
}



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}