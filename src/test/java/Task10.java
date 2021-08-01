public class Task10 {
    public int [] twoArgument (int len, int initialValue)
    {
        int [] arr = new int [len];
        for(int i = 0; i < len; i++){
            arr[i] = initialValue;
        }
        return (arr);
    }
}



//Написать метод, принимающий на вход два аргумента: len и initialValue,
//и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;