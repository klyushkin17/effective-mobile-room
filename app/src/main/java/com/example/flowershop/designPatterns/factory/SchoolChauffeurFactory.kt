package com.example.flowershop.designPatterns.factory

import com.example.flowershop.designPatterns.cars.Bus
import com.example.flowershop.designPatterns.cars.Car
import com.example.flowershop.designPatterns.cars.RaceCar
import com.example.flowershop.designPatterns.drivers.BusDriver
import com.example.flowershop.designPatterns.drivers.Driver

class SchoolChauffeurFactory: ChauffeurFactory {

    override fun getCar(
        speed: Int,
        amountOfWheels: Int,
        capacity: Int
    ): Car = Bus(speed, amountOfWheels, capacity)

    override fun getDriver(drivingExperience: Int): Driver = BusDriver(drivingExperience)
}