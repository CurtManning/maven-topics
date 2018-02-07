package week4.day1.appcode;

public class ShadowTest {

    public int x = 0;

    public class FirstLevel {

        public int x = 1;

        public int[] methodInFirstLevel(int x) {
        	int[] z = {x,this.x, ShadowTest.this.x};
            return z;
        }
    }

    public static void main(String... args) {
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        int [] y = fl.methodInFirstLevel(23);
        System.out.println("x = " + y[0]);
        System.out.println("this.x = " + y[1]);
        System.out.println("ShadowTest.this.x = " + y[2]);
    }
}