package com.git.test;

public class Demo {
    public static void main(String[] args) {
		//    char �������޷��ŵ� 16λ
		  //char c='\uFFFF'; System.out.println((int)c);
    	
		 //2147483647
    	/*
    	 * float��long��
    	 * �������������ʱ��
    	 *    ���û�б�int��,��תint����������
    	 *    ��int����ת��int�������Ȼ��������
    	 *    
    	 *    �������ͻ���ת��debug��������
    	 */
    	int i=2147483647;
    	  //long l=a/c+i+1l;
    	  short s=(short)i;
    	System.out.println(s);
	}
}
