package com.numscalculate;

/**
 * ����Ҫ��

1�� ����һ���������飬������ֵ 61, 23, 4, 74, 13, 148, 20

2�� ��������ֱ𱣴����ֵ����Сֵ���ۼ�ֵ��ƽ��ֵ�������������еĵ�һ��Ԫ�ؼ�Ϊ���ֵ��Ϊ��Сֵ

3�� ʹ�� for ѭ�����������е�Ԫ�أ��ֱ���ٶ������ֵ����Сֵ�Ƚϡ�����ȼٶ������ֵҪ�����滻��ǰ�����ֵ������ȼٶ�����СֵҪС�����滻��ǰ����Сֵ

4�� ѭ��ִ�й����ж������е�Ԫ�ؽ����ۼ����

5�� ѭ�����������ۼ�ֵ����ƽ��ֵ������ӡ����������*/

public class MyNumsCalculate {
	public static void main(String[] args) {
		//��ʼ������ͱ���
		int[] nums = {61,23,4,74,13,148,20};
		int maxNum = nums[0];//���ֵ��ʼ��Ϊ����ĵ�һ��Ԫ��
		int minNum = nums[0];//��Сֵ��ʼ��Ϊ����ĵ�һ��Ԫ��
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
		
		System.out.println("���ֵ��" + maxNum);
		System.out.println("��Сֵ��" + minNum);
		System.out.println("�ۼ�ֵ��" + sum);
		System.out.println("ƽ��ֵ��" + avg);
	}
}
