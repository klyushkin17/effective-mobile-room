package com.example.flowershop.designPatterns

import com.example.flowershop.designPatterns.builders.BusBuilder
import com.example.flowershop.designPatterns.builders.ICarBuilder
import com.example.flowershop.designPatterns.cars.Car

fun createCarInstance(): Car {

    val carBuilder: ICarBuilder = BusBuilder()

    carBuilder.setSpeed(200)
    carBuilder.setAmountOfWheels(6)
    carBuilder.setCapacity(9)

    return carBuilder.build()
}