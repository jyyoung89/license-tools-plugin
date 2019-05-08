package com.jyyoung89.android.licensetools;

public class NotEnoughInformationException extends RuntimeException {

    public final com.jyyoung89.android.licensetools.LibraryInfo libraryInfo;

    public NotEnoughInformationException(LibraryInfo libraryInfo) {
        this.libraryInfo = libraryInfo;
    }
}
