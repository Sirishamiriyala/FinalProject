package com.example.javalib;

import java.util.Random;

public class myClass {
    public static String[] joke={"Moses had the first tablet that could connect to the cloud.  ","About a month before he died, my uncle had his back covered in lard. After that, he went down hill fast","Talking to a liberal is like trying to explain social media to a 70 years old."};
    public String displayJoke(){return joke[new Random().nextInt(joke.length-1)];}
}
