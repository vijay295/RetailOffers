package com.code.retailoffers;

import org.springframework.stereotype.Component;

@Component
public class Test {

    public void retail() {
        int[] numbers = {41, 51, 101, 200, 300};
        int reward = 0;
        for (int number : numbers) {
            System.out.print("For " + number);
            getCustomersRewardsPoint(number, reward);
        }

    }

    private void getCustomersRewardsPoint(int number, int reward) {
        int number_to_eleminate = 0;
        while (number > 0) {
            if (number > 50 && number <= 100) {
                reward = reward + getTotalRewards(number);
                number_to_eleminate = number - 50;
                number = number - number_to_eleminate;
            } else if (number > 100) {
                reward = reward + getTotalRewards(number);
                number_to_eleminate = number - 100;
                number = number - number_to_eleminate;
            } else {
                number = 0;
            }
        }
        System.out.println(" Rewards Points " + reward);
    }

    public static int getTotalRewards(int number) {
        int reward = 0;
        if (number > 100) {
            reward = number - 100;
            reward = 2 * reward;
        } else if (number > 50 && number <= 100) {
            reward = number - 50;
            reward = 1 * reward;
        }
        return reward;
    }

}
