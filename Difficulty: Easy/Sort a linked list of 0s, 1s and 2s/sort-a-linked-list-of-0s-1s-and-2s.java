//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


// } Driver Code Ends
// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) 
    {
        Node headzero=new Node(-1);
        Node headfirst=new Node(-1);
        Node headsecond=new Node(-1);
        Node zero=headzero;
        Node first=headfirst;
        Node second=headsecond;
        while(head!=null)
        {
            if(head.data==0)
            {
                zero.next=head;
                zero=zero.next;
            }
            else if(head.data==1)
            {
                first.next=head;
                first=first.next;
            }
            else
            {
                second.next=head;
                second=second.next;
            }
            head=head.next;
        }
        zero.next=headfirst.next!=null?headfirst.next:headsecond.next;
        first.next=headsecond.next;
        second.next=null;
        return headzero.next;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            Node head = null;
            if (!arr.isEmpty()) {
                head = new Node(arr.get(0));
                Node tail = head;
                for (int i = 1; i < arr.size(); i++) {
                    tail.next = new Node(arr.get(i));
                    tail = tail.next;
                }
            }
            head = new Solution().segregate(head);
            printList(head);
        }
    }
}
// } Driver Code Ends