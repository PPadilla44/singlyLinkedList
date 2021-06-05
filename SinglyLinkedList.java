public class SinglyLinkedList {

    public Node head;
    public SinglyLinkedList() {
        head = null;
    }

    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    


    public void remove(){

        if(head == null) {
            System.out.println("List already empty");
        } else {

            Node currNode = head;
            Node previous = currNode;
            
            while(currNode.next != null){
                previous = currNode;
                currNode = currNode.next;
            }
            
            currNode = previous;  
            currNode.next = null;

        }
    }


    public void printValues(){
        Node currNode = head;

        while(currNode != null) {
            System.out.println(currNode.value + " ");

            currNode = currNode.next;
        }
    }


    public Node find(int value) {
        Node currNode = head;
    
        try {

            while(currNode.value != value){
                currNode = currNode.next;
            }
            System.out.println(currNode.value);
            return currNode;

        } catch (Exception e) {

            System.out.println("Could not find node with that value");
            return null;

        }
        
    }


    public void removeAt(int nodeIndex){
        Node currNode = head;

        if(nodeIndex == 0){
            head = head.next;
            return;
        }

        try {

            for(int i = 0; i < nodeIndex-1; i++){
                currNode = currNode.next;
            }
            
            Node next = currNode.next.next;
            currNode.next = next;

        } catch (Exception e) {
            System.out.println("Index out of range");
        }

    }

}
