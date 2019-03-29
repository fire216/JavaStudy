package com.kopo.human;

public class Mabang {
	int num;
	// 배열의 이름을 Array로 하면 안좋다고하심!
//	int[][] mabang = new int[5][5];
	int[][] mabang;

	public Mabang(int num) {
		this.num = num;
	}

	public void start() {
		mabang = new int[num][num];
		int x = 0;
		int y = num / 2;
        mabang[x][y] = 1; // (0,2) 좌표에  1을 입력
        
		for (int index = 2; index <= num * num; index++) {
			x = x - 1;
			y = y - 1;
			// 1.x<0 , y<0 인 경우 / x<0 인경우로 if 중첩문 분리!
			if (x < 0) {
				if (y < 0) {
					x = x+2;
					y = y+1;
				} else {
					x = x+num;
				}
			} else {
				// 1. y<0인 경우만 따지면 됨! 왜? 위에서 x<0, y<0 인 경우는 했으므로!
				if (y < 0) {
					y = y+num;
				} else {
					if(mabang[x][y]!=0) {
						// 여기가 이해가 안가네... 바로 밑으로 내려가야하는거 아닌가? 내 생각엔 x=x+1 인데...
						// 이해됐음! 일단 왼쪽 상단 대각선으로 올라간 뒤에 내려오는 개념이니까 이렇게 표시되는것!
						x= x+2;
						y= y+1;
					}
				}
			}
			mabang[x][y]=index;
		}
//		for(int i = 0; i<mabang.length; i++) {
//			for(int j = 0; j<mabang[i].length; j++) {
//				System.out.print(mabang[i][j]+"\t");
//			}
//			System.out.println();
			
			// 이것이 향상된 for문이라고 하심!
			for(int[] temp:mabang) {
				for(int fuck:temp) {
					System.out.print(fuck+"\t");
				}
				System.out.println();
			}
		}

	public static void main(String[] args) {
		Mabang mb = new Mabang(5);
		mb.start();
	}
}
// 규칙을 정의하자!
// 1번 규칙 : 1은 0,2에서 시작한다
// 2번 규칙 : 숫자를 찍고 다음숫자는 왼쪽상단으로 이동하자!
// 3번 규칙 : 만약 밖으로 벗어나서 i or j의 값이 -가 나온다면? -값은 4로 변환한다!
// 4번 규칙 : 만약 왼쪽 상단으로 올라가던 중, 칸에 숫자가 적혀있다면(값이 0이 아니라면?) 아래로 내려간다!
// 이는 25가 찍힐때까지 반복한다! (While문을 쓰면 좋을듯?)

// ★★★★★★★★★★★★★★교수님이 정한 조건!★★★★★★★★★★★★★★
// 이동 (왼쪽 대각선 상단) x = x-1, y = y-1 으로 이동시킨것!
// 위로 벗어나는 조건? x < 0, 왼쪽으로 벗어나는 조건? y < 0
// 0보다 작은 값은 x = x + N, y = y + N의 개념으로 다가갈것! (5x5이상 혹은 이하 크기의 마방진도 구현하기위해!)
// 모서리 => x < 0 and y < 0
// 모서리는 x = x + 2, y = y+1로 구현할것!
// 배열 안으로 들어왔을때 적어야할 칸에 숫자가 있냐없냐? x,y != 0 인지를 파악해야함!

//		int[][] array = new int[5][5];
////		array.length = x;
////		array[i].length = y;
//
//		for (int x = 0; x < array.length; x++) {
//			for (int y = 0; y < array[x].length; y++) {
//				if (x == 0 && y == 2) {
//					System.out.print(1);
//				}
//				int i = 0;
//				while (i = 25) {
//					for (i = 2; i <= array.length * array[x].length; i++) {
//						x = x - 1;
//						y = y - 1;
//						if (x < 0) {
//							x = x + array.length;
//							System.out.print(i);
//						} else if (y < 0) {
//							y = y + array[x].length;
//							System.out.print(i);
//						}
//					}
//				}
//			}
//		}
