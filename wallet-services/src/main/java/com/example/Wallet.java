package com.example;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter @Setter
@Entity
@Builder
@Data
@Table(name = "wallets")
@AllArgsConstructor @NoArgsConstructor
public class Wallet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "amount")
    private int amount;

}
