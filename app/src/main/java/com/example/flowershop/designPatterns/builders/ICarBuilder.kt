package com.example.flowershop.designPatterns.builders

import com.example.flowershop.designPatterns.cars.Car

interface ICarBuilder {

    fun setSpeed(speed: Int)
    fun setAmountOfWheels(amountOfWheels: Int)
    fun setCapacity(capacity: Int)

    fun build(): Car
}