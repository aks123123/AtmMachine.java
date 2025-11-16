package Test12;
import java.util.*;
 class ATM{
     float balance;
     int pin=1234;
     public void checkPin(){
         System.out.println("Enter your pin");
         Scanner sc=new Scanner(System.in);
         int enterPin=sc.nextInt();
         if(enterPin==pin){
             Menu();
         }
         else{
             System.out.println("pin in invalid");
         }
     }
     public void Menu() {
         System.out.println("Enter your choice ");
         System.out.println("1. Check A/c Balance");
         System.out.println("2. Withdraw money");
         System.out.println("3. Deposite Money");
         System.out.println("4. Exit");
         Scanner sc = new Scanner(System.in);
         int opt = sc.nextInt();
         if (opt == 1) {
             checkBalance();
         } else if (opt == 2) {
             withdraw();
         } else if (opt == 3) {
             depositeMoney();
         } else if (opt == 4) {
             return;
         } else {
             System.out.println("enter a avalid opt");
         }

     }
public void checkBalance(){
    System.out.println("Availabe Balance"+balance);
    Menu();
}
public void withdraw(){
    System.out.println("enter amount of withdraw");
    Scanner sc = new Scanner(System.in);
    float amount=sc.nextInt();
    if(amount>balance){
        System.out.println("Insufficient amount");
    }else{
        balance=balance-amount;
        System.out.println("Money withdraw succesfully"+(balance-amount));
    }
     }
    public void depositeMoney(){
        System.out.println("enter amount pf deposite");
        Scanner sc = new Scanner(System.in);
        float deposite=sc.nextFloat();
        balance=balance+deposite;
        System.out.println("successfully deposite"+(balance+deposite));
        Menu();
    }



     }
public class AtmMachine {
    public static void main(String[] args) {

ATM a1=new ATM();
a1.checkPin();
a1.balance=2000000;
    }
}
