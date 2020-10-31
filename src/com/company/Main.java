package com.company;

public class Main {

//    Написать программу сортировки по возрастанию заданного пользователем массива чисел.
//    Использовать пузырьковый метод сортировки.

    public static void main(String[] args) {
	    int[] nums = {-3, 1, 7, 2, 0, 9, 4};
	    for (int i = nums.length - 1; i>0;  i--){
	        for (int j = 0; j < i; j++){
                if( nums[j] > nums[j+1] ){
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }
//        for (int i = 0; i< nums.length; i++){
//            System.out.println(nums[i]);
//        }
    }
}
