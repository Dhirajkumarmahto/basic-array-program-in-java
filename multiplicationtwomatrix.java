import java.util.Scanner;
public class multiplicationtwomatrix {
    public static void main(String[] args){
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        int i,j;
        System.out.print("Enter your First Element=");
        Scanner sc=new Scanner(System.in);
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter your second element =");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.print("First matrix\n");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("second matrix\n");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
               System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
               c[i][j]=a[i][j]*b[i][j];
               System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}