import java.util.*;

public class lab4{
    static Scanner sc=new Scanner(System.in);
    long acno;
    String acname;
    double bal;
    
    void customer(){
        System.out.println("Enter the account holder name: ");
        acname=sc.nextLine();
        System.out.println("Enter the account number: ");
        acno=Long.parseLong(sc.nextLine());
        System.out.println("You have successfully registered!");
    }

    int deposit(double a[],String t[],int i){
        
            System.out.println("Enter the amount you want to deposit: ");
            double amt=Double.parseDouble(sc.nextLine());
            a[i]=amt;
            t[i]="Deposit";
            bal=bal+amt;
            System.out.println("Successfully deposited money!");
            i=i+1;
            return i;
            }

    
    

    int withdraw(double a[],String t[],int i){
        System.out.println("Enter the amount you want to withdraw: ");
        double amt=Double.parseDouble(sc.nextLine());
        if(bal>=amt){

            a[i]=amt;
            t[i]="Withdraw";
            
            bal=bal-amt;
            System.out.println("Successfull withdrawal");
            i=i+1;
            
        }else{
            System.out.println("Insufficient balance!");
        

        }
        
        return i;
        

    }

    void transactions(double a[],String t[],int i){
        System.out.println("Transaction Summary");
        System.out.println("***************");
        for(int j=0;j<i;j++){

            
            System.out.println(a[j]+" "+t[j]);
            

        }
        
    }

    void summary(){
        System.out.println("Account holder name: "+acname);
        System.out.println("Account no: "+acno);
        System.out.println("Balance is: "+bal);
    }

    public static void main(String[] args) {
        lab4 obj=new lab4();
        int i=0;
        double a[]=new double[3095];
        String t[]=new String[3095];
        int ch;
        System.out.println("Welcome to customer portal");
        obj.customer();
        do{
            System.out.println("------------------");
            System.out.println("1-Deposit Money");
            System.out.println("2-Withdraw money");
            System.out.println("3-Print transactions");
            System.out.println("4-Account Summary");
            System.out.println("5-Program ends!");
            System.out.println("------------------");
            System.out.print("Enter your choice: ");

            ch=Integer.parseInt(sc.nextLine());
            if(ch==1){
                i=obj.deposit(a,t,i);     
                   }
            else if(ch==2){
               i= obj.withdraw(a,t,i);
            }       
            else if(ch==3){
                obj.transactions(a,t,i);

            }
            else if(ch==4){
                obj.summary();
            }

            else if(ch==5){
                System.out.println("Program will now end!");
            }



        }while(ch!=5);



    }
}
