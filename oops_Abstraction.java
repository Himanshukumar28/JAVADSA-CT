abstract class RBI{   //controller
    abstract void interestRate();
    abstract void interestOnRd();
    }


class PNB extends RBI{
    void interestRate(){  //fixed and decide by rbi
        System.out.println(" 8 % on home loan");
    }
    void interestOnRd(){  //fixed and decide by rbi
        System.out.println("8.5% on RD");
    }
}
class SBI extends RBI{
    void interestRate(){  //fixed and decide by rbi
        System.out.println("6 % on car loan");
    }
    void interestOnRd(){   //fixed and decide by rbi  
        System.out.println("6.5 % on RD");
    }
}
public class oops_Abstraction {
    public static void main(String[] args) {
        PNB c1 = new PNB();
        c1.interestRate();
        c1.interestOnRd();
        SBI c2 = new SBI();
        c2.interestRate();
        c2.interestOnRd();
    }
}
