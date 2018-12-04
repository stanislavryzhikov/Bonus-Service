package ru.itpark;

public class BonusService {
    public int calculateBonus(int purchaseAmount, int totalAmount) { // FIXME: придумать нормальное имя для totalAmount
        int blueCardBonus = 50;
        int silverCardBonus = 70;
        int goldCardBonus = 90;
        int entirePart = purchaseAmount / 1_000;
        int bonusValue = 0;

        if (purchaseAmount >= 1 && purchaseAmount <= 15_000) {
            bonusValue = blueCardBonus;
        } else if (purchaseAmount >= 15001 && purchaseAmount <= 150_000) {
            bonusValue = silverCardBonus;
        } else {
            bonusValue = goldCardBonus;
        }

        int result = entirePart * bonusValue;
        return result;
    }
}
