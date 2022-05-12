package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int res = service.squaring(200, 300);
        System.out.println(res);
    }
}
