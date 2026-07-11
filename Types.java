public class Types{
    static int staticVariable = 42;
    int instanceVariable= 100;

    public void display(){
        String localVariable = "I am a Local Variable";
        System.out.println(localVariable);
        System.out.println("Static Variable: " + staticVariable);
    }
    public static void main(String[] args) {
        Types obj = new Types();
        obj.display();
        System.out.println("Instance Variable: " + obj.instanceVariable);
        System.out.println("Static Variable accessed from main: " + staticVariable);
    }
}