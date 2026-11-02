class boundedtypes {

    public <T extends Number> void displayNumber(T number) {

        System.out.println("Number: " + number);
        System.out.println("Double Value: " + number.doubleValue());
    }

    public static void main(String[] args) {

        boundedtypes obj = new boundedtypes();

        obj.displayNumber(100);
        obj.displayNumber(25.5);
        obj.displayNumber(50.75);
    }
}