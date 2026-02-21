public class oops_encapsulation03 {
    public static void main(String[] args) {
        
        BankAccount b1 = new BankAccount();
        b1.deposit(900);
        System.out.println(b1.getBalance());
    }
}
    class BankAccount{
        private int ballance = 1000;  //Private data bahar se direct access nhi

        //setter
        public void deposit(int amount){
            ballance += amount;     //Sirf methode ke through access milega
        }
        
        //getter
        public int getBalance(){
            return ballance;
        }
    }
    

