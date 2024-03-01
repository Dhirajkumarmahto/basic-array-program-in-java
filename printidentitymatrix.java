import java.util.Scanner;
public class printidentitymatrix {
    public static void main(String[] args){
        int a[][]=new int[3][3];
        int i,j;
        System.out.print("Enter your matrix ");
        Scanner sc=new Scanner(System.in);
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("INDENTITY MATRIX \n");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                if(i==j){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
