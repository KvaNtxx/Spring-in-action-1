package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by n.litvyak on 03.02.2016.
 */
public class Main {

    @Autowired
    CompactDisc cd;

    public static void main(String... args)
    {
        Main main = new Main();
        main.cd.play();
    }
}
