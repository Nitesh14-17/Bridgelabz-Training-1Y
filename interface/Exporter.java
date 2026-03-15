interface Exporter {
    default void exportToJSON() { System.out.println("Exported to JSON"); }
}