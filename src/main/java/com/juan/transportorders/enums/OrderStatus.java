package com.juan.transportorders.enums;

public enum OrderStatus {

    CREATED,
    IN_TRANSIT,
    DELIVERED,
    CANCELLED;

        public boolean canChangeTo(OrderStatus newStatus) {
            if (newStatus == null) return false;
            return switch (this){
                case CREATED -> newStatus == IN_TRANSIT || newStatus == CANCELLED;
                case IN_TRANSIT -> newStatus == DELIVERED || newStatus == CANCELLED;
                case DELIVERED, CANCELLED -> false;
            };
        }
}
