package WeightTracker;
import java.util.ArrayList;
public class WeightTracker {
	public static ArrayList<Double> getWeightChanges(ArrayList<Double> arr) {
		ArrayList<Double> changes= new ArrayList<Double>();
		for (int i=0;i<arr.size()-1;i++) {
			changes.add(arr.get(i+1)-arr.get(i));
		}
		return changes;
	}
	public static ArrayList<Double> getWeights(double init, ArrayList<Double> changes) {
		ArrayList<Double> weights=  new ArrayList<Double>();
		weights.add(init);
		for (int i=0;i<changes.size();i++) {
			weights.add(weights.get(weights.size()-1)+changes.get(i));
		}
		return weights;
				
	}
	public static ArrayList<Double> getWeightRuns(ArrayList<Double> weights){
		ArrayList<Double> runs = new ArrayList<Double>();
		for (int i=0; i<weights.size()-1;i++) {
			if (weights.get(i+1)>weights.get(i)) {
				boolean condition = true;
				int j = i;
				double min = weights.get(i);
				double max = weights.get(i);
					while (condition) {
					try {
					if ((weights.get(j+1)>=weights.get(j))) {
						max = weights.get(j+1);
						j++;
					} else {
						condition = false;
						runs.add(max-min);
					}
					} catch (Exception e) {
						condition = false;
						runs.add(max-min);
					}
					
				}
			} else if (weights.get(i+1)<weights.get(i)) {
				boolean condition = true;
				int j = i;
				double max = weights.get(i);
				double min = weights.get(i);
					while (condition) {
					try {
					if ((weights.get(j+1)<=weights.get(j))) {
						min = weights.get(j+1);
						j++;
					} else {
						condition = false;
						runs.add(min-max);
					}
					} catch (Exception e) {
						condition = false;
						runs.add(min-max);
					}
				}
			}
		}
		return runs;
	}
	public static void main(String[] args) {
		ArrayList<Double> g = new ArrayList<Double>();
		g.add(145.0);
		g.add(146.5);
		g.add(146.5);
		g.add(147.0);
		g.add(146.0);
		g.add(148.0);
		g.add(148.5);
		ArrayList<Double> c = getWeightChanges(g);
		for (int i=0;i<c.size();i++) {
			System.out.print(c.get(i)+" ");
		}
		System.out.println();
		ArrayList<Double> w = getWeights(145.0,c);
		for (int i=0;i<w.size();i++) {
			System.out.print(w.get(i)+" ");
		}
		System.out.println();
		ArrayList<Double> r = getWeightRuns(g);
		for (int i=0;i<r.size();i++) {
			System.out.print(r.get(i)+" ");
		}
	}
}
