package com.gl.labsession;

import java.util.ArrayList;

public class LongestPathBinaryTree {
	
	static class Node{
		int data;
		Node left,right;
	};
	
	static Node newnode(int nodeData) {
		Node temp=new Node();
		temp.data=nodeData;
		temp.left=null;
		temp.right=null;
		return temp;
		
	}
private static ArrayList<Integer> findLongestPath(Node root) {
	
	if(root==null) {
		ArrayList<Integer> output=new ArrayList<Integer>();
		return output;
	}
	
	
	
	ArrayList<Integer> leftnode=findLongestPath(root.left);
	
	ArrayList<Integer> rightnode=findLongestPath(root.right);
	
	if(rightnode.size()<leftnode.size()) {
		leftnode.add(root.data);
	}
	else {
		rightnode.add(root.data);
	}
	
		
		return (leftnode.size()>rightnode.size() ? leftnode : rightnode);
	}
	
	

	public static void main(String[] args) {
		
		Node root=newnode(100);
		root.left=newnode(20);
		root.right=newnode(130);
		root.left.left=newnode(10);
		root.left.right=newnode(50);
		root.right.left=newnode(110);
		root.right.right=newnode(140);
		root.left.left.left=newnode(5);
		
		
		ArrayList<Integer> output=findLongestPath(root);
		
		int size=output.size();
		
		for(int i=size-1;i>=0;i--) {
			System.out.println("-> "+output.get(i));
		}
				

		}

	

}
