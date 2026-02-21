public class oops_Abstraction {
    public static void main(String[] args) {
        
        BankAccount b1 = new BankAccount();
        b1.deposit();
    }

    class BankAccount{
        private int ballance = 1000;

        public void deposit(int amount){
            ballance += amount;
        }

        public int getBalance(){
            return ballance;
        }
    }
}
