package binarysearch;

public class NonRecursiveBinarySearch {
    public static void main(String[] args) {
        int num[] = new int[]{5,8,10,12,18,20,33,87,93,111,200};
        System.out.println(binarySearch(num,87));
    }

    private static int binarySearch(int num[],int i) {
        int l = 0;
        int h=num.length-1;
        while(l<=h){
            int mid = l+(h-l)/2;
          if(num[mid]==i){
              return mid;
          }
          if(num[mid]>i){
              h= mid-1;

          } else if(num[mid]<i){
              l = mid+1;

          }
        }
        return -1;
    }
}
