package com.juan.transportorders.dto;

import com.juan.transportorders.enums.OrderStatus;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private UUID id;

    private OrderStatus status;

    @NotBlank(message = "El origen no puede estar vacío")
    private String origin;

    @NotBlank(message = "El destino no puede estar vacío")
    private String destination;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
