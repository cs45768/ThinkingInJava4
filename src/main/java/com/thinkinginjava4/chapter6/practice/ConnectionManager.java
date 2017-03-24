package com.thinkinginjava4.chapter6.practice;

public class ConnectionManager {
	 public static void main(String[] args){
	        Connection connection = ConnectionManager.getConnection();
	        Connection connection1 = ConnectionManager.getConnection();
	        Connection connection2 = ConnectionManager.getConnection();
	        Connection connection3 = ConnectionManager.getConnection();
	        Connection connection4 = ConnectionManager.getConnection();
	        
	    }
	    private static int count = 0;
	    private static Connection[] connections = new Connection[]{
	                            Connection.get(),
	                            Connection.get(),
	                            Connection.get()};
	    public static Connection getConnection(){
	    	System.out.println("count:"+connections.length);
	        if (count < 3){
	            ConnectionManager.count++;
	            return connections[count--];
	        } else {
	            System.out.println("no more");
	            return null;
	        }
	    }
		public static int getCount() {
			return count;
		}
		public static void setCount(int count) {
			ConnectionManager.count = count;
		}
	    
	    
}


class Connection {
	    private Connection(){//构造方法私有，无法被直接通过构造方法创建
	        System.out.println("connection is created111111");
	    }
	    private static Connection connection;
	    public static Connection get(){
	        return new Connection();
	    }
	    
}
