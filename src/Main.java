public static void main(String[] args) {
    int price = 15000; // цена билета
    boolean ticket = true;

    int percent;
    if (ticket)  percent = 5;
     else percent = 0;

   int bonus =  (price * percent / 100);

    System.out.println( "Бонусные мили:" + bonus);
}