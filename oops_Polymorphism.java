public class oops_Polymorphism {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 12;
        int c = 13;
        System.out.println(add(a, b));
        System.out.println(add(a, b, c));
    }
    //pllymorphism --> polymer --> naam ek kaam anek
    //Method/function overloading
    //function name--> same
    //function parameter--> different

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
