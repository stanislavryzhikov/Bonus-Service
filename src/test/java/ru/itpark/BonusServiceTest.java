package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    @Test
    void calculateBonus() {
        {
            BonusService service = new BonusService();
            int cashback = service.calculateBonus(0, 1000);
            assertEquals(0, cashback);
        }
        {
            BonusService service = new BonusService();
            int cashback = service.calculateBonus(1001, 1000);
            assertEquals(50, cashback);
        }
        {
            BonusService service = new BonusService();
            int cashback = service.calculateBonus(100000, 1000);
            assertEquals(7000, cashback);
        }
        {
            BonusService service = new BonusService();
            int cashback = service.calculateBonus(200000, 1000);
            assertEquals(18000, cashback);
        }
    }
}