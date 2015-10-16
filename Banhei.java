/*
	線形探索の番兵法のプログラム
	利点は、普通の線形探索と比べて計算量のコストを半分に出来る事。
	なぜなら、
	線形探索
	1.キー値が見つからず探索失敗
	2.キー値が見つかり探索成功
	
	番兵法
	1.キー値が見つかり探索終了（番兵か否か）
*/

import java.util.Scanner;

public class Banhei {
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		a[n] = key;

		while (true) {
			if (a[i] == key)
				break;
			i++;
		}
		return i == n ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数:");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}

		System.out.print("探す値:");
		int ky = stdIn.nextInt();

		int idx = seqSearchSen(x, num, ky);

		if (idx == -1)
			System.out.println("その値の要素は存在しません");
		else
			System.out.println("その値はx[" + idx + "]にあります");

	}
}
