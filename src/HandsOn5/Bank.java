package HandsOn5;

class savingaccount implements Accounts{
    double balance; double intrest_rate;
    public savingaccount(double balance,double intrest_rate){
        this.balance=balance;
        this.intrest_rate=intrest_rate;
        
    }
    void deposit(double amount){
        this.balance+=amount;
    }
    void withdraw( double amount){
        if (amount>balance){
            System.out.println("insuffecinet balance");
        }else{
            this.balance-=amount;
        }
    }
    double calc_intrest(){
        double res=(balance*intrest_rate)/100;
        System.out.println("Intrest= "+res);
		return res;
    }
    
    // double getbalance(){
    //     System.out.println("balance= "+balance);}
    
}
// class currentaccount implements Accounts{
//     double balance; double intrest_rate;
//     currentaccount(double balance,double intrest_rate){
//         this.balance=balance;
//         this.intrest_rate=intrest_rate;
        
//     }
//     void deposit(double amount){
//         this.balance+=amount;
//     }
//     void withdraw( double amount){
//         if (amount>balance){
//             System.out.println("insuffecinet balance");
//         }else{
//             this.balance-=amount;
//         }
//     }
//     double calc_intrest(){
//         double res=(balance*intrest_rate)/100;
//         System.out.println("Intrest= "+res);
//     }
//     double getbalance(){
//         System.out.println("balance= "+balance);}
    
// }





public class Bank
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}