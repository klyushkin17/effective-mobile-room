package com.example.flowershop.designPatterns.factory

import com.example.flowershop.designPatterns.cars.Car
import com.example.flowershop.designPatterns.drivers.Driver

interface ChauffeurFactory {

    fun getCar(
        speed: Int,
        amountOfWheels: Int,
        capacity: Int,
    ): Car

    fun getDriver(
        drivingExperience: Int,
    ): Driver
}