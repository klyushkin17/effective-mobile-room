package com.example.flowershop.designPatterns

class CarBuilder: ICarBuilder {
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

    override fun build(): Car = Car(speed, amountOfWheels, capacity)
}