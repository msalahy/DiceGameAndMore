
package errorcatcher;


public class ErrorCatcher {


    public static void main(String[] args) {
        System.out.println("Calling myMethod...");
        myMethod();
        System.out.println("Method main is done. ");
    }
    public static void myMethod(){
        System.out.println("Ca;ling produce Error...");
        produceError();
        System.out.println("myMethod is done. ");
    }
    public static void produceError(){
        String str = "abc";
        System.out.println(str.charAt(2 ));
        System.out.println("ProduceError method is done. ");
    }
}
