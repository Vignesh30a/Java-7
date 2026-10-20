class Shape{
    public double getArea(){
        return 0;
    }
}
class Triangle extends Shape{
    private double b;
    private double h;
    public Triangle(double b, double h){
        this.b=b;
        this.h=h;
    }
    public double getArea(){
        return 0.5*b*h;
    }
}
class Square extends Shape{
    private double s;
    public Square(double s){
        this.s=s;
    }
    public double getArea(){
        return s*s;
    }
}
class Java{
    public static void main(String[] args) {
        Shape[] s=new Shape[2];
        s[0]=new Square(7);
        s[1]=new Triangle(1,1.732);
        System.out.println(s[0].getArea());
        System.out.println(s[1].getArea());
    }
}