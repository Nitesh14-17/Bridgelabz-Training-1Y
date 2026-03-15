interface SecurityUtils {
    static boolean isStrongPassword(String p) {
        return p.length() >= 8;
    }
}