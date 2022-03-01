package b4_OPP.Bai_tap.Stop_Watch;


public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch() {
    }
    public StopWatch(long startTime, long endTime) {
       this.startTime=startTime;
       this.endTime=endTime;
    }

    //setter getter
    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    //phương thức start() để reset startTime về thời gian hiện tại của hệ thống.
    public long start() {
        this.startTime=System.currentTimeMillis();
        return this.startTime;
    }

    //Phương thức stop() để thiết đặt endTime về thời gian hiện tại của hệ thống.
    public long stop() {
        this.endTime=System.currentTimeMillis();
        return this.endTime;
    }

    //Phương thức getElapsedTime() trả về thời gian đã trôi qua theo số milisecond giây
    public long getElapsedTime() {
        return this.endTime-this.startTime;
    }
}
