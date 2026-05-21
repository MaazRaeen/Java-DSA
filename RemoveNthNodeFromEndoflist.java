import java.io.*;
class ListNode {
        int val;
        ListNode next;
        ListNode (int val){
            this.val = val;
        }
    }
public class RemoveNthNodeFromEndoflist {
    
    public static ListNode nthelrem(ListNode head, int n){

        int len = 0;
        ListNode curr = head;
        while(curr != null){
            len++;
            curr = curr.next;
        }
        int idx = len - n;
        ListNode prev = head;
        if(len == n) return head.next;
        if(n>len) return head; // - choice if not asked dont include this line
        int i =1;
        while(i<idx){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
    // print the list value;
    public static void printlist(ListNode head){
        while( head != null){
            System.out.print(head.val+ " ");
            head = head.next;
        }
    }
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String [] input = br.readLine().split(" ");
        int n = Integer.parseInt(br.readLine());
        ListNode head = new ListNode(Integer.parseInt(input[0]));
        ListNode temp = head;
        for(int i = 1;i<size;i++){
            temp.next = new ListNode(Integer.parseInt(input[i]));
            temp = temp.next;
        }
        head = nthelrem(head, n);
        printlist(head);
    }
}