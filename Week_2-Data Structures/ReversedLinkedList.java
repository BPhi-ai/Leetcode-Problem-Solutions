class ReversedLinkedList {
    public static void main(String[] args) {
       ListNode head = new ListNode(1);
       head.next = new ListNode(2);
       head.next.next = new ListNode(3);
       head.next.next.next = new ListNode(4);
       ListNode reversed = ReversedLinkedListSolution(head);

       reversed.printList(reversed);

    }

    public static ListNode ReversedLinkedListSolution(ListNode head) {
        ListNode prev = null;

        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
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