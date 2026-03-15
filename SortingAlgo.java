import java.util.Arrays;

public class SortingAlgo {

    public static void bubbleSort() 
    {
        int arr[] = {5,8,9,2,1};
        System.out.println("Before sorting" + " " + Arrays.toString(arr));
        int noOfElements = arr.length;
        
        for(int itr=1; itr<=noOfElements-1; itr++)
        {
            for(int j=0; j<noOfElements-itr; j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
            }
        }
        System.out.println("After sorting" + " " + Arrays.toString(arr));

    }
    public static void main(String[] args) {
        bubbleSort();
    }
    
}
