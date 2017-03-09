package com.thinkinginjava4.chapter5.practice;

import java.util.Arrays;

public class ReflectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] a1 = new int[]{1,2,3};
	        int [] a2 = new int[5];
	        int [][] a3 = new int[2][3];
	        System.out.println(a1.getClass() == a2.getClass());//true
	        System.out.println(a1.getClass());//class [I
	        System.out.println(a3.getClass());//class [[I
	        System.out.println(a1.getClass().getSuperclass() == a3.getClass().getSuperclass());//true
	        System.out.println(a2.getClass().getSuperclass());//class java.lang.Object

	        //下句编译不通过：Error:(15, 42) java: 不可比较的类型: java.lang.Class<capture#1, 共 ? extends int[]>和java.lang.Class<capture#2, 共 ? extends int[][]>
	        //System.out.println(a1.getClass() == a3.getClass());

	        Object []b3 = a3;//通过
	        //下句编译不通过   Error:(17, 24) java: 不兼容的类型: int[]无法转换为java.lang.Object[]
	        //Object [] b1 = a1;

	        String s1 = "abc";
	        System.out.println(Arrays.asList(a1));//[[I@1540e19d]
	        System.out.println(Arrays.asList(s1));//[abc]
	}

}
