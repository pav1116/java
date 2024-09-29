#8

class Main 
{
    public static void main(String[] args) 
    {
        Shape s1 = new Rectangle(10, 20);
        s1.printArea(); 
        
        Shape s2 = new Triangle(30, 40);
        s2.printArea();  
        
        Shape s3 = new Circle(2);
        s3.printArea();  
    }
}

abstract class Shape 
{
    int a;
    int b;
    public Shape(int a, int b) 
    {
        this.a = a;
        this.b = b;
    }
    abstract void printArea();
}

class Rectangle extends Shape 
{
    public Rectangle(int a, int b) 
    {
        super(a, b);
    }

    void printArea() 
    {
        System.out.println("Area of Rectangle is: " + (a * b));
    }
}

class Triangle extends Shape 
{
    public Triangle(int a, int b) 
    {
        super(a, b);
    }

    void printArea() 
    {
        System.out.println("Area of Triangle is: " + (0.5 * a * b));
    }
}

class Circle extends Shape 
{
    public Circle(int a) 
    {
        super(a, 0); 
    }

    void printArea() 
    {
        System.out.println("Area of Circle is: " + (3.14 * a * a)); 
    }
}

***OUTPUT***

Area of Rectangle is: 200
Area of Triangle is: 600.0
Area of Circle is: 12.56


