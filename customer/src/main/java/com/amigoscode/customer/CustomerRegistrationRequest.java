package com.amigoscode.customer;

public record CustomerRegistrationRequest(
        String fisrtName,
        String lastName,
        String email) {
}
