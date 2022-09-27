import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Module1 Test cases
        //test case 1
        testModule1(new int[]{1,5,34,7,8,4,1123,5,778});

        //test case 2
        testModule1(new int[]{-3,6,3});

        //test case 3
        testModule1(new int[]{1,2,3,4,5,5,4,3,2,1});

        //Module2 Test cases
        //test case 1
        testModule2(new int[][]{{1,2,3},{1,2,3},{1,2,3}});

        //test case 2
        int[][] arr = new int[10][10];
        int ctr = 1;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = ctr;
                ctr++;
            }
        }
        testModule2(arr);

        //test case 3
        testModule2(new int[][]{{1}});
    }

    private static void testModule1(int[] arr) {
        //ask user what they would like to do to the array
        Scanner scanner = new Scanner(System.in);
        Module1 module1 = new Module1(arr);
        int a;
        while (true) {
            while (true) {
                System.out.println("1 - getAtIndex");
                System.out.println("2 - setAtIndex");
                System.out.println("3 - findIndexOf");
                System.out.println("4 - printAll");
                System.out.println("5 - deleteAtIndex");
                System.out.println("6 - expand");
                System.out.println("7 - shrink");
                a = Integer.parseInt(scanner.nextLine());
                if (a > 7 || a < 1) {
                    System.out.println("Enter a value between 1 and 7");
                    continue;
                }
                break;
            }//checks which option they chose and executes what they chose
            switch (a) {
                case 1:
                    System.out.println(module1.getAtIndex());
                    break;
                case 2:
                    module1.setAtIndex();
                    break;
                case 3:
                    System.out.println(module1.findIndexOf());
                    break;
                case 4:
                    module1.printAll();
                    break;
                case 5:
                    module1.deleteAtIndex();
                    break;
                case 6:
                    module1.expand();
                    break;
                case 7:
                    module1.shrink();
                default:
                    break;
            }
            //If the input is a 1, the loop continues, if it is not  a 1, then the loop breaks and the program ends
            System.out.println("Would you like to continue? 1 for yes, anything else for no");
            a = Integer.parseInt(scanner.nextLine());
            if (a == 1) {
                continue;
            }
            break;
        }
    }

    private static void testModule2(int[][] arr) {
        //creates a new Module2 named module2
        Module2 module2 = new Module2(arr);//calls default constructor
        Scanner scanner = new Scanner(System.in);

        //ask user what they would like to do to the array
        int a;
        while (true) {
            while (true) {
                System.out.println("1 - getAtIndex");
                System.out.println("2 - setAtIndex");
                System.out.println("3 - findIndexOf");
                System.out.println("4 - printAll");
                System.out.println("5 - deleteAtIndex");
                System.out.println("6 - expand");
                System.out.println("7 - shrink");
                a = Integer.parseInt(scanner.nextLine());
                if (a > 7 || a < 1) {
                    System.out.println("Enter a value between 1 and 7");
                    continue;
                }
                System.out.println("Valid Choice");
                break;
            }
            //switch case to see what option they chose
            switch (a) {
                case 1:
                    System.out.println(module2.getAtIndex());
                    break;
                case 2:
                    module2.setAtIndex();
                    break;
                case 3:
                    int[] temp = module2.findIndexOf();
                    System.out.println("The value is in row " + temp[0] + ", column " + temp[1]);
                    break;
                case 4:
                    module2.printAll();
                    break;
                case 5:
                    module2.deleteAtIndex();
                    break;
                case 6:
                    module2.expand();
                    break;
                case 7:
                    module2.shrink();
                default:
                    break;
            }
            //asks if user would lik to continue. Yes continues the loop, anything else breaks the loop and ends the
            //program
            System.out.println("Would you like to continue? 1 for yes, anything else for no");
            a = Integer.parseInt(scanner.nextLine());
            if (a == 1) {
                continue;
            }
            break;
        }
    }
}