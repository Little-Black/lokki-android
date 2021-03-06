package cc.softwarefactory.lokki.android.espresso;

import com.squareup.okhttp.mockwebserver.MockResponse;

import org.json.JSONException;

import cc.softwarefactory.lokki.android.R;
import cc.softwarefactory.lokki.android.espresso.utilities.MockJsonUtils;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;


public class PlacesScreenTest extends LoggedInBaseTest {


    @Override
    public void setUp() throws Exception {
        super.setUp();
        //enterPlacesScreen();
    }

    private void enterPlacesScreen() {
        getActivity();
        onView(withText(R.string.places)).perform((click()));
    }


    public void testEmptyPlacesScreen() {
        enterPlacesScreen();
        onView(withText(R.string.places_how_to_create)).check(matches(isDisplayed()));
    }


    public void testPlacesOnPlacesScreen() throws JSONException {
        getMockDispatcher().setPlacesResponse(new MockResponse().setBody(MockJsonUtils.getPlacesJson()));
        enterPlacesScreen();
        onView(withText("Testplace1")).check(matches(isDisplayed()));
    }
}
