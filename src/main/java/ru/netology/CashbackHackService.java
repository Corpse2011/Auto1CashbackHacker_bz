package ru.netology;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
//возращаем значение расчета по формуле - сумму покупки делим на 1000 и из нее вычитаем 1000
    }
}