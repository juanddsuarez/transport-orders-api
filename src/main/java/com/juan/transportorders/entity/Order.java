package com.juan.transportorders.entity;

import com.juan.transportorders.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "UUID")
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private OrderStatus status;

    @Column(name = "origin")
    private String origin;

    @Column(name = "destination")
    private String destination;

    @CreationTimestamp
    @Column(name = "createdAt", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updatedAt", nullable = false)
    private LocalDateTime updatedAt;

}
