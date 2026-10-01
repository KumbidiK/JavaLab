class NumberThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println(i);
    }
}

class CharacterThread extends Thread {

    public void run() {
        for (char c = 'A'; c <= 'E'; c++)
            System.out.println(c);
    }
}

class MessageThread extends Thread {

    public void run() {
        System.out.println("Hello from Thread");
    }
}

class ThreadClassDemo {
    public static void main(String[] args) {

        new NumberThread().start();
        new CharacterThread().start();
        new MessageThread().start();
    }
}