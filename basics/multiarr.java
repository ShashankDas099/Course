import java.util.Scanner;
public class multiarr{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of arrays: ");
        int n= scanner.nextInt();
        System.out.print("Enter length of arrays: ");
        int m= scanner.nextInt();
        int nums[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                nums[i][j]=(int)(Math.random()*10);
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("Element "+(j+1)+" of array "+(i+1)+" is: "+nums[i][j]);
             }
        }
        System.out.println("Arrays in table format:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                System.out.print(nums[i][j]+" ");
             }
             System.out.println();
        }
    }
}