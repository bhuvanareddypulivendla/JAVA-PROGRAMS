 import java.util.*;

public class settypes
{
	public static void main(String[] args) {
    
HashSet <Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(60);
        hs.add(70);
        hs.add(80);

        //1.printing elements in Hashset
        System.out.println("set values"+hs);

        //2.Removing element from Hashset
        hs.remove(80);
        System.out.println("Set after removing 80" +hs);

        //3.Size of Hashset
        System.out.println("Size of Set is:" +hs.size());

        //4.Checking if a element is exist or not
        System.out.println("Is set conatians 30:" +hs.contains(30));

        //5.Iterating using for-each loop
        System.out.println("Iterating over tree set:");
        for (Integer set : hs) {
            System.out.println(set);
        }

        //6.clearing Hashset
        hs.clear();
        System.out.println("Hash set after clear(): " + hs);

        //7.Checking if Hashset is empty or not
        System.out.println("Is Hash set empty? " + hs.isEmpty());


TreeSet <Integer> tr=new TreeSet<>();
        tr.add(10);
        tr.add(20);
        tr.add(30);
        tr.add(40);
        tr.add(50);
        tr.add(60);
        tr.add(70);
        tr.add(80);
        //1.printing Treeset
        System.out.println("tree values" +tr);

        //2.removing a element
        tr.remove(80);
        System.out.println("After removing 80: " + tr);

        //3.Check if element exists
        System.out.println("Contains 70: " + tr.contains(70));
        System.out.println("Contains 80: " + tr.contains(80));

        //4. Size of TreeSet
        System.out.println("Size of TreeSet: " + tr.size());

        //5. Iterating using for-each loop
        System.out.println("Iterating over TreeSet:");
        for (Integer tree : tr) {
            System.out.println(tree);
        }

        //6. First and Last elements
        System.out.println("First element: " + tr.first());
        System.out.println("Last element: " + tr.last());

        //7.cieling and floor of Tree Set
        System.out.println("Ceiling of 40: " + tr.ceiling(40));
        System.out.println("Floor of 40: " + tr.floor(40));

        //8.Clearing the TreeSet
        tr.clear();
        System.out.println("After clear(): " + tr);
        System.out.println("Is TreeSet empty? " + tr.isEmpty());

    }
}

