package org.dmly.micro.notification;

import org.dmly.micro.clients.notification.NotificationRequest;

import java.time.LocalDateTime;

public interface NotificationService {
    void sendNotification(NotificationRequest notificationRequest);
}
