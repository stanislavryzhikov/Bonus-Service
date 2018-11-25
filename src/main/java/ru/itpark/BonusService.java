package ru.itpark;

public class BonusService {
    public int calculateBonus(int purchaseAmount, int totalAmount) { // FIXME: придумать нормальное имя для totalAmount
        int result = 0;
        int blueCardBonus = 50;
        int silverCardBonus = 70;
        int goldCardBonus = 90;
        int entirePart = (int) (purchaseAmount / 1000);
        int bonusValue = 0;

        if (purchaseAmount >= 1 && purchaseAmount <= 15000) {
            bonusValue = blueCardBonus;
        } else if (purchaseAmount >= 15001 && purchaseAmount <= 150000) {
            bonusValue = silverCardBonus;
        } else {
            bonusValue = goldCardBonus;
        }

        result = entirePart * bonusValue;
        return result;
    }
}
