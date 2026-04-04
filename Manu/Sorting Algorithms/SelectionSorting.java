import java.util.Arrays;

public class SelectionSorting {

    public static void selectionSort()
    {
        int arr[] = {5,8,9,2,1};
        System.out.println("Before sorting" + " " + Arrays.toString(arr));
        int noOfElements = arr.length;

        for(int i=0; i<noOfElements-1; i++)
        {
            int mi = i;
            for(int j=i+1; j<noOfElements; j++)
            {
                if(arr[j]<arr[mi])
                {
                    mi = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mi];
            arr[mi] = temp;
        }
        System.out.println("After sorting" + " " + Arrays.toString(arr));
    }
    public static void main(String[] args) {
        selectionSort();
    }
}
