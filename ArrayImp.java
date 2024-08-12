import java.util.Scanner;

public class ArrayImp {

    public static void main(String[] args) {
        int [] arr = new int[5];
        int sum = 5;

        Scanner userI = new Scanner(System.in);

        for(int j=0; j<sum;j++){
           arr[j]= userI.nextInt();
           
        }

     
        
        for(int i=0; i<sum ; i++){
            System.out.println(arr[i]);
        }

        
    }
}