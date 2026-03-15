class Prototype implements Cloneable {
    String value;
    Prototype(String v) { value = v; }
    public Object clone() { try { return super.clone(); } catch (Exception e) { return null; } }
}