import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.print("Name : ");
        Scanner s1 = new Scanner(System.in);
        String Name = s1.nextLine();

        System.out.print("Account : ");
        Scanner s2 = new Scanner(System.in);
        String Account = s2.nextLine();

        System.out.print("CardNo : ");
        Scanner s3 = new Scanner(System.in);
        String CardNo = s3.nextLine();

        CheckingAccount account = new CheckingAccount(CardNo, new Account(Name, Account));

        while(true) {
            String[] Menu = new String[]{"1 : Deposit\r\n 2 : Withdraw\n 3 : Print Info\n 4 : Pay\n 0 : Exit\n Select : "};
            System.out.print(Arrays.toString(Menu));

            Scanner s4 = new Scanner(System.in);
            int number = s4.nextInt();

            switch(number) {

                case 1 :
                    System.out.print("Amount : ");
                    Scanner d_money = new Scanner(System.in);
                    account.deposit(d_money.nextInt());
                    break;

                case 2 :
                    System.out.print("Amount : ");
                    Scanner w_money = new Scanner(System.in);
                    account.withdraw(w_money.nextInt());
                    break;

                case 3 :
                    account.printInfo();
                    break;

                case 4 :
                    System.out.print("CardNo : ");
                    Scanner s5 = new Scanner(System.in);
                    String t_cardNo = s5.nextLine();

                    System.out.print("Amount : ");
                    Scanner s6 = new Scanner(System.in);
                    int t_amount = s6.nextInt();

                    boolean result = account.pay(t_cardNo, t_amount);

                    if(result==true) {
                        System.out.println("Success");
                    } else {
                        System.out.println("Fail");
                    }
                    break;
            }

            if(number == 0) {
                System.out.println("Exit");
                break;
            }
        }
    }
}
