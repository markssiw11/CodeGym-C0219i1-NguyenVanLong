public class ResiableTest{
    public static void main(String[] args) {
        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle(3);
        resizeables[1] = new Rectangle(3,4);
        resizeables[2] = new Square(3);
        for(Resizeable resizeable :resizeables) {
            System.out.println(resizeable.toString());
        }
        System.out.println("after mutiply 2");
        for(Resizeable resizeable: resizeables) {
            resizeable.resize(2);
            System.out.println(resizeable.toString());
        }
        System.out.println("after set reize");
        for(Resizeable resizeable: resizeables) {
            resizeable.resizeRandom();
            System.out.println(resizeable.toString());
        }



    }

}
