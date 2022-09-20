public class Main {
    public static void main(String[] args) {
        int [] arr = {-1,2,5,8,3,1,9,24,14};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");

    }

    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}