package com.numscalculate;

/**
 * 任务要求：

1、 定义一个整型数组，并赋初值 61, 23, 4, 74, 13, 148, 20

2、 定义变量分别保存最大值、最小值、累加值和平均值，并假设数组中的第一个元素既为最大值又为最小值

3、 使用 for 循环遍历数组中的元素，分别与假定的最大值和最小值比较。如果比假定的最大值要大，则替换当前的最大值；如果比假定的最小值要小，则替换当前的最小值

4、 循环执行过程中对数组中的元素进行累加求和

5、 循环结束根据累加值计算平均值，并打印输出相关内容*/

public class MyNumsCalculate {
	public static void main(String[] args) {
		//初始化数组和变量
		int[] nums = {61,23,4,74,13,148,20};
		int maxNum = nums[0];//最大值初始化为数组的第一个元素
		int minNum = nums[0];//最小值初始化为数组的第一个元素
		int sum = 0;
		int avg = 0;
		
		for(int i = 0;i < nums.length;i++){
			if(nums[i]>maxNum){
				maxNum = nums[i];
			}
			if(nums[i]<minNum){
				minNum = nums[i];
			}
			sum = sum + nums[i];
		}
		avg = sum/nums.length;
		
		System.out.println("最大值：" + maxNum);
		System.out.println("最小值：" + minNum);
		System.out.println("累加值：" + sum);
		System.out.println("平均值：" + avg);
	}
}
