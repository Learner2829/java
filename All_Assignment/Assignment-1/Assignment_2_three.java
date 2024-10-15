
class Circle{
    // . Create a Circle class with the following properties: radius. Implement methods to calculate 
    // the area and circumference of the circle.
    double radius;
    Circle(double t_radius){
    radius=t_radius;
    }
    void Area(){
        // System.out.println("Your Circle Area is:" + 3.1415*(radius*radius));
        System.out.println("Your Circle Area is:" + Math.PI*(radius*radius));
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(20.00);    
        c1.Area();
    }
    

}