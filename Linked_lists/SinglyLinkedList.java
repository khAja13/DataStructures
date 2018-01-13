public class SinglyLinkedList{
   public Node head = null;
   public SinglyLinkedList(){
     ;
   }
   public void insert_At_Head(int value){
     Node newnode = new Node(value);
    if(head==null){
      head = newnode;
    }
    else{
      newnode.next = head;
      head = newnode;
    }
  }
    public void print(){
      if(head==null){
        System.out.println("Empty List");
      }
      else{
        Node temp = head;
        while(temp!=null){
          System.out.print(temp.data);
          System.out.print(" ");
          temp = temp.next;
        }
        System.out.println("");
      }
    }
    public void insert_At_Tail(int value){
      Node newnode = new Node(value);
      if(head==null){
        head = newnode;
      }
      else{
        Node temp = head;
        while(temp.next!=null){
          temp = temp.next;
        }
        temp.next = newnode;
      }
    }
    public void insert_At_position(int value, int k){
      Node newnode = new Node(value);
      if(head==null){
        head = newnode;
      }
      else{
        Node temp = head;
        int cnt = 1;
        while(cnt!=k-1){
          temp = temp.next;
          cnt++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
      }
    }
    public void Delete_At_pos(int k){
      if(head==null){
        System.out.println("Empty List");
      }
      else if(k==1){
        head = head.next;
      }
      else{
        Node temp = head;
        int cnt = 1;
        while(cnt!=k-1){
          temp = temp.next;
          cnt++;
        }
        temp.next = temp.next.next;
      }
    }
    public void Delete_value(int value){
      if(head==null){
        System.out.println("Empty List");
      }
      else if(head.next==null){
        head = null;
      }
      else if(head.data==value){
        head = head.next;
      }
      else{
        Node temp = head;
        while(temp.next.data!=value){
          temp = temp.next;
        }
        temp.next = temp.next.next;
      }
    }
    public void Number_of_Nodes(){
      if(head==null){
        System.out.println("Empty List");
      }
      else{
        int cnt = 0;
        Node temp = head;
        while(temp!=null){
          temp = temp.next;
          cnt++;
        }
        System.out.println(cnt);
      }
    }
    public void Sum_of_Nodes(){
      if(head==null){
        System.out.println("Empty List");
      }
      else{
        Node temp = head;
        int sum=0;
        while(temp!=null){
          sum = sum + temp.data;
          temp = temp.next;
        }
        System.out.println(sum);
      }
    }
    public void Replace(int value, int k){
      if(head==null){
        System.out.println("Empty List");
      }
      else{
        Node temp = head;
        int cnt=1;
        while (temp!=null) {
          if(cnt==k){
            temp.data=value;
            break;
          }
          else{
            cnt++;
            temp = temp.next;
          }
        }
      }
    }
    public void Largest_to_end(){
      int largest;
      if(head==null){
        System.out.println("Empty List");
      }
      else{
        Node temp = head;
        largest=head.data;
        while(temp!=null){
          if(temp.data>largest){
            largest = temp.data;
          }
          temp = temp.next;
        }
        Delete_value(largest);
        insert_At_Tail(largest);
      }
    }
    public void Search(int value){
      Node temp = head;
      int cnt = 1;
      while(temp.data!=value){
        temp = temp.next;
        cnt++;
      }
      System.out.println("Node " +value+ " is at index " + cnt);
    }
    public void Concatenate(SinglyLinkedList n1){
        Node temp = this.head;
        while(temp.next!=null){
          temp = temp.next;
        }
        temp.next = n1.head;
    }
    public void Delete_even_elements(){
      Node temp = head;
      int cnt = 0;
      while(temp.next!=null){
        if(cnt%2==0){
          temp.next = temp.next.next;
        }
        else{
          temp = temp.next;
        }
        cnt++;
      }
    }
    public void Split(){
      SinglyLinkedList s1 = new SinglyLinkedList();
      SinglyLinkedList s2 = new SinglyLinkedList();
      Node temp = head;
      int cnt = 1;
      while(temp!=null){
        if((cnt%2)==0){
          s2.insert_At_Tail(temp.data);
        }
        else{
          s1.insert_At_Tail(temp.data);
        }
        cnt++;
        temp = temp.next;
      }
      s1.print();
      s2.print();
    }
    public Node reverse(){
      Node prev = null;
      Node current = head;
      Node next = null;
      while(current!=null){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
      }
      return prev;
    }
    public Node reverseRecursion(Node x){
      Node newnode;
      if(x.next==null)
      return x;
      newnode = reverseRecursion(x.next);
      x.next.next = x;
      x.next=null;
      return newnode;
    }
    public void ReversePrint(Node root){
      if(root.next != null){
        ReversePrint(root.next);
        System.out.println(root.data);
      }
      else{

      }
    }
}
