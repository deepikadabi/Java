public class Sort {
    public static void main(String args[]){
        int arr[]={2, 4,1,7,5,10,6,1,15,3};
        for(int k=0;k<arr.length;k++)

        System.out.print(arr[k]+"  ");
        System.out.println("");

        System.out.println("===================");
// SElection sort
/*
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
*/
//Bubbl sort
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
            for(int k=0;k<arr.length;k++)

            System.out.print(arr[k]+"  ");

            System.out.println("");


        }

        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"  ");
    }
}
