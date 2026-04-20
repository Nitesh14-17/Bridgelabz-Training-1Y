import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.*;

public class StreamApiExamples {
    public static void main(String[] args) {
        // 1. Top 5 Trending Movies
        List<Movie> movies = Arrays.asList(
            new Movie("A", 8.5, 2023),
            new Movie("B", 9.1, 2024),
            new Movie("C", 7.8, 2022),
            new Movie("D", 8.9, 2024),
            new Movie("E", 9.3, 2024),
            new Movie("F", 8.7, 2023),
            new Movie("G", 9.0, 2024)
        );
        movies.stream()
            .sorted(Comparator.comparingDouble(Movie::getRating).reversed()
                .thenComparing(Movie::getYear, Comparator.reverseOrder()))
            .limit(5)
            .forEach(m -> System.out.println(m.name + " " + m.rating + " " + m.year));

        // 2. Hospital Doctor Availability
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Aditya", "Cardiology", true),
            new Doctor("Aniket", "Neurology", false),
            new Doctor("OM", "Orthopedics", true),
            new Doctor("Shachi", "Pediatrics", true)
        );
        doctors.stream()
            .filter(d -> d.weekend)
            .sorted(Comparator.comparing(d -> d.specialty))
            .forEach(d -> System.out.println(d.name + " " + d.specialty));

        // 3. Insurance Claim Analysis
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 1000),
            new Claim("Auto", 2000),
            new Claim("Health", 1500),
            new Claim("Auto", 2500),
            new Claim("Home", 3000)
        );
        Map<String, Double> avgClaims = claims.stream()
            .collect(Collectors.groupingBy(c -> c.type, Collectors.averagingDouble(c -> c.amount)));
        avgClaims.forEach((type, avg) -> System.out.println(type + ": " + avg));

        // 4. Filtering Expiring Memberships
        List<Member> members = Arrays.asList(
            new Member("GOKU", LocalDate.now().plusDays(10)),
            new Member("Jerry", LocalDate.now().plusDays(40)),
            new Member("KEN", LocalDate.now().plusDays(25))
        );
        members.stream()
            .filter(m -> m.expiry.isAfter(LocalDate.now()) && m.expiry.isBefore(LocalDate.now().plusDays(31)))
            .forEach(m -> System.out.println(m.name + " " + m.expiry));

        // 5. Transforming Names for Display
        List<String> names = Arrays.asList("alice", "bob", "charlie");
        names.stream()
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);

        // forEach() Method
        // 1. Stock Price Logger
        List<Double> prices = Arrays.asList(101.5, 102.3, 99.8);
        prices.forEach(System.out::println);

        // 2. Event Attendee Welcome Message
        List<String> attendees = Arrays.asList("Nitesh", "Shachi", "Prachi");
        attendees.forEach(a -> System.out.println("Welcome " + a));

        // 3. IoT Sensor Readings
        List<Integer> readings = Arrays.asList(45, 67, 32, 80);
        readings.stream().filter(r -> r > 50).forEach(System.out::println);

        // 4. Email Notifications
        List<String> emails = Arrays.asList("a@mail.com", "b@mail.com");
        emails.forEach(StreamApiExamples::sendEmailNotification);

        // 5. Logging Transactions
        List<String> transactionIds = Arrays.asList("T1", "T2", "T3");
        transactionIds.forEach(id -> System.out.println(LocalDateTime.now() + " - Transaction: " + id));
    }

    static void sendEmailNotification(String email) {
        System.out.println("Email sent to " + email);
    }

    static class Movie {
        String name;
        double rating;
        int year;
        Movie(String name, double rating, int year) {
            this.name = name;
            this.rating = rating;
            this.year = year;
        }
        double getRating() { return rating; }
        int getYear() { return year; }
    }

    static class Doctor {
        String name;
        String specialty;
        boolean weekend;
        Doctor(String name, String specialty, boolean weekend) {
            this.name = name;
            this.specialty = specialty;
            this.weekend = weekend;
        }
    }

    static class Claim {
        String type;
        double amount;
        Claim(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }
    }

    static class Member {
        String name;
        LocalDate expiry;
        Member(String name, LocalDate expiry) {
            this.name = name;
            this.expiry = expiry;
        }
    }
}
