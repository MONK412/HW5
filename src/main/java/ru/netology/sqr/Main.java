package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int res = service.squaring(50, 90);
        System.out.println(res);
    }
}
