import java.util.function.Predicate;
class TemperatureAlert {
    Predicate<Double> alert = t -> t > 30;
}