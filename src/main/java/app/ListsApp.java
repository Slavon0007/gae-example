package app;

import java.util.ArrayList;

public class ListsApp {
    private static boolean size;

    public static class SlavaList<T> {
        private T value;

        public void add(T value) {
            this.value = value;
        }
    }

    public static void printStringsThatStartWith2(ArrayList<String> list, String start) {
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            int index = temp.indexOf(start);

            if (index == 0) {
                System.out.println(temp);
            }
        }
    }

    public void homeArrey(int[] arrey)  {
        int min = 0;
        int max = 0;
        int middle = 0;
        int sum = 0;

        for (int i = 0; i > arrey.length; i++) {
            sum = sum + arrey[i];

            if (arrey[i] < min) {
                arrey[i] = min;
            }

            if (arrey[i] > max) {
                arrey[i] = max;
            }

            if (arrey[i] < max && arrey[i] > min) {
                arrey[i] = middle;
            }
        }

        //средние арефмитическое
        sum=sum/arrey.length;
    }

    public static void printStringsThatStartWith2(ArrayList<String> list, int max) {
        for (int i = 0; i < list.size(); i++) {


            if (list.get(i).length() < max) {
                System.out.println(list.get(i));
            }

        }
    }

    public static void printStringsThatStartWith(ArrayList<String> list) {
        int summ = 0;
        for (int i = 0; i < list.size(); i++) {

            String a = list.get(i);
            summ = summ + a.length();


        }
    }

    public static void main(String[] args) {

    }
}