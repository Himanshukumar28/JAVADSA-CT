abstract class Bank{
    //abstract method
    abstract void getInterestRate();

    //non abstract method
//     void welcomeNote(){
//         System.out.println("Welcome");
//     }
}
class BOB extends Bank{
    void getInterestRate(){
        System.out.println("PNB interest rate is 6.5");
    }
}
class INDN extends Bank{
    void getInterestRate(){
        System.out.println("SBI interest rate is 7.5");
    }
}
public class oops_Abstraction02 {
    public static void main(String[] args) {
        Bank c1 = new BOB();
        c1.getInterestRate();
        //c1.welcomeNote();
        Bank c2 = new INDN();
        c2.getInterestRate();
        
    }
}