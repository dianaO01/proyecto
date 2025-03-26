package co.edu.umanizales.myfirstapi.controller;

import co.edu.umanizales.myfirstapi.model.Store;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path =  "/store")
public class StoreController {

    @GetMapping
    public String getStore(){
        Store moonNails = new Store( "15001", "moonNails", "calle 67 # 8-98", "manizales");

        return "Store";
    }
}
