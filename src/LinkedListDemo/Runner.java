
package LinkedListDemo;


public class Runner {
    public static void main(String[] args) {
        
      LinkedList n = new LinkedList();
        
            n.insert(20);
            n.insert(30);
            n.insert(40);
            n.insert(50);
            n.insert(60);
            n.insert(70);
            n.show();
            n.insertAtStart(10);
            n.show();
            
            n.insert(80);
            n.insertAt(5, 1);
            n.show();
              
    }
}
