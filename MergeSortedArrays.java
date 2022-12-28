import java.util.Arrays;

public class MergeSortedArrays {


    static int[] merge(int m[], int n[]) {
        int[] returnValue = new int[m.length + n.length];
        int x1 = 0, x2 = 0;
        for (int i = 0; i < m.length + n.length; i++) {

            if(x2==n.length){
                returnValue[i]=m[x1++];
            } else if(x1==m.length){
                returnValue[i]=n[x2++];
            }
           else if (m[x1] < n[x2]) {
                returnValue[i] = m[x1];
                x1++;

            } else if (m[x1] >= n[x2]) {
                returnValue[i] = n[x2];
                x2++;
            }
        }
        return returnValue;
    }



    public static void main(String[] args)
    {
        int arr1[] = new int[] { 4, 5, 9, 10, 15, 20 };
        int arr2[] = new int[] { 2, 3, 8, 13 };
        System.out.println(Arrays.toString( merge(arr1, arr2)));

    }
}