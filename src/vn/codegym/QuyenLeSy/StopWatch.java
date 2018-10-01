package vn.codegym.QuyenLeSy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StopWatch {
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private Date date = new Date()
    private String startTime;
    private String endTime;

    public StopWatch(){
        this.startTime = dateFormat.format(date);

    }
    public void start(){
        this.startTime = dateFormat.format(date);
    }

    public void stop(){
        this.endTime = dateFormat.format(date);
    }
}
