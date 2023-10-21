package dio.me.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity(name = "TB_ACCOUNT")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;
    private String agency;

    @Column(nullable = false, scale = 13, precision = 2)
    private BigDecimal balance;

    @Column(name = "ADDITIONAL_LIMIT", scale = 13, precision = 2)
    private BigDecimal limit;

}
