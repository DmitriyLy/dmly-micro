package org.dmly.micro.clients.notification;

public record NotificationRequest(Long toCustomerId,
                                  String toCustomerName,
                                  String message) {
}
