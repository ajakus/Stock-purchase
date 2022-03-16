package edu.wctc.stockpurchase.controller;

import edu.wctc.stockpurchase.entity.StockPurchase;
import edu.wctc.stockpurchase.service.StockPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stockpurchases")
public class StockPurchaseController {

    private StockPurchaseService service;

    @Autowired
    public StockPurchaseController(StockPurchaseService sps) {
        this.service = sps;
    }

    @GetMapping("/api/stockpurchases")
    public List<StockPurchase> getStocks() {
        return StockPurchaseService;
    }

    @GetMapping("/{purchase_id}")
    public StockPurchase getStocks(@PathVariable int purchase_id){
        return new StockPurchase();
    }

    @PostMapping("/api/stockpurchases")
    public List<StockPurchase> getStocks(){
        return purchase_id;
    }

    @PutMapping("/api/stockpurchases")
    public List<StockPurchase> getStocks(){
        return ;
    }
    @PatchMapping("/api/stockpurchases")
    public List<StockPurchase> getStocks(){
        return StockPurchaseService;
    }
    @DeleteMapping("{purchase_id}")
    public List<StockPurchase> getStocks(){
        return StockPurchaseService;
    }
}
