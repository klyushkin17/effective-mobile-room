package com.example.flowershop.designPatterns.builders

import com.example.flowershop.designPatterns.cars.Bus
import com.example.flowershop.designPatterns.cars.Car

class BusBuilder: ICarBuilder {
    private var speed = 100
    private var amountOfWheels = 4
    private var capacity = 5

    override fun setSpeed(speed: Int) {
        this.speed = speed
    }

    override fun setAmountOfWheels(amountOfWheels: Int) {
        this.amountOfWheels = amountOfWheels
    }

    override fun setCapacity(capacity: Int) {
        this.capacity = capacity
    }

    override fun build(): Car = Bus(speed, amountOfWheels, capacity)
}