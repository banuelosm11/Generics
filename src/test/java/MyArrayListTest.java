import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by aurorabanuelos on 5/19/17.
 */
public class MyArrayListTest {

    public MyArrayList myArrayList;
    @Before
    public void setUp(){
        myArrayList = new MyArrayList();
        myArrayList.add(0, 7);
        myArrayList.add(1, 10);
        myArrayList.add(2, 13);
    }


    @Test
    public void addTest(){
        //Given
        Integer itemToAdd = 12;
        boolean expected = true;

        //When
        boolean actual = myArrayList.add(itemToAdd);

        //Then
        Assert.assertEquals("Should return true", expected, actual);
    }

    @Test
    public void addWithParametersTest(){
        //Given
        Integer itemToAdd = 12;
        int i = 1;
        Integer expected = 12;

        //When
        myArrayList.add(i, itemToAdd);
        Integer actual = (Integer) myArrayList.get(i);

        //Then
        Assert.assertEquals("Should return 12", expected, actual);
    }

    @Test
    public void getTest(){
        //Given
        int i = 1;
        Integer expected = 10;

        //When
        Integer actual = (Integer) myArrayList.get(i);

        //Then
        Assert.assertEquals("Should return 10", expected, actual);
    }

    @Test
    public void removeTest(){
        //Given
        int i = 2;
        Integer expected = 13;

        //When
        Integer actual = (Integer) myArrayList.remove(i);

        //Then
        Assert.assertEquals("Should return 13", expected, actual);

    }

    @Test
    public void setTest(){
        //Given
        int i = 0;
        Integer itemToBeSet = 12;
        Integer expected = 12;

        //When
        Integer actual = (Integer) myArrayList.set(i, itemToBeSet);

        //Then
        Assert.assertEquals("should return 12", expected, actual);

    }

    @Test
    public void clearTest(){
        //When
        myArrayList.clear();
        int actual = myArrayList.size();

        //Then
        Assert.assertEquals("should be 0", 0, actual);
    }

    @Test
    public void isEmptyTest(){
        //When
        boolean actual = myArrayList.isEmpty();

        //Then
        Assert.assertEquals("should be false", false, actual);
    }

    @Test
    public void containsTest(){
        //When
        boolean actual = myArrayList.contains(30);

        //Then
        Assert.assertEquals("should return false", false, actual);
    }

    @Test
    public void sizeTest(){
        //When
        int actual = myArrayList.size();

        //Then
        Assert.assertEquals("should equal 3", 3, actual);
    }

    @Test
    public void resizingTest(){
        //When
        myArrayList.remove(0);
        int actual = myArrayList.size();

        //Then
        Assert.assertEquals("should be 2", 2, actual);

    }
}
