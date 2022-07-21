    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            HashMap<Integer, Integer> map = new HashMap();
            int n = in.nextInt();
            int m = in.nextInt();
            int max = 0;

            for (int i = 0; i < n; i++) 
            {
            if (i >= m) 
            {
                int old = deque.removeFirst();
                //System.out.println(old);
                if (map.get(old) == 1)
                {
                    map.remove(old);
                } else {
                    map.merge(old, -1, Integer::sum);
                }
            }
            
            int num = in.nextInt();
            deque.addLast(num);
            map.merge(num, 1, (Integer::sum));
            
            max = Math.max(max, map.size());
            
            if (max == m) 
            {
                break;
            }
        }
        
        in.close();
        System.out.println(max);
    }
}



