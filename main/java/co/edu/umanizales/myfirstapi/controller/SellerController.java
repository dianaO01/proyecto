package co.edu.umanizales.myfirstapi.controller;

import co.edu.umanizales.myfirstapi.model.Seller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "seller")
public class SellerController {

    @GetMapping
    public String getSeller(){
        Seller sofia = new Seller( "1053258654", "sofia",  "giraldo",'F', (byte) 21,"manizales");
        Seller valentina = new Seller(  "1053849582", "valentina", "tabares", 'F', (byte) 28, "manizales");
        Seller lina = new Seller ("1053837067","lina", "alvarez", 'F',(byte) 30, "manizales");
        Seller cristian = new Seller ("1053769521", "cristian", "gonzalez", 'M', (byte) 38, "manizales");
        Seller diana = new Seller ( "1053853035", "diana", "patiño", 'F', (byte) 28, "manizales");




         return "Seller";
    }
}
