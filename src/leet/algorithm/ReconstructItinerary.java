package leet.algorithm;

import java.awt.List;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class ReconstructItinerary {
	
	HashMap<String, PriorityQueue<String>> map = new HashMap<String, PriorityQueue<String>>();
	LinkedList<String> result = new LinkedList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReconstructItinerary ref = new ReconstructItinerary();
		//String[][] tickets = {{"MUC", "LHR"},{"JFK", "MUC"},{"SFO", "SJC"}, {"LHR", "SFO"}};
		String[][] tickets = {{"JFK","SFO"},{"JFK","XTL"},{"SFO","XTL"},{"XTL","JFK"},{"XTL","SFO"}};
		LinkedList<String> l = ref.findItinerary(tickets);
		
		for(String s : l){
			System.out.println(s);
		}
		
	}
	 
		public LinkedList<String> findItinerary(String[][] tickets) {
			for (String[] ticket : tickets) {
				if (!map.containsKey(ticket[0])) {
					PriorityQueue<String> q = new PriorityQueue<String>();
					map.put(ticket[0], q);
				}
				map.get(ticket[0]).offer(ticket[1]);
			}
	 
			dfs("JFK");
			return result;
		}
	 
		public void dfs(String s) {
			PriorityQueue<String> q = map.get(s);
	 
			while (q != null && !q.isEmpty()) {
				dfs(q.poll());
			}
	 
			result.addFirst(s);
		}
		
	}


