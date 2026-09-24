package dsa;

import java.util.ArrayList;

public class NodesBetweenCriticalPoints {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static ListNode createLinkedList(int[] arr) {
		if (arr == null || arr.length == 0)
			return null;
		ListNode head = new ListNode(arr[0]);
		ListNode curr = head;
		for (int i = 1; i < arr.length; i++) {
			curr.next = new ListNode(arr[i]);
			curr = curr.next;
		}
		return head;
	}

	public static int[] nodesBetweenCriticalPoints(ListNode head) {

		int itrPointer = 2;
		int[] distance = { -1, -1 };
		ArrayList<Integer> criticalPoints = new ArrayList<Integer>();

		ListNode current = head.next;
		ListNode previous = head;

		while (current != null && current.next != null) {

			if ((previous.val < current.val && current.next.val < current.val)
					|| (previous.val > current.val && current.next.val > current.val)) {

				
				criticalPoints.add(itrPointer);

			} 
			
			previous = current; 
			current = current.next; 
			itrPointer++;

		}

		if(criticalPoints.size() < 2) {
			
			return distance;
			
		}else {
			
			int maxDistance = criticalPoints.getLast() - criticalPoints.getFirst();
			int minDistance = Integer.MAX_VALUE;
			
			for(int i = criticalPoints.size() - 1; i > 0; i--) {
				
				if((criticalPoints.get(i) - criticalPoints.get(i - 1))< minDistance) {
					
					minDistance = criticalPoints.get(i) - criticalPoints.get(i - 1);
					
				}
				
			}
			
			distance[0] = minDistance;
			distance[1] = maxDistance;
			
			return distance;
			
		}
		
	}

	public static void main(String[] args) {
		int[] values = { 5, 3, 1, 2, 5, 1, 2 };
		ListNode head = createLinkedList(values);
		int[] result = nodesBetweenCriticalPoints(head);

		for (int i = 0; i < result.length; i++) {

			System.out.print(result[i] + " ");

		}

	}
}
