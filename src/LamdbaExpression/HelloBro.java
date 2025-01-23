package LamdbaExpression;

abstract class HelloBro implements Hello{
    public static void main(String[] args) {
        Hello greet = (name) -> name;

        greet.sayHello("Amit");
        System.out.println(greet.sayHello("Amit"));
    }
}
