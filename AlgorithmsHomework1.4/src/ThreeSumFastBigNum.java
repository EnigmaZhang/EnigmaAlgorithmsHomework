import java.math.BigInteger;
import java.util.Arrays;

class ThreeSumFastBigNum
{
    public static void main(String[] args)
    {
        int len = 0;
        for (String arg : args)
            if (arg != null)
                len++;
        BigInteger[] a = new BigInteger[len];
        for (int i = 0; i < len; i++)
            a[i] = BigInteger.valueOf(Long.parseLong(args[i].trim()));
        System.out.println(count(a));
    }

    private static int count(BigInteger[] a)
    {
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if (BinarySearch.rank((a[i].add(a[j])).negate(), a) > j)
                    cnt++;
        return cnt;
    }
}

