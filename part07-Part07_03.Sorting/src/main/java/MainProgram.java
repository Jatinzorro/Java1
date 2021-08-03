
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
       
    }
    
    public static int smallest(int[] array){
        int small=array[0];
        for(int i=0;i<array.length;i++){
            if(small>=array[i]){
                small=array[i];
            }
        }
        return small;
    }
    
    public static int indexOfSmallest(int[] array){
        int index=0;
        for(int i=0;i<array.length;i++){
            if(smallest(array)==array[i]){
                index=i;
                break;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int small=table[startIndex];
        int index=0;
        for(int i=startIndex;i<table.length;i++){
            if(small>=table[i]){
                small=table[i];
                index=i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
    
    public static void sort(int[] array) {
        int index=0;
        System.out.println(Arrays.toString(array));
        
        while(index<array.length){
            swap(array,index,indexOfSmallestFrom(array,index));
            System.out.println(Arrays.toString(array));
            
            index+=1;
        }
    }

}
