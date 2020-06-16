package com.example.mustachedemo.Cars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
	int number;
	String company;
	String model;
	String color;
}

