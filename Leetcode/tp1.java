import java.util.ArrayList;

public class tp1 {
    public static void main(String[] args) {
        ArrayList<Integer> store = new ArrayList();
        store.add(1000);
        store.add(100);
        store.add(1000);
        store.add(10);
        store.add(100);
        store.add(1);
        store.add(5);
        for (Integer ele : store) {
            System.out.print(ele + " ");
        }
        for(int i=0;i<store.size()-1;i++) {
            if(store.get(i)<store.get(i+1)) {
                int put = store.get(i);
                store.set(i,-put);
            }
        }
        System.out.println();
        for (Integer ele : store) {
            System.out.print(ele + " ");
        }

    }
}
