package atm;

public class Account {
    private String userName;
    private String passWord;
    private double balance;

    public Account() {
    }

    public Account(String userName, String passWord, double balance) {
        this.userName = userName;
        this.passWord = passWord;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", balance=" + balance +
                '}';
    }
}
