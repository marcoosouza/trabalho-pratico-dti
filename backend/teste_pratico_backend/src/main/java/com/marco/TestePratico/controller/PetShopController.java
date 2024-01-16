package com.marco.TestePratico.controller;

import com.marco.TestePratico.model.PetShop;
import com.marco.TestePratico.service.PetShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:3000")
public class PetShopController {
    @Autowired
    private PetShopService petShopService;

    @PostMapping("/add")
    public String add(@RequestBody PetShop petShop) {
        petShopService.save(petShop);

        return "Pet Shop Saved";
    }

    @PostMapping("/bestchoice")
    public Map<String, String> bestPetShop(@RequestBody Map<String, Object> requestBody) {
        String date = requestBody.get("date").toString();
        int numSmallDog = Integer.parseInt(requestBody.get("numSmallDog").toString());
        int numBigDog = Integer.parseInt(requestBody.get("numBigDog").toString());

        return petShopService.bestChoice(date, numSmallDog, numBigDog);
    }
}
