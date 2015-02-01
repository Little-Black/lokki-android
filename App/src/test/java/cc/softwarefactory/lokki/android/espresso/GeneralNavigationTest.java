package cc.softwarefactory.lokki.android.espresso;

import cc.softwarefactory.lokki.android.R;
import cc.softwarefactory.lokki.android.espresso.utilities.MockJsonUtils;
import cc.softwarefactory.lokki.android.espresso.utilities.TestUtils;
import com.squareup.okhttp.mockwebserver.MockResponse;

import org.json.JSONException;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasSibling;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
/**
 * Created by lfzhang on 2/1/15.
 */
public class GeneralNavigationTest extends MainActivityBaseTest{

    @Override
    public void setUp() throws Exception {
        super.setUp();
    }


//TEST
    public void testNavigationDrawer() {
        getActivity();
        String[] menuOptions = getInstrumentation().getTargetContext().getResources().getStringArray(R.array.menuOptions);
        onView(withId(R.id.decor_content_parent)).perform(TestUtils.clickScreenPosition(0, 0));
        for (String )
    }
}
