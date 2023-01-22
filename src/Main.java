public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Task 1");
        int[] numb3;
        numb3 = new int[]{1, 2, 3};
        double[] numbFloat = {1.57, 7.654, 9.986};
        int[] myNumb = new int[4];
        myNumb = new int[]{3, 2, 1, 0};
    }

    public static void task2() {
        System.out.println("Task 2");
        int[] numb32;
        numb32 = new int[]{1, 2, 3};
        double[] numbFloat2 = {1.57, 7.654, 9.986};
        int[] myNumb2 = new int[4];
        myNumb2 = new int[]{3, 2, 1, 0};
        for (int i1 = 0; i1 < numb32.length; i1++) {
            if (i1 == numb32.length - 1) {
                System.out.print(numb32[i1]);
                break;
            }
            System.out.print(numb32[i1] + ", ");
        }
        System.out.println(" ");
        for (int i2 = 0; i2 < numbFloat2.length; i2++) {
            if (i2 == numbFloat2.length - 1) {
                System.out.print(numbFloat2[i2]);
                break;
            }
            System.out.print(numbFloat2[i2] + ", ");
        }
        System.out.println(" ");
        for (int i3 = 0; i3 < myNumb2.length; i3++) {
            if (i3 == myNumb2.length - 1) {
                System.out.print(myNumb2[i3]);
                break;
            }
            System.out.print(myNumb2[i3] + ", ");
        }
        System.out.println(" ");

    }

    public static void task3() {
        System.out.println("Task 3");
        int[] numb33;
        numb33 = new int[]{1, 2, 3};
        double[] numbFloat3 = {1.57, 7.654, 9.986};
        int[] myNumb3 = new int[4];
        myNumb3 = new int[]{3, 2, 1, 0};
        for (int i1 = 2; i1 < numb33.length; i1--) {
            if (i1 == numb33.length - 3) {
                System.out.print(numb33[i1]);
                break;
            }
            System.out.print(numb33[i1] + ", ");
        }
        System.out.println(" ");
        for (int i2 = 2; i2 < numbFloat3.length; i2--) {
            if (i2 == numbFloat3.length - 3) {
                System.out.print(numbFloat3[i2]);
                break;
            }
            System.out.print(numbFloat3[i2] + ", ");
        }
        System.out.println(" ");
        for (int i3 = 3; i3 < myNumb3.length; i3--) {
            if (i3 == myNumb3.length - 4) {
                System.out.print(myNumb3[i3]);
                break;
            }
            System.out.print(myNumb3[i3] + ", ");
        }
        System.out.println(" ");
    }

    public static void task4() {
        System.out.println("Task 4");

    }
}