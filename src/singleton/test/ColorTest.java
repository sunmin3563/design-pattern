package singleton.test;

import singleton.lazy.LazyOne;
import singleton.lazy.LazyTwo;
import singleton.register.Color;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Tom on 2018/3/7.
 */
public class ColorTest {
    public static void main(String[] args) {
        System.out.println(Color.RED);
    }
}