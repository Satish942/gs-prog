package com.sapient.gs;

public class PascalTriangle {
	public static void main(String[] args) {
	    int row = 5;
	    int col = 2;
	    int element  = pascal(col,row);
	    System.out.println("At row:"+row+", position:"+col+"-->"+element);
	  }
	  
	  static int pascal(int col,int row){
	      if(col > row){
	          return 0;
	      }
	      if(col == 0 || row == col){
	        return 1;
	      }
	      return pascal(col,row-1) +  pascal(col-1,row-1);
	  }
}
