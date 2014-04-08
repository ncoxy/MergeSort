import java.util.ArrayList;

public class MergeSort{

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(4);
		a.add(5);
		a.add(9);
		
		b.add(1);
		b.add(3);
		b.add(5);
		b.add(6);
		b.add(7);
		// System.out.println(split(a));
		System.out.println(merge(a,b));
	}
	public static ArrayList<Integer> split(ArrayList<Integer> a){
		ArrayList<Integer> b = new ArrayList<Integer>();
		int x = a.size()/2 +1;

		for (int i = x ; i<a.size(); i++) {
			b.add(a.get(i));
			
		}
		for (int i = a.size()-1; i>=x; i--) {
			a.remove(a.get(i));
		}

		System.out.println(a);

		return b;
	}

	public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		int aSpot = 0;
		int bSpot = 0;

		while(result.size() <= a.size() + b.size() - 1){
			if (bSpot == b.size()) {
				result.add(a.get(aSpot));
				aSpot++;
			}else if (aSpot == a.size()) {
				result.add(b.get(bSpot));
				bSpot++;
			}else if (b.get(bSpot) >= a.get(bSpot)) {
				result.add(a.get(aSpot));
				aSpot++; 
			}else{
				result.add(b.get(bSpot));
				bSpot++;
			}

		}
		System.out.println(a);
		System.out.println(b);
		return result;




		
	}



}