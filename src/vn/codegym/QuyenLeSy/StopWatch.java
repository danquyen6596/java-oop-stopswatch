package vn.codegym.QuyenLeSy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(){
        this.startTime = System.currentTimeMillis();

    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public float  getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
