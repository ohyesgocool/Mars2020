package arrays;

public class MakeTwoArraysEqualByReversingSubArrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] line = new int[1001];

        // creating an temporary array to save the frequency
        for (int i = 0; i < arr.length; i++)
            line[arr[i]]++;

        // decreasing the frequency with the target array
        for (int i = 0; i < arr.length; i++)
            line[target[i]]--;

        // if the two arrays are same then the line array's all elements will be 0.
        // Otherwise at least one element will be something other than 0
        for (int i = 0; i < line.length; i++)
            if (line[i] != 0)
                return false;

        return true;
    }
}
