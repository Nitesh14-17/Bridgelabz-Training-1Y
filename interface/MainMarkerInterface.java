class MainMarkerInterface {
    public static void main(String[] args) {
        BackupData b = new BackupData("data");
        Prototype p = new Prototype("model");
        SensitiveInfo s = new SensitiveInfo("secret");
        System.out.println(b.data);
        System.out.println(((Prototype)p.clone()).value);
        System.out.println(s.info);
    }
}