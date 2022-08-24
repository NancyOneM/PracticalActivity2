package activity2;

public class Question5 {
    public static void main(String[] arg) {
      /*  int myArrayInt[] = new int [10];
        myArrayInt [0] = 2;
        myArrayInt [1] = 4;
        myArrayInt [2] = 6;
        myArrayInt [3] = 8;
        myArrayInt [4] = 10;
        myArrayInt [5] = 12;
        myArrayInt [6] = 14;
        myArrayInt [7] = 16;
        myArrayInt [8] = 18;
        myArrayInt [9] = 20;*/

        int myArrayInt[] = {2, 4, 6,8, 10, 12,14,16,18,20};
        int sum = 0;
        for(int i : myArrayInt)
           sum = sum + i;
            System.out.println("The Average is: "+sum/10);
        }

   }

