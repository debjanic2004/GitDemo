package sample;

import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void BubbleSort() {
		int n[] = { 11, -8, 20, -22, 18, -14, -28 };
		for (int i = 0; i < n.length; i++) {
			int temp = 0;
			boolean swp = false;
			for (int j = 0; j < n.length - i - 1; j++) {
				if (n[j] > n[j + 1]) {
					temp = n[j];
					n[j] = n[j + 1];
					n[j + 1] = temp;
					swp = true;
				}
			}
			if (swp = false)
				break;
		}
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}

}
