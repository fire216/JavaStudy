package com.kopo.human;

public class Mabang {
	int num;
	// �迭�� �̸��� Array�� �ϸ� �����ٰ��Ͻ�!
//	int[][] mabang = new int[5][5];
	int[][] mabang;

	public Mabang(int num) {
		this.num = num;
	}

	public void start() {
		mabang = new int[num][num];
		int x = 0;
		int y = num / 2;
        mabang[x][y] = 1; // (0,2) ��ǥ��  1�� �Է�
        
		for (int index = 2; index <= num * num; index++) {
			x = x - 1;
			y = y - 1;
			// 1.x<0 , y<0 �� ��� / x<0 �ΰ��� if ��ø�� �и�!
			if (x < 0) {
				if (y < 0) {
					x = x+2;
					y = y+1;
				} else {
					x = x+num;
				}
			} else {
				// 1. y<0�� ��츸 ������ ��! ��? ������ x<0, y<0 �� ���� �����Ƿ�!
				if (y < 0) {
					y = y+num;
				} else {
					if(mabang[x][y]!=0) {
						// ���Ⱑ ���ذ� �Ȱ���... �ٷ� ������ ���������ϴ°� �ƴѰ�? �� ������ x=x+1 �ε�...
						// ���ص���! �ϴ� ���� ��� �밢������ �ö� �ڿ� �������� �����̴ϱ� �̷��� ǥ�õǴ°�!
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
			
			// �̰��� ���� for���̶�� �Ͻ�!
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
// ��Ģ�� ��������!
// 1�� ��Ģ : 1�� 0,2���� �����Ѵ�
// 2�� ��Ģ : ���ڸ� ��� �������ڴ� ���ʻ������ �̵�����!
// 3�� ��Ģ : ���� ������ ����� i or j�� ���� -�� ���´ٸ�? -���� 4�� ��ȯ�Ѵ�!
// 4�� ��Ģ : ���� ���� ������� �ö󰡴� ��, ĭ�� ���ڰ� �����ִٸ�(���� 0�� �ƴ϶��?) �Ʒ��� ��������!
// �̴� 25�� ���������� �ݺ��Ѵ�! (While���� ���� ������?)

// �ڡڡڡڡڡڡڡڡڡڡڡڡڡڱ������� ���� ����!�ڡڡڡڡڡڡڡڡڡڡڡڡڡ�
// �̵� (���� �밢�� ���) x = x-1, y = y-1 ���� �̵���Ų��!
// ���� ����� ����? x < 0, �������� ����� ����? y < 0
// 0���� ���� ���� x = x + N, y = y + N�� �������� �ٰ�����! (5x5�̻� Ȥ�� ���� ũ���� �������� �����ϱ�����!)
// �𼭸� => x < 0 and y < 0
// �𼭸��� x = x + 2, y = y+1�� �����Ұ�!
// �迭 ������ �������� ������� ĭ�� ���ڰ� �ֳľ���? x,y != 0 ������ �ľ��ؾ���!

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
