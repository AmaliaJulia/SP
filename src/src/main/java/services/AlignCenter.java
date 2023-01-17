package services;
import models.AlignStrategy;

public class AlignCenter implements AlignStrategy{


    public void render(String text) {
        System.out.printf("## %s ##\n",text);

    }
}