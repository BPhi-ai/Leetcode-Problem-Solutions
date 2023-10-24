class LinkedListCycle {
    public static void main(String[] args) {
       ListNode head = new ListNode(1);
       head.next = new ListNode(2);
       head.next.next = new ListNode(3);
       head.next.next.next = new ListNode(4);
       ListNode reversed = LinkedListCycleSolution(head);
       System.out.println(hasCycle(reversed));
       //value indicates position of which the cycle happens in the linked list.

       reversed.printList(reversed);

    }

    public static ListNode LinkedListCycleSolution(ListNode head) {
        ListNode prev = null;

        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    //parameter pos is not given, therefore this is the solution that Leetcode gives.
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    static class ListNode {
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

        void printList(ListNode node) {
            while(node != null) {
                System.out.print(node.val + " ");
                node = node.next;
            }
        }
    }
}

//finished up to this point.