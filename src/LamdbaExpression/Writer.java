package LamdbaExpression;

abstract class Writer implements Printer{
    public static void main(String[] args) {
        Printer obj = () -> "Hello";
        System.out.println(obj.print());
    }
}
