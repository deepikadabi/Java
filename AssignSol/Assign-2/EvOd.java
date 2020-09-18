// Sum of Even & sum of odd
class EvOd{
    public static void main(String args[])
    {
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        int sumE=0;
        int sumO=0;
        for(int i=0;i<10;i++)
        {
            if(arr[i]%2==0)
            {
                sumE=sumE+arr[i];
            }
            else
            {
                sumO=sumO+arr[i];
            }
        }
        System.out.println(sumE);
        System.out.println(sumO);

    }
}