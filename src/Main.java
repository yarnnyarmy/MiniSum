import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Create list
        List<Long> ls = new ArrayList<>();
        List<Long> lsTemp = new ArrayList<>();
        List<Long> finalLs = new ArrayList<>();
        Scanner sn = new Scanner (System.in);

        System.out.println("Enter length of list");

        //Add the length of the list from user input
        int n = sn.nextInt();
        System.out.println("Enter the numbers of the list.");

        //For loop to add user numbers to list
        for (int i = 0; i < n; i++){
            long num = sn.nextInt();
            ls.add(num);
            lsTemp.add(num);
        }
        //Count is zero after the for loop finishes add one to the count
        //if count is less than the size of the array break out the while loop
        int count = 0;

        while (count < ls.size()) {

            //the numbers in the list will be added to the list after each cycle
            long answer = 0;
            for (int i = 0; i < ls.size(); i++) {

                //if count and i are not equal then add to the list
                if (i != count) {
                    answer += ls.get(i);
                }
            }
            finalLs.add(answer);
            count++;
        }

        //sort the list
        Collections.sort(finalLs);

        //get the first number in the list and the last number in the list
        System.out.println(finalLs.get(0));
        System.out.println(finalLs.get(finalLs.size() - 1));

    }
}