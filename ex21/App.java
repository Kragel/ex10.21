package t_10_innerClasses.ex21;

public class App {

    public static void main(String[] args)
    {
        print(new Derive());
    }

    public static void print(Outer a)
    {
        new Outer.InnerC().printHello();
        a.printHello();
    }

}
