package strings;

//https://leetcode.com/problems/rings-and-rods/
public class RingsAndRods {
    public int countPoints(String rings) {
        int rods[] = new int[10];

        // Traverse and turn bit corresponding to the character found
        // in the respective ring
        for (int i = 0; i < rings.length(); i += 2)
            rods[rings.charAt(i + 1) - '0'] |= (1 << (rings.charAt(i) - 'A'));

        // Count rods with all 3 bits turned on
        int count = 0;
        for (int i : rods) if (i == 131138) count++;
        return count;
    }
}
