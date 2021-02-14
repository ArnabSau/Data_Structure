import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node root;
     void print(){
        Node temp=root;
         System.out.print("LinkedList: ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
     void add(int data){
        Node node=new Node(data);
        if(root==null){
            root=node;
        }else{
            Node temp=root;
            while(temp.next!=null) temp = temp.next;
            temp.next=node;
        }
    }
    void delete(){
         Node temp=root;
         if(temp==null){
             System.out.println("No node found");
         }else{
             if(temp.next==null){
                 root=null;
             }else{
                 while(temp.next.next!=null){
                     temp=temp.next;
                 }
                 temp.next=null;
             }
             System.out.println("Node Deleted");
         }
    }
    boolean search(int key){
         Node temp=root;
         boolean flag=false;
         while (temp!=null){
             if(temp.data==key){
                 flag=true;
                 break;
             }
             temp=temp.next;
         }
         return flag;
    }
    void delete(int key){
         Node temp=root;
         Node prv=null;
         boolean flag=false;
         while(temp!=null){
             if(temp.data==key){
                 flag=true;
                 break;
             }
             prv=temp;
             temp=temp.next;
         }
         if(flag==false || prv==null){
             System.out.println("Element not found");
         }else{
             prv.next=temp.next;
             System.out.println(temp.data+" deleted");
         }
    }
    void rev(){
         if(root==null){
             System.out.println("LinkedList is empty");
         }else{
             Node current=root;
             Node prv=null;
             Node next=null;
             while(current!=null){
                 next=current.next;
                 current.next=prv;
                 prv=current;
                 current=next;
             }
             root=prv;
         }
    }

}

public class Main {

    public static void main(String[] args) {
	boolean flag=true;
        Scanner sc= new Scanner(System.in);
        LinkedList linkedList=new LinkedList();
	while(flag){
	    System.out.println("\nPress 0 for exit:\nPress 1 for print LinkedList:\nPress 2 for add Node:\nPress 3 for " +
                "delete node:\nPress 4 for search element:\nPress 5 for delete a key element:\nPress 6 for Rev");
	    int temp=sc.nextInt();
	    switch(temp){
            case 0:
                flag=false;
                break;
            case 1:
                linkedList.print();
                break;
            case 2:
                System.out.println("Enter data:");
                int data=sc.nextInt();
                linkedList.add(data);
                break;
            case 3:
                linkedList.delete();
                break;
            case 4:
                System.out.println("Enter key:");
                int key=sc.nextInt();
                System.out.println(linkedList.search(key)?"Element found":"Element not found");
                break;
            case 5:
                System.out.println("Enter key:");
                int key1=sc.nextInt();
                linkedList.delete(key1);
                break;
            case 6:
                linkedList.rev();
                break;
        }
    }
    }
}
