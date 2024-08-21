package atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account("duc", "123", 1000000);
        login(sc, account);
    }
    public static void login(Scanner sc, Account account) {
        System.out.println(" Nhập tài khoản ");
        String userName = sc.nextLine();
        System.out.println(" Nhập mật khẩu  ");
        String passWord = sc.nextLine();
        if (account.getUserName().equals(userName) && account.getPassWord().equals(passWord)) {
            System.out.println(" đăng nhập thành công ");
            while (true){
                System.out.println(" thành công ");
                System.out.println("1. xem thông tin ");
                System.out.println("2. rút tiền ");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice){
                    case 1:
                        System.out.println(account);
                        break;
                    case 2:
                        withdrawMoney(sc , account);
                        break;
                }
            }
        }else {
            exit(sc, account);
        }
    }

    public static void exit(Scanner sc, Account account){
        System.out.println(" đăng nhập thất bại! hãy thử lại (Y/N)");
        String choiceReturn = sc.nextLine();
        if (choiceReturn.equalsIgnoreCase("Y")){
            login(sc, account);
        }else {
            System.exit(0);
        }
    }
    public static void withdrawMoney(Scanner sc, Account account){
        System.out.println(" nhập số tiền cần rút ");
        double money = Double.parseDouble(sc.nextLine());
        if ( money <= 0 || money > account.getBalance()){
            System.out.println(" số tiền không hợp lệ ");
        }else {
            double remainAmt = account.getBalance() - money;
            System.out.println(" Số du trong tài khoản là " + remainAmt);
        }
    }

}
