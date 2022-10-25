class Classroom {

    public static void main(String[] args) {
        Wilder Goudale = new Wilder("Goudale", false);
        Wilder Json = new Wilder ("Json", false);

        System.out.println(Goudale.whoAmI());
        System.out.println(Json.whoAmI());

        Goudale.setAware(true);
        Json.setAware(true);

        System.out.println(Goudale.whoAmI());
        System.out.println(Json.whoAmI());
    }

}