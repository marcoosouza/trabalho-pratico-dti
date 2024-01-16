package com.marco.TestePratico.service;

import com.marco.TestePratico.model.PetShop;

import java.util.List;
import java.util.Map;

public interface PetShopService {
    public PetShop save(PetShop petShop);
    public List<PetShop> getAll();
    public Map<String, String> bestChoice(String date, int numSmallDog, int numBigDog);

}
