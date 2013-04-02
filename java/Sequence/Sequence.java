package com.paixu;

public class Sequence {
	public static void main(String[] args) {
		int[] intArry = {2,40,1,5,3};
		for(int i=0;i<intArry.length-1;i++){
			//第一层循环是要比较的次数 n-1 (n表示数据长度)
			for(int j=i+1;j<intArry.length;j++){
				//第二层循环是从数组的第2个元素开始比较
				if(intArry[i]<intArry[j]){
					// >  <  来控制排序的升序和降序
					int temp = 0;
					temp = intArry[i];
					intArry[i] = intArry[j];
					intArry[j] = temp;
				}
			}
		}
		//遍历
		for(int o = 0;o<intArry.length;o++){
			System.out.println(intArry[o]);
		}
	}
}
