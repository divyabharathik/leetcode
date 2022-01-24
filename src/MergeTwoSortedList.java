public class MergeTwoSortedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));


        ListNode result = mergeTwoLists(l1, l2);
        while (result.next != null) {
            System.out.println(result.val);
            result = result.next;
        }


    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode temp = new ListNode(0);
//        ListNode listNode = temp;
//        while (list1.next != null && list2.next != null) {
//            if (list1.val < list2.val) {
//                listNode.next = list1;
//                list1 = list1.next;
//            } else {
//                listNode.next = list2;
//                list2 = list2.next;
//            }
//            listNode = listNode.next;
//        }
//        if (list1 != null) {
//            listNode.next = list1;
//            list1 = list1.next;
//        }
//        if (list2 != null) {
//            listNode.next = list2;
//            list2 = list2.next;
//        }
//        return temp.next;

        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                curr.next = p1;
                p1 = p1.next;
            } else {
                curr.next = p2;
                p2 = p2.next;
            }
            curr = curr.next;
        }
        if (p1 != null) {
            curr.next = p1;
        } else if (p2 != null) {
            curr.next = p2;
        }
        return head.next;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}