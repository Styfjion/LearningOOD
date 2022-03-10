package iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        DrivingRecorder dr = new DrivingRecorder();

        for (int i = 0; i < 12; i++) {
            dr.append("视频_" + i);
        }

        List<String> uStorage = new ArrayList<>();

        for (String video : dr) {
            System.out.println(video);
            if ("视频_10".equals(video) || "视频_8".equals(video)) {
                uStorage.add(video);
            }
        }
        System.out.println("事故证据：" + uStorage);
    }
}
