public class Triangle {
    private double size1=1;
    private double size2 =1;
    private double size3=1;
    private double p;
    public Triangle() {

    }
    public Triangle(double size1, double size2, double size3) {
    this.size1=size1;
    this.size2=size2;
    this.size3= size3;
    }

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(6,8,10);
        System.out.println(triangle1);
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }
    public double getP() {
        return (size1+size2+size3)/2;
    }
    public double getArea() {
        return Math.sqrt(getP()*(getP()-size1)*(getP()-size2)*(getP()-size3));
    }
    public double getPerimeter() {
        return getP()*2;
    }
    public String toString() {
        return "area: "+getArea()+" perimeter: "+ getPerimeter()+" a:"+size1+" b:"+size2+" c:"+size3;
    }
}
