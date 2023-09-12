package br.com.marcio.warehousems.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name= "tb_werehouse")
@Data
public class Werehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "id_product", nullable = false)
    private Long productId;

    @Column(name = "id_quantity")
    private int quantity;

}
