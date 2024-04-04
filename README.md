# Orders and Notifications Management Module

This repository contains the implementation of the "Orders and Notifications Management" module, a component designed to fulfill specific needs within a larger software system. This module allows users to manage orders, including both simple and compound orders, as well as handle notifications for various operations within the system.

## Table of Contents

- [Team](#team)
- [Class Diagram](#class-diagram)
- [Sequence Diagram](#sequence-diagram)
- [Requirements](#requirements)
- [Exposed Web Service API](#exposed-web-service-api)
- [Installation and Usage](#installation-and-usage)
- [Contributing](#contributing)
- [License](#license)

## Team

This project is developed by the following team members:

- Abdelrahman Hossam Eldin Ahmed - [bodyhossam62@gmail.com](mailto:bodyhossam62@gmail.com)
- Sara Adel Hanafy - [saraadel6122@gmail.com](mailto:saraadel6122@gmail.com)
- Doha Tarek Farouk - [dohatarek155@gmail.com](mailto:dohatarek155@gmail.com)
- Mai Mohamed Khalil - [maim51084@gmail.com](mailto:maim51084@gmail.com)

## Class Diagram

![Class Diagram](link-to-your-class-diagram-image)

**Note:**
The class diagram for this project is available in a Word file. You can view the diagram by downloading the file 

The class diagram illustrates the structure of the software components and their relationships. Key design patterns such as Composite Pattern in the Order Module and Strategy Pattern in various places are utilized for efficient implementation.


## Sequence Diagram

![Sequence Diagram](link-to-your-sequence-diagram-image)

**Note:**
The sequence diagram for this project is also available in a Word file. You can view the diagram by downloading the file.


The sequence diagram depicts the interactions between different components or objects in the system over time, showcasing the flow of messages and the order of executions.

## Requirements

The "Orders and Notifications Management" module is designed to fulfill the following requirements:

1. Display a list of all available products and their categories with remaining counts.
2. Allow customers to create an account with a specific balance and verify their registration through OTP.
3. Enable customer login with username and password.
4. Facilitate placing simple or compound orders.
5. Provide details of both simple and compound orders.
6. Allow users to ship placed orders.
7. Initialize notification channels, create default templates, and configure channels.
8. Display statistics regarding the most notified email address/phone number and the most sent notification template.
9. Implement a notifications queue for sending notifications.
10. Allow customers to cancel orders.

## Exposed Web Service API

The module exposes the following RESTful API endpoints to interact with its functionalities:

- `GET /products/all`: Retrieve information about all available products.
- `GET /products/allByCategory`: Retrieve products categorized by their categories.
- `POST /register`: Create a customer account.
- `GET /sendOTP`: Generate and retrieve an OTP for registration validation.
- `POST /verifyOTP/{otp}`: Verify the OTP sent during registration.
- `POST /login/{username}/{password}`: Validate a customer's login credentials.
- `POST /orders/simple`: Create a simple order.
- `POST /orders/compound`: Create a compound order.
- `GET /orders/{id}`: Retrieve details of a specific order.
- `GET /orders/ShipOrder/{id}`: Ship a specific order.
- `GET /notify/init`: Initialize notification channels.
- `GET /notify/mostChannel`: Retrieve information about the most used notification channel.
- `GET /notify/mostTemplate`: Retrieve information about the most sent notification template.
- `GET /notify/display`: Display notifications currently in the queue.
- `POST /CancelOrder/{id}`: Cancel a specific order.

## Installation and Usage

To install and use the module, follow these steps:

1. Clone the repository: `git clone <repository_url>`
2. Install dependencies: `npm install`
3. Start the server: `npm start`
4. Access the API endpoints using a tool like Postman or through HTTP requests.

## Contributing

Contributions to improve this module are welcome. Feel free to fork the repository and submit pull requests with your changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
