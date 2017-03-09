package com.thinkinginjava4.chapter5.practice;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Practice5_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MoneyValue moneyValue=new MoneyValue(Money.TEN);
		moneyValue.howValue();
		moneyValue=new MoneyValue(Money.FIFTY);
		moneyValue.howValue();
	}
}

class MoneyValue{
	Money money;
	public MoneyValue(Money money){
		this.money =money;
	}
	public void howValue() {
		switch (money) {
		case ONE:
			System.out.println("一块钱");
			break;
		case TWO:
			System.out.println("二块钱");
			break;
		case FIVE:
			System.out.println("五块钱");
			break;
		case TEN:
			System.out.println("十块钱");
			break;
		case TWENTY:
			System.out.println("二十块钱");
			break;
		case FIFTY:
			System.out.println("五十块钱");
			break;
		default:
			break;
		}
	}
	
}


