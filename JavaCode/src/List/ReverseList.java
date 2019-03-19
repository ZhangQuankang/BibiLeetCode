package List;

/**
 * 反转链表：
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class ReverseList {

    public ListNode Solution(ListNode head) {
        ListNode preNode = null;
        ListNode nowNode = head;
        ListNode nextNode = null;
        while(nowNode != null){
            //下一节点赋值
            nextNode = nowNode.next;
            //反转节点
            nowNode.next = preNode;
            //pre和now节点后移，准备下一次操作
            preNode = nowNode;
            nowNode = nextNode;
        }
        return preNode;
    }
}
