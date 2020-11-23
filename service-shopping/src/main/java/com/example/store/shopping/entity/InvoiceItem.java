package com.example.store.shopping.entity;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "tbl_invoce_items")
@Data
public class InvoiceItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Positive(message = "El numero de elemento debe ser mayor a cero")
    private Double quantity;
    private Double price;
    @Column(name = "product_id")
    private Long productId;
    @Transient
    private Double subTotal;

    public Double getSubTotal(){
        if(this.price > 0 && this.quantity > 0){
            return this.price * this.quantity;
        }else{
            return (double) 0;
        }
    }

    public InvoiceItem(){
        this.quantity = (double) 0;
        this.price = (double) 0;
    }

}
