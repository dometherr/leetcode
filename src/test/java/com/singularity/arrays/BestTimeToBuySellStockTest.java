package com.singularity.arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class BestTimeToBuySellStockTest {
    static BestTimeToBuySellStock broker;

    @BeforeAll
    public static void beforeAll() {
        broker = new BestTimeToBuySellStock();
    }

    @Test
    public void brokerMapsProfitOnBestDayToBuyExists() {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int profit = broker.maxProfit(prices);
        int expectedProfit = 5;

        assertThat(profit).isEqualTo(expectedProfit);
    }

    @Test
    public void brokerMapsProfitOnBestDayToBuyNotExists() {
        int[] prices = {4, 2, 1};

        int profit = broker.maxProfit(prices);
        int expectedProfit = 0;

        assertThat(profit).isEqualTo(expectedProfit);
    }

}
