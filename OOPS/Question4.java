package OOPS;

/* ================= BASE ABSTRACT CLASS ================= */

abstract class Notification {

    protected String recipient;
    protected String message;

    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    // Must be implemented by child classes
    public abstract void send();

    // Common behavior (same for all)
    public final void log() {
        System.out.println("Notification logged for: " + recipient);
    }
}

/* ================= EMAIL NOTIFICATION ================= */

class EmailNotification extends Notification {

    private String subject;

    public EmailNotification(String recipient, String message, String subject) {
        super(recipient, message);
        this.subject = subject;
    }

    @Override
    public void send() {
        System.out.println(
            "Sending EMAIL to " + recipient +
            " | Subject: " + subject +
            " | Message: " + message
        );
    }
}

/* ================= SMS NOTIFICATION ================= */

class SMSNotification extends Notification {

    private static final int SMS_LIMIT = 160;

    public SMSNotification(String recipient, String message) {
        super(recipient, message);

        if (message.length() > SMS_LIMIT) {
            throw new IllegalArgumentException(
                "SMS character limit exceeded"
            );
        }
    }

    @Override
    public void send() {
        System.out.println(
            "Sending SMS to " + recipient +
            " | Message: " + message
        );
    }
}

/* ================= PUSH NOTIFICATION ================= */

class PushNotification extends Notification {

    private String deviceToken;

    public PushNotification(String recipient, String message, String deviceToken) {
        super(recipient, message);
        this.deviceToken = deviceToken;
    }

    @Override
    public void send() {
        System.out.println(
            "Sending PUSH notification to device " +
            deviceToken +
            " | Message: " + message
        );
    }
}

/* ================= SERVICE LAYER ================= */

class NotificationService {

    public void sendNotification(Notification notification) {
        notification.send();   // Runtime polymorphism
        notification.log();    // Final method
        System.out.println("--------------------------------");
    }
}

/* ================= MAIN ================= */

public class Question4 {

    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        // Email
        Notification email = new EmailNotification(
            "akash@gmail.com",
            "Your interview is scheduled",
            "Interview Update"
        );

        // SMS
        Notification sms = new SMSNotification(
            "9876543210",
            "Your OTP is 123456"
        );

        // Push
        Notification push = new PushNotification(
            "Akash",
            "You have a new message",
            "DEVICE_ABC_123"
        );

        service.sendNotification(email);
        service.sendNotification(sms);
        service.sendNotification(push);

        // ❌ SMS limit violation (LSP-safe: checked during creation)
        try {
            Notification badSms = new SMSNotification(
                "9999999999",
                "This message is intentionally made very long to cross the SMS character limit and demonstrate exception handling"
            );
            service.sendNotification(badSms);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
