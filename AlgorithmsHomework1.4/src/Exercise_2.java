/*
 *  This code uses BigNumber class to avoid integer overflow in ThreeSum.
 *  @author:Enigma Zhang
 */

import java.io.*;

public class Exercise_2
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
        ThreeSumFastBigNum.main(lines);
    }
}




