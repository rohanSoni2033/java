public class Account {
    private static int balance;

    static {
        balance = 1000;
    }

    public static void main(String[] args){
        withdrawal(2000);
        deposit(800);
        withdrawal(1500);
        checkBalance();
   }
   public static void withdrawal(int withdrawalAmount){
        if (balance-withdrawalAmount>=0) {
            balance -= withdrawalAmount;
            System.out.println("withdrawal of "+withdrawalAmount+" successed, " +
                    " remaining balance "+balance);
        }
        else{
            System.out.println("insufficient balance!! " +
                    "withdrawal of "+withdrawalAmount+" failed,"+
                    " total avialable balance "+balance);
        }
   }
   public static void deposit(int depositAmount){
       if (depositAmount>0) {
           balance += depositAmount;
           System.out.println("deposit of "+depositAmount+" successed, " +
                   " avialable balance "+balance);
       }
       else{
           System.out.println("invalid deposit amount!! " +
                   "deposit of "+depositAmount+" failed,"+
                   " total avialable balance "+balance);
       }
   }
   public static void checkBalance(){
       System.out.println("total avialable balance : "+balance);
   }
}
