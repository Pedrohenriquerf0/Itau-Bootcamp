package itau.bootcamp;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static List<Integer> numeros = new ArrayList<>();

    private static void inc(int numero){
        synchronized (numeros){
            numeros.add(numero);
        }
    }

    private static void dec(int numero){
        synchronized (numeros){
            numeros.remove(numero);
        }
    }

    private static void show(int numero){
        synchronized (numeros){
            System.out.println(numeros);
        }
    }

    public static void main(String[] args) {
        Runnable inc = () -> {
            for (int i = 0; i < 100_000_000; i++) {
                inc(i);
            }
        };

        Runnable dec = () -> {
            for (int i = 100_000_000; i > 0; i--) {
               dec(i);
            }
        };

        Runnable show = () -> {
            for (int i = 0; i < 100_000_000; i++){
                show(i);
            }
        };


        new Thread(inc).start();
        new Thread(dec).start();
        new Thread(show).start();
    }
}