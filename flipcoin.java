
public class flipcoin {

	public static void main(String[] args) {
		// Declaration
		int Head = 0;
		int Tail = 0;
		int n = 10;
		for (int i = 1; i <= n; i++) {
			double coin = Math.random();
			if (coin > 0.5) {
				Head++;
			} else {
				Tail++;
			}
		}
		// Calculating the percentage of Number of Times HEAD & TAIL
		int percenthead = (Head * 100) / 10;
		int percenttail = (Tail * 100) / 10;
		System.out.println("the percentageof head" + percenthead);
		System.out.println("the percentage of tail" + percenttail);

	}
}
