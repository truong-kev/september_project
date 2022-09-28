import java.util.Scanner;

public class Module2 {
    private int[][] arr;
    private int input1, input2, input3;
    private Scanner scanner;

    //constructor
    public Module2(int[][] arr){
        this.arr = arr;
        scanner = new Scanner(System.in);
    }

    //default constructor
    public Module2(){
        arr = new int[10][10];
        int ctr = 1;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = ctr;
                ctr++;
            }
        }
        scanner = new Scanner(System.in);
    }

    //returns value at the specified indexes. i representing the row and j representing the column
    //returns -1  and prints"Out of bounds" if out of bounds
    public int getAtIndex() {
        System.out.println("Enter the first index");
        input1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the second index");
        input2 = Integer.parseInt(scanner.nextLine());
        if (input1 >= 0 && input1 < arr.length && input2 >= 0 && input2 < arr[input2].length) {
            return arr[input1][input2];
        }
        return -1;
    }

    //sets the value passed in at i,j. i representing the row and j representing the column.
    //if i or j are not in bounds, prints "Out of bounds"
    public void setAtIndex() {
        System.out.println("Enter the first index");
        input1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the second index");
        input2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter a value");
        input3 = Integer.parseInt(scanner.nextLine());
        if (input1 >= 0 && input1 < arr.length && input2 >= 0 && input2 < arr[input2].length) {
            arr[input1][input2] = input3;
            return;
        }
        System.out.println("Out of bounds");
    }

    //finds the index of the value that was passed in.
    //returns a 1d array, with index 0 being the row and index 1 being the column
    //returns an array {-1,-1} if value is not found in the 2d array
    public int[] findIndexOf() {
        System.out.println("Enter a value");
        input1 = Integer.parseInt(scanner.nextLine());
        int[] temp = {-1, -1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == input1) {
                    temp[0] = i;
                    temp[1] = j;
                    return temp;
                }
            }
        }
        return temp;
    }

    //goes through each row and column and prints the values in each seperated by a comma
    public void printAll() {
        String temp = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                temp = temp + arr[i][j] + ',';
            }
        }
        System.out.println(temp.substring(0, temp.length() - 1));
    }

    //deletes the value at the index and shifts everything in that row over by 1
    public void deleteAtIndex() {
        System.out.println("Enter the first index");
        input1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the second index");
        input2 = Integer.parseInt(scanner.nextLine());
        if (input1 >= 0 && input1 < arr.length && input2 >= 0 && input2 < arr[input1].length) {
            int temp[] = new int[arr[input1].length - 1];
            int k = 0;
            for (int l = 0; l < arr[input1].length; l++) {
                if (l != input2) {
                    temp[l - k] = arr[input1][l];
                } else {
                    k = 1;
                }
            }
            arr[input1] = temp;
            return;
        }
        System.out.println("Out of bounds");
    }

    //expands the 2d array by 1 column and 1 row. Assigns everything in those rows and columns to 0
    public void expand(){
        int temp[][] = new int[arr.length + 1][arr[0].length + 1];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                temp[i][j] = arr[i][j];
            }
            temp[i][arr.length] = 0;
        }
        for(int i = 0; i < temp[0].length; i++){
            temp[temp.length - 1][i] = 0;
        }
        arr = temp;
    }

    //shrinks the array by 1 row and 1 column
    public void shrink(){
        int temp[][] = new int[arr.length - 1][arr[0].length - 1];
        for(int i = 0; i < temp.length; i++){
            for(int j = 0; j < temp.length; j++){
                temp[i][j] = arr[i][j];
            }
        }
        arr = temp;
    }
}