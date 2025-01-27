package jpa.myshop_payment.product;

import jakarta.persistence.*;
import jpa.myshop_payment.user.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "product_tb")
@Entity
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String productname;

    private Double price;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}