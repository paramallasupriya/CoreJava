package com.as.apex.corejava.basics;

public class BestTimeToBuyAndSellStocks {

		   public static int maxProfit(int[] prices) {
		       
		       if(prices == null || prices.length == 0)
		        {
		        return 0;
		        }
		       int min = prices[0];
		       int max = Integer.MIN_VALUE;
		       
		       for(int i = 0; i < prices.length; i++){
		           int money = prices[i] - min;
		           if(money > max) {
		            max = money;
		           }
		           if(prices[i] < min) {
		            min = prices[i];
		           }
		       }
		       
		       return max;
		       
		   }

		public static void main(String[]args) {

		int[] prices= {7,4,5,6,9};
		    int profit = maxProfit(prices);
		    System.out.println("The best time to sell stock is"+ " " + profit);
		}

		}
