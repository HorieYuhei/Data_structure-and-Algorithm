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

import java.util.Scanner; //Scannerクラスのインポート宣言

public class Banhei { //Banheiクラス
	static int seqSearchSen(int[] a, int n, int key) { //seqSearchSenメソッド
		int i = 0;	//カウンタ変数
		a[n] = key;	//番兵をaの要素の最後に格納する

		while (true) {	//探す値が見つかるまで繰り返す
			if (a[i] == key)
				break;	//a[i]の中身とkeyが一致したらループを抜ける
			i++;
		}
		return i == n ? -1 : i;	//見つけた値が番兵だったら-1を返却、それ以外ならiを返却
	}
	/*
		上の文章で、番兵を置いたおかげでif文を一つ書くだけで済んでいる
		つまり処理数が少なくなっている？
	*/
	

	public static void main(String[] args) {	//mainメソッド
		Scanner stdIn = new Scanner(System.in);	//Scannerクラスのインスタンス化

		System.out.print("要素数:");
		int num = stdIn.nextInt();	//numに要素数を格納する
		int[] x = new int[num + 1];	//num＋1の要素を持つ配列xを宣言

		for (int i = 0; i < num; i++) {	//配列xに数字を格納するために回すfor文
			System.out.print("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}

		System.out.print("探す値:");
		int ky = stdIn.nextInt();	//探す値をkyに格納

		int idx = seqSearchSen(x, num, ky); //seqSearchSenメソッドに(x,num,ky)を渡して、返却値をidxに格納する

		if (idx == -1)
			System.out.println("その値の要素は存在しません");
		else
			System.out.println("その値はx[" + idx + "]にあります");

	}
}
