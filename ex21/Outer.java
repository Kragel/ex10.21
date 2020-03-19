package t_10_innerClasses.ex21;

public interface Outer {

    void printHello();

    class InnerC implements Outer {

        @Override
        public void printHello()
        {
            System.out.println("Hello world!");
        }
    }

}
