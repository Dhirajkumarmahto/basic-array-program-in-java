import java.util.Scanner;
public class SearchElementinmatrxi {
    public static void main(String[] args){
        int a[][]=new int [3][3];
        int i,j;
        System.out.print("Eneter your Element =:");
        Scanner sc=new Scanner(System.in);

        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("YOUR MATRIX IS....\n");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        boolean found=false;
        System.out.print(" Enter your Search Elements=");
        int SearchNumbers=sc.nextInt();
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                if(a[i][j]==SearchNumbers){
                    found=true;
                    break;
                }
            }
        }
        if(found){
            System.out.print(" Search Elements is present in Your Matrix"+found);
        }
        else{
            System.out.print("Search Elements is a Not present in Your Matrix");
        }
    }
}
