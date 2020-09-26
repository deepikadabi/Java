//51.	Create a program that helps banks to maintain records. It should have following facilities. 
//  o Anybody can create current or saving account with following initial information: account number, name, 
//  balance, and branch. o display account detail for a particular accounts. o display total money deposited in
//   bank. o allow deposit and  withdrawal in an account  . o for saving account opening balance and minimum 
//  balance must be 5000. o for current account opening balance and minimum balance must be 1000. 
//  o can not withdraw the amount from the account that makes balance less than the minimum balance. 
import java.util.Scanner;
class Account{
    int AccountNumber;
    String name;
     Float balance;
    String type;
    static double totalMoney;


    Account(){}
    Account(int ac, String n, Float bal, String br){
        this.AccountNumber = ac;
        this.name = n;
        this.balance = bal;
        this.type = br;
        totalMoney += balance;
    }

    public void show(){
        System.out.println("AC NUMBER : "+AccountNumber+"    AC HOLDER NAME : "+name+"    BALANCE : "+balance+"    AC TYPE : "+type);
    }

    void deposit(Float amt) {
		this.balance += amt;
		totalMoney+=amt;
		System.out.println("Updated Details : ");
		System.out.println(this.toString());
    }

    void withdraw(Float amt) {
		float minBal = 0;
		if(this.type == "Current Account") {
            minBal = 1000;
            System.out.println("curr");
		}
		else if(this.type == "Saving Account") {
			minBal = 5000;
		}
		float temp = this.balance - amt;
		if(temp > minBal) {
			this.balance = temp;
			totalMoney-=temp;
			System.out.println("Updated Details : ");
			System.out.println(this.toString());
		}
		else
			System.out.println("Insufficient Funds!");
	
    }
    
	@Override
	public String toString() {
		return "Bank [accno=" + AccountNumber + ", name=" + name + ", balance=" + balance + ", branch=" + type + "]";
	}
}


public class Bank_51 {
    public static void main(String args[]){
        System.out.println();
        System.out.println();

        System.out.println("============================================================================");
        System.out.println("                                 WELCOME TO BANK                            ");
        System.out.println("============================================================================");
        System.out.println();
        var isBoolean = true;
        Account ac[] = new Account[3];
        int acn = 0;
        while(isBoolean){
        System.out.println();
        System.out.println("HOW CAN WE HELP YOU?? CHOOSE ANY ONE OPTION : ");
        System.out.println("=============================================================================");
        System.out.println();
        System.out.println("1. Want to open an Account ? ");
        System.out.println("2. Want to see your Account Details ? ");
        System.out.println("3. Want to do any transaction ? ");
        System.out.println("4. EXIT");
        System.out.println("=============================================================================");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1: 
                isBoolean = true;

                for(int i=0; i<3; i++)
                {
                    System.out.println("==================================================================");
                    System.out.println("Which type of account do you want to open ? ");
                    System.out.println("1. Current Account");
                    System.out.println("2. Saving Account");
                    System.out.println("==================================================================");
                    System.out.print("Enter Your Choice here : ");
                    int a = sc.nextInt();
                    String name;
                    float balance;
                    acn++;
                    if(a==1) { 
                        System.out.print("Enter Account Holder Name : ");
                        name = sc.next();
                        System.out.print("Enter Amount (minimum amount should be 1000) : ");
                        balance = sc.nextInt();
                            if(balance<1000)
                            {
                                System.out.println("Minimum Amount 1000 : ");
                                balance = sc.nextInt();
                            }
                        Account aco = new Account(acn,name,balance,"Current Account");
                        ac[i] = aco;
                    }
                    if(a==2){
                        System.out.print("Enter Account Holder Name : ");
                        name = sc.next();
                        System.out.print("Enter Amount (minimum amount should be 5000) : ");
                        balance = sc.nextInt();
                            if(balance<5000)
                            {
                                System.out.print("Minimum Amount 5000 Re-enter : ");
                                balance = sc.nextInt();
                            }
                        Account aco = new Account(acn,name,balance,"Saving Account");
                        ac[i] = aco;

                    }

                    
                }
                System.out.println("==================================Account Details================================");
                for(Account a : ac)
                    a.show();
                break; 
//////////////////////////////////////////////////////////////////////////////////////////            
            case 2: 
                isBoolean = true;
                System.out.println("=================================Account Details==================================");
                for(Account a : ac)
                    a.show();
                System.out.println("==================================================================================");
                break;
/////////////////////////////////////////////////////////////////////////////////////////
            case 3: 
                System.out.println("First Enter Your Account Number : ");
                int y = sc.nextInt();
                for(int i=0; i<ac.length; i++)
                {
                    if( ac[i].AccountNumber == y ){

                        System.out.println("What do you want to do ? Deposite or Withdraw : ");
                        System.out.println("1. Deposite");
                        System.out.println("2. Withdraw");
                        int dw = sc.nextInt();
                        System.out.println("============================================================================");
                        Float x;
                        if(dw == 1){
                            System.out.println("Enter amount to deposite");
                            x= sc.nextFloat();
                            //Transaction t = new Transaction(x);
                            ac[i].deposit(x);
                            break;
                        }
                        if(dw == 2){
                            System.out.println("Enter amount to withdraw");
                            x= sc.nextFloat();
                            //Transaction t = new Transaction(x);
                            ac[i].withdraw(x);
                            break;
                        } 
                        else{
                            System.out.println("Invalid option !!!!");
                        }
                    }
                    else{
                        System.out.println("You dont have account. First create an account");
                    }
            
                }
                break; 
////////////////////////////////////////////////////////////////////////////////////////
            case 4: 
                isBoolean = false;
                break; 

///////////////////////////////////////////////////////////////////////////////////////
            default: 
                isBoolean = true;

                System.out.println("Invalid!!! This option is not available.");
                break;

        } 
    }
        

    }



}

