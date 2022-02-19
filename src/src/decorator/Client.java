package decorator;

import decorator.model.FoundationMakeup;
import decorator.model.Girl;
import decorator.model.Lipstick;
import decorator.model.Showable;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.zip.ZipInputStream;

public class Client {
    public static void main(String[] args) {
        Showable madeUpGirl = new Lipstick(new FoundationMakeup(new Girl()));
        madeUpGirl.show();

        File file = new File("/压缩包.zip");
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
