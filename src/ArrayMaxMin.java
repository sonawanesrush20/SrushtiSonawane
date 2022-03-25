import java.util.Scanner;
    class Max{
        public int Max(int arr[]){
            int max=arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]>max)
                    max=arr[i];
            }
            return max;
        }
    }
    class Min{
        public int Min(int arr[]){
            int min=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]<min)
                    min=arr[i];
            }
            return min;
        }
    }
    public class ArrayMaxMin {
        public static void main(String[] args) {
            Max m=new Max();
            Min m2=new Min();
            Scanner sc=new Scanner(System.in) ;
            System.out.println("enter length of an array");
            int n=sc.nextInt();
            int [] arr=new int[n];
            System.out.println("enter array elements");
            for(int j=0;j<arr.length;j++){
                arr[j]=sc.nextInt();
            }

            System.out.println("maximum number is"+ m.Max(arr));
            System.out.println("Minimum number is"+ m2.Min(arr));

        }
    }

