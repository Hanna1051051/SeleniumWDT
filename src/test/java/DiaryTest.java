import org.junit.Test;

public class DiaryTest {
    @Test
    public void test() {

        try {
            Diary.diary();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
