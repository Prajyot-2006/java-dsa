
import java.util.ArrayList;

public class basic01 {
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();   normal 1D arrayList
        ArrayList< ArrayList<Integer> > arr = new ArrayList<>();  // 2D ArrayList
//        arr.add(10); // we cannot add single elements in 2d arraylist (directly) this gives error 
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(10);
        b.add(20);
        b.add(30);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(100);
        c.add(200);
        c.add(300);
        c.add(400);

        // now adding these 1d arraylists into 2d arraylist
        arr.add(a);  // index 0 of arr 
        arr.add(b);  // index 1 of arr
        arr.add(c);  // index 2 of arr

        // first way to print 2d arraylist same as we do in normal arraylist
        System.out.println(arr);

        System.out.println("");
        // 2nd way to print 2d arraylist just like rows and columns 
        for(int i=0;i<arr.size();i++) {
            for(int j=0;j<arr.get(i).size();j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println("");
        }

        System.out.println();
        // 3rd way to print 2d arraylist using foreach loop
        for (ArrayList<Integer> list : arr) {  // list = arr[0] then arr[1] then arr[2] 
            for(int ele : list) {
                System.out.print(ele + " ");
            }
            System.out.println("");
        }
    }
}
