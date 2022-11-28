package com.example;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@Entity
@Builder
@Table(name = "wallets")
@AllArgsConstructor @NoArgsConstructor
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String userName;

    private int amount;

}
