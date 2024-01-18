# Energy Management System Simulation

Welcome to our internship application's technical test. This Java application simulates a basic energy management system, focusing on object-oriented programming principles.

## Table of Contents

- [Project Overview](#project-overview)
- [Components](#components)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Bonus Points](#bonus-points)
- [Contributing](#contributing)

## Project Overview

### Objective

Develop a Java application that simulates an energy management system with different components, such as batteries and solar panels.

### Components

1. **Abstract Class - `Component`**
   - Base class for different energy components.
   - Has an abstract method `getDetails` to return details as a string.

2. **Subclass - `Battery`**
   - Represents a battery.
   - Constructor takes the capacity in kWh.
   - Overrides `getDetails` to return battery details.
   - Has a method `getCapacity` to get the battery capacity.

3. **Subclass - `SolarPanel`**
   - Represents a solar panel.
   - Constructor takes power generation capacity in kW.
   - Overrides `getDetails` to return solar panel details.
   - Has a method `generatePower` to simulate power generation.

4. **Class - `EnergyManager`**
   - Manages a collection of energy components.
   - Methods to add/remove components and calculate total battery capacity.

### Getting Started

#### Prerequisites

- Java Development Kit (JDK) installed
- IntelliJ IDEA or any preferred Java IDE

#### Installation

1. Clone the repository: `git clone https://github.com/Nour-chargui/Lightency_test.git`
2. Open the project in your Java IDE.

## Usage

Run the `Main` class to execute the simulation. This will create instances of batteries and solar panels, add them to the `EnergyManager`, and calculate the total battery capacity.

## Bonus Points - Error Handling

### Why

To enhance the code's robustness by handling potential errors gracefully.

### How

1. **Update `Battery` and `SolarPanel` Classes:**
   - Added checks for negative capacity or power.
   - Threw `IllegalArgumentException` for invalid input.

2. **Handle Errors in Main Class:**
   - Updated `Main` class to handle exceptions when creating components.
   - Prints an error message if an `IllegalArgumentException` is caught.

### Utility

- Ensures that invalid input values (e.g., negative capacity or power) are caught and reported.
- Prevents the program from crashing due to unexpected input.

## Contributing

I have contributed in this work with my teammate
