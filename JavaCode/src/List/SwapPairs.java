package List;

/**
 * 交换链表中的相邻节点
 * 输入: 1->2->3->4->NULL
 * 输出: 2->1->4->3->NULL
 */
public class SwapPairs {

    public ListNode SwapPairs(ListNode head){
        if(head == null || head.next == null){
            return null;
        }
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode pre = result;
        while(pre.next != null && pre.next.next != null){
            ListNode node1 = pre.next;
            ListNode node2 = pre.next.next;
            pre.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            pre = pre.next.next;
        }
        return result.next;
    }
}
