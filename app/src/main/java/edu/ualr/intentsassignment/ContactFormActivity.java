package edu.ualr.intentsassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import edu.ualr.intentsassignment.databinding.ContactFormBinding;
import edu.ualr.intentsassignment.model.Contact;

public class ContactFormActivity extends AppCompatActivity {
    // TODO 01. Create a new layout file to define the GUI elements of the ContactFormActivity.
    // TODO 02. Define the basic skeleton of the ContactFormActivity. Inflate the layout defined in the first step to display the GUI elements on screen.
    public static final String CONTACT = "ContactData";
    private ContactFormBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ContactFormBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

    }
    // TODO 06. Create a new method that reads the values in the several EditText elements of the layout and then uses the Contact class to send those data to ContactInfoActivity

    public void onButtonClick(View view) {
        Intent intent = new Intent(this, ContactInfoActivity.class);

        Contact c = new Contact();
        c.setFirstName(mBinding.personFirstName.getText().toString());
        c.setLastName(mBinding.personLastName.getText().toString());
        c.setPhoneNumber(mBinding.phoneNumber.getText().toString());
        c.setEmailAddress(mBinding.email.getText().toString());
        c.setAddress(mBinding.location.getText().toString());
        c.setWebsite(mBinding.website.getText().toString());
        intent.putExtra(CONTACT, c);
        startActivity(intent);
    }


}
