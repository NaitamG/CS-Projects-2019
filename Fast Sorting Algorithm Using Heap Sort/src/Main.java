public class Main {
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        Sorts ob = new Sorts();
        ob.heapSort(arr);

        System.out.println("Sorted array is");
        ob.printArray(arr);
    }
}
