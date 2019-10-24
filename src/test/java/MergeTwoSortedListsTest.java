import model.ListNode;
import org.junit.Test;

public class MergeTwoSortedListsTest {



    @Test
    public void test(){

        ListNode n1 = new ListNode(1);

        ListNode n2 = new ListNode(2);
        n1.next = n2;

        ListNode n3 = new ListNode(4);
        n2.next = n3;


        ListNode n4 = new ListNode(1);

        ListNode n5 = new ListNode(3);
        n4.next=n5;
        ListNode n6 = new ListNode(4);
        n5.next=n6;

        ListNode result = MergeTwoSortedLists.mergeTwoLists(n1, n4);

        System.out.println(result);
    }



    @Test
    public void test2(){

        ListNode n1 = new ListNode(5);

        ListNode n4 = new ListNode(1);

        ListNode n5 = new ListNode(2);
        n4.next=n5;
        ListNode n6 = new ListNode(4);
        n5.next=n6;

        ListNode result = MergeTwoSortedLists.mergeTwoLists(n1, n4);

        System.out.println(result);
    }


}
