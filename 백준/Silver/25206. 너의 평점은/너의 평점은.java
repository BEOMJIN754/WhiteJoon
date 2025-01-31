import java.io.*;
import java.util.*;

public class Main {
	
	public enum EGrade{
	 	AP("A+",4.5),A("A0",4.0),BP("B+",3.5),B("B0",3.0),
	 	CP("C+",2.5),C("C0",2.0),DP("D+",1.5),D("D0",1.0),
	 	F("F",0.0),;
		
		private final String symbol;
		private final double point;
		
		EGrade(String string, double e) {
			this.symbol = string;
			this.point = e;
		}
		public String getSymbol() {
			return symbol;
		}
		public double getPoint() {
			return point;
		}
		
		public static double getPointsBySymbol(String symbol) throws IllegalArgumentException {
			for(EGrade g :EGrade.values()) {
				if(g.getSymbol().equals(symbol)){
					return g.getPoint();
				}
			}
			throw new IllegalArgumentException("None");
		}
	 	
	}
	public static void main(String[] args) throws IOException, IllegalArgumentException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String line;
		double cnt =0.0;
		double sum = 0.0;
		while((line = br.readLine()) != null && !line.isEmpty()) {
			st = new StringTokenizer(line);
			String name = st.nextToken();
			double h = Double.parseDouble(st.nextToken());
			String g = st.nextToken();
			if(g.equals("P")) {continue;}
			else {
			sum = sum+(h*EGrade.getPointsBySymbol(g));
			cnt +=h;
			}
		}
		System.out.println(sum/cnt);
		
	}
}
