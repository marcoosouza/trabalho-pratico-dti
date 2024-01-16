package com.marco.TestePratico.service;

import com.marco.TestePratico.model.PetShop;
import com.marco.TestePratico.repository.PetShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PetShopServiceImpl implements PetShopService{
    //Representação do maior valor possível inteiro
    private static int INFINITE = 2147483647;
    @Autowired
    private PetShopRepository petShopRepository;

    @Override
    public PetShop save(PetShop petShop) {
        return petShopRepository.save(petShop);
    }

    @Override
    public List<PetShop> getAll() {
        return petShopRepository.findAll();
    }

    @Override
    public Map<String, String> bestChoice(String date, int numSmallDog, int numBigDog) {
        Map<String, String> response = new HashMap<>();
        String[] nameAndValue = null;

        String[] parsedDate = date.split("-");

        int day = Integer.parseInt(parsedDate[2]);
        int month = Integer.parseInt(parsedDate[1]);
        int year = Integer.parseInt(parsedDate[0]);

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);

        LocalDate ld = LocalDate.of(year, month, day);
        boolean isWeekend = isWeekend(ld);

        nameAndValue = calculateBestChoice(numSmallDog, numBigDog, isWeekend);

        response.put("bestchoice", nameAndValue[0]);
        response.put("value", nameAndValue[1]);
        return response;
    }

    private String[] calculateBestChoice(int numSmallDog, int numBigDog, boolean isWeekend) {
        List<PetShop> petShops = getAll();
        int smallestValue = INFINITE;
        String nameChoice = "";
        int distance = -1;

        for(PetShop ps : petShops) {
            int valueBigDog = (isWeekend) ? ps.getValueBigDogWeekend() : ps.getValueBigDog();
            int valueSmallDog = (isWeekend) ? ps.getValueSmallDogWeekend() : ps.getValueSmallDog();
            int total = valueBigDog * numBigDog + valueSmallDog * numSmallDog;

            if (total < smallestValue || (total == smallestValue && ps.getDistance() < distance)) {
                smallestValue = total;
                nameChoice = ps.getName();
                distance = ps.getDistance();
            }
        }

        return new String[]{nameChoice, String.valueOf(smallestValue)};
    }

    public static boolean isWeekend(LocalDate ld) {
        return ld.getDayOfWeek().toString().equals("SATURDAY") || ld.getDayOfWeek().toString().equals("SUNDAY");
    }
}
