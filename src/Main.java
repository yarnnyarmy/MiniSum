import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Long> ls = new ArrayList<>();
        List<Long> lsTemp = new ArrayList<>();
        List<Long> finalLs = new ArrayList<>();
        Scanner sn = new Scanner (System.in);

        System.out.println("Enter length of list");
        int n = sn.nextInt();
        System.out.println("Enter the numbers of the list.");
        for (int i = 0; i < n; i++){
            long num = sn.nextInt();
            ls.add(num);
            lsTemp.add(num);
        }
        int count = 0;

        while (count < ls.size()) {
            long answer = 0;
            for (int i = 0; i < ls.size(); i++) {
                if (i != count) {
                    answer += ls.get(i);
                }
            }
            finalLs.add(answer);
            count++;
        }

        Collections.sort(finalLs);

        System.out.println(finalLs.get(0));
        System.out.println(finalLs.get(finalLs.size() - 1));

    }
}