import java.text.SimpleDateFormat;
import java.util.Date;

/*
* @Description: 线程休眠方法sleep()方法 study
* @Author: p
* @Date: 2019-11-5 14:40
* Attention:
* 1、sleep（）方法使用的位置，如果是在main里面使用则阻塞的就是main线程。如果在其他线程中执行，则阻塞的是执行代码的线程
* 2、线程睡眠到期，自动苏醒，并返回到可运行状态（就绪），不是运行状态
* 2、案例：倒计时功能
*/
public class TestDemo1 {
    public static void main(String[] args) throws InterruptedException{
        countDown(10000);
    }

    public static void countDown(long mills){
        Date endDate = new Date(System.currentTimeMillis() + mills);
        long endTime = endDate.getTime();

        while(true){
            System.out.println(new SimpleDateFormat("hh:mm:ss").format(endDate));
            endDate = new Date(endDate.getTime() + 1000);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            if (endTime - endDate.getTime() > mills){
                break;
            }
        }
    }
}
