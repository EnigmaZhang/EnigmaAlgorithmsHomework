import java.util.HashMap;

public class TwoSumFaster
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

        System.out.println(count(a, 0));
    }

    static int count(Integer[] a, Integer sum)
    {
        int count = 0;
        HashMap<Integer, Integer> a_hash = new HashMap<>();
        // Use hash to count elements.
        for (Integer key : a)
            a_hash.put(key, a_hash.getOrDefault(key, 0) + 1);
        for (Integer key : a)
            if (a_hash.containsKey(-key + sum))
            {
                count += a_hash.get(-key + sum);
                // Make sure not to count 0 twice.
                if (key == 0)
                    count--;
            }
        return count / 2;
    }
}
