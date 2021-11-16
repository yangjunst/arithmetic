/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/9/11 16:40
 * Program Goal:
 *********************************************/
class Sort{
    public static void main(String[] args) {
        int[] array = new int[10000];
        // bubble Sort
        long start1 = System.currentTimeMillis();
        for (int k = 0; k < 10; k++) {
            for (int j = 0; j < array.length; j++) {
                array[j] =(int)(Math.random() * 10000);
            }
            bubbleSort(array);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Bubble Sort->");
        System.out.println(end1 - start1);
        //insert Sort
        long start2 = System.currentTimeMillis();
        for (int k = 0; k < 10; k++) {
            for (int j = 0; j < array.length; j++) {
                array[j] =(int)(Math.random() * 10000);
            }
            insertSort(array);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Insert Sort->");
        System.out.println(end2 - start2);
        //select sort
        long start3 = System.currentTimeMillis();
        for (int k = 0; k < 10; k++) {
            for (int j = 0; j < array.length; j++) {
                array[j] =(int)(Math.random() * 10000);
            }
            selectSort(array);
        }
        long end3 = System.currentTimeMillis();
        System.out.println("Select Sort->");
        System.out.println(end3 - start3);
    }
    public static void bubbleSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < array.length; i++) {
            boolean flag=true;
            for (int j = 1; j < length-i-1; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    flag=false;
                }
            }
            if(flag){
                return;
            }
        }
    }

    public static void insertSort(int[] array) {
        int insertNode;
        int j;
        for (int i = 1; i < array.length; i++) {
            insertNode = array[i];
            j = i - 1;
            while(j >= 0 && insertNode < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = insertNode;
        }
    }

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[pos] > array[j]) {
                    pos = j;
                }
            }
            if (pos != i) {
                int temp = array[i];
                array[i] = array[pos];
                array[pos] = temp;
            }
        }
    }
}
class A {
    public static void f1() {
        System.out.println("f1");
        f2();
    }

    public static void f2() {
        System.out.println("f2");
        f3();
    }

    public static void f3() {
        System.out.println("f3");
    }
}

public class Test {
    public static void m1() {
        System.out.println("m1");
        m2();
        System.out.println("after....");
    }

    public static void m2() {
        System.out.println("m2");
        m3();
        System.out.println("after....");
    }

    public static void m3() {
        System.out.println("m3");
        m4();
        System.out.println("after....");
    }

    public static void m4() {
        System.out.println("m4");
        A.f1();
        System.out.println("after....");
    }

    public static void main(String[] args) {
        m1();
    }
}
