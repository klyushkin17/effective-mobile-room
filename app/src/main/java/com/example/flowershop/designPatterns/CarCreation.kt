package com.example.flowershop.designPatterns

fun createCarInstance(): Car {

    val carBuilder: ICarBuilder = CarBuilder()

    carBuilder.setSpeed(200)
    carBuilder.setAmountOfWheels(6)
    carBuilder.setCapacity(9)

    return carBuilder.build()
}