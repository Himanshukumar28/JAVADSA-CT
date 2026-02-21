//pllymorphism --> polymer --> naam ek kaam anek
    //Method/function overloading
    //function name--> same
    //function parameter--> different

    //Method/function overriding
    //function name--> same
    //function parameter--> same
public class oops_Polymorphism {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 12;
        int c = 0; //dummy
        System.out.println(add(a, b));
        System.out.println(add(a, b, c));
    }
    

    public static int add(int a , int b){
        return a + b;
    }
    public static int add(int a , int b , int c){
        return a  + b + c;
    }

    //Method/function overriding
    //function name--> same
    //function parameter--> same

    

}
