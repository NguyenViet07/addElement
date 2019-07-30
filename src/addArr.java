import java.util.Scanner;

public class addArr {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print("nhap vao so can chen: ");
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        System.out.print("nhap vao vi tri can in: ");
        int index = input.nextInt();
        arr = addElement(arr,X,index);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "\t");
        }
    }
    private static int[] addElement(int arr[], int element, int index) {
        int []newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = element;
        for (int i = index + 1; i < arr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }
}
