package com.bookland.demobookland.model.projections;

import com.bookland.demobookland.model.Card;

import java.util.Date;
import java.util.List;

public interface CustomerInfoProjection {
    String getFirstName();

    String getSurname();

    String getPhoneNumber();

    Date getDateOfBirth();

    String getCustomerId();

    String getEmail();
}
