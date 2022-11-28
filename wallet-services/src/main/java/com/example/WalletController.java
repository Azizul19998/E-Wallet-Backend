package com.example;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {
    //create api all time called by kafka, no need to write own

    @Autowired
    WalletService walletService;


    @PostMapping("create-wallet-by-username")
    public void createWallet(@RequestParam("username") String userName) {
        walletService.createWallet(userName);
    }

    @GetMapping("get-wallet-by-username")
    public  Wallet getWalletByUserName(@RequestParam("username") String username) {
       return  walletService.getWalletByUserName(username);
    }

}
