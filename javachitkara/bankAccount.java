public class bankAccount {
    String username;
    int accountNumber;
    int totalAmount;
    int amountCredited;
    int amountWithdraw;
    bankAccount(String username,int a,int c,int w,int t){
        this.username = username;
        this.accountNumber=a;
        this.amountCredited=c;
        this.amountWithdraw=w;
        this.totalAmount=t-w+c;

    }
}
