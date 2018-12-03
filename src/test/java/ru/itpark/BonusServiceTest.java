package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    @Test
    void calculateBonus() {
        {
            BonusService service = new BonusService();
            int cashback = service.calculateBonus(0, 1_000);
            assertEquals(0, cashback);
        }
        {
            BonusService service = new BonusService();
            int cashback = service.calculateBonus(1_001, 1_000);
            assertEquals(50, cashback);
        }
        {
            BonusService service = new BonusService();
            int cashback = service.calculateBonus(100_000, 1_000);
            assertEquals(7_000, cashback);
        }
        {
            BonusService service = new BonusService();
            int cashback = service.calculateBonus(200_000, 1_000);
            assertEquals(18_000, cashback);
        }
    }
}