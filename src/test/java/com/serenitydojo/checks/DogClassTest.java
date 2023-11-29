package com.serenitydojo.checks;

import com.serenitydojo.Dog;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class DogClassTest {
    @Test
    public void theDogClassShouldExist() throws ClassNotFoundException {
        assertThat(Class.forName("com.serenitydojo.Dog")).isNotNull();
    }

    @Test
    public void theDogClassShouldHaveAName() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Dog").getDeclaredField("name").getGenericType()).isEqualTo(String.class);
    }

    @Test
    public void theDogClassShouldHaveAFavoriteToy() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Dog").getDeclaredField("favoriteToy").getGenericType()).isEqualTo(String.class);
    }

    @Test
    public void theDogClassShouldHaveAnAge() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Dog").getDeclaredField("age").getGenericType()).isEqualTo(int.class);
    }

    @Test
    public void theDogShouldMakeNoise() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Dog dog = new Dog("Buddy", "Ball", 3);
        // Use assertThat to check if the output matches the expected value
        assertThat(Class.forName("com.serenitydojo.Dog").getMethod("makeNoise").invoke(dog)).isEqualTo("Woof");

    }

    @Test
    public void theDogShouldBeFedAfterFeeding() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InvocationTargetException, IllegalAccessException {
        Dog dog = new Dog("Rex", "Bone", 5);

        // Initially, the dog should not be fed
        assertThat(dog.getFedStatus()).isFalse();

        // Call the feed() method
        Class.forName("com.serenitydojo.Dog").getMethod("feed").invoke(dog);

        // After feeding, the dog should be fed
        assertThat(dog.getFedStatus()).isTrue();
    }

}
