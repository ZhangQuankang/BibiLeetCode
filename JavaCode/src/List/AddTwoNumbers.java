package List;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class AddTwoNumbers {
    public ListNode add2Num(ListNode l1,ListNode l2){
        //定义一个新的链表，用于存储结果
        ListNode result = new ListNode(0);
        ListNode p = l1, q = l2, cur = result;
        //进位
        int carry = 0;
        //两个加数至少有一个不为空
        while( p != null || q != null){
            //给两个加数赋值
            int x = (p != null) ? p.val:0;
            int y = (q != null) ? q.val:0;
            //单个位加法计算，加上进位
            int sum = carry + x + y;
            //计算进位
            carry = sum / 10;
            //将进位进给高位
            cur.next = new ListNode(sum % 10);
            //计算下一位
            cur = cur.next;
            if(p!=null){
                p = p.next;
            }
            if(q!=null){
                q =q.next;
            }
        }
        //最后判断最高位是否还有进位
        if(carry > 0){
            cur.next = new ListNode(carry);
        }
        return result.next;
    }
}
