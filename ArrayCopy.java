import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {
        int[] array1 = {10,20,30};
        int[] array2 = {40, 50, 60};

        int array1Len = array1.length;
        int array2Len = array2.length;
        int[] compeletArray = new int[array1Len + array2Len];

        System.arraycopy(array1, 0, compeletArray, 0, array1Len);
        System.arraycopy(array2, 0, compeletArray, array1Len, array2Len);

        System.out.println(Arrays.toString(compeletArray));
    }
}

