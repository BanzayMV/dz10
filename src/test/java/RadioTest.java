import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void setCurrentStationZero() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationMinus() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationLimit() {
        Radio rad = new Radio();
        rad.setCurrentStation(15);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationNormal() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);
        int expected = 5;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    ///////////////////////////////////////////////////////////
    @Test
    public void station1() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);
        rad.next();
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void station2() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    ///////////////////////////////////////////////////////////
    @Test
    public void prevSt1() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.prev();
        int expected = 8;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevSt2() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    ///////////////////////////////////////////////////////////
    @Test
    public void setVol1() {
        Radio rad = new Radio();
        rad.setVolume(100);
        int expected = 100;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVol2() {
        Radio rad = new Radio();
        rad.setVolume(0);
        int expected = 0;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVol3() {
        Radio rad = new Radio();
        rad.setVolume(10);
        int expected = 10;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVol4() {
        Radio rad = new Radio();
        rad.setVolume(-1);
        int expected = 0;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVol5() {
        Radio rad = new Radio();
        rad.setVolume(101);
        int expected = 0;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVol6() {
        Radio rad = new Radio();
        rad.setVolume(99);
        int expected = 99;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVol7() {
        Radio rad = new Radio();
        rad.setVolume(1);
        int expected = 1;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    ///////////////////////////////////////////////////////////
    @Test
    public void upVol1() {
        Radio rad = new Radio();
        rad.setVolume(0);
        rad.upVolume();
        int expected = 1;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVol2() {
        Radio rad = new Radio();
        rad.setVolume(99);
        rad.upVolume();
        int expected = 100;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVol3() {
        Radio rad = new Radio();
        rad.setVolume(100);
        rad.upVolume();
        int expected = 100;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    ///////////////////////////////////////////////////////////
    @Test
    public void downVol1() {
        Radio rad = new Radio();
        rad.setVolume(100);
        rad.downVolume();
        int expected = 99;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVol2() {
        Radio rad = new Radio();
        rad.setVolume(1);
        rad.downVolume();
        int expected = 0;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVol3() {
        Radio rad = new Radio();
        rad.setVolume(0);
        rad.downVolume();
        int expected = 0;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}