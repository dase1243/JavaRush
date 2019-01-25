package com.javarush.glushko.level27.lesson15.big01.ad;

import java.util.ArrayList;
import java.util.List;

public class StatisticAdvertisementManager {
    private static StatisticAdvertisementManager ourInstance = new StatisticAdvertisementManager();
    private AdvertisementStorage advertisementStorage = AdvertisementStorage.getInstance();

    private StatisticAdvertisementManager() {
    }

    public static StatisticAdvertisementManager getInstance() {
        return ourInstance;
    }

    public List<Advertisement> getActiveVideos() {
        List<Advertisement> result = new ArrayList<>();
        for (Advertisement advertisement : advertisementStorage.list()) {
            if (advertisement.getHits() > 0) {
                result.add(advertisement);
            }
        }
        return result;
    }

    public List<Advertisement> getInactiveVideos() {
        List<Advertisement> result = new ArrayList<>();
        for (Advertisement advertisement : advertisementStorage.list()) {
            if (advertisement.getHits() == 0) {
                result.add(advertisement);
            }
        }
        return result;
    }
}
