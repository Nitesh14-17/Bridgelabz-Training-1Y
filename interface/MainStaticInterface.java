import java.util.Date;
class MainStaticInterface {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.isStrongPassword("password123"));
        System.out.println(UnitConverter.kmToMiles(10));
        System.out.println(UnitConverter.kgToLbs(5));
        System.out.println(DateFormatter.format(new Date(), "yyyy-MM-dd"));
    }
}