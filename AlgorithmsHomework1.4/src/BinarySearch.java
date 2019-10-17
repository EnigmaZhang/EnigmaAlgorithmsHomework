import java.math.BigInteger;

class BinarySearch
{
    static int rank(int key, int[] a)
    {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    static int rank(BigInteger key, BigInteger[] a)
    {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if (key.compareTo(a[mid]) < 0)
                hi = mid - 1;
            else if (key.compareTo(a[mid]) > 0)
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
