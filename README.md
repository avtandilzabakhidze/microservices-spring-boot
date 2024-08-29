# Microservices Spring Boot Project

## Description

This project demonstrates a microservices architecture using Spring Boot. It includes two main microservices:

- **Customer Service:** Manages customer-related operations.
- **Fraud Service:** Handles fraud detection and related operations.

The project showcases how to build and deploy microservices that interact with each other, with each service having its own domain, service, and controller layers.

## Project Structure

### `customer` Service

- **Domain:** Contains the `Customer` entity.
- **Service:** Contains business logic related to customer operations.
- **Controller:** Manages HTTP requests and responses related to customer operations.

### `fraud` Service

- **Domain:** Contains the `Fraud` entity and related data models.
- **Service:** Contains business logic for fraud detection and management.
- **Controller:** Manages HTTP requests and responses related to fraud operations.

## Project Structure

Here is a brief overview of the structure of each service:

### Customer Service

#### Domain

- **`Customer`**: Represents customer data with attributes such as `id`, `name`, and `email`.

#### Service

- **`CustomerService`**: Contains business logic for managing customers. Methods include:
  - `findAll()`: Retrieves all customers.
  - `findById(Long id)`: Finds a customer by ID.
  - `save(Customer customer)`: Creates or updates a customer.
  - `delete(Long id)`: Deletes a customer by ID.

#### Controller

- **`CustomerController`**: Provides REST API endpoints for customer operations:
  - `GET /api/v1/customers`: Retrieves all customers.
  - `GET /api/v1/customers/{id}`: Retrieves a customer by ID.
  - `POST /api/v1/customers`: Creates a new customer.
  - `PUT /api/v1/customers/{id}`: Updates an existing customer.
  - `DELETE /api/v1/customers/{id}`: Deletes a customer by ID.

### Fraud Service

#### Domain

- **`Fraud`**: Represents fraud detection data with attributes such as `id`, `customerId`, and `fraudulent`.

#### Service

- **`FraudService`**: Contains business logic for fraud detection. Methods include:
  - `checkFraud(Long customerId)`: Checks if a customer is flagged for fraud.

#### Controller

- **`FraudController`**: Provides REST API endpoints for fraud operations:
  - `GET /api/v1/fraud/{customerId}`: Checks if a customer is flagged for fraud.

## Installation
