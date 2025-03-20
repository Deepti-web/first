CLEARimport java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner impo = new Scanner(System.in);
        // System.out.println("enter the size of the array:");
        // int size = impo.nextInt();

        // int arr[] = new int[size];

        // System.out.println("enter the numnber into the element:");
        //   for(int i = 0;i<size;i++){
        //     System.out.println("enter the "+(i+1)+" number:");
        //             arr[i] = impo.nextInt();
        //   }
        //    System.out.println("your entered number is");
        //    for(int i = 0;i<size;i++){
        //     System.out.println(arr[i]+" ");
        //    }

        System.out.println("enter the row size:");
        int r = impo.nextInt();

        System.out.println("enter the column size:");                                      //here (i & r) refers to row
        int c = impo.nextInt();                                                                   // and (j & c) refers to column 

        int arr[][] = new int[r][c];

        System.out.println("enter the element in the arrray:");
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                System.out.println("enter the "+"["+(i+1)+"]["+(j+1)+"]"+" number:");
                 arr[i][j] = impo.nextInt();
            }
        }
         System.out.println("your entered element is:");
         for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


           impo.close();
           
    }
    

}
