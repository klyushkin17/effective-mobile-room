package com.example.flowershop.designPatterns

interface ICarBuilder {

    fun setSpeed(speed: Int)
    fun setAmountOfWheels(amountOfWheels: Int)
    fun setCapacity(capacity: Int)

    fun build(): Car
}