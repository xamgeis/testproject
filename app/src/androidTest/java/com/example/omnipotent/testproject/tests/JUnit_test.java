package com.example.omnipotent.testproject.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.omnipotent.testproject.MyActivity;
import com.example.omnipotent.testproject.R;

import org.w3c.dom.Text;

/**
 * Created by Omnipotent on 4/19/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MyActivity>{
    MyActivity myActivity;

    public JUnit_test(){

        super(MyActivity.class);
    }

    public void test_first() {
        myActivity = getActivity();

        TextView textView = (TextView) myActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World!", tester);
    }

}
