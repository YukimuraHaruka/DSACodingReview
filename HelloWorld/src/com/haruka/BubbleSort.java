package com.haruka;

public class BubbleSort {
    public void sort(int[] array){
        int arraySize = array.length;
        boolean isSorted;
        for(var i = 0; i < arraySize; i++){
            isSorted = true;
            for(var j = 1; j < arraySize - i; j++)
                if(array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                    isSorted = false;
                }
            if(isSorted)
                return;
        }
    }
    private void swap(int[] array, int index1, int index2){
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
