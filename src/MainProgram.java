public class MainProgram {
    private static int bubbleSwap = 0;
    private static int newLoop = 0;

    public static void main(String[] args) {
        int[] array = new int[5];
        setRandomArray(array);
        //setSetArray(array);
        System.out.println();
        sortArray(array);
        printArrayAfterSort(array);
    }

    private static boolean isSorted(int[] array){
        for(int i = 0; i< array.length-1; i++){
            if(array[i] > array[i+1])
                return false;
        }
        return true;
    }

    private static void sortArray(int[] array){
        for(int i = 1; i < array.length; i++){
            //newLoop += 1;
            for(int j = 0; j < array.length-i; j++){
                if(array[j] > array[j+1]){
                    swap(array,j);
                    //bubbleSwap += 1;
                }
            }
        }
    }

    private static void sortArray2(int[] array){
        for(int i = 1; i < array.length; i++){
            //newLoop += 1;
            if(isSorted(array))
                return;
            for(int j = 0; j < array.length-i; j++){
                if(array[j] > array[j+1]){
                    swap(array,j);
                    //bubbleSwap += 1;
                }
            }
        }
    }


    private static void printArrayAfterSort(int[] array){
        for(int i = 0; i < array.length; i++)
            System.out.println(array[i]);
        System.out.println();
        System.out.println("bubbleSwap = " + bubbleSwap);
        System.out.println("newLoop = " + newLoop);
    }

    private static void swap(int[] array, int i){
        int help = array[i];
        array[i] = array[i+1];
        array[i+1] = help;
    }

    private static void setRandomArray(int[] array){
        for(int i = 0; i < array.length ; i++){
            array[i] = (int)(Math.random()*101);
            System.out.println(array[i]);
        }
    }
    private static void setSetArray(int[] array){
        array[0] = 1;
        array[1] = 2;
        array[2] = 4;
        array[3] = 5;
        array[4] = 3;
        for(int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}