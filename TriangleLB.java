import java.util.Scanner; //スキャナクラスのインポート宣言

public class TriangleLB {//三角形クラス
	public static void main(String[] args) {//メイン関数
		Scanner stdIn = new Scanner(System.in); //スキャナクラスのインスタンス生成
		int n; //段数入力のための変数n

		System.out.println("左下直角の三角形を表示します。");//見出し

		do {//段数が正になるまで入力を催促
			System.out.print("段数は :");
			n = stdIn.nextInt();//整数値の読み込み
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {//二重ループ
			for (int j = 1; j <= i; j++) {
			//iの値がふえるごとに横方向の繰り返しも増える
					System.out.print('*');
			}
				System.out.println();//改行
			
		}
	}
}

