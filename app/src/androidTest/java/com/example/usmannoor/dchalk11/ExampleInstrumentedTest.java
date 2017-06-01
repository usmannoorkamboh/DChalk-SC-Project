package com.example.usmannoor.dchalk11;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.example.usmannoor.dchalk11.DAO.UsersDAO;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.usmannoor.dchalk11", appContext.getPackageName());
    }

    @Test
    public void logincheck() {
        UsersDAO usersDAO = new UsersDAO();
        int a = usersDAO.authenticate("ol", "ol");
        assertTrue(a > 0);

    }
    @Test
    public void logincheckinvalid() {
        UsersDAO usersDAO = new UsersDAO();
        int a = usersDAO.authenticate("poi", "ol");
        assertTrue(a < 1);

    }

    @Test
    public void logincheckinvali() {
        UsersDAO usersDAO = new UsersDAO();
        int a = usersDAO.authenticate("oo", "ol");
        assertTrue(a < 1);

    }


}
