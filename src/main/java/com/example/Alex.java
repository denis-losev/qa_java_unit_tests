package com.example;

import java.util.List;

public class Alex extends Lion {
    private final List<String> friendsList = List.of("Марти", "Глория", "Мелман");
    private final String placeOfLiving = "Нью-Йоркский зоопарк";
    public Alex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public List<String> getFriends() {
        return friendsList;
    }

    public String getPlaceOfLiving() {
        return placeOfLiving;
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
