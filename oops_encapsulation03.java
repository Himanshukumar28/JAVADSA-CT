public class oops_encapsulation03 {
    public static void main(String[] args) {
        
        BankAccount b1 = new BankAccount();
        b1.deposit(900);
    }
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
    

