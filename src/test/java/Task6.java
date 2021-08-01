public class Task6 {
    public void oneAndZero()
    {
        int[] arr = {1, 1, 0, 1, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 1)
            {
                arr[i] = 0;
            }
            else if (arr[i] == 0)
            {
                arr[i] = 1;
            }
            else if(arr[i] >= 2)
                throw new IllegalArgumentException("IllegalArgumentException in array");
            System.out.println(arr[i]);
        }
    }
}
