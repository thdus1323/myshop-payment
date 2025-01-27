package jpa.myshop_payment.paymentHistory;

import jakarta.persistence.*;
import jpa.myshop_payment.payment.Payment;
import jpa.myshop_payment.product.Product;
import jpa.myshop_payment.user.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "paymentHistory_tb")
@Entity
@NoArgsConstructor
public class PaymentHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    private Payment payment;
}
