
package LinkedListDemo;


public class LinkedList {
    
    
    Node head;
    
    public void insert(int data){
    
            Node node = new Node();
            node.data = data;
            
            node.Next = null;
            
            if (head == null) {
                    
                head = node;
               
        }
            else{
                
                Node n = head;
                
                while(n.Next != null){
                        
                    n = n.Next;
                    
                    
                }
                n.Next = node;
                
            }
      
    }
    
  
    // At Start position elemnt adding
    
   public void insertAtStart(int data){
      Node node = new Node();
      node.data = data;
      node.Next = head;
      head = node;
      
   }
   
   //At any ponit add element add
   public void insertAt(int index,int data){
       
            Node node = new Node();
                node.data = data;
                node.Next = null;
                node.Next = head;
               if (index == 0) {
           
                   insertAtStart(data);
       }else{ 
                   
                   Node n = head;
                   // n hold the first adress and n = n.next means the 2nd assign the alue of n..
    
             for (int i = 0; i < index-1; i++) {
                n=n.Next;
                 

                 }
       
                        node.Next = n.Next;
                   
                         n.Next = node;
              }        
           
   }


///// deleted items according to index value
   
   public void delete(int index){
       
       if (index ==0 ) {
           
           head = head.Next;
           
       }else{
           
           Node n = head;
           
           Node n1;
           
           for (int i = 0; i < index-1; i++) {
               
               n = n.Next;
               
           }
           
           n1 = n.Next;
           
           n.Next = n1.Next; 
           
           System.out.println("Deleted items Is: "+n1.Next);
           
           n1 = null;
       
       }
        
   
   
   }
   
   
   //VShow value
     public void show(){
    
        
        Node node = head;
        
       
        
        while(node.Next !=null){
        
            System.out.print(node.data+" ");
            
            node = node.Next;

           
        }
 
        System.out.println(node.data);
    
    
    }
     
     
     
    
}
