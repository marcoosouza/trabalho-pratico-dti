package com.marco.TestePratico.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Petshop")
public class PetShop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "ValueSmallDog")
    private int valueSmallDog;
    @Column(name = "ValueSmallDogWeekend")
    private int valueSmallDogWeekend;
    @Column(name = "ValueBigDog")
    private int valueBigDog;
    @Column(name = "ValueBigDogWeekend")
    private int valueBigDogWeekend;
    @Column(name = "Distance")
    private int distance;

    public PetShop(){}
    public PetShop(String name, int valueSmallDog, int valueSmallDogWeekend, int valueBigDog, int valueBigDogWeekend, int distance) {
        this.name = name;
        this.valueSmallDog = valueSmallDog;
        this.valueSmallDogWeekend = valueSmallDogWeekend;
        this.valueBigDog = valueBigDog;
        this.valueBigDogWeekend = valueBigDogWeekend;
        this.distance = distance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValueSmallDog() {
        return valueSmallDog;
    }

    public void setValueSmallDog(int valueSmallDog) {
        this.valueSmallDog = valueSmallDog;
    }

    public int getValueSmallDogWeekend() {
        return valueSmallDogWeekend;
    }

    public void setValueSmallDogWeekend(int valueSmallDogWeekend) {
        this.valueSmallDogWeekend = valueSmallDogWeekend;
    }

    public int getValueBigDog() {
        return valueBigDog;
    }

    public void setValueBigDog(int valueBigDog) {
        this.valueBigDog = valueBigDog;
    }

    public int getValueBigDogWeekend() {
        return valueBigDogWeekend;
    }

    public void setValueBigDogWeekend(int valueBigDogWeekend) {
        this.valueBigDogWeekend = valueBigDogWeekend;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "PetShop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", valueSmallDog=" + valueSmallDog +
                ", valueSmallDogWeekend=" + valueSmallDogWeekend +
                ", valueBigDog=" + valueBigDog +
                ", valueBigDogWeekend=" + valueBigDogWeekend +
                ", distance=" + distance +
                '}';
    }
}
