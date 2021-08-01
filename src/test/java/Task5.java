class Task5 {
    public boolean leapYear(int year) {
        boolean yearIsLeap;
        if (year < 0) {
            throw new IllegalArgumentException("IllegalArgumentException");
        }
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            yearIsLeap = true;
        } else {
            yearIsLeap = false;
        }
        return (yearIsLeap);
    }
}