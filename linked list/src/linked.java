public class linked {
   Node head;
   
   public void tambahDepan(String data){
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
   }

   public void print(){
    Node current = head;
    while (current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
    }
    System.out.println("NULL");
}

}
