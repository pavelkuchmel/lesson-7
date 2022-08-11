import java.util.Scanner;

public class classwork1108 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /*
--------------------------------------------------------------------------------------------------------
         */
        /*
        int num;
        do{
            System.out.print("Введите число от 1 до 3: ");
            num = in.nextInt();
        }while (num<1||num>3);
        */
        /*
--------------------------------------------------------------------------------------------------------
         */
        /*
        int array[] = new int[10];
        int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //заполнить массив случайными данными
        for (int i = 0;i<array1.length;i++){
            array[i]=(int)(Math.random()*10); //array[i]=(int)(Math.random()*11)-5;     --- вывод случайных чисел И положительных И отрицательных
        }                                     //класс Arrays - cервисный класс массивов. Arrays.toString вывод в строку
        //вывод массива в строку              //не забыть импортировать import java.util.Arrays;
        for (int i = 0;i<array1.length;i++){
            System.out.print(array[i]+" ");
        }
         */
        /*
-------------------------------------------------------------------------------------------------------
         */
        //Array1. Дано целое число N (>0).
        //Сформировать и вывести целочисленный массив размера N,
        //содержащийN первыхположительныхнечетныхчисел: 1, 3, 5, ... .
        /*
        int n;
        do{
            System.out.print("Enter size array: "); //тест цикла do-while - что-то типа защиты от дурака
            n = in.nextInt();
        }while (n<1);
        int[] array = new int[n];
        int j = 1;
        for (int i = 0;i<array.length;i++){
            array[i]=j;
            j+=2;
        }
        for (int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
         */
        /*
------------------------------------------------------------------------------------------------------
         */
        //Array3. Дано целое число N (>1),
        //а также первый член A и разность D арифметической прогрессии.
        //Сформировать и вывести массив размера N,
        //содержащий N первых членов данной прогрессии: A, A+D, A+2·D, A+3·D, ... .
        /*
        System.out.print("Введите рамер массива: ");
        int size = in.nextInt();
        int[] arifm = new int[size];
        int a = in.nextInt();
        int d = in.nextInt();
        arifm[0] = a;                         //эту строку убираем
        for (int i = 1;i< arifm.length;i++){  //for(int i = 0;i<arifm;i++){
            arifm[i] = a + i * d;             //    arifm[i] = a + i * d;
        }                                     //}
        for (int i = 0;i<arifm.length;i++) {
            System.out.print(arifm[i] + " ");
        }
         */
        /*
-------------------------------------------------------------------------------------------------------
         */
        //Array5. Дано целое число N (>2). Сформировать и вывести целочисленный массив размера N,
        //содержащий N первых элементов последовательности чисел Фибоначчи FK:
        //F1 = 1, F2 = 1, FK = FK−2 +FK−1, K = 3,4,... .
        /*
        System.out.print("Введите рамер массива: ");
        int size = in.nextInt();
        int[] fibonachi = new int[size];
        for (int i = 0, j=1;i<fibonachi.length;i++, j+=i){
            fibonachi[i]=j;
        }
        for (int i = 0;i<fibonachi.length;i++) {
            System.out.print(fibonachi[i] + " ");
        }
        */
        /*
-------------------------------------------------------------------------------------------------------
         */
        //Array7. Массив размера N аполнить случайными целыми числами.
        //Вывести его элементы в прямом и обратном порядке на разных строках.
        /*
        System.out.println("Вывести размер массива: ");
        int size = in.nextInt();
        int[] nums = new int[size];
        for (int i = 0;i< nums.length;i++){
            nums[i]=(int)(Math.random()*10);
        }
        int j = nums.length;
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println(" ");
        for (int i = (j-1);i>=0;i--){
            System.out.print(nums[i]+" ");
           }
         */
        /*
-------------------------------------------------------------------------------------------------------
         */
        //Array8. Дан целочисленный массив размера N.
        //Вывести все содержащиеся в данном массиве нечетные числа
        //в порядке возрастания их индексов, а также их количество K.
        /*
        System.out.print("Вывести размер массива: ");
        int size = in.nextInt();
        int[] nums = new int[size];
        for (int i = 0;i<nums.length;i++){
            nums[i]=(int)(Math.random()*10);
        }
        int check = 0;
        for (int i = 0;i< nums.length;i++){
            if (nums[i]%2!=0){
                System.out.print(nums[i]+" ");
                check++;
            }
        }
        System.out.println("\n \n"+check);
         */
        /*
--------------------------------------------------------------------------------------------------------
         */
        //Array9. Дан целочисленный массив размера N.
        //Вывести все содержащиеся в данном массиве четные числа в
        //порядке убывания их индексов, а также их количество K.
        /*
        System.out.print("Вывести размер массива: ");
        int size = in.nextInt();
        int[] nums = new int[size];
        for (int i = 0;i<nums.length;i++){
            nums[i]=(int)(Math.random()*10);
        }
        int check = 0;
        int j = nums.length;
        for (int i = (j-1);i>=0;i--) {
            if (nums[i]%2==0){
                System.out.print(nums[i]+" ");
                check++;
            }
        }
        System.out.println("\n \n"+check);
         */
        /*
---------------------------------------------------------------------------------------------------------
         */
        //Array10. Дан целочисленный массив размера N.
        //Вывести вначале все содержащиеся в данноммассиве четные числа
        //в порядке возрастания их индексов, а затем — все нечетные числа в порядке убывания их индексов.
        System.out.print("Вывести размер массива: ");
        int size = in.nextInt();
        int[] nums = new int[size];
        for (int i = 0;i<nums.length;i++){
            nums[i]=(int)(Math.random()*10);
        }
        int j = nums.length;
        int check = 0;
        int check1 = 0;
        for (int i = 0;i< nums.length;i++){
            if (nums[i]%2!=0){
                System.out.print(nums[i]+" ");
                check++;
            }
        }
        System.out.println('\n');
        for (int i = (j-1);i>=0;i--) {
            if (nums[i]%2==0){
                System.out.print(nums[i]+" ");
                check1++;
            }
        }
        System.out.println("\n \nКоличество нечетных: "+check);
        System.out.println("\nКоличество четных: "+check1);


    }
}
