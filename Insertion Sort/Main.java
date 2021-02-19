public class Main {

    public static void main(String[] args) {
	int arr[]={7,3,2,5,6};
	insertion_sort(arr);
	print(arr);
    }
    static void insertion_sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && temp>arr[j]){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
    }
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
