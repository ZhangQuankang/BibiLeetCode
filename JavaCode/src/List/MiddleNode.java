package List;

/**
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 *
 * 例如：
 * 输入：[1,2,3,4,5]
 * 输出：此列表中的结点 3 (序列化形式：[3,4,5])
 */
public class MiddleNode {
    public ListNode middleNode(ListNode head){
        //定义快慢指针
        ListNode slow = head,fast = head;
        //快指针每次两步，慢指针每次一步
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
