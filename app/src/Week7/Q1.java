package Week7;

import java.util.Random;

class RandomNumberGenerator extends Thread {
    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int randomNumber = random.nextInt(100);    
            System.out.println("Generated Random Number: " + randomNumber);

            if (randomNumber % 2 == 0) {
                SecondThread squareThread = new SecondThread(randomNumber);
                squareThread.start();
            } else {
                ThirdThread cubeThread = new ThirdThread(randomNumber);
                cubeThread.start();
            }

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SecondThread extends Thread {
    private int number;

    public SecondThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + " is: " + square);
    }
}

class ThirdThread extends Thread {
    private int number;

    public ThirdThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int cube = number * number * number;
        System.out.println("Cube of " + number + " is: " + cube);
    }
}

public class Q1 {
    public static void main(String[] args) {
        RandomNumberGenerator generatorThread = new RandomNumberGenerator();
        generatorThread.start();
        System.out.println("hello");
    }
}
