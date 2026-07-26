public class findElem05 {
    public static void main(String[] args) {
        int arr[] = {2,5,1,76,4};
        int ele = 76;
        int ans = exists(arr,ele,0);
        System.out.println(ans);
    }
    public static int exists(int arr[] , int ele , int ind) {
        if(ind == arr.length) return 0;
        if(arr[ind]==ele) return ind;
        int send = exists(arr, ele, ind+1);
        return send;
    }
}