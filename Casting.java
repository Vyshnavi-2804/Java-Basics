public class casting{
    public static void main(String[] args){
        // Implicit Casting (Widening)
        int intValue = 10;
        double doubleValue = intValue; // int is implicitly cast to double
        System.out.println(doubleValue);
        // Explicit Casting (Narrowing)
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; // double is explicitly cast to int
        System.out.println(anotherIntValue);

    }
}