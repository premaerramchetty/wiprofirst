public abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class ShapeDrawingApp {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(), new Rectangle(), new Circle(), new Rectangle() };
        
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
