import java.util.Scanner;
public class FindlargestElementinmatrix {
    public static void main(String[] args){
        int a[][]=new int[3][3];
        System.out.print("Enter your element :=");
        Scanner sc=new Scanner(System.in);
        int i,j;
        int max = Integer.MIN_VALUE;

        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("YOUR MATRIX..\n");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("LARGEST ELEMENTS IS YOUR..\n");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                if(a[i][j]>max){
                    max=a[i][j];
                }
            }
        }
        System.out.print(max);
    }
}
