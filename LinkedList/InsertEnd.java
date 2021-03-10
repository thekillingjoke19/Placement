class Node3{
    int data;
    Node3 next;
    Node3(int x){
        data = x;
        next = null;
    }
}
public class InsertEnd {
    private static Node3 InsertATheEnd(Node3 head, int x) {
        Node3 temp =new  Node3(x);
        if(head == null) 
          return temp;
        Node3 cur = head;
        while(cur.next != null){
            cur=cur.next;
        }
        cur.next =temp;
        return temp;

       }
    public static void main(String[] args) {
        Node3 head = null;
        head = InsertATheEnd(head,10);
        head = InsertATheEnd(head,20);
        head = InsertATheEnd(head,30);
    }

   
}
