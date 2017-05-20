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
    }


    @Test
    public void addTest(){
        //Given
        Integer itemToAdd = 10;
        boolean expected = true;

        //When
        boolean actual = myArrayList.add(itemToAdd);

        //Then
        Assert.assertEquals("Should return true", expected, actual);
    }

    @Test
    public void addWithParametersTest(){
        //Given
        Integer itemToAdd = 10;
        int i = 1;
        Integer expected = 10;

        //When
        myArrayList.add(i, itemToAdd);
        Integer actual = (Integer) myArrayList.get(i);

        //Then
        Assert.assertEquals("Should return 10", expected, actual);
    }

    @Test
    public void getTest(){
        //Given
        int i = 0;
        Integer expected = 7;

        //When
        Integer actual = (Integer) myArrayList.get(i);

        //Then
        Assert.assertEquals("Should return 7", expected, actual);
    }

    @Test
    public void removeTest(){
        //Given
        int i = 0;
        Integer expected = 7;

        //When
        Integer actual = (Integer) myArrayList.remove(i);

        //Then
        Assert.assertEquals("Should return 7", expected, actual);

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
        boolean actual = myArrayList.contains(7);

        //Then
        Assert.assertEquals("should return true", true, actual);
    }

    @Test
    public void sizeTest(){
        //When
        int actual = myArrayList.size();

        //Then
        Assert.assertEquals("should equal 1", 1, actual);
    }

    @Test
    public void resizingTest(){
        //When
        myArrayList.remove(0);
        int actual = myArrayList.size();

        //Then
        Assert.assertEquals("should be 0", 0, actual);

    }
}
