package LamdbaExpression;

abstract class AdderCall implements Adder{
    public static void main(String[] args) {
        Adder ans = (a,b) -> a+b;
        ans.addition(10,20);
        System.out.println(ans.addition(10,20));
    }
}
