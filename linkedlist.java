

    /*
3. Linked List Implementation
Create a program that implements a Linked List data structure with the following functions:
 * Create: A function to initialize or create a new, empty linked list.
 * Add: A function to add a new item (node) to the list.
 * Delete: A function to remove a specific item from the list.
 * Display (Sorted): A function that prints all data in the linked list in sorted order.*/

class node{                               //constructor 
    int data;
    node next;
   node(int data){
    this.data = data;
    this .next=null;
   }

    node( int data , node next){      //a compulsory syntax
        this.data = data;
        this.next = next;
    }
    }
    class linkedlist{               //initialize empty node
       node head;
         linkedlist() {
        
            head = null;
        }
        
    void add (int value){
    node newnode = new node(value);      // inserting in the beg
    newnode.next= head;
    head = newnode;
    }
   void delete(int value){         // delete
    if (head==null){
    return;}
    if(head.data == value){
        head=head.next;
        return;

    }
    node current=head;
    while(current.next !=null && current.next.data != value){
        current = current.next;
    }
    if(current.next !=null){
        current.next=current.next.next;
    }
    
   } void display(){
    node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
   
 class testlinklist{
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.add(90);
        list.add(70);
        list.add(10);

System.out.println("List after adding nodes:");
        list.display();

        list.delete(20);
        System.out.println("List after deleting 20:");
        list.display();
    }
 }

}
}






