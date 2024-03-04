import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        int num1,num2,result=0,ch;
        System.out.print("ENTER YOUR FIRST NUMBER=");
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        System.out.print("ENTER YOUR SEACOND NUMBER=");
        num2=sc.nextInt();

        System.out.print("CHOSE ON YOUR OPERATIONS('+,''-','*','/')\n");
       char operation = sc.next().charAt(0);

        switch(operation){
            case '+':
            result=num1+num2;
            break;
            case '-':
            result=num1-num2;
            break;
            case '*':
            result=num1*num2;
            break;
            case '/':
            if(num2!=0){
                result=num1/num2;
            }
            else{
                System.out.print("THIS NUMBER IS NOTE DEVIDED");
            }
            break;

            default:
            System.out.print("ERROR OPERATIONS");
        }
        System.out.print("RESULT="+result);
    }
}