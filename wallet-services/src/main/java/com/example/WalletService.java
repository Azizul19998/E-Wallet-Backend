package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class WalletService {

    @Autowired
    WalletRepository walletRepository;

    public void createWallet(String userName) {
            Wallet wallet = Wallet.builder()
                    .userName(userName)
                    .amount(0).build();

            walletRepository.save(wallet);
    }

    public  Wallet getWalletByUserName( String username) {
        Wallet wallet = walletRepository.findByUserName(username);
        return wallet;
    }

    public Wallet increamentWallet(String userName, int amount) {
      //option 1
        Wallet oldWallet = walletRepository.findByUserName(userName);
        int newAmount= oldWallet.getAmount()+amount;
        int originalid= oldWallet.getId();

        Wallet updatedWallet = Wallet.builder()
                .id(originalid)
                .userName(userName)
                .amount(newAmount).build();

        walletRepository.save(updatedWallet);
        return updatedWallet;


        //option-2--Query qriting
       // int success = walletRepository.updatedWallet(userName, amount);


    }

    Wallet decreamentWallet(String userName, int amount) {

        Wallet oldWallet = walletRepository.findByUserName(userName);
        int newAmount= oldWallet.getAmount()-amount;
        int originalid= oldWallet.getId();

        Wallet updateWallet = Wallet.builder()
                .id(originalid)
                .userName(userName)
                .amount(newAmount).build();

        return walletRepository.save(updateWallet);

    }
}
