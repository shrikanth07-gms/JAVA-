import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int ans=0;
        System.out.println("Enter operator:");
        char op=input.next().trim().charAt(0);
        if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
            System.out.println("Enter the numbers:");
            int n1=input.nextInt();
            int n2=input.nextInt();
            if(op=='+'){
                ans=n1+n2;
            }
            if(op=='-'){
                ans=n1-n2;
            }
            if(op=='*'){
                ans=n1*n2;
            }
            if(op=='%'){
                ans=n1%n2;
            }
            if(op=='/'){
                ans=n1/n2;
            }
        }
            else{
                System.out.println("Invalid operation");
            }

            System.out.println("Your answer is:" + ans);
        }
    }
