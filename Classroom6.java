import java.util.*;
public class Classroom6{
    static class Node{
        Node[] children;
        boolean eow;
        public Node(){
            children=new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    static Node root=new Node();
    public static void insert(String args[]){
        Node curr=root;
        for(int i=0;i<words.length();i++){
int idx=word.charAt(i)-'a';
if(curr.children[idx]==null){
    //add new node
    curr.children[idx]=new Node();
}if(i==word.length()-1){
    curr.children[idx].eow=true;
}
curr=curr.children[idx];
        }
    }
    public static void main(String args[]){
        String words[]={"the","a","there","their","any"};
        for(int i=0;i<words.length();i++){
            insert(words[i]);
        }
    }
}