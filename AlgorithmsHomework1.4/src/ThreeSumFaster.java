import java.util.Arrays;

public class ThreeSumFaster
{
    public static void main(String[] args)
    {
        int len = 0;
        for (String arg : args)
            if (arg != null)
                len++;
        Integer[] a = new Integer[len];
        for (int i = 0; i < len; i++)
            a[i] = Integer.parseInt(args[i].trim());

        System.out.println(count(a));
    }

    private static int count(Integer[] a)
    {
        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            Integer[] tmp = Arrays.copyOfRange(a, i + 1, a.length);
            count += TwoSumFaster.count(tmp, -a[i]);
        }

        return count;
    }
}
