package com.efoxdev.conversor.models;

public record Conversor(
    String result,
    double conversion_rate,
    double conversion_result
) {
}
