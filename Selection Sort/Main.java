import java.util.Scanner;

public class Main {
    static int arr[];
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=Integer.parseInt(sc.next());
        }
	    selectionSort();
	    for(int i=0;i<n;i++){
	        System.out.print(arr[i]+" ");
        }
    }
    static void selectionSort(){
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            int index=findMin(i,arr.length-1);
            arr[i]=arr[index];
            arr[index]=temp;
        }
    }
    static int findMin(int l,int r){
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=l;i<=r;i++){
            if(arr[i]<min){
                min=arr[i];
                index=i;
            }
        }
        return index;
    }
}
