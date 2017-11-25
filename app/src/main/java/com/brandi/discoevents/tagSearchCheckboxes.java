package com.brandi.discoevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class tagSearchCheckboxes extends AppCompatActivity {

    globals g = globals.getInstance();

    // Intent used for the tag search button, this is used in the onClick listener
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tag_search_checkboxes);
    }

    /**
     *Description: Class for the check boxes that determines which boxes have been checked
     *             and sets a variable for them if they have been checked.
     */
    public void onCheckboxClicked(View view){
        //Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        //Check which checkbox was clicked
        switch(view.getId()){
            case R.id.checkCS:
                if (checked) // Set a variable to true that way I can find out which class needs to be displayed in the next view
                    g.setCS(true); // Set equal to true
                else
                    g.setCS(false); // Set equal to false
                break;
            case R.id.checkBoxCE:
                if(checked) //Set a variable to true that way I can find out which class needs to be displayed in the next view
                    g.setCE(true); // Set equal to true
                else // Not much to do
                    g.setCE(false); // Set equal to false
                break;
            case R.id.checkBoxEE:
                if(checked) //Set a variable to true that way I can find out which class needs to be displayed in the next view
                    g.setEE(true); // Set equal to true
                else // Not much to do
                    g.setEE(false); // Set equal to false
                break;
            case R.id.checkBoxDept:
                if(checked) //Set a variable to true that way I can find out which class needs to be displayed in the next view
                    g.setDEPT(true); // Set equal to true
                else // Not much to do
                    g.setDEPT(false); // Set equal to false
                break;
        }
    }

    // This is the code that allows the tagSearch button to take the app to the tagSearchCheckboxes class/fragment
    public void goTagEventList(View view) {
        intent = new Intent(tagSearchCheckboxes.this, TagEventList.class);
        startActivity(intent);
    }
}