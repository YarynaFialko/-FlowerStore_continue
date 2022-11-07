package ua.edu.ucu.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;


//@Table
//@Entity
//@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
public class Flower {
    private String color;
    private int sepaLength;
    private int price;
}
