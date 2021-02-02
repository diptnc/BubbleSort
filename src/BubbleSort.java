public class BubbleSort {

public void sort(double arr[]){
    int n = arr.length;
    for (int i=0; i<n-1;i++){
        for (int j=0; j<n-i-1; j++){
            if (arr[j]>arr[j+1]){
                double  temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    display(arr);

}
public void display(double arr[]){
    for (int i =0; i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
    public static void main(String[] args) {
            double arr[]={2,7,8,9,2,67.84,93};
            BubbleSort obj=new BubbleSort();
            obj.sort(arr);
    }

}
