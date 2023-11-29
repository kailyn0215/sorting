public class Tester
{
    public static void main(String[] args)
    {
        int arr[] = {2, 5, 1, 9};
        int temp;

        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] > arr[i + 1])
            {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                System.out.println("Swap " + arr[i] + " and " + arr[i + 1]);
            }
        }
        System.out.println(arr[1]);
    }
}