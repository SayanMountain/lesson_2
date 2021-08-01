class Task4 {
    public void printStrings (String string, int numberOfStrings){
        if (numberOfStrings <= 0) {
            throw new IllegalArgumentException("IllegalArgumentException");
        }
        for(int i = 0; i < numberOfStrings; i++){
            System.out.println(string);
        }
    }
}