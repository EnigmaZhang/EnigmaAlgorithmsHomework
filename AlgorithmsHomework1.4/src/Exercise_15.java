/*
 *  This code uses a faster linear algorithm to solve TwoSum problem,
 *  and a quadratic algorithm to solve ThreeSum
 *  @author:Enigma Zhang
 */

import java.io.*;

public class Exercise_15
{
    public static void main(String[] args) throws IOException
    {
        String[] lines = new String[10000];
        try (BufferedReader in = new BufferedReader(new FileReader("Resource/2Kints.txt")))
        {
            String tmp;
            for (int i = 0; (tmp = in.readLine()) != null; i++)
                lines[i] = tmp;
        }

        TwoSumFaster.main(lines);
        ThreeSumFaster.main(lines);
    }
}
