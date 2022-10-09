package JAVA9to17;

interface MyInterface{
    private static String reverseStrings(String string){
        return new StringBuilder(string).reverse().toString();
    }
    static void toUpperCase(String string){
        String reverseString= reverseStrings(string);
        System.out.println(reverseString.toUpperCase());
    }
    static void toLowerCase(String string){
        String reverseString= reverseStrings(string);
        System.out.println(reverseString.toLowerCase());
    }
}

public class ques1 {
    public static void main(String[] args) {
        MyInterface.toLowerCase("KRISHNA");
        MyInterface.toUpperCase("krishna");
    }
}
